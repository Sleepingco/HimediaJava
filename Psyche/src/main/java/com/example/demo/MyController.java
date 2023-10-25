package com.example.demo;

import java.util.ArrayList;
import java.util.Date;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {
	// 다음 찾기 ctrl+k
	//HttpSession session=null; 이런식으로 전역변수로 만들어서 this.session으로 쓸 수도 있다
	@GetMapping("/")
	public String home(HttpServletRequest req,Model model) { 
		// Model은 위와같이 괄호안에 써줘야지 스프링부트가 인식하고 값을 전달해준다
		// HttpServletRequest req 스프링 프레임워크가 가지고있는 클래스이다 from태그이용해서 데이터를 보내면 Parameter정보,server정보,Client정보,session정보,connection정보를 가지고있다 jsp는 session.setAttribute()할수 있지만 컨트롤러는sess = req.getsession()으로 초기화를 해주고 sess.setAttribute(),sess.getAttribute()를 해야 쓸수있다
		// HttpServletRequest은 값을 받기위해 써주는것
		// Model은 JSP에 데이터를 전달하기 위해 써주는것
		HttpSession session = req.getSession(); //세션사용을 위한 초기화
		String userid=(String) session.getAttribute("userid");
		if(userid==null||userid.equals("")) {
			// 홈페이지 처음 들어간 경우 또는 로그인 실패하고 Home으로 돌아온 경우
			model.addAttribute("name","");
		}else {
			model.addAttribute("name",(String) session.getAttribute("username"));
			// 로그인 성공한 경우
		}
		return "Home";//화면에 jsp화일 띄우고 끝남
	}
	@GetMapping ("/login")
	
	public String login(HttpServletRequest req) {
		HttpSession session = req.getSession();
		String userid = (String) session.getAttribute("userid");
		if(userid==null||userid.equals("")) {
			return "login"; 
		} else {
			return "redirect:/";
		}
		
	}
	@GetMapping("/another")
	public String doAnother() {
		return "signon";
	}
	@PostMapping("/signon")
	@ResponseBody
	public String doSignon(HttpServletRequest req) {
		String loginid = req.getParameter("userid");
		String pwd = req.getParameter("pwd");
		if(loginid.equals("blackpink")&&pwd.equals("apink")) {
			return "redvelvet";
		}
		return "Nobody";
	}
	@PostMapping ("/dologin")
//	@ResponseBody
	public String dologin(HttpServletRequest req,Model model) {
//		return "sayHello";
		String loginid=req.getParameter("loginid");
		String pwd=req.getParameter("pwd");
		if(loginid.equals("blackpink") && pwd.equals("apink")) {
			HttpSession session = req.getSession();
			session.setMaxInactiveInterval(1800);
			session.setAttribute("userid", loginid);
			session.setAttribute("username", "redvelvet");
			session.setAttribute("now", new Date());
			session.setAttribute("username", "redvelvet");
			return "redirect:/"; // 해당하는 메소드까지 실행하고 url을 연결함
		}
		return "redirect:/login";
	}
	@GetMapping ("/logout")
	public String doLogout(HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.invalidate();
		return "redirect:/";
	}
	//JSON
	@GetMapping ("/view")
	public String doView() {
		return "/view";
	}
	@PostMapping ("/list")
	@ResponseBody //ajax에서는 반드시 responsebody가 있어야함
	public String doList() {
		ArrayList<String> alMenu = new ArrayList<String>();
		ArrayList<Integer> alPrice = new ArrayList<Integer>();
		alMenu.add("라떼");alMenu.add("모카");alMenu.add("팥죽");
		alPrice.add(3000);alPrice.add(3500);alPrice.add(7000);
	
		JSONArray ja = new JSONArray();
		for(int i=0; i<alMenu.size();i++) {
			JSONObject jo = new JSONObject();
			jo.put("menu", alMenu.get(i));
			jo.put("price", alPrice.get(i));
			ja.add(jo);
		}
		return ja.toJSONString();
	}
}

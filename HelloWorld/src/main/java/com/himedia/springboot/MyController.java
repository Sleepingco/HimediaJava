package com.himedia.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
	// 클라이언트가ipadress:port 또는 ipadress:port/라고 주소창에 입력하면
	//이 메소드가 실행된다
	@GetMapping("/")
	public String doHome() {
		return "home";
	}
	
	@GetMapping("/testone") // 도메인뒤에아무것도 안치면 / 가 있는거나 마찬가지이다
	public String showHome() {
		System.out.println("on");
		return "test1"; //JSP화일이름(확장명제외)
	}
	@GetMapping("/testtwo") 
	public String showSecond() {
		System.out.println("on");
		return "sub/test2"; 
	}
	@GetMapping("/getfour")
	public String getFour() {
		return "getfour";
	}
	@GetMapping("/showfour")
	public String showFour() {
		return "showfour";
	}
	@GetMapping("/jsst")
	public String jsst() {
		return "jsst";
		}
	@GetMapping("/jsgt")
	public String jsgt() {
		return "jsgt";
		}
	@PostMapping("/showtable")
	public String showTable() {
		return "showtable";
	}
	@GetMapping("/gettable") // 주소창에서 쳐서 접속하므로 Get을 쓰고 다른창으로 이동하면 post 사용가능 
	public String getTable() {
		return "gettable";
	}
	@GetMapping("/register") // 주소창에서 쳐서 접속하므로 Get을 쓰고 다른창으로 이동하면 post 사용가능 
	public String signUp() {
		return "member/signup";
	}
	@GetMapping("/regREST") // 주소창에서 쳐서 접속하므로 Get을 쓰고 다른창으로 이동하면 post 사용가능 
	public String doRegister1() {
		return "member/signupREST";
	}
	
	//RESTAPI
	@GetMapping("/bemember/{userid}/{passcode}/{name}/{birthday}/{gender}/{mobile}") // 주소창에서 쳐서 접속하므로 Get을 쓰고 다른창으로 이동하면 post 사용가능
	public String beMember(@PathVariable String userid,
							@PathVariable String passcode,
							@PathVariable String name,
							@PathVariable String birthday,
							@PathVariable String gender,
							@PathVariable String mobile,
							Model model) {
		model.addAttribute("user_id",userid);
		model.addAttribute("passcode",passcode);
		model.addAttribute("name",name);
		model.addAttribute("birthday",birthday);
		model.addAttribute("gender",gender);
		model.addAttribute("mobile",mobile);
		return "member/showmemberREST";
	}
// model and view는 sel과 같은 데이터를 받을 때 Controller에서 코딩한다
//	@PostMapping("/signup")
//	public ModelAndView dosignup1(HttpServletRequest hsr, ModelAndView mv ) {
//		String userid=hsr.getParameter("userid");
//		String passcode=hsr.getParameter("passcode1");
//		String name = hsr.getParameter("name");
//		String birthday = hsr.getParameter("birthday");
//		String gender = hsr.getParameter("gender");
//		String mobile = hsr.getParameter("mobile");
//		mv.addObject("login",userid);
//		mv.addObject("pwd",passcode);
//		mv.addObject("nme",name);
//		mv.addObject("bday",birthday);
//		mv.addObject("gender",gender);
//		mv.addObject("mb",mobile);
//		String sItem="";
//		String items[]=hsr.getParameterValues("interest");
//		for(String item : items){
//			if(!sItem.equals("")) sItem+=",";
//			sItem+=item;
//		}
//		mv.addObject("interest",sItem);
//		String sRegion="";
//		String regions[]=hsr.getParameterValues("region");
//		for(String region : regions){
//			if(!sRegion.equals("")) sRegion+=",";
//			sRegion+=region;
//		}
//		mv.addObject("region",sRegion);
//		mv.setViewName("member/showmember");
//		return mv;
////		return "member/login";
//	}
//	@GetMapping("/signup")
//	public String dosignup2() {
//		return "member/login";
//	}
	
	// Command Class이용
	@PostMapping("/signup")
	public String dosignUp(Member member, Model model) {
		model.addAttribute("member",member);
		return "member/showmember";
	}
}
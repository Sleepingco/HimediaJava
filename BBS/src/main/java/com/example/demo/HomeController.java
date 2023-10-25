package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	@Autowired
	private BoardDAO bdao;
	@Autowired
	private MemberDAO mdao;
	@GetMapping("/")
	public String home(HttpServletRequest req, Model model) {
		HttpSession session = req.getSession();
		String userid=(String) session.getAttribute("id");
		if( userid==null ||userid.equals("")) {
			model.addAttribute("loginstr","<a href='/goLogin'>로그인</a>&nbsp;&nbsp;<a href='/goSignup'>회원가입</a>"); 
			model.addAttribute("write",""); 
		}else { 
			model.addAttribute("loginstr",userid+"&nbsp;&nbsp;<button id=btnLogout>로그아웃</button>");
			model.addAttribute("write","<a href='/write'>글쓰기</a>"); 
		}
		
//		페이지 알고리즘
		int start,psize;
		String page = req.getParameter("pageno");
		if(page==null || page.equals("")) {
			page="1";
		}
		
		/* int pno; 파라미터 값 체크 다른 버전
		 * if(page==null || page.equals("")) {
		 *  pno=1; 
		 *  }else { 
		 * 		pno=Integer.parseInt(page); 
		 * 	}
		 */
		
		int pno=Integer.parseInt(page);
		System.out.println("pno ["+pno+"]");
		start = (pno-1)*10;
		System.out.println("start ["+start+"]");
		psize = 10;
		ArrayList<BoardDTO> alBoard=bdao.getlist(start, psize);
		
		int cnt=bdao.getTotal();
		int pagecount = (int) Math.ceil(cnt/10.0);
		/*
		 * 26/10 ->2 
		 * 26/10.0 -> 2.6
		 * 26.0/10 -> 2.6
		 */
		System.out.println("pagecount="+pagecount);
		String pagestr="";
		for(int i=1; i<=pagecount;i++) {
			if(pno==i) {
				pagestr += i+"&nbsp;";
			}else {
				pagestr+="<a href='/?pageno="+i+"'>"+i+"</a>&nbsp;";
			}
		}
		// <a href='/?pageno=1>1</a> <a href='/?pageno=2>2</a> <a href='/?pageno3>3</a>
		model.addAttribute("pagestr",pagestr);
		
		/* 이전다음 버튼
		 * if(start==0) { //첫페이지 목록보여줄 예정 model.addAttribute("prev","");
		 * model.addAttribute("next","<a href='/?pageno="+(pno+1)+"'>다음</a>"); }else
		 * if(alBoard.size()<10){
		 * model.addAttribute("prev","<a href='?pageno="+(pno-1)+"'>이전</a>");
		 * model.addAttribute("next",""); }else {
		 * model.addAttribute("next","<a href='/?pageno="+(pno+1)+"'>다음</a>");
		 * model.addAttribute("prev","<a href='?pageno="+(pno-1)+"'>이전</a>"); }
		 */
		System.out.println("retval"+alBoard.size());
		model.addAttribute("blist",alBoard);
		return "home";
	}
	//for Signup
		@GetMapping("/goSignup")
		public String goregist() {
			return "signup";
		}
		@PostMapping("/doSign")
		public String regist(HttpServletRequest req,Model model) {
			try {
				String id=req.getParameter("id");
				String pw=req.getParameter("pw");
				int cnt= mdao.signup(id,pw);
				if(cnt==1) {
					return "redirect:/goLogin";
				}else {
					model.addAttribute("fail", "-1");
					return "signup";
				}
			}catch (Exception e) {
				model.addAttribute("fail", "-1");
				return "signup";
			}
		}
		// for login
		@GetMapping("/goLogin")
		public String gologin() {
			return "login";
		}
		@PostMapping("/doLogin")
		public String doLogin(HttpServletRequest req,Model model) {
			try {
				String id=req.getParameter("id");
				String pw=req.getParameter("pw");
				int n = mdao.login(id,pw);
				if(n==1) {
					HttpSession s =req.getSession();
					s.setAttribute("id", id);
					return "redirect:/";
				} else {
					model.addAttribute("fail", "-1");
					return "/login";
				}
			} catch(Exception e) {
				model.addAttribute("fail", "-1");
				return "/login";
			}
		}
		@PostMapping("/logout")
		@ResponseBody
		public String execLogout(HttpServletRequest req) {
			HttpSession s = req.getSession();
			s.invalidate();
			return "/";
		}
		
	@GetMapping("/view")
	public String view(HttpServletRequest req,Model model) {
		int seqno = Integer.parseInt(req.getParameter("seqno"));
		BoardDTO bdto = bdao.view(seqno);
		String oriwri=bdto.getWriter();
		bdao.hitup(seqno);
		model.addAttribute("bpost",bdto);
		HttpSession session = req.getSession();
		String writer=(String) session.getAttribute("id");
		try {
			if(writer.equals(oriwri)){
				model.addAttribute("modidel","<a href='/write'>글쓰기</a>&nbsp;&nbsp;<button id=btnUpdate>수정</button>&nbsp;&nbsp;<button id=btnDelete>삭제</button>");
				return "view";
			}else {
				model.addAttribute("modidel","");
				model.addAttribute("write","<a href='/write'>글쓰기</a>&nbsp;");
				return "view";
			}
		} catch(Exception e) {
			model.addAttribute("modidel","");
			return "view";
		}
		
		
	}
	@GetMapping("/delete")
	public String delete(HttpServletRequest req) {
		int seqno = Integer.parseInt(req.getParameter("seqno"));
		bdao.delete(seqno);
		return "redirect:/";
	}
	@GetMapping("/write")
	public String write(HttpServletRequest req,Model model) {
		return "write";
	}
	@PostMapping("/insert")
	public String insert(HttpServletRequest req) {
		HttpSession session = req.getSession();
		String title=req.getParameter("title");
		String content=req.getParameter("content");
		String writer=(String) session.getAttribute("id");
		bdao.insert(title,content,writer);
		return "redirect:/";
	}
	@GetMapping("/update")
	public String update(HttpServletRequest req,Model model) {
		int seqno = Integer.parseInt(req.getParameter("seqno"));
		BoardDTO bdto = bdao.view(seqno);
		model.addAttribute("bpost",bdto);
		return "update";
	}
	@PostMapping("/modify")
	public String modify(HttpServletRequest req) {
		int seqno=Integer.parseInt(req.getParameter("seqno"));
		String title=req.getParameter("title");
		String content=req.getParameter("content");
		bdao.update(seqno,title,content);
		return "redirect:/";
	}
}

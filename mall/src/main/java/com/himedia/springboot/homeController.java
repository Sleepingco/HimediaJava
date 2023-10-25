package com.himedia.springboot;

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
public class homeController {
	@Autowired
	private mallDAO mdao;
	
	@GetMapping ("/")
	public String L_home(HttpServletRequest req,Model model) {
		HttpSession session= req.getSession();
		String userid=(String)session.getAttribute("userid");
		Integer admin=(Integer)session.getAttribute("admin");
		System.out.println("adminval"+admin);
		//변경사항
		if(userid==null || userid.equals("")) {
			model.addAttribute("userid", "");
		} else {
			model.addAttribute("userid", userid);
			model.addAttribute("admin", admin);
		}
		return "redirect:/korBook/korbook";
	}

	@GetMapping ("/login")
	public String login() {
		return "login";
	}
	@GetMapping ("/signup")
	public String signup() {
		return "signup";
	}	
	@PostMapping("/dosignup")
	public String dosignup(HttpServletRequest req) {
		String userid=req.getParameter("userid");
		String passcode=req.getParameter("passcode");
		String username=req.getParameter("username");
		String gender=req.getParameter("gender");
		String birthday=req.getParameter("birthday");
		String mobile=req.getParameter("mobile");
		mdao.insert(userid, passcode, username, gender, birthday, mobile);
		return "redirect:/";
	}
	
	@PostMapping("/dologin")
	public String dologin(HttpServletRequest req,Model model) {
		String userid=req.getParameter("userid");
		String passcode=req.getParameter("passcode");
		int n= mdao.select(userid,passcode);
		//변경사항
		Integer admin = mdao.admin(userid,passcode);
		if(admin != null) {
			if(n==1) {
				HttpSession session= req.getSession();
				session.setAttribute("userid", userid);
				session.setAttribute("password", passcode);
				session.setAttribute("admin", admin);
				return "redirect:/";
			}
		}
		return "redirect:/login";
	}
	@GetMapping("/logout")
	public String doLogout(HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.invalidate();
		return "redirect:/";
	}	
	@GetMapping("/korBook/korbook")
	public String bookall(HttpServletRequest req,Model model) {
		HttpSession session= req.getSession();
		String userid=(String)session.getAttribute("userid");
		if(userid==null || userid.equals("")) {
			model.addAttribute("userid", "");
		} else {
			model.addAttribute("userid", userid);
		}
		
		int start, psize;
		String page = req.getParameter("pageno");
		if(page==null || page.equals("")) {
			page="1";	
		} 
		int pno = Integer.parseInt(page);
		start = (pno-1)*3;
		psize=3;		
		int cnt=mdao.getnovelTotal();
		int pagecount = (int)Math.ceil(cnt/3.0);
		String pagestr="";
		for(int i=1; i<=pagecount; i++) {
			if(pno==i) {
				pagestr+=i+"&nbsp;";
			} else {
			pagestr+="<a href='/korBook/korbook?pageno="+i+"'>"+i+"</a>&nbsp;";
			}
		}
		model.addAttribute("pagestr",pagestr);
		ArrayList<mallDTO> albook = mdao.getAll(start,psize);
		model.addAttribute("alAll",albook);
		return "/korBook/korbook";
	}

	@GetMapping("/korBook/kornovel")
	public String korNovel(HttpServletRequest req,Model model) {
		HttpSession session= req.getSession();
		String userid=(String)session.getAttribute("userid");
		if(userid==null || userid.equals("")) {
			model.addAttribute("userid", "");
		} else {
			model.addAttribute("userid", userid);
		}
		
		int start, psize;
		String page = req.getParameter("pageno");
		if(page==null || page.equals("")) {
			page="1";	
		} 
		int pno = Integer.parseInt(page);
		start = (pno-1)*3;
		psize=3;		
		int cnt=mdao.getnovelTotal();
		int pagecount = (int)Math.ceil(cnt/3.0);
		String pagestr="";
		for(int i=1; i<=pagecount; i++) {
			if(pno==i) {
				pagestr+=i+"&nbsp;";
			} else {
			pagestr+="<a href='/korBook/kornovel?pageno="+i+"'>"+i+"</a>&nbsp;";
			}
		}
		model.addAttribute("pagestr",pagestr);
		
		ArrayList<mallDTO> alNovel = mdao.getNovel(start,psize);
		model.addAttribute("alNovel",alNovel);
		return "/korBook/kornovel";
	}
	
	@GetMapping("/korBook/korhistory")
	public String korhistory(HttpServletRequest req,Model model) {
		HttpSession session= req.getSession();
		String userid=(String)session.getAttribute("userid");
		if(userid==null || userid.equals("")) {
			model.addAttribute("userid", "");
		} else {
			model.addAttribute("userid", userid);
		}
		
		int start, psize;
		String page = req.getParameter("pageno");
		if(page==null || page.equals("")) {
			page="1";	
		} 
		int pno = Integer.parseInt(page);
		start = (pno-1)*3;
		psize=3;		
		int cnt=mdao.gethistoryTotal();
		int pagecount = (int)Math.ceil(cnt/3.0);
		String pagestr="";
		for(int i=1; i<=pagecount; i++) {
			if(pno==i) {
				pagestr+=i+"&nbsp;";
			} else {
			pagestr+="<a href='/korBook/korhistory?pageno="+i+"'>"+i+"</a>&nbsp;";
			}
		}
		model.addAttribute("pagestr",pagestr);
		
		ArrayList<mallDTO> alHistory = mdao.getHistory(start,psize);
		model.addAttribute("alHistory",alHistory);
		return "korBook/korhistory";
	}
	
	@GetMapping("/korBook/detail")
	public String detail(HttpServletRequest req, Model model) {
		HttpSession session= req.getSession();
		String userid=(String)session.getAttribute("userid");
		if(userid==null || userid.equals("")) {
			model.addAttribute("userid", "");
		} else {
			model.addAttribute("userid", userid);
		}	
		int seqno=Integer.parseInt(req.getParameter("seqno"));
		String genre = req.getParameter("genre");
		mallDTO book = mdao.bselect(seqno, genre);
		mdao.hitup(seqno);
		model.addAttribute("book",book);		
		return "korBook/detail";
	}
	@GetMapping("/korBook/buyment")
	public String buyment(HttpServletRequest req,Model model) {
		HttpSession session= req.getSession();
		String userid=(String)session.getAttribute("userid");
		if(userid==null || userid.equals("")) {
			model.addAttribute("userid", "");
		} else {
			model.addAttribute("userid", userid);
		}	
		
		int seq = Integer.parseInt(req.getParameter("seqno"));
		mallDTO orders = mdao.orders(seq);
		model.addAttribute("book",orders);
		
		return "korBook/buyment";
	}
	@GetMapping("/korBook/payment")
	public String payment(HttpServletRequest req,Model model) {
		HttpSession session= req.getSession();
		String userid=(String)session.getAttribute("userid");
		if(userid==null || userid.equals("")) {
			model.addAttribute("userid", "");
		} else {
			model.addAttribute("userid", userid);
		}	
		int seq = Integer.parseInt(req.getParameter("seq"));
		mallDTO orders = mdao.orders(seq);
		model.addAttribute("book",orders);
		
		return "korBook/payment";
	}
	@PostMapping("/korBook/Payment")
	public String Payment(HttpServletRequest req) {
		HttpSession session= req.getSession();
		String userid=(String)session.getAttribute("userid");
		String mobile = req.getParameter("mobile");
		String qty = req.getParameter("qty");
		String sum = req.getParameter("sum");
		mdao.paymentinsert(userid,mobile,qty,sum);
		
		return "redirect:/";
	}
	@GetMapping("/korBook/addBook")
	public String addBook() {
		return "korBook/addBook";
	}
	
	@PostMapping("/korBook/addBookdb")
	public String addBookdb(HttpServletRequest req) {
		String name=req.getParameter("name");
		String price=req.getParameter("price");
		String genre=req.getParameter("genre");
		String img=req.getParameter("img");
		String author=req.getParameter("author");
		String prodinfo=req.getParameter("prodinfo");
		mdao.addbookinsert(name,price,genre,img,author,prodinfo);
		
		return "korBook/addBook";
	}
	@GetMapping("/korBook/addcart")
	@ResponseBody
	public String cart(HttpServletRequest req, Model model) {
		int seq = Integer.parseInt(req.getParameter("seqno"));
		mdao.addcart(seq);
		int cnt = mdao.count(seq);
		return ""+cnt;
	}
	/*
	 * @GetMapping("/korBook/viewcart") public String view(HttpServletRequest req,
	 * Model model) { mallDTO select = mdao.selectCart();
	 * model.addAttribute("book",select); }
	 */
		
}

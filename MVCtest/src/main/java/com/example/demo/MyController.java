package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {
	@GetMapping("/")
	public String root() {
		return "home";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
// MVC
//	@PostMapping("/dologin")
//	public String dologin(HttpServletRequest hsr, Model model) { //hsr이라는 클래스안에userid 와 passcode가 저장되어있고 그 값을 모델에 저장시켜서 값을 빼오기 위해하는 과정
//		System.out.println("DO LOGIN CALLED");
//		String userid=hsr.getParameter("userid");
//		String passcode=hsr.getParameter("passcode");
//		model.addAttribute("login",userid);
//		model.addAttribute("pwd",passcode);
//		return "view";
//	}
	
//	@PostMapping("/dologin")
//	public String doLogin(@RequestParam("userid")String userid, // 적은 데이터를 보낼땐 좋지만 많은 데이터를 보낼때는 코드가 길어진다
//						@RequestParam("passcode") String passcode,
//						Model model) {
//		model.addAttribute("login",userid);
//		model.addAttribute("pwd",passcode);
//		return "view";
//	}
	
	
	// Command Class이용
	@PostMapping("/dologin2")
	public String dologin2(info info, Model model) {
		model.addAttribute("info",info);
		return "view";
	}
	//Path variable 이용
	@GetMapping("/Pathlogin/{userid}/{passcode}")
	public String beMember(@PathVariable String userid,
							@PathVariable String passcode,
							Model model) {
		model.addAttribute("user_id",userid);
		model.addAttribute("passcode",passcode);
		return "view";
	}
	
}

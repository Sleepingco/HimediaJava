package com.himedia.springboot;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class P_SearchbarController {
	@Autowired
	private P_SearchbarDAO sdao;
	@GetMapping("/searchbar")
	public String search(HttpServletRequest req) {
		return "P_job/SearchBar";
	}
	@GetMapping("/dosearch")
	public String desearch(HttpServletRequest req,Model model) {
		String name = req.getParameter("name");
		ArrayList<P_SearchbarDTO> result = sdao.dosearch(name);
		model.addAttribute("result",result );
		return "P_job/SearchBar";
	}
}

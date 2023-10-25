package com.example.demo;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CafeMenuController {
	@Autowired
	private MenuDAO mdao;
	@GetMapping("/addmenu")
	public String display() {
		return "AddMenu";
	}
	/* 110
	 * @PostMapping("/insert") //insert는 DTO필요x public String
	 * doInsert(HttpServletRequest req,Model model) { String name =
	 * req.getParameter("name"); int price =
	 * Integer.parseInt(req.getParameter("price")); int cnt=mdao.insert(name,price);
	 * System.out.println("inserted count["+cnt+"]");
	 * 
	 * ArrayList<MenuDTO> alMenu = mdao.select();
	 * model.addAttribute("menulist",alMenu); return "AddMenu"; }
	 */
	
	@PostMapping("/insert") //insert는 DTO필요x
	@ResponseBody
	public String doInsert(HttpServletRequest req,Model model) {
		String name = req.getParameter("name");
		int price = Integer.parseInt(req.getParameter("price"));
		int cnt=mdao.insert(name,price);
		System.out.println("inserted count["+cnt+"]");
		
		return ""+cnt;
	}

	@SuppressWarnings("unchecked")
	@PostMapping("/getmenulist")
	@ResponseBody
	public String getMenuList() {
		ArrayList<MenuDTO> alMenu = mdao.select();
		JSONArray ja = new JSONArray();
		for(int i=0; i<alMenu.size();i++) {
			JSONObject jo = new JSONObject();
			jo.put("seq", alMenu.get(i).getSeq());
			jo.put("menu", alMenu.get(i).getName());
			jo.put("price", alMenu.get(i).getPrice());
			ja.add(jo);
		}
		return ja.toJSONString();
	}
	
	@PostMapping("/dodelete")
	@ResponseBody
	public String doDelete(HttpServletRequest req) {
		int delNum = Integer.parseInt(req.getParameter("delNum"));
		int cnt = mdao.delete(delNum);
		System.out.println("cnt:"+cnt);
		return ""+cnt;
	}
	@PostMapping("/update")
	@ResponseBody
	public String doUpdate(HttpServletRequest req) {
		int menu_no=Integer.parseInt(req.getParameter("m_num"));
		String name=req.getParameter("name");
		int price=Integer.parseInt(req.getParameter("price"));
		int cnt= mdao.update(menu_no,name,price);
		return cnt+"";
	}
	
//	-- addmenu2 by AJAX
	@GetMapping("/addmenu2")
	public String ajaxAddmenu2() {
		return "AddMenu2";
	}
	@SuppressWarnings("unchecked")
	@PostMapping("/ajaxinsert")
	@ResponseBody
	public String ajaxinsert(HttpServletRequest req) {
		String name = req.getParameter("name");
		int price = Integer.parseInt(req.getParameter("price"));
		mdao.insert(name,price);
		System.out.println(name + price);
		
		ArrayList<MenuDTO> ajaxMenu = mdao.select();
		JSONArray ja = new JSONArray();
		for(int i=0; i<ajaxMenu.size();i++) {
			JSONObject jo = new JSONObject();
			jo.put("seq", ajaxMenu.get(i).getSeq());
			jo.put("menu", ajaxMenu.get(i).getName());
			jo.put("price", ajaxMenu.get(i).getPrice());
			ja.add(jo);
		}
		return ja.toJSONString();
	}
}

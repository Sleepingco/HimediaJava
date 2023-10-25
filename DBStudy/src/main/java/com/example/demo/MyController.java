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
public class MyController {
	@Autowired //DAO선언하나당 하나
	private EmpDAO empdao; 
	@Autowired
	private EmpDAO depdao; 
	@GetMapping("/")
	public String root() {
		return "home";
	}
	
	@GetMapping("/emplist")
	public String doEmpList(Model model) {
		//data가져오기
		ArrayList<EmpDTO> alEmp =empdao.getEmpList();
		//jsp에 보내기
		model.addAttribute("list",alEmp);
		return "list";
	}
	@GetMapping("/deplist")
	public String doDepList(Model model) {
		//data가져오기 (부서코드, 부서명, 매니저명)
		ArrayList<DepDTO> alDep =depdao.getDepList();
		//jsp에 보내기
		model.addAttribute("dlist",alDep);
		return "dlist";
	}
	
	
//	--- getList by AJAX call
	@GetMapping("/ajaxemplist")
	public String ajaxEmpList() {
		return "ajaxemplist";
	}
	@PostMapping("/ajaxelist")
	@ResponseBody
	public String ajaxEList() {
		ArrayList<EmpDTO> ajaxEmp = empdao.getEmpList();
		JSONArray ja = new JSONArray();
		for(int i=0; i<ajaxEmp.size();i++) {
			JSONObject jo = new JSONObject();
			jo.put("eid", ajaxEmp.get(i).getEmployee_id());
			jo.put("name", ajaxEmp.get(i).getEmp_name());
			jo.put("sal", ajaxEmp.get(i).getSalary());
			jo.put("dname",  ajaxEmp.get(i).getDepartment_name());
			jo.put("mname", ajaxEmp.get(i).getManager());
			ja.add(jo);
		}
		return ja.toJSONString();
	}
	//특정 연봉사이
	@GetMapping("/view") // localhost:8080/view?low=100 (1)QuertString (2)Form tag (3) AJAX {id:199}
	public String view(HttpServletRequest req, Model model) { //req에서 low=100이라는 값을 받아옴
		int low=Integer.parseInt(req.getParameter("low")); // "low"에 파라미터 값을 정수로 바꿔서 low에 저장함
		int hi=Integer.parseInt(req.getParameter("hi"));
		System.out.println("low="+req.getParameter("low"));
//		EmpDTO emp = empdao.view(low,hi);
		ArrayList<EmpDTO> emp =empdao.view(low,hi); //dao메소드가 호출할때 파라미터가 넘어감
		model.addAttribute("person",emp);
		return "view";
		//DTO DAO SELECT CONTROLLER XML고침
	}
}

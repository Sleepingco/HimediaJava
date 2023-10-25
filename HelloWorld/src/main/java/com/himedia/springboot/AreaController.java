package com.himedia.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AreaController {
	
	@GetMapping("/first")
	public String doFirst() {
		return "area/first";
	}
	@GetMapping("/second")
	public String doSecond() {
		return "area/second";
	}
	@GetMapping("/third")
	public String doThird() {
		return "area/third";
	}
	@GetMapping("/fourth")
	public String doFourth() {
		return "area/fourth";
	}
}

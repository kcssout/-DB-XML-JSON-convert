package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuideController {
	
	@RequestMapping("/guide")
	public String guide() {
		return "guide";
	}
	@RequestMapping("/guide2")
	public String guide2() {
		return "guide2";
	}
	
	
	@RequestMapping("/")
	public String root() {
		return "redirect:/guide";
	}
}

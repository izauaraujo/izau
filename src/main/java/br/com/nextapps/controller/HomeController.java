package br.com.nextapps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller	
public class HomeController {
	
	@GetMapping("/")
	public String initPage() {
		return "index";
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	@GetMapping("/tables")
	public String getTables() {
		return "tables";
	}
	
	@GetMapping("/charts")
	public String getCharts() {
		return "charts";
	}
	
	@GetMapping("/register")
	public String getRegister() {
		return "register";
	}
	
}

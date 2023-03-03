package com.carshop.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
	@GetMapping("/manager")
	public String ManagerMethod(Model model) {
		model.addAttribute("data", "manager");
		return "test";
	}
	
	@GetMapping("/member")
	public String MemberMethod(Model model) {
		model.addAttribute("data", "member");
		return "test";
	}
	
	@GetMapping("/guest")
	public String GuestMethod(Model model) {
		model.addAttribute("data", "guest");
		return "test";
	}
	
	@GetMapping("/login")
	public String loginMethod(HttpServletRequest request) {
		request.getSession().setAttribute("isLogOn", true);
		return "login";
	}
	
	@GetMapping("/loginfailed")
	public String loginfailedMethod() {
		return "login";
	}
	
	@GetMapping("/logout")
	public String logoutMethod() {
		return "login";
	}
}

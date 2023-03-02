package com.carshop.study;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/param")
public class ParamController {
	@GetMapping("/exam1")
	public String exam1(@RequestParam String id, Model model) {
		
		model.addAttribute("data", "자동차 아이디 : " + id);
		
		return "study/name";
	}
}

package com.carshop.study;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/study")
public class ModelmapExam {
	@GetMapping("/modelmaptest")
	public String modelmap(ModelMap modelMap) {
		modelMap.addAttribute("data1", "모델 맵 테스트입니다.");
		modelMap.addAttribute("data2", "모델과 동일합니다.");
		return "study/modelmaptest";
	}
}

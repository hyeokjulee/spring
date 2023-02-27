package com.carshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/boards")
	public String boardList(Model model) {
		List<BoardDTO> list = boardService.getAllBoardList();
		model.addAttribute("boardList", list);
		return "boards";
	}
}

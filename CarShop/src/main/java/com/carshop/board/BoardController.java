package com.carshop.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/board", method=RequestMethod.GET)
public class BoardController {
	@Autowired // DI
	private BoardService boardService;
	
	@GetMapping("/list")
	public String boardList(Model model) {
		List<BoardDTO> list = boardService.getAllBoardList();
		model.addAttribute("boardList", list);
		return "board/boards";
	}
	
	@GetMapping("/test")
	public String BoardTest() {
		return "board/boardtest";
	}
	
	@GetMapping("/boardfoldertest")
	public String boardfoldertest() {
		return "board/boardfoldertest";
	}
}

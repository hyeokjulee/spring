package com.carshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardRepository boardRepository;
	
	@Override
	public List<BoardDTO> getAllBoardList() {
		return boardRepository.getAllBoardList();
	}
}

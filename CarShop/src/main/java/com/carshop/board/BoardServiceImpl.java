package com.carshop.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired // DI 의존성 주입 IoC 제어의 역전
	private BoardRepository boardRepository;
	
	@Override
	public List<BoardDTO> getAllBoardList() {
		return boardRepository.getAllBoardList();
	}
}

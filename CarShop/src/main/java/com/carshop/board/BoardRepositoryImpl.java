package com.carshop.board;

import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class BoardRepositoryImpl implements BoardRepository {
	private List<BoardDTO> listOfBoards = new ArrayList<BoardDTO>();
	
	public BoardRepositoryImpl() {
		BoardDTO board1 = new BoardDTO("안녕하세요","반갑습니다","austin","02/28/2023");
		BoardDTO board2 = new BoardDTO("hi","hello","andy","02/27/2023");
		BoardDTO board3 = new BoardDTO("방가","신입회원입니다","신입","02/26/2023");
		
		listOfBoards.add(board1);
		listOfBoards.add(board2);
		listOfBoards.add(board3);
	}
	
	@Override
	public List<BoardDTO> getAllBoardList() {
		return listOfBoards;
	}
}

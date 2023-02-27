package com.carshop.controller;

import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class BoardRepositoryImpl implements BoardRepository {
	private List<BoardDTO> listOfBoards = new ArrayList<BoardDTO>();
	
	public BoardRepositoryImpl() {
		BoardDTO board1 = new BoardDTO("글","글","홍","오늘");
		BoardDTO board2 = new BoardDTO("제","내","길","내일");
		BoardDTO board3 = new BoardDTO("목","용","동","어제");
		
		listOfBoards.add(board1);
		listOfBoards.add(board2);
		listOfBoards.add(board3);
	}
	
	@Override
	public List<BoardDTO> getAllBoardList() {
		return listOfBoards;
	}
}

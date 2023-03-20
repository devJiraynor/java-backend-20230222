package board.controller;

import board.dto.request.board.PostBoardDto;
import board.service.BoardService;

public class BoardController {
	
	private BoardService boardService;
	
	public BoardController () {
		boardService = new BoardService();
	}
	
	public void postBoard(PostBoardDto dto) {
		
	}

}








package com.spring.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.spring.biz.board.BoardVO;
import com.spring.biz.board.impl.BoardDAO;
import com.spring.view.controller.Controller;

public class GetBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(">>> 글 상세 조회 요청 처리");
		//1. 전달 받은 값 추출
		String seq = request.getParameter("seq");
		
		//2. DB 연동처리(하나의 글 조회)
		BoardVO vo = new BoardVO();
		vo.setSeq(Integer.parseInt(seq));
		
		BoardDAO boardDAO = new BoardDAO();
		BoardVO board = boardDAO.getBoard(vo);
		
		//3. 화면 네비게이션(상세페이지로 이동)
		//3-1. 상세페이지에서 사용할 데이타 전달
		request.getSession().setAttribute("board", board);
		
		//3-2. 상세페이지로 이동
		//response.sendRedirect("getBoard.jsp");
		//return "getBoard.jsp"; //ViewResoler 사용 전
		return "getBoard"; //ViewResoler 사용시 이름만
	}

}

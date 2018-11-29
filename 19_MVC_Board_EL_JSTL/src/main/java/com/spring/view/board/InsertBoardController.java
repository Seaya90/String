package com.spring.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.spring.biz.board.BoardVO;
import com.spring.biz.board.impl.BoardDAO;
import com.spring.view.controller.Controller;

public class InsertBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(">>> 글 등록 요청 처리");
		//1. 전달 받은 데이타 추출
		//request.setCharacterEncoding("UTF-8"); //한글처리
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		//2. DB 연동 처리(데이타 입력)
		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setWriter(writer);
		vo.setContent(content);
		
		BoardDAO boardDAO = new BoardDAO();	
		boardDAO.insertBoard(vo);
		
		//3. 화면 네비게이션(목록페이지로 이동)
		//response.sendRedirect("getBoardList.do");
		return "getBoardList.do";
	}

}

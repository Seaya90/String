<%@page import="com.spring.biz.board.impl.BoardDAO"%>
<%@page import="com.spring.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 전달받은 값으로 DB연동처리(삭제) 후 화면이동 --%>
<%
	//1. 전달받은 값 추출
	String seq = request.getParameter("seq");
	
	//2. 업무처리-DB연동작업(삭제)
	BoardVO vo = new BoardVO();
	vo.setSeq(Integer.parseInt(seq));
	
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.deleteBoard(vo);
	
	//3. 화면 네비게이션 처리(목록)
	response.sendRedirect("getBoardList.jsp");
%>




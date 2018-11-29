<%@page import="com.spring.biz.user.impl.UserDAO"%>
<%@page import="com.spring.biz.user.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- id, password 값을 받아서 DB에 있는지 확인 후 로그인 처리 --%>
<%
	//1. 사용자가 입력한 데이타(정보) 추출
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	//2. DB연동처리(id,password 유무 확인)
	UserVO vo = new UserVO();
	vo.setId(id);
	vo.setPassword(password);
	
	UserDAO userDAO = new UserDAO();
	UserVO user = userDAO.getUser(vo);
	
	//3. 화면 네비게이션(화면이동)
	if (user != null) { //사용자가 존재하는 경우
		//System.out.println("로그인 성공!!!");
		response.sendRedirect("getBoardList.jsp");
	} else { //사용자가 없는 경우
		//System.out.println("로그인 실패!!!");
		response.sendRedirect("login.jsp");
	}
%>





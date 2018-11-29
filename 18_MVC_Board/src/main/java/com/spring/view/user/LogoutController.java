package com.spring.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.spring.view.controller.Controller;

public class LogoutController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(">>> 로그아웃 요청 처리");
		//1. 브라우저와 연결된 세션 객체를 종료(초기화)
		HttpSession session = request.getSession();
		session.invalidate();

		//2. 화면 네비게이션(로그인 페이지)
		//response.sendRedirect("login.jsp");
		//return "login.jsp";
		return "login";
	}

}

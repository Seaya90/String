package com.spring.biz;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.biz.member.MemberService;
import com.spring.biz.member.MemberVO;
import com.sun.xml.internal.ws.api.server.Container;

public class MemberServiceClient {

public static void main(String[] args) {
		//컨테이너 구동
	AbstractApplicationContext container = 
			new GenericXmlApplicationContext("applicationContext.xml");
		
	MemberService memberService = (MemberService) container.getBean("memberService");
	
	//글등록 기능 테스트
	/*CREATE TABLE MEMBER (
    IDX NUMBER PRIMARY KEY,
    ID VARCHAR2(20) NOT NULL,
    PWD VARCHAR2(20) NOT NULL,
    NAME VARCHAR(10) NOT NULL,
    GENDER VARCHAR(4),
    PHONE VARCHAR2(30),
    ADDRESS VARCHAR2(100),
    REGDATE DATE);
    
	CREATE SEQUENCE MEMBER_SEQ NOCACHE;
	*/
	MemberVO vo = new MemberVO();
	vo.setId("USER3");
	vo.setPwd("0000");
	vo.setName("김유저");
	vo.setGender("여");
	vo.setPhone("010-8585-9999");
	vo.setAddress("벤쿠버");
	
	container.close();
	
	}

}

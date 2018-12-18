package com.spring.biz.member.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.spring.biz.common.JDBCUtill;
import com.spring.biz.member.MemberVO;



@Repository("memberDAO")
public class MemberDAO {
	//JDBC 관련변수
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;
	
	
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
	
	//sql 명령어
private final String MEMBER_INSERT 
	= "INSERT INTO MEMBER(IDX, ID, PWD, NAME, GENDER, PHONE, ADDRESS, REGDATE)"
	+"VALUES((SELECT NVL(MAX(IDX),0)+1 FROM MEMBER), ?, ?, ?, ?, ?, ?, SYSDATE)";

	
//CRUD 기능의 메소드 구현
public void insertMember(MemberVO vo) {
	System.out.println("===>회원가입 처리!");
	
	try {
		conn = JDBCUtill.getConnection();
		stmt = conn.prepareStatement(MEMBER_INSERT);
		stmt.setString(1, vo.getId());
		stmt.setString(2, vo.getPwd());
		stmt.setString(3, vo.getName());
		stmt.setString(4, vo.getGender());
		stmt.setString(5, vo.getPhone());
		stmt.setString(6, vo.getAddress());
		stmt.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		JDBCUtill.close(stmt, conn);
	}
}

}

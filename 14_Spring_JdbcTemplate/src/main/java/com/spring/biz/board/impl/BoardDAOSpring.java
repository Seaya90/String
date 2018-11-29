package com.spring.biz.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.biz.board.BoardVO;
import com.spring.biz.common.JDBCUtil;

//@Repository는 @Component 상속받아 기능 확장된 어노테이션
//DB와 연동작업 처리하는 클래스에 설정
@Repository("boardDAOSpring")
public class BoardDAOSpring {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//JDBC 관련 변수
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	//SQL문
	private final String BOARD_INSERT
		= "INSERT INTO BOARD (SEQ, TITLE, WRITER, CONTENT) "
		+ "VALUES ((SELECT NVL(MAX(SEQ),0)+1 FROM BOARD), ?, ?, ?)";
	private final String BOARD_UPDATE
		= "UPDATE BOARD SET TITLE=?, CONTENT=? WHERE SEQ=?";
	private final String BOARD_DELETE
		= "DELETE FROM BOARD WHERE SEQ = ?";
	private final String BOARD_GET
		= "SELECT * FROM BOARD WHERE SEQ = ?";
	private final String BOARD_LIST
		= "SELECT * FROM BOARD ORDER BY SEQ DESC";
	
	public BoardDAOSpring() {
		System.out.println(">> BoardDAOSpring 객체 생성(JdbcTemplate)");
	}
	//글입력
	public void insertBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 insertBoard() 실행");
		Object[] args = {vo.getTitle(), vo.getWriter(), vo.getContent()};
		jdbcTemplate.update(BOARD_INSERT, args);
	}
	
	//글수정
	public void updateBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 updateBoard() 실행");
		jdbcTemplate.update(BOARD_UPDATE, 
				vo.getTitle(), vo.getContent(), vo.getSeq());
	}
	
	//글삭제
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 deleteBoard() 실행");
		jdbcTemplate.update(BOARD_DELETE, vo.getSeq());
	}
	
	//글 상세 조회
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> Spring JDBC로 getBoard() 실행");
		//queryForObject("sql문", sql문매칭값(Object배열), 1개 row 데이타타입);
		Object[] args = {vo.getSeq()}; //sql문매칭값(Object배열)
		return jdbcTemplate.queryForObject(BOARD_GET, 
				args, new BoardRowMapper());
	}
	
	//글 목록 전체 조회
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> Spring JDBC로 getBoardList() 실행");
		return jdbcTemplate.query(BOARD_LIST, new BoardRowMapper());
	}
}











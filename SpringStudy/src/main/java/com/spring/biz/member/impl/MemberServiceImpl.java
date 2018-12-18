package com.spring.biz.member.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.biz.member.MemberVO;

@Service("memberService")
public class MemberServiceImpl {
	@Autowired
	private MemberDAO memberDAO;
	
	public void insertMember(MemberVO vo) {
		memberDAO.insertMember(vo);
	}

}

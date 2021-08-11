package com.team04.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.team04.member02.MemberDto02;

import lombok.extern.slf4j.Slf4j;

@Service
@Repository
@Slf4j
public class MemberService implements MemberDao {

	@Autowired
	private MemberDao memberDao;
	
	@Override
	public int signUp(String name, String mobile, String email, String password, String entryDate, String role, int enabled) {
		return memberDao.signUp(name, mobile, email, password, entryDate, role, enabled);
	}
		
	@Override
	public MemberDto signIn(String username, String password) {
		return memberDao.signIn(username, password);
	}

	@Override
	public MemberDto findByName(String username) {
		MemberDto member = new MemberDto("admin01", "01012341234", "admin01@email.com", "12345", "2021-07-20", "ROLE_ADMIN", 1);
//		return memberDao.findByName(username);
		return member;
	}
	
	@Override
	public MemberDto findByEmail(String email) {
		return memberDao.findByEmail(email);
	}
	
	@Override
	public MemberDto test02(String username) {
		return memberDao.test02(username);
	}

	@Override
	public List<MemberDto02> selectMemberList() {
		log.debug("#### 서비스테스트");
		return memberDao.selectMemberList();
	}



}
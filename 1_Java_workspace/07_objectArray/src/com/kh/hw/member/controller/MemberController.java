package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	int i = 0;
	public int existMemberNum() {
		return 0;
	}
	public Boolean checkId(String inputId) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				if(m[i].getId().equals(inputId)) {
					return false;
				}
			}
		}
		return true;
	}
	public String insertMember(String id, String name, String password, String email, char gender, int age) {
		return "����Ϸ�";
	}
	public String searchId(String id) {
		return " ";
	}
	public Member[] searchName(String name) {
		return m;
	}
	public Member[] searchEmail(String email) {
		return m;
	}
	public Boolean updatePassword(String id, String password) {
		return true;
	}
	public Boolean updateName(String id, String name) {
		return true;
	}
	public Boolean updateEmail(String id, String email) {
		return true;
	}
	public Boolean delete(String id) {
		return true;
	}
	public void delete() {
		
	}
	public Member[] printAll() {
		return m;
	}
}

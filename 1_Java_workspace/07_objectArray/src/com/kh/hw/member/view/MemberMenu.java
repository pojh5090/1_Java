package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public MemberMenu() {
		
	}
	public void mainMenu() {
		int num = 0;
		do {
			System.out.println("최대 등록 가능한 회원수는 " + (10-mc.existMemberNum()) + "명 입니다.");
			System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() +"명 입니다.");
			System.out.println("1. 새 회원 등록");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
			
			switch(num) {
			case 1 : insertMember(); break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : printAll(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		} while (num != 9);
	}
	
	public void insertMember() {
		System.out.println("새 회원을 등록합니다.");
		System.out.print("아이디: ");
		String mid = sc.next();
		if(mc.checkId(mid) == false) {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			System.out.print("아이디 : ");
			mid = sc.nextLine();
		}
		System.out.print("이름: ");
		String mname = sc.next();
		System.out.print("비밀번호: ");
		String mpasswd = sc.next();
		System.out.print("이메일: ");
		String memail = sc.next();
		System.out.print("성별(M/F): ");
		char msex = sc.next().toUpperCase().charAt(0);
		if(msex != 'F' && msex != 'M') {
			System.out.println("성별을 다시 입력하세요.");
			System.out.print("성별(M/F): ");
			msex = sc.nextLine().toUpperCase().charAt(0);
		}
		System.out.print("나이: ");
		int mage = sc.nextInt();
		
		mc.insertMember(mid, mname, mpasswd, memail, msex, mage);
		mainMenu();
	}
	public void searchMember() {
		
	}
	public void searchId() {
		
	}
	public void searchEmail() {
		
	}
	public void updateMember() {
		
	}
	public void updatePassword() {
		
	}
	public void updateName() {
		
	}
	public void updateEmail() {
		
	}
	public void deleteMember() {
		
	}
	public void deleteOne() {
		
	}
	public void deleteAll() {
		
	}
	public void printAll() {
		
	}
}

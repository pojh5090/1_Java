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
			System.out.println("�ִ� ��� ������ ȸ������ " + (10-mc.existMemberNum()) + "�� �Դϴ�.");
			System.out.println("���� ��ϵ� ȸ�� ���� " + mc.existMemberNum() +"�� �Դϴ�.");
			System.out.println("1. �� ȸ�� ���");
			System.out.println("2. ȸ�� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ����");
			System.out.println("5. ��� ���");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			num = sc.nextInt();
			
			switch(num) {
			case 1 : insertMember(); break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : printAll(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		} while (num != 9);
	}
	
	public void insertMember() {
		System.out.println("�� ȸ���� ����մϴ�.");
		System.out.print("���̵�: ");
		String mid = sc.next();
		if(mc.checkId(mid) == false) {
			System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���.");
			System.out.print("���̵� : ");
			mid = sc.nextLine();
		}
		System.out.print("�̸�: ");
		String mname = sc.next();
		System.out.print("��й�ȣ: ");
		String mpasswd = sc.next();
		System.out.print("�̸���: ");
		String memail = sc.next();
		System.out.print("����(M/F): ");
		char msex = sc.next().toUpperCase().charAt(0);
		if(msex != 'F' && msex != 'M') {
			System.out.println("������ �ٽ� �Է��ϼ���.");
			System.out.print("����(M/F): ");
			msex = sc.nextLine().toUpperCase().charAt(0);
		}
		System.out.print("����: ");
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

package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.print("���� : ");
		char gender = sc.next().charAt(0);
		
		Member m = new Member(name, age, gender);
		
		int menu = 0;
		while(true) {
			System.out.println("==== �޴� ====");
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			System.out.print("�޴� ��ȣ : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 : lc.myInfo(); break;
			case 2 : selectAll(); break;
			case 3 : searchBook(); break;
			case 4 : rentBook(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); return;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	public void selectAll() {
		Book[] bList = lc.selectAll();
		for(int i = 0 ; i < bList.length; i++) {
			if(bList[i] instanceof CookBook) {
				System.out.println(i + "�� ���� : " + ((CookBook)bList[i]).toString());
			} else {
				System.out.println(i + "�� ���� : " + ((AniBook)bList[i]).toString());
			}
		}
	}
	public void searchBook() {
		System.out.print("�˻��� ���� Ű���� : ");
		String key = sc.next();			
		Book[] searchList = lc.searchBook(key);
		for(int i = 0; i < searchList.length; i++) {
			if(searchList[i] instanceof CookBook) {
				System.out.println(((CookBook)searchList[i]).toString());
			} else {
				System.out.println(((AniBook)searchList[i]).toString());
			}
		}
	}
	public void rentBook() {		
		selectAll();
		System.out.print("�뿩�� ���� ��ȣ ���� : ");
		int index = sc.nextInt();
		
		int result = lc.rentBook(index);
		if(result == 0) {
			System.out.println("���������� �뿩�Ǿ����ϴ�.");
		} else if(result == 1) {
			System.out.println("���� �������� �뿩 �Ұ����Դϴ�.");
		} else {
			System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���.");
		}
	}
}

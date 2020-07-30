package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	public void mainMenu() {
		System.out.println("== Welcome KH Library ==");
		int menu = 0;
		
		do {
			System.out.println("**** ���θ޴� ****");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻� ��ȸ");
			System.out.println("4. ���� ����");
			System.out.println("5. ���� �� �������� ����");
			System.out.println("9. ����");
			System.out.print("�޴� ��ȣ ���� : ");
			menu = sc.nextInt();
			switch(menu) {
			case 1 : insertBook(); break;
			case 2 : selectList(); break;
			case 3 : searchBook(); break;
			case 4 : deleteBook(); break;
//			case 5 : ascBook(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���"); 
			}
		} while(menu != 9);
	}
	
	public void insertBook() {
		System.out.println("==== �� ���� �߰� ====");
		System.out.println("å ������ �Է����ּ���.");
		System.out.print("���� �� : ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("���� �� : ");
		String author = sc.next();
		System.out.print("�帣(1. �ι�/ 2. ���� / 3. �ܱ��� / 4. ��Ÿ) : ");
		int gen = sc.nextInt();
		System.out.print("���� : ");
		int price = sc.nextInt();
		String jang = null;
		if(gen == 1) {
			jang = "�ι�";
		} else if(gen == 2) {
			jang = "����"; 
		} else if(gen == 3) {
			jang = "�ܱ���";
		} else {
			jang = "��Ÿ";
		}
		
		Book bk = new Book(name, author, jang, price);
		bc.insertBook(bk);
	}
	
	public void selectList() {
		ArrayList<Book> bookList = bc.selectList();
		
		if(bookList == null) {
			System.out.println("�����ϴ� ������ �����ϴ�.");
		} else {
			System.out.println("=== ���� ��ü ��ȸ ===");
			for(int i = 0; i < bookList.size(); i++) {
				System.out.println(bookList.get(i));
			}
			
		}
	}
	
	public void searchBook() {
		System.out.println("=== ���� �˻� ====");
		System.out.print("�˻� Ű���� : ");
		String search = sc.next();
		
		ArrayList<Book> searchList =  bc.searchBook(search);
		
		for(int i = 0; i < searchList.size(); i++) {
			System.out.println(searchList.get(i));
		}
	}
	public void deleteBook() {
		System.out.println("=== ���� ���� ===");
		System.out.print("������ ���� �� : ");
		String dtitle = sc.next();
		System.out.print("������ ���� �� : ");
		String dauthor = sc.next();
		
		Book remove = bc.deleteBook(dtitle, dauthor);
		if(remove != null) {
			System.out.println("���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ ������ ã�� ���߽��ϴ�.");
		}
	}
	/////////////���� ������..////////////////
	
}

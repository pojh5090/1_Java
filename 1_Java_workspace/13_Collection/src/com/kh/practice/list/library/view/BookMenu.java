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
			System.out.println("**** 메인메뉴 ****");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			menu = sc.nextInt();
			switch(menu) {
			case 1 : insertBook(); break;
			case 2 : selectList(); break;
			case 3 : searchBook(); break;
			case 4 : deleteBook(); break;
//			case 5 : ascBook(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요"); 
			}
		} while(menu != 9);
	}
	
	public void insertBook() {
		System.out.println("==== 새 도서 추가 ====");
		System.out.println("책 정보를 입력해주세요.");
		System.out.print("도서 명 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.next();
		System.out.print("장르(1. 인문/ 2. 과학 / 3. 외국어 / 4. 기타) : ");
		int gen = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		String jang = null;
		if(gen == 1) {
			jang = "인문";
		} else if(gen == 2) {
			jang = "과학"; 
		} else if(gen == 3) {
			jang = "외국어";
		} else {
			jang = "기타";
		}
		
		Book bk = new Book(name, author, jang, price);
		bc.insertBook(bk);
	}
	
	public void selectList() {
		ArrayList<Book> bookList = bc.selectList();
		
		if(bookList == null) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			System.out.println("=== 도서 전체 조회 ===");
			for(int i = 0; i < bookList.size(); i++) {
				System.out.println(bookList.get(i));
			}
			
		}
	}
	
	public void searchBook() {
		System.out.println("=== 도서 검색 ====");
		System.out.print("검색 키워드 : ");
		String search = sc.next();
		
		ArrayList<Book> searchList =  bc.searchBook(search);
		
		for(int i = 0; i < searchList.size(); i++) {
			System.out.println(searchList.get(i));
		}
	}
	public void deleteBook() {
		System.out.println("=== 도서 삭제 ===");
		System.out.print("삭제할 도서 명 : ");
		String dtitle = sc.next();
		System.out.print("삭제할 저자 명 : ");
		String dauthor = sc.next();
		
		Book remove = bc.deleteBook(dtitle, dauthor);
		if(remove != null) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
	}
	/////////////여기 에러남..////////////////
	
}

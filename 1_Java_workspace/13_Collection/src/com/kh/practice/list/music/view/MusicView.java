package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	
	public void mainMenu() {	
		int menu = 0;		
		do {
			System.out.println("====***** 메인메뉴 *****====");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			menu = sc.nextInt();
			switch(menu) {
			case 1 : addList(); break;
			case 2 : addAtZero(); break;
			case 3 : printAll(); break;
			case 4 : searchMusic(); break;
			case 5 : removeMusic(); break;
			case 6 : setMusic(); break;
			case 7 : ascTitle(); break;
			case 8 : descSinger(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요"); 
			}
		} while(menu != 9);
	}
	public void addList() {
		System.out.println("***** 마지막 위치에 곡 추가 *****");
		System.out.print("곡 명 : ");
		String title = sc.next();
		System.out.print("가수 명 : ");
		String singer = sc.next();
		
		Music music = new Music(title, singer);
		boolean ok = mc.addList(music);
		if(ok == true) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}		
	}
	public void addAtZero() {
		System.out.println("***** 첫 위치에 곡 추가 *****");
		System.out.print("곡 명 : ");
		String title = sc.next();
		System.out.print("가수 명 : ");
		String singer = sc.next();
		
		Music music = new Music(title, singer);
		int ok = mc.addAtZero(music);
		if(ok == 1) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	}
	public void printAll() {
		System.out.println(mc.printAll());
	}
	public void searchMusic() {
		System.out.println("***** 특정 곡 검색 *****");
		System.out.print("검색할 곡 명 : ");
		String title = sc.next();
		
//		Music find = mc.searchMusic(title);
//		if(find != null) {
//			System.out.println(find);
//		} else {
//			System.out.println("검색한 곡이 없습니다.");
//		}
	}
	public void removeMusic() {
		
	}
	public void setMusic() {
		
	}
	public void ascTitle() {
		
	}
	public void descSinger() {
		
	}
}

package com.kh.practice.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	
	public void mainMenu() {	
		int menu = 0;		
		do {
			System.out.println("====***** ���θ޴� *****====");
			System.out.println("1. ������ ��ġ�� �� �߰�");
			System.out.println("2. ù ��ġ�� �� �߰�");
			System.out.println("3. ��ü �� ��� ���");
			System.out.println("4. Ư�� �� �˻�");
			System.out.println("5. Ư�� �� ����");
			System.out.println("6. Ư�� �� ���� ����");
			System.out.println("7. ��� �������� ����");
			System.out.println("8. ������ �������� ����");
			System.out.println("9. ����");
			
			System.out.println();
			System.out.print("�޴� ��ȣ ���� : ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1 : addList(); break;
			case 2 : addAtZero(); break;
			case 3 : printAll(); break;
			case 4 : searchMusic(); break;
			case 5 : removeMusic(); break;
			case 6 : setMusic(); break;
			case 7 : ascTitle(); break;
			case 8 : descSinger(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); break;
			default : System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���"); 
			}
		} while(menu != 9);
	}
	
	public void addList() {
		System.out.println("***** ������ ��ġ�� �� �߰� *****");
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String singer = sc.nextLine();
		
		Music music = new Music(title, singer);
		boolean ok = mc.addList(music);
		if(ok == true) {
			System.out.println("�߰� ����");
		} else {
			System.out.println("�߰� ����");
		}		
	}
	
	public void addAtZero() {
		System.out.println("***** ù ��ġ�� �� �߰� *****");
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String singer = sc.nextLine();
		
		Music music = new Music(title, singer);
		int ok = mc.addAtZero(music);
		if(ok == 1) {
			System.out.println("�߰� ����");
		} else {
			System.out.println("�߰� ����");
		}
	}
	public void printAll() {
		System.out.println("****** ��ü �� ��� ��� ******");
		List list = mc.printAll();
		if(list != null) {
			System.out.println(list);
		} else {
			System.out.println("�� ����� �����ϴ�.");
		}
	}
	public void searchMusic() {
		System.out.println("***** Ư�� �� �˻� *****");
		System.out.print("�˻��� �� �� : ");
		String title = sc.nextLine();
		
		Music find = mc.searchMusic(title);
		if(find != null) {
			System.out.println(find);
		} else {
			System.out.println("�˻��� ���� �����ϴ�.");
		}
	}
	public void removeMusic() {
		System.out.println("***** Ư�� �� ���� *****");
		System.out.print("������ �� �� : ");
		String title = sc.nextLine();
		
		Music find = mc.removeMusic(title);
		if(find != null) {
			System.out.println(find + "�� ���� �߽��ϴ�.");
		} else {
			System.out.println("������ ���� �����ϴ�.");
		}
	}
	public void setMusic() {
		System.out.println("***** Ư�� �� ���� ���� *****");
		System.out.print("�˻��� �� �� : ");
		String searchTitle = sc.nextLine();
		System.out.print("������ �� �� : ");
		String setTitle = sc.nextLine();
		System.out.print("������ ���� �� : ");
		String setSinger = sc.nextLine();
		
		Music music = new Music(setTitle, setSinger);
		Music result = mc.setMusic(searchTitle, music);
		if(result != null) {
			System.out.println(result + "�� ���� ���� �Ǿ����ϴ�.");
		} else {
			System.out.println("������ ���� �����ϴ�.");
		}
	}
	public void ascTitle() {
		System.out.println("***** �� �� �������� ���� *****");
		int result = mc.ascTitle();
		if(result == 1) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
	}
	public void descSinger() {
		int result = mc.descSinger();
		if(result == 1) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
	}
}

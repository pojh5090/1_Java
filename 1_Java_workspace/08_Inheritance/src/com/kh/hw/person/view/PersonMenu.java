package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	int[] arr = new int[2];
	
	public void mainMenu() {
		int num = 0;
		do {
			arr = pc.personCount();
			
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + arr[0] + "명 입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + arr[1] +"명 입니다.");
			System.out.println();
			
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
			
			switch(num) {
			case 1 : studentMenu(); break;
			case 2 : employeeMenu(); break;
			case 9 : System.out.println("종료합니다."); break;
			default : System.out.println("다시 입력해주세요."); 
			}
		} while(num != 9);								
	}
	public void studentMenu() {
		int num = 0;
		do {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			
			if(arr[0] >= 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다."); 
			}			
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
			
			switch(num) {
			case 1 :
				if(arr[0] >= 3) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); continue;
				}					
				insertStudent(); break;
			case 2 : printStudent(); break;
			case 9 : mainMenu(); break;
			default : System.out.println("다시 입력해주세요."); 
			}
		} while(num != 9);					
	}
	public void employeeMenu() {
		int num = 0;
		do {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
			
			switch(num) {
			case 1 : insertEmployee(); break;
			case 2 : printEmployee(); break;
			case 9 : mainMenu(); break;
			default : System.out.println("다시 입력해주세요."); 
			}
		} while(num != 9);
	}
	public void insertStudent() {	
		while(arr[0] <= 3) {
			System.out.print("학생 이름 : ");
			String n = sc.next();
			System.out.print("학생 나이 : ");
			int a = sc.nextInt();
			System.out.print("학생 키 : ");
			double h = sc.nextDouble();
			System.out.print("학생 몸무게 : ");
			double w = sc.nextDouble();
			System.out.print("학생 학년 : ");
			int g = sc.nextInt();
			System.out.print("학생 전공 : ");
			String m = sc.next();
			
			pc.insertStudent(n, a, h, w, g, m);

			System.out.print("그만 하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요. : ");
			String aa = sc.next();
			
			if(aa.equals("n") || aa.equals("N")) {
				System.out.println("학생메뉴로 돌아갑니다.");
				studentMenu();
				break;
			}
		}		
		if(arr[0] >= 3) {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찾기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
			studentMenu();
		}						
	}
	public void printStudent() {
		
	}
	public void insertEmployee() {
		
	}
	public void printEmployee() {
		
	}
}

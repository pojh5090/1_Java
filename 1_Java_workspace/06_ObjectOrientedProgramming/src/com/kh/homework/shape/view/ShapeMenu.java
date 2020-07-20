package com.kh.homework.shape.view;

import java.util.Scanner;

import com.kh.homework.shape.controller.ShapeController;

public class ShapeMenu {
	Scanner sc = new Scanner(System.in);
	ShapeController spr = new ShapeController();
	
	int num = 0;
	
	public void inputMenu() {
		System.out.println("==== 도형 프로그램 ====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		
		System.out.print("메뉴 번호 : ");
		num = sc.nextInt();
		
		if(num != 3 && num != 4 && num != 9) {
			System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			inputMenu();
		}
		
		if(num == 3) triangleMenu();
		if(num == 4) squareMenu();
		if(num == 9) {
			System.out.println("프로그램을 종료합니다.");
		}
	}
	
	public void triangleMenu() {
		System.out.println("==== 삼각형 ====");
		System.out.println("1. 삼각형면적");
		System.out.println("2. 삼각형색칠");
		System.out.println("3. 삼각형정보");
		System.out.println("9. 메인으로");
		
		System.out.print("메뉴 번호 : ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			inputData(3, 1);
			triangleMenu();
		} else if(choice == 2) {
			System.out.print("색깔 : ");
			String cc = sc.next();
			spr.paintColor(cc);
			System.out.println("색이 설정되었습니다.");
			triangleMenu();
		} else if(choice == 3) {
			printInform(3);
			triangleMenu();
		} else if(choice == 9) {
			System.out.println("메인으로 돌아갑니다.");
			inputMenu();
		} else {
			System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			triangleMenu();
		}
	}
	
	public void squareMenu() {
		System.out.println("==== 사각형 ====");
		System.out.println("1. 사각형둘레");
		System.out.println("2. 사각형면적");
		System.out.println("3. 사각형색칠");
		System.out.println("4. 사각형정보");
		System.out.println("9. 메인으로");
		
		System.out.print("메뉴 번호 : ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			inputData(4, 1);
			squareMenu();
		} else if(choice == 2) {
			inputData(4, 2);
			squareMenu();
		} else if(choice == 3) {
			System.out.print("색깔 : ");
			String cc = sc.next();
			spr.paintColor(cc);
			System.out.println("색이 설정되었습니다.");
			squareMenu();
		} else if(choice == 4) {
			printInform(4);
		} else if(choice == 9) {
			System.out.println("메인으로 돌아갑니다.");
			inputMenu();
		} else {
			System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			squareMenu();
		}
	}
	
	public void inputData(int type, int menuNum) {
		if(type == 3 && menuNum == 1) {
			System.out.print("높이 : ");
			int th = sc.nextInt();
			System.out.print("너비 : ");
			int tw = sc.nextInt();
			System.out.println("면적 : " + spr.calcArea(3, th, tw));
		} 
		if(type == 4 && menuNum == 1) {
			System.out.print("높이 : ");
			int sh = sc.nextInt();
			System.out.print("너비 : ");
			int sw = sc.nextInt();
			System.out.println("둘레 : " + spr.calcPerimeter(4, sh, sw));
		}
		if(type == 4 && menuNum == 2) {
			System.out.print("높이 : ");
			int sh = sc.nextInt();
			System.out.print("너비 : ");
			int sw = sc.nextInt();
			System.out.println("면적 : " + spr.calcArea(4, sh, sw));
		}

	}
	
	public void printInform(int type) {
		if(type == 3)
			System.out.println(spr.print(3));
		else
			System.out.println(spr.print(4));
	}
}

package com.kh.practice.view.Point;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	Scanner sc = new Scanner(System.in);
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		int num = 0;
		do {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			
			System.out.print("메뉴 번호 : ");
			num = sc.nextInt();
			
			switch(num) {
			case 1 : circleMenu(); break;
			case 2 : rectangleMenu(); break;
			case 9 : System.out.println("종료합니다."); break;
			default : System.out.println("다시 입력해주세요."); 
			}
		} while(num != 9);
	}
	public void circleMenu() {
		int menu = 0;
		do {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");		
			System.out.print("메뉴 번호 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 : calcCircum(); break;
			case 2 : calcCircleArea(); break;
			case 9 : mainMenu(); break;
			default : System.out.println("다시 입력해주세요."); continue;
			}
		} while (true);	
	}
	public void rectangleMenu() {
		int menu = 0;
		do {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로");		
			System.out.print("메뉴 번호 : ");
			menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1 : calcPerimeter(); break;
			case 2 : calcRectArea(); break;
			case 9 : mainMenu(); break;
			default : System.out.println("다시 입력해주세요."); continue;
			}
		} while (true);	
	}
	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int r = sc.nextInt();
		
		System.out.println(cc.calcCircum(x, y, r));
	}
	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int r = sc.nextInt();
		
		System.out.println(cc.calcArea(x, y, r));
	}
	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int h = sc.nextInt();
		System.out.print("너비 : ");
		int w = sc.nextInt();
		
		System.out.println(rc.calcPerimeter(x, y, h, w));
	}
	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int h = sc.nextInt();
		System.out.print("너비 : ");
		int w = sc.nextInt();
		
		System.out.println(rc.calcArea(x, y, h, w));
	}
}

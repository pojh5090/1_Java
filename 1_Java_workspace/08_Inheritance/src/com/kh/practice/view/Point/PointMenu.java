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
			System.out.println("==== �޴� ====");
			System.out.println("1. ��");
			System.out.println("2. �簢��");
			System.out.println("9. ������");
			
			System.out.print("�޴� ��ȣ : ");
			num = sc.nextInt();
			
			switch(num) {
			case 1 : circleMenu(); break;
			case 2 : rectangleMenu(); break;
			case 9 : System.out.println("�����մϴ�."); break;
			default : System.out.println("�ٽ� �Է����ּ���."); 
			}
		} while(num != 9);
	}
	public void circleMenu() {
		int menu = 0;
		do {
			System.out.println("==== �޴� ====");
			System.out.println("1. �� �ѷ�");
			System.out.println("2. �� ����");
			System.out.println("9. ��������");		
			System.out.print("�޴� ��ȣ : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 : calcCircum(); break;
			case 2 : calcCircleArea(); break;
			case 9 : mainMenu(); break;
			default : System.out.println("�ٽ� �Է����ּ���."); continue;
			}
		} while (true);	
	}
	public void rectangleMenu() {
		int menu = 0;
		do {
			System.out.println("==== �޴� ====");
			System.out.println("1. �簢�� �ѷ�");
			System.out.println("2. �簢�� ����");
			System.out.println("9. ��������");		
			System.out.print("�޴� ��ȣ : ");
			menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1 : calcPerimeter(); break;
			case 2 : calcRectArea(); break;
			case 9 : mainMenu(); break;
			default : System.out.println("�ٽ� �Է����ּ���."); continue;
			}
		} while (true);	
	}
	public void calcCircum() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("������ : ");
		int r = sc.nextInt();
		
		System.out.println(cc.calcCircum(x, y, r));
	}
	public void calcCircleArea() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("������ : ");
		int r = sc.nextInt();
		
		System.out.println(cc.calcArea(x, y, r));
	}
	public void calcPerimeter() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("���� : ");
		int h = sc.nextInt();
		System.out.print("�ʺ� : ");
		int w = sc.nextInt();
		
		System.out.println(rc.calcPerimeter(x, y, h, w));
	}
	public void calcRectArea() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("���� : ");
		int h = sc.nextInt();
		System.out.print("�ʺ� : ");
		int w = sc.nextInt();
		
		System.out.println(rc.calcArea(x, y, h, w));
	}
}

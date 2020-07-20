package com.kh.homework.shape.view;

import java.util.Scanner;

import com.kh.homework.shape.controller.ShapeController;

public class ShapeMenu {
	Scanner sc = new Scanner(System.in);
	ShapeController spr = new ShapeController();
	
	int num = 0;
	
	public void inputMenu() {
		System.out.println("==== ���� ���α׷� ====");
		System.out.println("3. �ﰢ��");
		System.out.println("4. �簢��");
		System.out.println("9. ���α׷� ����");
		
		System.out.print("�޴� ��ȣ : ");
		num = sc.nextInt();
		
		if(num != 3 && num != 4 && num != 9) {
			System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
			inputMenu();
		}
		
		if(num == 3) triangleMenu();
		if(num == 4) squareMenu();
		if(num == 9) {
			System.out.println("���α׷��� �����մϴ�.");
		}
	}
	
	public void triangleMenu() {
		System.out.println("==== �ﰢ�� ====");
		System.out.println("1. �ﰢ������");
		System.out.println("2. �ﰢ����ĥ");
		System.out.println("3. �ﰢ������");
		System.out.println("9. ��������");
		
		System.out.print("�޴� ��ȣ : ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			inputData(3, 1);
			triangleMenu();
		} else if(choice == 2) {
			System.out.print("���� : ");
			String cc = sc.next();
			spr.paintColor(cc);
			System.out.println("���� �����Ǿ����ϴ�.");
			triangleMenu();
		} else if(choice == 3) {
			printInform(3);
			triangleMenu();
		} else if(choice == 9) {
			System.out.println("�������� ���ư��ϴ�.");
			inputMenu();
		} else {
			System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
			triangleMenu();
		}
	}
	
	public void squareMenu() {
		System.out.println("==== �簢�� ====");
		System.out.println("1. �簢���ѷ�");
		System.out.println("2. �簢������");
		System.out.println("3. �簢����ĥ");
		System.out.println("4. �簢������");
		System.out.println("9. ��������");
		
		System.out.print("�޴� ��ȣ : ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			inputData(4, 1);
			squareMenu();
		} else if(choice == 2) {
			inputData(4, 2);
			squareMenu();
		} else if(choice == 3) {
			System.out.print("���� : ");
			String cc = sc.next();
			spr.paintColor(cc);
			System.out.println("���� �����Ǿ����ϴ�.");
			squareMenu();
		} else if(choice == 4) {
			printInform(4);
		} else if(choice == 9) {
			System.out.println("�������� ���ư��ϴ�.");
			inputMenu();
		} else {
			System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
			squareMenu();
		}
	}
	
	public void inputData(int type, int menuNum) {
		if(type == 3 && menuNum == 1) {
			System.out.print("���� : ");
			int th = sc.nextInt();
			System.out.print("�ʺ� : ");
			int tw = sc.nextInt();
			System.out.println("���� : " + spr.calcArea(3, th, tw));
		} 
		if(type == 4 && menuNum == 1) {
			System.out.print("���� : ");
			int sh = sc.nextInt();
			System.out.print("�ʺ� : ");
			int sw = sc.nextInt();
			System.out.println("�ѷ� : " + spr.calcPerimeter(4, sh, sw));
		}
		if(type == 4 && menuNum == 2) {
			System.out.print("���� : ");
			int sh = sc.nextInt();
			System.out.print("�ʺ� : ");
			int sw = sc.nextInt();
			System.out.println("���� : " + spr.calcArea(4, sh, sw));
		}

	}
	
	public void printInform(int type) {
		if(type == 3)
			System.out.println(spr.print(3));
		else
			System.out.println(spr.print(4));
	}
}

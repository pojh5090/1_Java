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
			
			System.out.println("�л��� �ִ� 3����� ������ �� �ֽ��ϴ�.");
			System.out.println("���� ����� �л��� " + arr[0] + "�� �Դϴ�.");
			System.out.println("����� �ִ� 10����� ������ �� �ֽ��ϴ�.");
			System.out.println("���� ����� ����� " + arr[1] +"�� �Դϴ�.");
			System.out.println();
			
			System.out.println("1. �л� �޴�");
			System.out.println("2. ��� �޴�");
			System.out.println("9. ������");
			
			System.out.print("�޴� ��ȣ : ");
			num = sc.nextInt();
			
			switch(num) {
			case 1 : studentMenu(); break;
			case 2 : employeeMenu(); break;
			case 9 : System.out.println("�����մϴ�."); break;
			default : System.out.println("�ٽ� �Է����ּ���."); 
			}
		} while(num != 9);								
	}
	public void studentMenu() {
		int num = 0;
		do {
			System.out.println("1. �л� �߰�");
			System.out.println("2. �л� ����");
			System.out.println("9. ��������");
			
			if(arr[0] >= 3) {
				System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰� �޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�."); 
			}			
			System.out.print("�޴� ��ȣ : ");
			num = sc.nextInt();
			
			switch(num) {
			case 1 :
				if(arr[0] >= 3) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); continue;
				}					
				insertStudent(); break;
			case 2 : printStudent(); break;
			case 9 : mainMenu(); break;
			default : System.out.println("�ٽ� �Է����ּ���."); 
			}
		} while(num != 9);					
	}
	public void employeeMenu() {
		int num = 0;
		do {
			System.out.println("1. ��� �߰�");
			System.out.println("2. ��� ����");
			System.out.println("9. ��������");
			
			System.out.print("�޴� ��ȣ : ");
			num = sc.nextInt();
			
			switch(num) {
			case 1 : insertEmployee(); break;
			case 2 : printEmployee(); break;
			case 9 : mainMenu(); break;
			default : System.out.println("�ٽ� �Է����ּ���."); 
			}
		} while(num != 9);
	}
	public void insertStudent() {	
		while(arr[0] <= 3) {
			System.out.print("�л� �̸� : ");
			String n = sc.next();
			System.out.print("�л� ���� : ");
			int a = sc.nextInt();
			System.out.print("�л� Ű : ");
			double h = sc.nextDouble();
			System.out.print("�л� ������ : ");
			double w = sc.nextDouble();
			System.out.print("�л� �г� : ");
			int g = sc.nextInt();
			System.out.print("�л� ���� : ");
			String m = sc.next();
			
			pc.insertStudent(n, a, h, w, g, m);

			System.out.print("�׸� �Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ� Ű�� ��������. : ");
			String aa = sc.next();
			
			if(aa.equals("n") || aa.equals("N")) {
				System.out.println("�л��޴��� ���ư��ϴ�.");
				studentMenu();
				break;
			}
		}		
		if(arr[0] >= 3) {
			System.out.println("�л��� ���� �� �ִ� ������ �� ã�� ������ �л� �߰��� �����ϰ� �л� �޴��� ���ư��ϴ�.");
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

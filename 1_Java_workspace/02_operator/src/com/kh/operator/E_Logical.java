package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	public void method1() {
		//�Է��� ���� ���� 1~100 ������ �������� Ȯ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		//1 ~ 100 == 1���� ũ�ų� ���� 100���� �۰ų� ����
		boolean result = (num >= 1) && (num <= 100);
		
		System.out.print("�Է��� ���� 1�� 100 ���̿� �ֳ���? " + result);
		
	}
	
	public void method2() {
		//�Է��� ���� ���� �빮������ Ȯ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		
		//���ڰ� A���� ũ�ų� ����, Z���ٴ� �۰ų� ����
		boolean result =  ch >= 'A' && ch <= 'Z';
		
		System.out.print("�Է��� ���ڰ� A~Z ���̿� �ֳ���? " + result);
		
		System.out.println("��� �Ͻ÷��� y Ȥ�� Y�� �Է��ϼ��� . ");
		System.out.print("��� �Ͻðڽ��ϱ�?(Y/y) : ");
		char answer = sc.nextLine().charAt(0);
		boolean result2 = answer == 'Y' || answer == 'y';
				
		System.out.println("��� �Ͻðڴٱ���? " + result2);
	}
}

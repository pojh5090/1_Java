package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public void print() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.next();
		
		System.out.print("������ �Է��ϼ���(��/��) : ");
		String sexStr = sc.next();
		
//		String sexStr = sc.nextLine();
//		char sex = sexStr.charAt(0);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("Ű " + height + "cm�� " + age + "�� " + sexStr + "�� " + name + 
				"�� �ݰ����ϴ�^^");
	}
}

package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public void munja() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String name = sc.next();
		
		char first = name.charAt(0);
		char second = name.charAt(1);
		char third = name.charAt(2);
		
		System.out.println("ù ��° ���� : " + first);
		System.out.println("�� ��° ���� : " + second);
		System.out.println("�� ��° ���� : " + third);
	}
}

package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public void calculate() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int a = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int b = sc.nextInt();
		
		System.out.println("���ϱ� ��� : " + (a + b));
		System.out.println("���� ��� : " + (a - b));
		System.out.println("���ϱ� ��� : " + (a * b));
		System.out.println("������ �� ��� : " + (a / b));
		
	}
}

package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void method() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double a = sc.nextDouble();
		
		System.out.print("���� : ");
		double b = sc.nextDouble();
		
		System.out.println("���� : " + (a * b));
		System.out.println("�ѷ� : " + (a + b) * 2);
	}
}

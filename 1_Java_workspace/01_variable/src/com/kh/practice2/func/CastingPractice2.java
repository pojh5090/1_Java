package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void score() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double kor =sc.nextDouble();
		
		System.out.print("���� : ");
		double eng = sc.nextDouble();
		
		System.out.print("���� : ");
		double mat = sc.nextDouble();
		
		int total = (int)(kor + eng + mat);
		
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + mat);
		System.out.println("���� : " + total);
		System.out.println("��� : " + total / 3);
	}
}

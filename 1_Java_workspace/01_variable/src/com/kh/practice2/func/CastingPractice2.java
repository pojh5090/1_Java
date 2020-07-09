package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void score() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor =sc.nextDouble();
		
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수학 : ");
		double mat = sc.nextDouble();
		
		int total = (int)(kor + eng + mat);
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + total / 3);
	}
}

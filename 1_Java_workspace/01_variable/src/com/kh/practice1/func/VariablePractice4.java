package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public void munja() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String name = sc.next();
		
		char first = name.charAt(0);
		char second = name.charAt(1);
		char third = name.charAt(2);
		
		System.out.println("첫 번째 문자 : " + first);
		System.out.println("두 번째 문자 : " + second);
		System.out.println("세 번째 문자 : " + third);
	}
}

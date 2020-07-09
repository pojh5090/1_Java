package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다" : "양수가 아니다 ";
		
		System.out.println(result);
	}
	
	public void practice2() {
	Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다" : (num == 0 ? "0이다" : "음수다");
		
		System.out.println(result);
	}
	
	public void practice3() {
	Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수다" : "홀수다";
		
		System.out.println(result);
	}
	
	public void practice4() {
	Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + num2 / num);
		System.out.println("남는 사탕 개수 : " + num2 % num);
	}
	
	public void practice5() {
	Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int ban = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		String sexStr = sc.next();
		
		String sex = sexStr.equals("M") ? "남" : "여";

		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		float score = sc.nextFloat();
		
		System.out.println(grade + "학년 " + ban + "반 " + num + "번 " + name + " " + 
				sex + "학생의 성적은 " + score + "이다");
	}
		
	
}

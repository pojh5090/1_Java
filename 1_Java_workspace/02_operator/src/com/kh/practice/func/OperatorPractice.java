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
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = (age <= 13) ? "어린이" : ((age > 13 && age <= 19) ? "청소년" : "성인");
		
		System.out.println(result);
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int mat = sc.nextInt();
		
		int sub = kor + eng + mat;
		double aver = sub / 3;
		
		System.out.println("합계 : " + sub);
		System.out.println("평균 : " + aver);
		
		String result = (kor >= 40 && eng >= 40 && mat >=40 && aver >= 60.0) ? 
				"합격" : "불합격";
		
		System.out.println(result);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(-포함) : ");
		String num = sc.next();
		
		String result = num.charAt(7) == 2 ? "여자" : "남자";
		System.out.println(result);
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int put = sc.nextInt();
		
		boolean result = (put<= num1 || put > num2) ? true : false;
		System.out.println(result);
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1 == num2 && num2 == num3) ? true : false;
		System.out.println(result);
	}
		
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int a = sc.nextInt();
		double ia = a + a*0.4;
		
		System.out.print("B사원의 연봉 : ");
		int b = sc.nextInt();
		double ib = b;
		
		System.out.print("C사원의 연봉 : ");
		int c = sc.nextInt();
		double ic = c + c*0.15;
		
		System.out.println("A사원 연봉/연봉+a : " + a + "/" + ia);
		String ar = ia >= 3000 ? "3000 이상" : "3000 미만";
		System.out.println(ar);
		
		System.out.println("B사원 연봉/연봉+a : " + b + "/" + ib);
		String br = ib >= 3000 ? "3000 이상" : "3000 미만";
		System.out.println(br);
		
		System.out.printf("C사원 연봉/연봉+a : " + c + "/" + "%.13f",ic);
		System.out.println();
		String cr = ic >= 3000 ? "3000 이상" : "3000 미만";
		System.out.println(cr);
	}
		
}

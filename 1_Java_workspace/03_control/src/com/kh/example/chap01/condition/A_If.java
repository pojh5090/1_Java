package com.kh.example.chap01.condition;

import java.util.Scanner;

public class A_If {
	//단독 if문
	// if(조건식) {
	//    실행할 문장;
	//   }
	//조건식의 결과 값이 참(true)이면 { } 안에 있는 코드 실행
	//조건식의 결과 값이 거짓(false)이면 { } 안에 있는 코드는 무시하고 넘어감
	public void method1() {
		//입력한 숫자가 양수인지 음수인지 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 한 개를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수입니다.");
		}
		
		if(num < 0) {
			System.out.println("음수입니다.");
		}
		
		if(num == 0) {
			System.out.println("0 입니다.");
		}
		
		System.out.println("프로그램 종료");
	}
	
	public void method2() {
		//입력한 숫자가 짝수인지 홀수인지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수 입니다.!");
		} 
		if(num % 2 != 0) {
			System.out.println("홀수 입니다.!");
		}
		
	}
	
	public void method3() {
		//입력한 숫자가 1~10사이의 숫자인지 확인
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0 && num < 11) {
			System.out.println("1~10 사이의 수입니다");
		}
		
		if(num <= 0 || num >= 11) {
			System.out.println("1과 10 사이의 숫자가 아닙니다.");
		}
	}
	
	public void method4() {
		//문자열 비교하기
		//이름을 입력 받아 본인 이름과 같으면 본인입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력 하세요 : ");
		String name = sc.nextLine();
		
		//**문자열에서 비교는 == 사용 불가!**
		//문자열 비교는 String 클래스 안에 있는 equals() 메소드로 비교
		
		if(name.equals("강진희"))
		{
			System.out.println("본인입니다.");
		}
		if(!name.equals("강진희"))
		{
			System.out.println("본인이 아닙니다.");
		}
	}
}

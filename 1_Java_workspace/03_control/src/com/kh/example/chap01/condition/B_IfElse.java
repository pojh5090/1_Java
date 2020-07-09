package com.kh.example.chap01.condition;

import java.util.Scanner;

public class B_IfElse {
	//if-else문
	//if(조건식) {
	//     실행할 문장1;
	// }  else {
	//     실행할 문장2;
	// }
	//둘 중 한 개를 선택하는 조건문
	//조건식의 결과 값이 참(true)이면 if안에 있는 실행 문장1 수행
	//조건식의 결과 값이 거짓(false)이면 else 안에 있는 실행문장2 수행
	// ==> 조건이 참인 경우와 거짓인 경우에 수행하는 명령을 따로 작성하는 경우 사용
	
	public void method1() {
		//입력한 숫자가 양수인지 음수인지 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수 입니다.");
		} 
		else {  
			//음수 or 0
			//System.out.println("양수가 아닙니다.");
			if(num == 0) {
				System.out.println("0 입니다");				
			}
			else {
				System.out.println("음수입니다.");
			}			
		}
	}
	
	public void method2() {
		//입력한 숫자가 짝수인지 홀수인지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 한 개를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num%2 == 0) {
			System.out.println("짝수 입니다.");
		}
		else {	
			System.out.println("홀수 입니다.");
		}
	}
	
	public void method3() {
		//입력한 숫자가 1~10 사이의 숫자인지 확인
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 한 개를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 10) {
			System.out.println("1~10사이의 숫자입니다.");
		} else {
			System.out.println("범위 밖입니다.");
		}
	}
	
	public void method4() {
		//이름 비교하기
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		
		String name = sc.next();
		
		if(name.equals("강진희")) {
			System.out.println("본인입니다.");
		} else {
			System.out.println("본인이 아닙니다.");
		}
	}
	
}

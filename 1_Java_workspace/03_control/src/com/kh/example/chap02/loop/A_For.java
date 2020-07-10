package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
	// for(초기식; 조건식; 증감식) {
	//    실행 문장;
	// }
	// 초기식 -> 조건식 확인 -> (조건식이 true일 때) 실행문장 수행 -> 증감식 -> 조건식 확인 -> (반복)
	// 조건식의 결과가 false가 될 때 까지 반복
	
	// for문 안에 있는 초기식, 조건식, 증감식 생략 가능
	// 초기식은 무엇인지, 조건은 무엇인지, 증감은 얼마나 되는지 소괄호 안은 아니어도 어딘가에는 표기해야 함
	// 결국 for() 안에서만 생략될 뿐 모두 필요한 요소	
	public void method1() {
		// 1부터 5부터 출력
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + " 반복");
		}
	}
	
	public void method1_1() {
		// 자기소개 다섯번 하기 : 내 이름은 박신우야
//		for(int i = 0; i <= 4; i++)  //==> 0 1 2 3 4
		for(int i = 0; i < 5; i++) {
			System.out.println("내 이름은 박신우야");
		}
	}
	
	public void method2() {
		// 5부터 1까지 출력
//		for(int i =5; i > 0; --i) {
//			System.out.println(i);
//		}
		for(int i = 1; i <= 5; i++) {
			System.out.println(6 - i);
		}
	}
	
	public void method2_1() {
		// 8부터 3까지 출력
		for(int i = 8; i > 2; --i) {
			System.out.println(i);
		}
	}
	
	public void method3() {
		// 1~10 사이의 홀수만
//		for(int i = 1; i <= 10; i++) {
//			if(i % 2 != 0) {
//				System.out.println(i);
//			}
//		}
		for(int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
	}
	
	public void method4() {
		//정수 두 개를 입력 받아 그 사이 숫자 출력
		//정수 두개 입력하세요.
		//단 , 첫번째 숫자를 두번쨰 숫자보다 작게 입력.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 입력: ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 수 입력: ");
		int num2 = sc.nextInt();
		
//		for(int i = num1; i <= num2; ++i) {
//			System.out.print(i + " ");
//		}
//		for(; num1 <= num2; num1++) {
//			System.out.print(num1 + " ");
//		}
		
		int max = 0;  //두 숫자 중 큰 숫자 저장 
		int min = 0;  //두 숫자 중 작은 숫자 저장
		
		if(num1 <= num2) {
			max = num2;
			min = num1;
		} else {  //반대 상황
			max = num1;
			min = num2;
		}
		
		for(int i = min; i <= max; i++) {
			System.out.print(i + " ");
		}
		
	}
	
	public void method4_1() {
		// 정수를 하나 입력 받아 그 수가 1~9사이의 숫자일때만 그 수의 구구단 출력
		// 조건이 맞지 않으면 "1~9 사이의 양수를 입력해야 합니다. " 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~9 사이의 숫자를 입력하세요 : ");
		int gugu = sc.nextInt();
		
		if(gugu >= 1 && gugu <= 9) {
			for(int i = 1; i <= 9; ++i) {
				System.out.println(gugu + " x " + i + " = " + gugu*i );
			}
		} else {
			System.out.println("1~9사이의 양수를 입력해야 합니다.");
		}
	}
	
	public void method5() {
		//1부터 10사이의 임의의 난수를 정해 1부터 난수까지의 합계
		//랜덤 값 생성 메소드 : Math.random();
		// 0이상 1미만의 실수를 랜덤으로 반환(double)
		// 0단계) 0 <= Math.random() < 1   (실수)
		// 1단계) 0 <= Math.random() * 10 < 10 : 0~9.99999999
		// 2단계) 1 <= Math.random()*10 + 1 < 11  : 1~10.9999999
		// 3단계) 1 < (int)(Math.random() * 10 + 1) < 11
		
		int num = (int)(Math.random() * 10 + 1);
		int sum = 0;
		
		for(int i = 1; i <= num; ++i ) {
			sum += i;
		}
		System.out.println("난수는 : " + num);
		System.out.println("합계는 : " + sum);
		
	}
	
	public void method6() {
		//중첩 for문 : for문 안에 for문
		//2단부터 9단까지 출력
		for(int i = 2; i <= 9; ++i) {
			for(int j = 1; j <= 9; ++j ) {
				System.out.println(i + " X " + j + " = " + (i*j));
			}
		}
	}
	
	public void method7() {
		//아날로그 시계 : 0시 0분 ~ 23시 59분
		for(int i = 0; i <= 23; i++) {
			for(int j = 0; j <= 59; j++) {
				System.out.println(i + "시 " + j + "분" );
			}
		}
	}
	
	public void method8() {
		//한 줄에 별 표(*)가 5 번 출력되는데 그 줄은 사용자가 입력한 수 만큼 출력
		//ex -> 3
		//*****
		//*****
		//*****
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해라: ");
		int row = sc.nextInt();
		
		for(int i = 0; i < row; ++i ) {
			for(int j = 0; j < 5; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method9() {
		//한 줄에 별표 문자를 입력한 줄 수와 칸 수 만큼 입력
		//단, 줄 수와 칸 수가 일치하는 위치에는 줄 번호에 대한 정수 출력
		//ex
		// 줄 수 : 4, 칸 수 : 5
		// 1****
		// *2***
		// **3**
		// ****4
		Scanner sc = new Scanner(System.in);
		
		System.out.print("줄 수를 입력: ");
		int row = sc.nextInt();
		
		System.out.print("칸 수를 입력: ");
		int kan = sc.nextInt();
		
		for(int i = 1; i <= row; ++i) {
			for(int j = 1; j <= kan; ++j) {
				if(i == j) {
					System.out.printf("%d", j);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	
}

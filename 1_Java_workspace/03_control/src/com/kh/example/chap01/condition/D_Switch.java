package com.kh.example.chap01.condition;

import java.util.Scanner;

public class D_Switch {
	//조건식의 결과 값을 case에서 찾아 명령을 수행하는 조건문
	//해당하는 값이 case에 없을 경우에는 default의 명령문 수행
	
	//case와 수행문 사이에는 콜론(:)을 써야함
	//break가 없으면 멈추지 않고 계속 수행
	
	//switch(변수) {
	// case 값1 : 실행문1; break;  -->변수의 값이 값1이면 실행
	// case 값2 : 실행문2; break;  -->변수의 값이 값2이면 실행
	// default : 실행문3;          -->변수의 값이 case문에 없으면 실행
	// }
	
	public void method1() {
		//정수 두 개와 연산기호 문자 1개를 입력받아
		//연산 기호 문자에 해당하는 계산을 수행하고 출력하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 값 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 값 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자(+, -, *, /) : ");
		char op = sc.next().charAt(0);
		
		int result = 0;
		
		switch(op) {
		case '+' :
			result = num1 + num2;
			break;
		case '-' :
			result = num1 - num2;
			break;
		case '*' :
			result = num1 * num2;
			break;
		case '/' :
			result = num1 / num2;
			break;
		default:
			System.out.println("잘못 입력 하셨습니다.");
		}	
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("신우네 과일가게 입니다!^^");
		System.out.println("사과, 바나나, 복숭아, 키위 있습니다~ 가격 편하게 물어보세요!");
		System.out.println("어떤 과일의 가격이 궁금하세요? : ");
		String fruit = sc.next();
		
		int price = 0;
		
		switch(fruit) {     //여기 break 없애면 에러~~
		case "사과" : 
			price = 1000;
			break;
		case "바나나" :
			price = 3000;
			break;
		case "복숭아" :
			price = 2000;
			break;
		case "키위" :
			price = 5000;
			break;
		default :
			System.out.println("그 과일은 없습니다.");
		}
		System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
	}
	
	public void method3() {
		//1월부터 12월까지 입력받아 해당하는 달의 마지막 날짜를 출력하세요.
		//2월만 28
		//1,3,5,7,8,10,12 ->31일
		//4,6,9,11->30일
		Scanner sc = new Scanner(System.in);
		System.out.print("1월 ~ 12월까지 중 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
//		switch(num) {
//		case 1 : System.out.println("31일"); break;
//		case 2 : System.out.println("28일"); break;
//		case 3 : System.out.println("31일"); break;
//		case 4 : System.out.println("30일"); break;
//		case 5 : System.out.println("31일"); break;
//		case 6 : System.out.println("30일"); break;
//		case 7 : System.out.println("31일"); break;
//		case 8 : System.out.println("31일"); break;
//		case 9 : System.out.println("30일"); break;
//		case 10 : System.out.println("31일"); break;
//		case 11 : System.out.println("30일"); break;
//		case 12 : System.out.println("31일"); break;
//		default : System.out.println("1부터 12사이의 숫자를 입력하세요");
//		}
		
		switch(num) {
		case 1 : case 3 : case 5 : case 7 : case 8 : 
		case 10 : case 12 :
			System.out.println("31일 까지 입니다."); break;
		case 4 : case 6 : case 9 : case 11 :
			System.out.println("30일 까지 입니다."); break;
		case 2 : 
			System.out.println("28일 까지 입니다."); break;
		default :
			System.out.println("1부터 12사이의 숫자를 입력하세요");
		}
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("****우리의 메뉴입니다.****");
		System.out.println("1. 간단하게 계산하기");
		System.out.println("2. 신우네 과일 가게");
		System.out.println("3. 월의 막날 출력하기");
		System.out.print("메뉴 번호 : ");		
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 :
//			System.out.println("간단 계산");
			method1();  //호출한거임!
			break;
		case 2 :
//			System.out.println("신우네");
			method2();
			break;
		case 3 :
//			System.out.println("막날");
			method3();
			break;
		default :
			System.out.println("메뉴 번호를 다시 입력해주세요.");
		}	
	}
}

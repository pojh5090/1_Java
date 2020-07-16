package com.kh.example.chap04_field.controller;

public class KindsOfVariabke { // <== 클래스 영역의 시작
	// 클래스 영역에 작성하는 변수 : 필드
	// 필드 == 멤버 변수 == 멤버 필드 == 전역변수
	
	private int globalNum;  //멤버 필드 = 전역변수 = 멤버 변수 = 필드
	
	public void method1(int num) {  // <== 메소드 영역의 시작
		               //매개변수 (지역변수)
		int localNum; // <-----메소드 안에 있다 == 지역 변수!
		
		//System.out.println(localNum); 하면 에러!
		//The local variable localNum may not have been initialized ->초기화가 안됐어~
		//지역 변수는 선언 외에 다시 사용하기 위해서는 반드시 초기화가 되어있어야함***
		
		System.out.println(num); 
		//이미 채워져서 오기 때문에 num 그냥 사용 가능
		
		System.out.println(globalNum);
		//필드는 초기화 안되어도 사용 가능..
		
	} // <== 메소드 영역의 끝
	
	public void method2() {
		//System.out.println(localNum);  --> 지역 변수는 해당 지역(블록 안)안에서만 사용 가능
		System.out.println(globalNum);
	}
	
} // <== 클래스 영역의 끝

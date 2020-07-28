package com.kh.example.chap02_throws.controller;

public class ThrowsController {
	public void method1() throws Exception {
		System.out.println("method1() 호출됨...");
		method2(); //여기서 선택 할 수있음  1.위임할것인지,  2. 처리할 것인지  --->현재는 main으로 위임됨.
		System.out.println("method1() 종료됨...");
	}
	public void method2() throws Exception {
		System.out.println("method2() 호출됨...");
		method3(); //여기서 선택 할 수있음  1.위임할것인지,  2. 처리할 것인지
		System.out.println("method2() 종료됨...");
	}
	public void method3() throws Exception {
		System.out.println("method3() 호출됨...");
		
		throw new Exception();
		
		//System.out.println("method3() 종료됨...");
		//Unreachable code
		//어차피 도달을 못하기 때문에 의미가 없는 코드가 됨.
		
		//메소드에 계속 throws Exception 추가해줌으로써 exception 위임함.
		
	}
}

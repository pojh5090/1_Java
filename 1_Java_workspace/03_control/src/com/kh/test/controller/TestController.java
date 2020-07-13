package com.kh.test.controller;

public class TestController {
	public void methodA() {
		System.out.println("methodA() 호출됨...");
		methodB();
		System.out.println("methodA() 종료됨...");
		//return;  ->각 메소드안에 return은 숨어져있음 .. 그래서 자동으로 돌아가는것임.
	}
	
	public void methodB() {
		System.out.println("methodB() 호출됨...");
		methodC(); 
		System.out.println("methodB() 종료됨...");
		//return;
	}
	
	public void methodC() {
		System.out.println("methodC() 호출됨...");
		System.out.println("methodC() 종료됨...");
		//return;
	}
}

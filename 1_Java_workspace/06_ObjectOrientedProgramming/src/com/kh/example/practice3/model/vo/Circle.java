package com.kh.example.practice3.model.vo;

public class Circle {
	private static final double PI = 3.14;    //상수니까 final 꼭 써주기!
	private static int radius = 1;
	
	public Circle() {
	}
	
	public void incrementRadius() {
		radius = radius + 1;
	}
	
	public void getAreaOfCircle() {
		System.out.println("원의 넓이 : " + PI * radius * radius);
	}
	
	public void getSizeOfCircle() {
		System.out.println("원의 둘레 : " + 2 * PI * radius);
	}
}

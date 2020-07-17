package com.kh.example.practice3.run;

import com.kh.example.practice3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		Circle cc = new Circle();
		
		System.out.println("반지름 1 증가 전의 넓이 및 둘레");
		cc.getAreaOfCircle();
		cc.getSizeOfCircle();
		
		cc.incrementRadius();
		
		System.out.println("반지름 1 증가 후의 넓이 및 둘레");
		cc.getAreaOfCircle();
		cc.getSizeOfCircle();
		
		

	}

}

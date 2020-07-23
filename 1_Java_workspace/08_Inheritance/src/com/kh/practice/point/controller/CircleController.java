package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double area = Math.PI * radius * radius;
		return "면적 : " + c.getX() + ", " + c.getY() + ", " + c.getRadius() + " / " + area;
	}
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double cir = Math.PI * radius * 2;
		return "둘레 : " + c.getX() + ", " + c.getY() + ", " + c.getRadius() + " / " + cir;
	}
}

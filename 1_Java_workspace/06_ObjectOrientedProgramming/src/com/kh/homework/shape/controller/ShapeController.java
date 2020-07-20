package com.kh.homework.shape.controller;

import com.kh.homework.shape.model.vo.Shape;

public class ShapeController {
	Shape s = new Shape();
	
	public double calcPerimeter(int type, double height, double width) {
		s.setType(type);
		s.setHeight(height);
		s.setWidth(width);
		
		return (width + height) * 2;
	}
	
	public double calcArea(int type, double height, double width) {
		s.setType(type);
		s.setHeight(height);
		s.setWidth(width);		
		
		if(type == 4) {
			return width * height;
		}
		return width * height * 0.5;
	}
	public void paintColor(String color) {
		s.setColor(color);
	}
	public String print(int type) {
		if(type == 3)
			return "�ﰢ��" + s.inform();
		
		return "�簢��" + s.inform();
	}
}

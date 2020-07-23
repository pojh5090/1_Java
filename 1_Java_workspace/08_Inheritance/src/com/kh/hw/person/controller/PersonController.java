package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Student;
import com.kh.hw.person.model.vo.Employee;

public class PersonController {
	Student[] s = new Student[3];
	Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int[] cc = new int[2];
		return cc;
	}
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for(int i = 0; i < s.length; i++) {
			s[i].setName(name);
			s[i].setAge(age);
			s[i].setHeight(height);
			s[i].setWeight(weight);
			s[i].setGrade(grade);
			s[i].setMajor(major);
		}								
	}
	public Student[] printStudent() {
		return s;
	}
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		
	}
	public Employee[] printEmployee() {
		return e;
	}
}

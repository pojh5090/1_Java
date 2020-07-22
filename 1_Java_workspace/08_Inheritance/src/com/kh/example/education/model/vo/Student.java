package com.kh.example.education.model.vo;

public class Student extends Academy {
	/*
 	- academy: String
 	- academy: String
 	- name: String
 	- classroom: char
 	- course: String
 	- money: int
 	
 	+ Student()
 	+ Student(academy:String, acaAddr:String, name:String, classroom:char,
 			  course:String, money:int)
 	
 	+ setter/getter
 	+ inform(): String
 		academy + " " + acaAddr + " " + name + " " + classroom + 
 		course + " " + money
 */
	private String course;
	private int money;
	
	public Student() {
		
	}
	public Student(String academy, String acaAddr, String name, char classroom, String course, int money) {
		super(academy, acaAddr, name, classroom);  //Academy 클래스의 생성자 호출~
		this.course = course;
		this.money = money;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
//	public String inform() {
//		return super.getAcademy() + " " + super.getAcaAddr() + " " + super.getName() + " " + super.getClassroom() + 
//		 		course + " " + money;
//	}
//	@Override
//	public String inform() {
//		return super.inform() + course + " " + money;
//	}
	@Override
	public String toString() {
		return super.toString() + course + " " + money;
	}
}

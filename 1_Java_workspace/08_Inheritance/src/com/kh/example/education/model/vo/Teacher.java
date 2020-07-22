package com.kh.example.education.model.vo;

public class Teacher extends Academy {
	/*
 	- academy: String
 	- academy: String
 	- name: String
 	- classroom: char
 	- subject: String
 	- career: int
 	
 	+ Teacher()
 	+ Teacher(academy:String, acaAddr:String, name:String, classroom:char,
 			  subject:String, career: int)
 	
 	+ setter/getter
 	+ inform(): String
 		academy + " " + acaAddr + " " + name + " " + classroom + 
 		subject + " " + career
 */
	private String subject;
	private int career;
	
	public Teacher() {
		
	}
	public Teacher(String academy, String acaAddr, String name, char classroom, String subject, int career) {
		super(academy, acaAddr, name, classroom);
		this.subject = subject;
		this.career = career;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getCareer() {
		return career;
	}
	public void setCareer(int career) {
		this.career = career;
	}
//	@Override
//	public String inform() {
//		return super.inform() + subject + " " + career;
//	}
	@Override
	public String toString() {
		return super.toString() + subject + " " + career;
	}
}

package com.kh.example.chap06_method.model.vo;

public class Trainee {
	/*
	     - name : String
	     - ACADEMY: String = "KH"  -> final �ʿ�!
	     - classRoom: char
	     - time: String
	     - score:double -> �̰� static����
	     ----------------
	     
	     + Trainee()
	     + Trainee(name:String, classRoom:char, time:String, score:double)
	     
	     + changeName(name:String):void
	     + printName():String
	     + getACADEMY():String
	     + setClassRoom(classRoom:char) : void
	     + showClassRoom(): char	  
	 */
	
	private String name;
	private final String ACADEMY = "KH";
	private char classRoom;
	private String time;
	private static double score;
	
	public Trainee() {}
	public Trainee(String name, char classRoom, String time, double score) {
		this.name = name;
		this.classRoom = classRoom;
		this.time = time;
		Trainee.score = score;
	}	
//	public void changeName(String name) {
//		this.name = name;
//	}
	public void setName(String name) {
		this.name = name;
	}
//	public String printName() {
//		return name;
//	}
	public String getName() {
		return name;
	}
//	public String getACADEMY() {
//		return ACADEMY;
//	}
	public String getACADEMY() {
		return ACADEMY;
	}	
//	public void setClassRoom(char classRoom) {
//		this.classRoom = classRoom;
//	}
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}
//	public char showClassRoom() {
//		return classRoom;
//	}
	public char getClassRoom() {
		return classRoom;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTime() {
		return time;
	}
	//ACADEMY�� setter �Լ� �ȸ���~~�����
	
	public static void setScore(double score) {
		//this.score = score;
		//The static field Trainee.score should be accessed in a static way (���޽��� ����)
		Trainee.score = score;   
		//�̷��� ���־�� �Ѵ�..
		//static �����ϱ� ��ü�������� ���� Ŭ���� �̸� �ٿ��� �����;���!
	}
	public static double score(double score) {
		return score;
	}
	
	public String inform() {
		return ACADEMY + " " + name + "�Ʒû��� " + classRoom + "�� " + time + "�̰�, " +
				score + "���Դϴ�.";
	}
}

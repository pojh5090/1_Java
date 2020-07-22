package com.kh.example.test.model.vo;

public class Child1 {
	private String str;
	private int num;
	
	public Child1() {
		Parent p = new Parent();
		//p.num = 10;  //->불가능
		p.dNum = 0.1;  //->가능, default는 같은 패키지내서 가능하기 때문
		p.bool = true; //->가능, 같은 패키지 내라서 
		p.ch = 'a';  //->가능
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
}

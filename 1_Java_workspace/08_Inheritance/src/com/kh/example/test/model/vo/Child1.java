package com.kh.example.test.model.vo;

public class Child1 {
	private String str;
	private int num;
	
	public Child1() {
		Parent p = new Parent();
		//p.num = 10;  //->�Ұ���
		p.dNum = 0.1;  //->����, default�� ���� ��Ű������ �����ϱ� ����
		p.bool = true; //->����, ���� ��Ű�� ���� 
		p.ch = 'a';  //->����
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

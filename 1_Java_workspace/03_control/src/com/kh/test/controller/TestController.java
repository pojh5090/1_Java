package com.kh.test.controller;

public class TestController {
	public void methodA() {
		System.out.println("methodA() ȣ���...");
		methodB();
		System.out.println("methodA() �����...");
		//return;  ->�� �޼ҵ�ȿ� return�� ���������� .. �׷��� �ڵ����� ���ư��°���.
	}
	
	public void methodB() {
		System.out.println("methodB() ȣ���...");
		methodC(); 
		System.out.println("methodB() �����...");
		//return;
	}
	
	public void methodC() {
		System.out.println("methodC() ȣ���...");
		System.out.println("methodC() �����...");
		//return;
	}
}

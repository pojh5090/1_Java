package com.kh.example.chap02_throws.controller;

public class ThrowsController {
	public void method1() throws Exception {
		System.out.println("method1() ȣ���...");
		method2(); //���⼭ ���� �� ������  1.�����Ұ�����,  2. ó���� ������  --->����� main���� ���ӵ�.
		System.out.println("method1() �����...");
	}
	public void method2() throws Exception {
		System.out.println("method2() ȣ���...");
		method3(); //���⼭ ���� �� ������  1.�����Ұ�����,  2. ó���� ������
		System.out.println("method2() �����...");
	}
	public void method3() throws Exception {
		System.out.println("method3() ȣ���...");
		
		throw new Exception();
		
		//System.out.println("method3() �����...");
		//Unreachable code
		//������ ������ ���ϱ� ������ �ǹ̰� ���� �ڵ尡 ��.
		
		//�޼ҵ忡 ��� throws Exception �߰��������ν� exception ������.
		
	}
}

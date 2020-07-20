package com.kh.example.chap06_method.controller;

import com.kh.example.chap05_constructor.model.vo.User;

public class MethodController {
	// �Ű����� ������ ��ȯ �� ������ ���� ����
	// 1. �Ű����� ���� ��ȯ �� ���� �޼ҵ�
	public void method1() {
		//�޼ҵ� ���븸 ���� �� �ƹ� ���� ��ȯ���� �ʰ� ������.
		System.out.println("�Ű������� ��ȯ �� �� �� ���� �޼ҵ� �Դϴ�.");
//		return;
	}
	// 2. �Ű����� ���� ��ȯ �� �ִ� �޼ҵ�
	public int method2() {
//		int i = 0;
//		return i;
		return 0;
	}
	// 3. �Ű����� �ְ� ��ȯ �� ���� �޼ҵ�
	public void method3(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}
	// 4. �Ű����� �ְ� ��ȯ �� �ִ� �޼ҵ�
	public int method4(int a, int b) {
		return a - b;
	}
	
	// ��ȯ ���� �迭�� ���
	public int[] method5() {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println("MethodController arr : " + arr);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] *= 10;
		}
		
		return arr;
	}
	// ��ȯ ���� Ŭ������ ���
	public User method6() {
		User user = new User("user01", "pass01", "ȫ�浿");
		System.out.println("MethodController user : " + user);
		return user;
	}
	
}

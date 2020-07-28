package com.kh.example.chap04_user.controller;

import java.util.Scanner;

import com.kh.example.chap04_user.model.exception.MyException;

public class MyExceptionController {
	
	public void inputAge() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է� �ϼ��� : ");
		int age = sc.nextInt();
		
		try {
			checkAge(age);
		} catch (MyException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public void checkAge(int age) throws MyException {
		if(age < 19) {
			throw new MyException("�� 19�� �̸��� ������ �Ұ��մϴ�.");
		} else {
			System.out.println("��ſ� ���� �Ǽ���.");
		}
	}
}

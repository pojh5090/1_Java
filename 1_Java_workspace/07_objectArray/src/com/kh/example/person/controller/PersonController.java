package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	public void method1() {
		//��ü �迭�� ��ü�� ���� �迭
		// Person��ü�� �� �� �ִ� 5���� ���� pArr ����
		
		Person[] pArr = new Person[5];
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.print(pArr[i] + " ");
		}
		System.out.println();
		
		//�ε����� �̿��� �ʱ�ȭ
		pArr[0] = new Person("���ǰ�", 25, '��', 179.5, 75.6);
		pArr[1] = new Person("������", 13, '��', 213.4, 34.2);
		pArr[2] = new Person("�����", 40, '��', 180.1, 79.4);
		pArr[3] = new Person("�����", 5, '��', 100.2, 24.9);
		pArr[4] = new Person("���̹�", 27, '��', 161.2, 60.4);
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].personInfo());
		}
		
		System.out.println();
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i] + " ");
		}
	}	
	public void method2() {
		//��ü �迭�� �Ҵ�� ���ÿ� �ʱ�ȭ ����
		int[] iArr = {1, 2, 3, 4, 5};
		
		Person[] pArr = {new Person("�ں���", 27, '��', 144.4, 34), 
						 new Person("�ۼ���", 34, '��', 150.4, 56.6),
						 new Person("������", 54, '��', 179.6, 80.1)};
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].personInfo());
		}
	}	
}

package com.kh.example.chap04_field.controller;

public class KindsOfVariabke { // <== Ŭ���� ������ ����
	// Ŭ���� ������ �ۼ��ϴ� ���� : �ʵ�
	// �ʵ� == ��� ���� == ��� �ʵ� == ��������
	
	private int globalNum;  //��� �ʵ� = �������� = ��� ���� = �ʵ�
	
	public void method1(int num) {  // <== �޼ҵ� ������ ����
		               //�Ű����� (��������)
		int localNum; // <-----�޼ҵ� �ȿ� �ִ� == ���� ����!
		
		//System.out.println(localNum); �ϸ� ����!
		//The local variable localNum may not have been initialized ->�ʱ�ȭ�� �ȵƾ�~
		//���� ������ ���� �ܿ� �ٽ� ����ϱ� ���ؼ��� �ݵ�� �ʱ�ȭ�� �Ǿ��־����***
		
		System.out.println(num); 
		//�̹� ä������ ���� ������ num �׳� ��� ����
		
		System.out.println(globalNum);
		//�ʵ�� �ʱ�ȭ �ȵǾ ��� ����..
		
	} // <== �޼ҵ� ������ ��
	
	public void method2() {
		//System.out.println(localNum);  --> ���� ������ �ش� ����(��� ��)�ȿ����� ��� ����
		System.out.println(globalNum);
	}
	
} // <== Ŭ���� ������ ��

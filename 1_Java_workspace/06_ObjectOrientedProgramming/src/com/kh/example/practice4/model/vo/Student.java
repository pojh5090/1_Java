package com.kh.example.practice4.model.vo;

public class Student {
	// �ν��Ͻ� ���� : ��ü�� ������ ����� �� �ִ� ����(static�� ���� ����)
	// Ŭ���� ���� : Ŭ������ �����Ͽ� ����� �� �ִ� ����(static�� ����)
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	// �ν��Ͻ� ��� : ��ü�� ���� �� ������ �ʱ�ȭ
	{
		classroom = 3;
		name = "������";
		height = 177.7;
		gender = '��';
	}
	// Ŭ���� ��� : ���α׷� ���۽ÿ� �� �� �ʱ�ȭ
	static {
		grade = 2;
	}
	
	public Student() {}
	
	public void information() {
		System.out.printf("%d�г� %d�� %s(%c)�� Ű�� %fcm�Դϴ�." , grade, classroom, name, gender, height);
	}
}

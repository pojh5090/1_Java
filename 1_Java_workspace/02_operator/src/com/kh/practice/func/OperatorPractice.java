package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "�����" : "����� �ƴϴ� ";
		
		System.out.println(result);
	}
	
	public void practice2() {
	Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "�����" : (num == 0 ? "0�̴�" : "������");
		
		System.out.println(result);
	}
	
	public void practice3() {
	Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "¦����" : "Ȧ����";
		
		System.out.println(result);
	}
	
	public void practice4() {
	Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� �� : ");
		int num = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int num2 = sc.nextInt();
		
		System.out.println("1�δ� ���� ���� : " + num2 / num);
		System.out.println("���� ���� ���� : " + num2 % num);
	}
	
	public void practice5() {
	Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.next();
		
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		
		System.out.print("��(���ڸ�) : ");
		int ban = sc.nextInt();
		
		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		
		System.out.print("����(M/F) : ");
		String sexStr = sc.next();
		
		String sex = sexStr.equals("M") ? "��" : "��";

		
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		float score = sc.nextFloat();
		
		System.out.println(grade + "�г� " + ban + "�� " + num + "�� " + name + " " + 
				sex + "�л��� ������ " + score + "�̴�");
	}
		
	
}

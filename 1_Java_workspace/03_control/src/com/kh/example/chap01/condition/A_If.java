package com.kh.example.chap01.condition;

import java.util.Scanner;

public class A_If {
	//�ܵ� if��
	// if(���ǽ�) {
	//    ������ ����;
	//   }
	//���ǽ��� ��� ���� ��(true)�̸� { } �ȿ� �ִ� �ڵ� ����
	//���ǽ��� ��� ���� ����(false)�̸� { } �ȿ� �ִ� �ڵ�� �����ϰ� �Ѿ
	public void method1() {
		//�Է��� ���ڰ� ������� �������� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� ���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("����Դϴ�.");
		}
		
		if(num < 0) {
			System.out.println("�����Դϴ�.");
		}
		
		if(num == 0) {
			System.out.println("0 �Դϴ�.");
		}
		
		System.out.println("���α׷� ����");
	}
	
	public void method2() {
		//�Է��� ���ڰ� ¦������ Ȧ������ ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("¦�� �Դϴ�.!");
		} 
		if(num % 2 != 0) {
			System.out.println("Ȧ�� �Դϴ�.!");
		}
		
	}
	
	public void method3() {
		//�Է��� ���ڰ� 1~10������ �������� Ȯ��
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num > 0 && num < 11) {
			System.out.println("1~10 ������ ���Դϴ�");
		}
		
		if(num <= 0 || num >= 11) {
			System.out.println("1�� 10 ������ ���ڰ� �ƴմϴ�.");
		}
	}
	
	public void method4() {
		//���ڿ� ���ϱ�
		//�̸��� �Է� �޾� ���� �̸��� ������ �����Դϴ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է� �ϼ��� : ");
		String name = sc.nextLine();
		
		//**���ڿ����� �񱳴� == ��� �Ұ�!**
		//���ڿ� �񱳴� String Ŭ���� �ȿ� �ִ� equals() �޼ҵ�� ��
		
		if(name.equals("������"))
		{
			System.out.println("�����Դϴ�.");
		}
		if(!name.equals("������"))
		{
			System.out.println("������ �ƴմϴ�.");
		}
	}
}

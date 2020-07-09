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
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		String result = (age <= 13) ? "���" : ((age > 13 && age <= 19) ? "û�ҳ�" : "����");
		
		System.out.println(result);
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int kor = sc.nextInt();
		
		System.out.print("���� : ");
		int eng = sc.nextInt();
		
		System.out.print("���� : ");
		int mat = sc.nextInt();
		
		int sub = kor + eng + mat;
		double aver = sub / 3;
		
		System.out.println("�հ� : " + sub);
		System.out.println("��� : " + aver);
		
		String result = (kor >= 40 && eng >= 40 && mat >=40 && aver >= 60.0) ? 
				"�հ�" : "���հ�";
		
		System.out.println(result);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(-����) : ");
		String num = sc.next();
		
		String result = num.charAt(7) == 2 ? "����" : "����";
		System.out.println(result);
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("�Է� : ");
		int put = sc.nextInt();
		
		boolean result = (put<= num1 || put > num2) ? true : false;
		System.out.println(result);
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1 == num2 && num2 == num3) ? true : false;
		System.out.println(result);
	}
		
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A����� ���� : ");
		int a = sc.nextInt();
		double ia = a + a*0.4;
		
		System.out.print("B����� ���� : ");
		int b = sc.nextInt();
		double ib = b;
		
		System.out.print("C����� ���� : ");
		int c = sc.nextInt();
		double ic = c + c*0.15;
		
		System.out.println("A��� ����/����+a : " + a + "/" + ia);
		String ar = ia >= 3000 ? "3000 �̻�" : "3000 �̸�";
		System.out.println(ar);
		
		System.out.println("B��� ����/����+a : " + b + "/" + ib);
		String br = ib >= 3000 ? "3000 �̻�" : "3000 �̸�";
		System.out.println(br);
		
		System.out.printf("C��� ����/����+a : " + c + "/" + "%.13f",ic);
		System.out.println();
		String cr = ic >= 3000 ? "3000 �̻�" : "3000 �̸�";
		System.out.println(cr);
	}
		
}

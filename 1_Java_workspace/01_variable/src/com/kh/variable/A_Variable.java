package com.kh.variable;

public class A_Variable {  //��� Ŭ����
	public void declareVariable() {
		//���� ���� �� �ʱ�ȭ
		// A. ���� ���� : �޸𸮿� ���� ������ ����
		// 1. ����
		boolean isTrue;
		
		// 2. ������
		// 2-1. ����
		char ch;
		// 2-2. ���ڿ�
		String str;
		
		// 3. ������
		// 3-1. ������
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		// 3-2. �Ǽ���
		float fNum;
		double dNum;
		
		
		// B. �ʱ�ȭ(����)
		isTrue = true;   //true, false�� ���� ����
		ch = 'A';
		str = "ABCD";
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		
		fNum = 4.478f;
		dNum = 8.0;
		
		System.out.println("isTrue�� �� : " + isTrue);
		
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);
		
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		
	}
	
	public void initVariable() {
		//���� ����� ���ÿ� �ʱ�ȭ
		// 1. ����
		boolean isTrue = false;
		
		// 2. ������
		char ch = '��';
		String str = "������";
		
		// 3. ������
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
		
		float fNum = 4.0f;
		double dNum = 8.0d;
		
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("char�� �� : " + ch);
		System.out.println("str�� �� : " + str);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		
	}
	
}

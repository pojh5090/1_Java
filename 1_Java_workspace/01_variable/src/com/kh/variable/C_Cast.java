package com.kh.variable;

public class C_Cast {
	public void rule1() {
		int num = 'a';
		 //4byte <- 2byte  : �ڵ� ����ȯ
		System.out.println("num : " + num);		
		
		char c = 65;
	    //2byte <- 4byte  : 65�� int�������� ���ͷ� (�� ��ü)�� ����!!!
		System.out.println("c : " + c);
		
		//char c2 = num;
		//�̰� �Ұ��� -> num�� ���ͷ� �ƴϰ� �����̱� ������ �ȵ�.
		
		char c2 = (char)num;
		// (char)�� �ٿ������� �� ���� ����ȯ ����!
		System.out.println("c2 : " + c2);
		
		int num2 = -97;
		char c3 = (char)num2;
		System.out.println("c3 : " + c3);
		//?�� ���� ����  : char���� ������ ���� ����!
	}
	public void rule2() {
		int iNum = 10;
		long lNum = 100L;
		
		//int sum = iNum + lNum;
		//         int + long
		//(�ڵ� ����ȯ)long + long = long
		
		// ��� 1. ���� ����� int�� ���� ����ȯ
		int sum1 = (int)(iNum + lNum);
		System.out.println("sum1 : " + sum1);
		
		// ��� 2. long���� ���� int�� ���� ����ȯ
		int sum2 = iNum + (int)lNum;
		System.out.println("sum2 : " + sum2);
		
		// ���3. ��� �ڷ����� long���� �ޱ�
		long sum3 = iNum + lNum;
		System.out.println("sum3 : " + sum3);
	}
}

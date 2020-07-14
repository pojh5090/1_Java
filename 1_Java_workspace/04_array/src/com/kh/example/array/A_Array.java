package com.kh.example.array;

import java.util.Scanner;

public class A_Array {
	// �迭�� ���� �ڷ����� ������ �ϳ��� �������� �ٷ�� ��
	// ����� ������ �ε����� �����Ǵµ� �ε����� 0���� ����.
	
	// �迭 ����
	//  �ڷ���[] �迭��;
	//  �ڷ��� �迭��[];
	// �迭 �Ҵ�
	//  �ڷ���[] �迭�� = new �ڷ���[�迭ũ��];
	//  �ڷ��� �迭��[] = new �ڷ���[�迭ũ��];
	//  new�����ڸ� ���� Heap������ �迭 ũ�⸸�� ���� ����
	//  �����Ǵ� ���� �� ������ ���� �ּ� ���� �����
	//  �ּҰ��� stack�� �ִ� �迭�� ������ ���� ���� ��(�����ϰ� ����)
	
	// �迭 �ʱ�ȭ
	//   1) �ε��� �̿�(�ε����� zero-based)
	//       �迭��[�ε��� ��ȣ] = ��;
	//   2) for�� �̿�(��Ģ�� ���� ���� ��� ����)
	//       for(int i = 0; i < arr.length; i++) {
	//           �迭��[i] = ��;
	//       }
	//   3) ����� ���ÿ� �ʱ�ȭ
	//       �ڷ���[] �迭�� = {��};
	//       �ڷ���[] �迭�� = new �ڷ���[]{��};
	
	public void method1() {
		//int�ڷ����� ���� �� �ִ� 9��¥���� arr�迭 ����
		int[] arr = new int[9];  //�迭 ���� �� �Ҵ�
		arr[0] = 10;
		arr[1] = 20;
		
		for(int i = 0; i < 9; i++) {
			arr[i] = 10 * (i + 1);
		}
		
		//arr[9] = 100; 
		//�ϸ� ArrayindexOutOfBoundsException ������! 
		
		for(int i = 0; i < 9; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//�迭 ���̸� ��ȯ���ִ� length -->�Ұ�ȣ�� ��� method �ƴ�!
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void method2() {
		int[] iArr;  //�迭 ����
		iArr = new int[5];   //�迭 �Ҵ�		
		System.out.println("iArr : " + iArr);
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		
		//double�� �� �� �ִ� 30ĭ¥�� dArr�迭 ����
		double[] dArr = new double[30];
		System.out.println("ó������ ���� dArr�� ũ�� : " + dArr.length);
		System.out.println("ó������ ���� dArr�� �ּ� : " + dArr);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �迭 ũ�� : ");
		int arrSize = sc.nextInt();
		
		dArr = new double[arrSize];  //������ ����~~
		
		System.out.println("ũ�� �ٲ� dArr�� ũ�� : " + dArr.length);
		System.out.println("ũ�� �ٲ� dArr�� �ּ� : " + dArr);		
//		new�����ڴ� �ּҰ��� ���� ��ȯ��Ű�°��̱� ������, ���� new�� ���ָ� �ּҵ� �޶���
//		���� �����״� �ּ� ������ ������. ���� ���� �Է��� �迭�� ����Ŵ~
//	        ���� �迭 30���� GC����(garbage collector)���� ���� �����
//		�ѹ� ���� �迭�� ũ��� ���� �� ���� ����.
		
		// dArr ����
		dArr = null;
		
		char[] cArr = {'a', 'b', 'c'};
		char[] cArr2 = new char[] {'d', 'e', 'f'};
		
		for(int i = 0; i < cArr.length; i++)
			System.out.print(cArr[i] + " ");
		
		System.out.println();
		
		for(int i = 0; i < cArr2.length; i++)
			System.out.print(cArr2[i] + " ");
	}
}

package com.kh.example.dimension;

public class DimensionalArray {
	
	public void method1() {
		// 2���� �迭 ����
		// �ڷ���[][] �迭��;
		// �ڷ��� �迭��[][];
		// �ڷ��� [] �迭��[];
		
		int[][] iArr1;
		int iArr2[][];
		int[] iArr3[];
		// ������ �ϰ� �Ǹ� stack�� ������ �������
		
		// 2���� �迭 �Ҵ�
		//	ũ�� ������ ��� �� �� �� �ؾ� ��
		iArr1 = new int[3][4];  // �����迭 (���簢�� or ���簢������ ������ ������)

		
		System.out.println("iArr1 : " + iArr1);
		System.out.println("iArr1[0] : " + iArr1[0]);
		System.out.println("iArr1[1] : " + iArr1[1]);
		System.out.println("iArr1[2] : " + iArr1[2]);
		
		System.out.println("iArr1[0][0] : " + iArr1[0][0]);
		System.out.println("iArr1[0][1] : " + iArr1[0][1]);
		System.out.println("iArr1[0][2] : " + iArr1[0][2]);
		System.out.println("iArr1[0][3] : " + iArr1[0][3]);
		System.out.println("iArr1[1][0] : " + iArr1[1][0]);
		System.out.println("iArr1[1][1] : " + iArr1[1][1]);
		System.out.println("iArr1[1][2] : " + iArr1[1][2]);
		System.out.println("iArr1[1][3] : " + iArr1[1][3]);
		System.out.println("iArr1[2][0] : " + iArr1[2][0]);
		System.out.println("iArr1[2][1] : " + iArr1[2][1]);
		System.out.println("iArr1[2][2] : " + iArr1[2][2]);
		System.out.println("iArr1[2][3] : " + iArr1[2][3]);
		
		System.out.println();
		
		for(int i = 0; i < iArr1.length; i++) {
			for(int j = 0; j < iArr1[i].length; j++) {
				System.out.println("iArr1[" + i + "][" + j + "] : " + iArr1[i][j]);
			}
		}
	}
	
	public void method2() {
		// 3�� 5��¥�� int�� ���� iArr �迭 ����
		int[][] iArr = new int[3][5];
		
		// �� ���
		// 1. �迭 �ε����� �����Ͽ� �� ���
		iArr[0][0] = 1;
		iArr[0][1] = 2;
		iArr[0][2] = 3;
		iArr[0][3] = 4;
		iArr[0][4] = 5;
		
		iArr[1][0] = 6;
		iArr[1][1] = 7;
		iArr[1][2] = 8;
		iArr[1][3] = 9;
		iArr[1][4] = 10;
		
		iArr[2][0] = 11;
		iArr[2][1] = 12;
		iArr[2][2] = 13;
		iArr[2][3] = 14;
		iArr[2][4] = 15;
		
		// 2. ���� for���� �̿��Ͽ� �� ���
		int value = 1;
		for(int i = 0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
//				iArr[i][j] = value;
//				value++;
				iArr[i][j] = value++;				
			}
		}
		
		// 3. ����� ���ÿ� �ʱ�ȭ
		int[][] iArr2 = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
		
		for(int i = 0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
				System.out.printf("%2d ",iArr[i][j]);
				//-2d �ϸ� ���� ����~~
			}
			System.out.println();
		}
		
		System.out.println();

		for(int i = 0; i < iArr2.length; i++) {
			for(int j = 0; j < iArr2[i].length; j++) {
				System.out.printf("%-2d ", iArr2[i][j]);
			}
			System.out.println();
		}
	}
	
	public void method3() {
		// ���� �迭
		// ���� ������ ������ �� �࿡ ���� ���� �������� ���� ����
		int[][] iArr = new int[3][];   // �����迭 �Ҵ�,  ���� ����!
//		for(int i = 0; i < iArr.length; i++) {
//			for(int j = 0; j < iArr[i].length; j++) {
//				System.out.println(iArr[i][j]);
//			}
//		}  //�̷��Ը� �����ϸ� NullPointException�� ��.. ���� : ���� ������ ���� �ʾƼ�
		   //�ּҸ� ��� 3���� ������ Null�� �� �ֱ� ����!
		
		iArr[0] = new int[2];
		iArr[1] = new int[4];
		iArr[2] = new int[3];
		
		for(int i = 0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
				System.out.printf("%d ", iArr[i][j]);
			}
			System.out.println();
		}
		
		// �� ���
		// 1. �ε����� �����Ͽ� �� ���
		iArr[0][0] = 1;
		iArr[0][1] = 2;
		
		iArr[1][0] = 3;
		iArr[1][1] = 4;
		iArr[1][2] = 5;
		iArr[1][3] = 6;
		
		iArr[2][0] = 7;
		iArr[2][1] = 8;
		iArr[2][2] = 9;
		
		System.out.println();
		for(int i = 0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
				System.out.printf("%d ", iArr[i][j]);
			}
			System.out.println();
		}
		
		// 2. ���� for���� �̿��Ͽ� �� ���
		int value = 1;
		for(int i = 0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
				iArr[i][j] = value++;
			}
		}
		
		System.out.println();
		for(int i = 0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
				System.out.printf("%d ", iArr[i][j]);
			}
			System.out.println();
		}
		
		// 3. ���� ���ÿ� �� �Ҵ�
		
		int[][] iArr2 = {{1, 2}, {3, 4, 5, 6}, {7, 8, 9}};  //heap������ �����Ǵ°���, new����
		
		System.out.println();
		for(int i = 0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
				System.out.printf("%d ", iArr[i][j]);
			}
			System.out.println();
		}
 	}	
}

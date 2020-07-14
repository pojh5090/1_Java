package com.kh.example.array;

import java.util.Scanner;

public class A_Array {
	// 배열은 같은 자료형의 변수를 하나의 묶음으로 다루는 것
	// 저장된 값마다 인덱스가 지정되는데 인덱스는 0부터 시작.
	
	// 배열 선언
	//  자료형[] 배열명;
	//  자료형 배열명[];
	// 배열 할당
	//  자료형[] 배열명 = new 자료형[배열크기];
	//  자료형 배열명[] = new 자료형[배열크기];
	//  new연산자를 통해 Heap영역에 배열 크기만한 공간 생성
	//  생성되는 순간 그 공간에 대한 주소 값이 생기고
	//  주소값은 stack에 있는 배열명 공간에 값이 대입 됨(참조하고 있음)
	
	// 배열 초기화
	//   1) 인덱스 이용(인덱스는 zero-based)
	//       배열명[인덱스 번호] = 값;
	//   2) for문 이용(규칙이 있을 때만 사용 가능)
	//       for(int i = 0; i < arr.length; i++) {
	//           배열명[i] = 값;
	//       }
	//   3) 선언과 동시에 초기화
	//       자료형[] 배열명 = {값};
	//       자료형[] 배열명 = new 자료형[]{값};
	
	public void method1() {
		//int자료형만 넣을 수 있는 9개짜리의 arr배열 생성
		int[] arr = new int[9];  //배열 선언 및 할당
		arr[0] = 10;
		arr[1] = 20;
		
		for(int i = 0; i < 9; i++) {
			arr[i] = 10 * (i + 1);
		}
		
		//arr[9] = 100; 
		//하면 ArrayindexOutOfBoundsException 에러남! 
		
		for(int i = 0; i < 9; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//배열 길이를 반환해주는 length -->소괄호가 없어서 method 아님!
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void method2() {
		int[] iArr;  //배열 선언
		iArr = new int[5];   //배열 할당		
		System.out.println("iArr : " + iArr);
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		
		//double만 들어갈 수 있는 30칸짜리 dArr배열 생성
		double[] dArr = new double[30];
		System.out.println("처음으로 만든 dArr의 크기 : " + dArr.length);
		System.out.println("처음으로 만든 dArr의 주소 : " + dArr);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변경할 배열 크기 : ");
		int arrSize = sc.nextInt();
		
		dArr = new double[arrSize];  //사이즈 변경~~
		
		System.out.println("크기 바꾼 dArr의 크기 : " + dArr.length);
		System.out.println("크기 바꾼 dArr의 주소 : " + dArr);		
//		new연산자는 주소값도 같이 반환시키는것이기 때문에, 새로 new를 써주면 주소도 달라짐
//		원래 가리켰던 주소 연결은 끊어짐. 새로 공간 입력한 배열로 가리킴~
//	        기존 배열 30개는 GC영역(garbage collector)으로 가서 사라짐
//		한번 정한 배열의 크기는 수정 할 수가 없다.
		
		// dArr 삭제
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

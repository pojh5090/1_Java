package com.kh.variable;

public class C_Cast {
	public void rule1() {
		int num = 'a';
		 //4byte <- 2byte  : 자동 형변환
		System.out.println("num : " + num);		
		
		char c = 65;
	    //2byte <- 4byte  : 65는 int형이지만 리터럴 (값 자체)라서 가능!!!
		System.out.println("c : " + c);
		
		//char c2 = num;
		//이건 불가능 -> num은 리터럴 아니고 변수이기 때문에 안됨.
		
		char c2 = (char)num;
		// (char)을 붙여줌으로 써 강제 형변환 해줌!
		System.out.println("c2 : " + c2);
		
		int num2 = -97;
		char c3 = (char)num2;
		System.out.println("c3 : " + c3);
		//?가 나온 이유  : char형은 음수가 없기 때문!
	}
	public void rule2() {
		int iNum = 10;
		long lNum = 100L;
		
		//int sum = iNum + lNum;
		//         int + long
		//(자동 형변환)long + long = long
		
		// 방법 1. 수행 결과를 int로 강제 형변환
		int sum1 = (int)(iNum + lNum);
		System.out.println("sum1 : " + sum1);
		
		// 방법 2. long형의 값을 int로 강제 형변환
		int sum2 = iNum + (int)lNum;
		System.out.println("sum2 : " + sum2);
		
		// 방법3. 결과 자료형을 long으로 받기
		long sum3 = iNum + lNum;
		System.out.println("sum3 : " + sum3);
	}
}

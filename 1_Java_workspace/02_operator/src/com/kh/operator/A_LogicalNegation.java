package com.kh.operator;

public class A_LogicalNegation {
	public void method() {
		System.out.println("true�� ���� : " + !true);
		System.out.println("false�� ���� : " + !false);
		
		boolean bool1 = false;
		boolean bool2 = true;
		
		System.out.println("!bool1 : " + !bool1);    //true
		System.out.println("!bool2 : " + !bool2);    //false
		System.out.println("!!bool1 : " + !!bool1);  //false
		System.out.println("!!bool2 : " + !!bool2);  //true
	}
}

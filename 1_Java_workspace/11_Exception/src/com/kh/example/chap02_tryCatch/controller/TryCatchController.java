package com.kh.example.chap02_tryCatch.controller;

import java.io.IOException;

public class TryCatchController {
	public void method1() {
		System.out.println("method1() ȣ���...");
		try {
			method2();
			System.out.println("���� ����� �ɱ� �ȵɱ�?");  //��� �ȵǰ� �ٷ� catch�� �Ѿ~
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception���� ����");
		} finally {
			System.out.println("���� ���ο� ������� ������ ����");
		}
		System.out.println("method1() �����...");
	}
	
	public void method2() throws IOException {
		System.out.println("method2() ȣ���...");
		
//		throw new NullPointerException("null�� ���Դ�!");  //( )�ȿ� �����޽��� �� �� ����!
		//  --->Unchecked Exception -> �츮�� �� ����ó�� ������ �ʾƵ� ������ ����X

		throw new IOException("������ IOException�� �߻����׽��ϴ�.");
		
//		System.out.println("method2() �����...");
	}
}

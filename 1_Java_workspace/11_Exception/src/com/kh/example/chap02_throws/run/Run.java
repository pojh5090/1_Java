package com.kh.example.chap02_throws.run;

import com.kh.example.chap02_throws.controller.ThrowsController;

public class Run {

	public static void main(String[] args) /*throws Exception*/ {
		ThrowsController tc = new ThrowsController();
		
		try {
			tc.method1();
		} catch (Exception e) {			
//			e.printStackTrace(); 
			//->���� �޼����� �߻� �ٿ����� ã�Ƽ� �ܰ躰�� ������ ������ (���� �̸�,��ġ ���)
			System.out.println("���� ��Ȳ�� �߻��߽��ϴ�.");
		} 
		
		System.out.println("���������� �����...");
	}
}

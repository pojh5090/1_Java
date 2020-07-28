package com.kh.example.chap00_file.controller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method() {
		File f1 = new File("test.txt");
		try {
			f1.createNewFile(); //������ �������ִ� �޼ҵ� : ���� ��� ������ ������Ʈ �ֻ�ܿ� �������
			
			File f2 = new File("c:\\test\\test.txt");
//			f2.createNewFile();
			
			File f3 = new File("c:\\temp3\\temp2");
			File f4 = new File("c:\\temp3\\temp2\\test.txt");
//			f4.createNewFile();
			f3.mkdirs();  //���� ������ִ°���!
			f4.createNewFile();
			f4.delete();
			
			System.out.println(f2.exists());
			System.out.println(f3.exists());
			System.out.println(f3.isFile());
			
			System.out.println("���� �� : " + f1.getName());
			System.out.println("���� �뷮 : " + f1.length());
			System.out.println("���� ���� ��� : " + f1.getAbsolutePath());
			System.out.println("���� ��� ��� : " + f1.getPath());  //���� ���� ��ġ�� ���� ��� �ٲ�
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

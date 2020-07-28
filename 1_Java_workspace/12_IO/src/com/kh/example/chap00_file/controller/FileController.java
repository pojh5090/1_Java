package com.kh.example.chap00_file.controller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method() {
		File f1 = new File("test.txt");
		try {
			f1.createNewFile(); //파일을 생성해주는 메소드 : 파일 경로 없으면 프로젝트 최상단에 만들어짐
			
			File f2 = new File("c:\\test\\test.txt");
//			f2.createNewFile();
			
			File f3 = new File("c:\\temp3\\temp2");
			File f4 = new File("c:\\temp3\\temp2\\test.txt");
//			f4.createNewFile();
			f3.mkdirs();  //폴더 만들어주는거임!
			f4.createNewFile();
			f4.delete();
			
			System.out.println(f2.exists());
			System.out.println(f3.exists());
			System.out.println(f3.isFile());
			
			System.out.println("파일 명 : " + f1.getName());
			System.out.println("파일 용량 : " + f1.length());
			System.out.println("저장 절대 경로 : " + f1.getAbsolutePath());
			System.out.println("저장 상대 경로 : " + f1.getPath());  //현재 나의 위치에 따라 계속 바뀜
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

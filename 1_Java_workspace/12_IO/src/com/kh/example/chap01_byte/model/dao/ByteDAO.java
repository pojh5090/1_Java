package com.kh.example.chap01_byte.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	public void fileOpen() {
		//파일에 바이트 단위로 데이터를 읽어오고 싶다
		try(FileInputStream fis = new FileInputStream("a_byte.txt");) {			
//			
//			// 1. 배열을 사용하여 배열에 저장하여 읽어오기
//			int fileSize = (int)new File("a_byte.txt").length();  //length()의 반환형 long형이니까
//			byte[] bArr = new byte[fileSize];
//			fis.read(bArr);
//			for(int i = 0; i < bArr.length; i++) {
//				System.out.print(bArr[i] + " ");
//			}
			
			// 2. 배열 저장 사용하지 않고 읽어오기	
			int value;
			while((value = fis.read()) != -1 ) {
				System.out.print((char)value + " ");
			} 
			//value 없는 결과 : b d f c e 이렇게 퐁당퐁당 나옴 (이유: while조건문이랑 print문에서 총 2번 쓰였기 때문)
 		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
			
	public void fileSave() {
		//파일에 바이트 단위로 데이터를 저장하고 싶다
		
		FileOutputStream fos = null;
		try {
//			fos = new FileOutputStream("a_byte");
			fos = new FileOutputStream("a_byte.txt", true); //이어쓰기!
			fos.write(97);
			
			byte[] bArr = {98, 99, 100, 101, 102, 103};
			
			fos.write(bArr);	
			
			fos.write(bArr, 1, 3); //bArr의 1인덱스부터 3개를 잘라서 넣겠다~
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace(); //여기서 catch 두개 순서 바뀌면 안됨~~ IOException이 부모라서! ****
		} finally {
			  try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileSave2() {
//		try(FileOutputStream fos = new FileOutputStream("a_byte.txt");) {
//		//fos에서 발생한 자동 close에 대한 exception 처리가 되지 않아서 에러!
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} 
		try(FileOutputStream fos = new FileOutputStream("a_byte.txt");) {
			fos.write(94);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

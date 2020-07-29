package com.kh.example.chap01_byte.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {
	public void fileOpen() {
		//���Ͽ� ����Ʈ ������ �����͸� �о���� �ʹ�
		try(FileInputStream fis = new FileInputStream("a_byte.txt");) {			
//			
//			// 1. �迭�� ����Ͽ� �迭�� �����Ͽ� �о����
//			int fileSize = (int)new File("a_byte.txt").length();  //length()�� ��ȯ�� long���̴ϱ�
//			byte[] bArr = new byte[fileSize];
//			fis.read(bArr);
//			for(int i = 0; i < bArr.length; i++) {
//				System.out.print(bArr[i] + " ");
//			}
			
			// 2. �迭 ���� ������� �ʰ� �о����	
			int value;
			while((value = fis.read()) != -1 ) {
				System.out.print((char)value + " ");
			} 
			//value ���� ��� : b d f c e �̷��� �������� ���� (����: while���ǹ��̶� print������ �� 2�� ������ ����)
 		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
			
	public void fileSave() {
		//���Ͽ� ����Ʈ ������ �����͸� �����ϰ� �ʹ�
		
		FileOutputStream fos = null;
		try {
//			fos = new FileOutputStream("a_byte");
			fos = new FileOutputStream("a_byte.txt", true); //�̾��!
			fos.write(97);
			
			byte[] bArr = {98, 99, 100, 101, 102, 103};
			
			fos.write(bArr);	
			
			fos.write(bArr, 1, 3); //bArr�� 1�ε������� 3���� �߶� �ְڴ�~
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace(); //���⼭ catch �ΰ� ���� �ٲ�� �ȵ�~~ IOException�� �θ��! ****
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
//		//fos���� �߻��� �ڵ� close�� ���� exception ó���� ���� �ʾƼ� ����!
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

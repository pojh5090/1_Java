package com.kh.example.chap02_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {
	public void fileSave() {
		// ���Ͽ� ���� ���� �����͸� �����ϰ� �ʹ�
		FileWriter fw = null;
		try {
			fw = new FileWriter("b_char.txt");
			
			fw.write("�� IO ��մ�");
			fw.write('A');
			fw.write(' ');
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//try with resource �غ���
	public void fileSave2() {                     //���⿡ ; �����Ⱦ��� ������µ�, �������� ����� ���ش�
		try(FileWriter fw = new FileWriter("b_char.txt");){				
			fw.write("try with resource ����");
			fw.write(' ');
			fw.write('B');
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileOpen() {
		// ������ ���� ���� �����ͷ� �о���� �ʹ�
		FileReader fr = null;
		try {
			fr = new FileReader("b_char.txt");
			
			int value;
			while((value = fr.read()) != -1) {
				System.out.print((char)value + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileOpen2() {
		try(FileReader fr = new FileReader("b_char.txt");) {
				
			int value;
			while((value = fr.read()) != -1) {
				System.out.print((char)value + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

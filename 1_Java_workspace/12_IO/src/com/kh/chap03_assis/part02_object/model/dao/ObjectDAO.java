package com.kh.chap03_assis.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap03_assis.part02_object.model.vo.Member;

public class ObjectDAO {
	public void fileSave() {
		Member[] mar = {new Member("user01", "pass01", "���ǰ�", "kkk@kkk", 25, '��', 1250.7),
				        new Member("user02", "pass02", "������", "nnn@nnn", 17, '��', 1221.6),
				        new Member("user03", "pass03", "�����", "ddd@ddd", 22, '��', 1234.5)};
		
		//��ü�� ���Ͽ� �����ϰ� ����
		// --- --> ��ü�� ���õ� ������Ʈ�� �ʿ� : ObjectInputStream, ObjectOutputStream
		//          --- --> ����� ���õ� ��Ʈ�� : ObjectOutputStream(Ȯ��)
		//      ----------> ���� ����� ���õ� ��Ʈ�� �ʿ� : FileOutputStream(Ȯ��), FileWriter
		
		//*��ݽ�Ʈ�� ���� ������ֱ�
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_object.txt"));) {
//			FileOutputStream fos = new FileOutputStream("d_object.txt");
//			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_object.txt"));
			
			for(int i = 0; i < mar.length; i++) {
				oos.writeObject(mar[i]);
			}
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		
		//���Ͽ� ����� ��ü�� �о���� ����
		//          ------- > ObjectInputStream
		// -----------------> FileInputStream
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object.txt"));) {
//			FileInputStream fis = new FileInputStream("d_object.txt");
//			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object.txt"));
			
			Member[] mmar = new Member[3];		
			for(int i = 0; i < mmar.length; i++) {
				mmar[i] = (Member)ois.readObject();  //�ٿ�ĳ���� �ؼ� �־��ֱ�
			}			
			for(Member m : mmar) {
				System.out.println(m);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(EOFException e) {
			System.out.println("���� ���� �����߽��ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

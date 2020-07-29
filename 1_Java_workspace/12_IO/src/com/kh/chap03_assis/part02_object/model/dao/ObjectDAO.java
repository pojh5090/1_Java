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
		Member[] mar = {new Member("user01", "pass01", "강건강", "kkk@kkk", 25, '남', 1250.7),
				        new Member("user02", "pass02", "남나눔", "nnn@nnn", 17, '남', 1221.6),
				        new Member("user03", "pass03", "도대담", "ddd@ddd", 22, '여', 1234.5)};
		
		//객체를 파일에 저장하고 싶음
		// --- --> 객체에 관련된 보조스트림 필요 : ObjectInputStream, ObjectOutputStream
		//          --- --> 저장과 관련된 스트림 : ObjectOutputStream(확정)
		//      ----------> 파일 저장과 관련된 스트림 필요 : FileOutputStream(확정), FileWriter
		
		//*기반스트림 먼저 만들어주기
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
		
		//파일에 저장된 객체를 읽어오고 싶음
		//          ------- > ObjectInputStream
		// -----------------> FileInputStream
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object.txt"));) {
//			FileInputStream fis = new FileInputStream("d_object.txt");
//			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object.txt"));
			
			Member[] mmar = new Member[3];		
			for(int i = 0; i < mmar.length; i++) {
				mmar[i] = (Member)ois.readObject();  //다운캐스팅 해서 넣어주기
			}			
			for(Member m : mmar) {
				System.out.println(m);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(EOFException e) {
			System.out.println("파일 끝에 도달했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

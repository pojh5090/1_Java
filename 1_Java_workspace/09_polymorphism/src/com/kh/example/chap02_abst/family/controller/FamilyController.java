package com.kh.example.chap02_abst.family.controller;

import com.kh.example.chap02_abst.family.model.vo.Baby;
import com.kh.example.chap02_abst.family.model.vo.Basic;
import com.kh.example.chap02_abst.family.model.vo.Family;
import com.kh.example.chap02_abst.family.model.vo.Mother;

public class FamilyController {
	public void method() {
		//Family f = new Family();  --> �߻�Ŭ������ ��ü���� �ȵǴ°���, 
		
		//��� �������� ����
//		Family m = new Mother("��Ӵ�", 50, 70, "���");
//		Family b = new Baby("���̺�", 3.5, 70);
//		
//		System.out.println(m);
//		System.out.println(b);
//		
////		m.eat();
////		b.eat();
////		
////		m.sleep();
////		b.sleep();
//				
//		System.out.println(m);
//		System.out.println(b);
		
//		Basic b = new Basic();  //-> �������̽� �̱� ������ ��ü���� �Ұ���
		Basic mother = new Mother("��Ӵ�", 50, 70, "���");
		Basic baby = new Baby("���̺�", 3.5, 70);
		
		mother.eat();
		baby.eat();
		
		System.out.println(mother);
		System.out.println(baby);
	}
}

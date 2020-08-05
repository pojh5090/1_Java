package com.kh.example.set.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.kh.example.set.model.compare.DogComparator;
import com.kh.example.set.model.vo.Dog;

public class SetController {
	public void doSet() {
//		HashSet<Dog> set = new HashSet<>(); //�̷��� ���׸� ���� ���� : Ÿ�� �߷�
		HashSet<Dog> set = new HashSet<Dog>();
		
		//add(E e) : set �ȿ� ������ �߰�
		set.add(new Dog("����", 3.3));
		set.add(new Dog("���", 2.3));
		set.add(new Dog("�̵�", 5.6));
		System.out.println(set);   //->���� ������� ��µ�
		
		set.add(new Dog("���", 2.3));		
		System.out.println(set);  //->�ߺ����� ���� ����
		//���� : new ������ ����� �ؼ� �ٸ� �ּҰ��� ������ �ֱ� ���� (���ü)
		//��� : hashCode(), equals() �������̵� ���ָ� �ذ��.
		
		//<String> ,<Interger> Ÿ������ �ߺ� ������ �־ �ѹ����� ��µ�
		//���� : �Ѵ� equals�� ��� �ް� �ֱ� ����!
		
		LinkedHashSet set2 = new LinkedHashSet<Dog>();
		set2.add(new Dog("����", 2.1));
		set2.add(new Dog("����", 8.3));
		set2.add(new Dog("�κ�", 5.0));
		set2.add(new Dog("����", 2.1));
		System.out.println(set2);
		
		set2.add(new Dog("����", 6.1));
		set2.add(new Dog("����", 5.2));
		set2.add(new Dog("����", 9.5));
		set2.add(new Dog("����", 12.5));
		System.out.println(set2);  //���� ���� ���� �� �� �ִ�
		
		TreeSet<Dog> set3 = new TreeSet<Dog>(set2);
		System.out.println(set3);  //�� CompareTo �޼ҵ� ������༭ �̸� ������������ ���ĵ�
		
		//�����Է� ���Ͽ� �����ϰڴ�
		TreeSet<Dog> set4 = new TreeSet<Dog>(new DogComparator());
		set4.addAll(set2);
		set4.add(new Dog("����", 6.1)); //�߰� �ȵǾ���! ���� : ���̶� ���԰� ���Ƽ� ���� ��ü�� �ν�
		System.out.println(set4); 
		System.out.println(set4.size());
		
		Iterator<Dog> it = set4.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		while(it.hasNext()) {
			System.out.println("re : " + it.next());
		}  //����� ��� �ȵ�.. ���� : �ѹ� ���� ���������� ��Ȱ���� ���� �ʱ� ������ (�� �ϰ������ ���ο� ��ü �� ������ֱ�)
		
		
	}
}

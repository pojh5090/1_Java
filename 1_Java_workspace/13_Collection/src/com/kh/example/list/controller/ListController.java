package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.example.list.model.compare.StudentComparator;
import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() {
		ArrayList list1 = new ArrayList();
		list1.add(null);  //->���� Object Ÿ�� �� ...
		
		ArrayList<Student> list = new ArrayList<Student>(3); 
		          //���� ���׸��� ���� Ÿ�� ���� �������! + 3��¥�� ����
		//list.add(null);   //->���� Student Ÿ�Ը� ��!
		
		// add(E e) : ����Ʈ ���� ������ �߰�
		list.add(new Student("�׽�Ʈ", 0));
		list.add(new Student("�����", 60));
		
		System.out.println("list : " + list);
		
		list.add(new Student("������", 90));
		list.add(new Student("����ȣ", 85));
		
		System.out.println("list : " + list);
		System.out.println("���� list�� ��� element ���� : " + list.size()); //���� 1. ũ�⿡ ���� ����
		
		list.add(new Student("���̹�", 66));
		System.out.println("list : " + list);
		
		
		// ����2. �߰�/����/���� ���� ���ó�� ����
		// add(int index, E e) : index��°�� ������ �߰�
		list.add(0, new Student("�����", 100));
		System.out.println("list : " + list);
		
		list.add(3, new Student("���ǰ�", 40));
		System.out.println("list : " + list);
		
		
		// remove(int index) : index��° ������  ����
		list.remove(1);
		System.out.println("list : " + list);
		
		// remove(Object o) : �ش� ������ ����
		list.remove(new Student("���ǰ�", 40));  // ->���� �ȵ�!
		// ���� : remove(//) ���� ��ȣ �ȿ� equals �޼ҵ�� ������ �Ǻ� ���� �ϴµ�, equals�� ���� object Ŭ���� �޼ҵ�.
		// -->�ּҰ��� ������ ���� (��, String������ ���ڿ� ��) 
		//--> Student���� equals�� ���� -> �������̵� �������! �ּҰ� �ƴ�, �ʵ尪���� �� �� �� �ֵ���!!
		System.out.println("list : " + list);
		
		
		//���� ���1. CollectionsŬ���� �̿� : �÷����� �̿��� �� ������ �޼ҵ带 ��Ƴ��� Ŭ���� (�ڸ�ǰ : Arrays)
		Collections.sort(list); 
		System.out.println("list ����1: " + list);
		
		
		//���� ���2. List.sort()�޼ҵ� �̿�
		list.add(new Student("�ں���", 85));
		list.sort(new StudentComparator());
		System.out.println("list ����2: " + list);
		
		//���� ���3. ���� Ÿ���� ������ �� ����
//		list.add("��");
		
		//set(int index, E e) : index��°�� �ִ� ��Ҹ� e�� ����
		list.set(2, new Student("�����", 60));
		System.out.println("list : " + list);
		
		//get(int index) : index��°�� �ִ� ��Ҹ� ������ ��
		Student s = list.get(2);
		System.out.println(s);
		System.out.println("list : " + list);
		
		//subList(int index1 , int index2) : index1��°���� index2��° ������ ����Ʈ ��ȯ
		System.out.println(list.subList(2, 5));
		
		//contains(Object o) : o�� ����Ʈ�� �����Ѵٸ� true��ȯ
		//indexOf(Object o) : o�� ����Ʈ�� ��ġ�ϴ� �ε��� ��ȯ
		boolean bool = list.contains(new Student("������", 90));
		System.out.println(bool);
		int index = list.indexOf(new Student("������", 90));
		System.out.println(index);
		
		int index2 = list.indexOf(new Student("������", 50));
		System.out.println(index2); //������� -1 ��ȯ��
		
		//clear() : ����� ��� ��ü ����
		//isEmpty() : ����Ʈ�� ��������� true ��ȯ
		System.out.println("list : " + list);
		list.clear();
		System.out.println("list : " + list);
		
		System.out.println("list�� ����ֳ���? : " + list.isEmpty());
	}
}

package com.kh.example.education.run;

import com.kh.example.education.model.vo.Student;
import com.kh.example.education.model.vo.Teacher;

public class Run {

	public static void main(String[] args) {
		Teacher t = new Teacher("KH����������", "����� ������", "�ڽſ�", 'G', " �ڹ�", 5);
		System.out.println(t);
		//���� : �ּҰ��� ���ð��̴�..
		//��� : ������ ���������� ��µ�!!(�޸��� ����)
		
		Student s = new Student("KH����������", "����� ������", "������", 'G', " ����Ʈ ������", 30);
		System.out.println(s);
	}

}

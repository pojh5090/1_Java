package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	StudentController ssm = new StudentController();
	
	public void StudentMenu() {
		System.out.println("==========�л� ���� ���==========");
		Student[] stdArr = ssm.printStudent();
		for(int i = 0; i < stdArr.length; i++) {
			System.out.println(stdArr[i].inform());
		}
//		for(Student student:stdArr) {  //���� for��(for-each��)
//			System.out.println(student.inform());
//		} //student��� �ӽ� ������ �׶��׋� �޾ƿͼ� ����ϰ� �� �ް� �ϴ°���!
		System.out.println("==========�л� ���� ���==========");
		System.out.println("�л� ���� �հ� : " + ssm.sumScore());
		double[] dd = ssm.avgScore();
		System.out.println("�л� ���� ��� : " + dd[1]);
		System.out.println("==========���� ��� ���==========");
		for(int i = 0; i < stdArr.length; i++) {
			if(stdArr[i].getScore() < StudentController.CUT_LINE) {
				System.out.println(stdArr[i].getName() + "�л��� ����� ����Դϴ�.");
			} else {
				System.out.println(stdArr[i].getName() + "�л��� ����Դϴ�.");
			}
		}
	}
}

package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	StudentController ssm = new StudentController();
	
	public void StudentMenu() {
		System.out.println("==========학생 정보 출력==========");
		Student[] stdArr = ssm.printStudent();
		for(int i = 0; i < stdArr.length; i++) {
			System.out.println(stdArr[i].inform());
		}
//		for(Student student:stdArr) {  //향상된 for문(for-each문)
//			System.out.println(student.inform());
//		} //student라는 임시 변수에 그때그떄 받아와서 출력하고 또 받고 하는거임!
		System.out.println("==========학생 성적 출력==========");
		System.out.println("학생 점수 합계 : " + ssm.sumScore());
		double[] dd = ssm.avgScore();
		System.out.println("학생 점수 평균 : " + dd[1]);
		System.out.println("==========성적 결과 출력==========");
		for(int i = 0; i < stdArr.length; i++) {
			if(stdArr[i].getScore() < StudentController.CUT_LINE) {
				System.out.println(stdArr[i].getName() + "학생은 재시험 대상입니다.");
			} else {
				System.out.println(stdArr[i].getName() + "학생은 통과입니다.");
			}
		}
	}
}

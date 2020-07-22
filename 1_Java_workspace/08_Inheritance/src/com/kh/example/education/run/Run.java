package com.kh.example.education.run;

import com.kh.example.education.model.vo.Student;
import com.kh.example.education.model.vo.Teacher;

public class Run {

	public static void main(String[] args) {
		Teacher t = new Teacher("KH정보교육원", "서울시 강남구", "박신우", 'G', " 자바", 5);
		System.out.println(t);
		//예상 : 주소값이 나올것이다..
		//결과 : 정보가 정상적으로 출력됨!!(메모장 보기)
		
		Student s = new Student("KH정보교육원", "서울시 강남구", "강진희", 'G', " 스마트 콘텐츠", 30);
		System.out.println(s);
	}

}

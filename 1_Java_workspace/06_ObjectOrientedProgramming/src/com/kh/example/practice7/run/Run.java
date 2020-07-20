package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee ee = new Employee();
		ee.setEmpNo(100);
		ee.setEmpName("홍길동");
		ee.setDept("영업부");
		ee.setJob("과장");
		ee.setAge(25);
		ee.setGender('남');
		ee.setSalary(2500000);
		ee.setBonusPoint(0.05);
		ee.setPhone("010-1234-5678");
		ee.setAddress("서울시 강남구");
		
		System.out.println("사원번호 " + ee.getEmpNo() + "인 " + ee.getEmpName() + ee.getJob() + "은 " +
				ee.getDept() + "이고 " + ee.getAge() + "살이다." );
		System.out.println("성별은 " + ee.getGender() + "자 이고 연봉은 " + ee.getSalary() + "원이며 " +
				ee.getBonusPoint() + "의 보너스를 갖으며 연락처는 " + ee.getBonusPoint() + "이고 " + 
				ee.getAddress() + "에 거주한다");
	}

}

package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee ee = new Employee();
		ee.setEmpNo(100);
		ee.setEmpName("ȫ�浿");
		ee.setDept("������");
		ee.setJob("����");
		ee.setAge(25);
		ee.setGender('��');
		ee.setSalary(2500000);
		ee.setBonusPoint(0.05);
		ee.setPhone("010-1234-5678");
		ee.setAddress("����� ������");
		
		System.out.println("�����ȣ " + ee.getEmpNo() + "�� " + ee.getEmpName() + ee.getJob() + "�� " +
				ee.getDept() + "�̰� " + ee.getAge() + "���̴�." );
		System.out.println("������ " + ee.getGender() + "�� �̰� ������ " + ee.getSalary() + "���̸� " +
				ee.getBonusPoint() + "�� ���ʽ��� ������ ����ó�� " + ee.getBonusPoint() + "�̰� " + 
				ee.getAddress() + "�� �����Ѵ�");
	}

}

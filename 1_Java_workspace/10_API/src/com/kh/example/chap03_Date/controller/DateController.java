package com.kh.example.chap03_Date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {
	public void method1() {
		Date today = new Date();
		System.out.println(today);
		
		System.out.println(today.getTime());
//		Mon Jul 27 21:04:32 KST 2020
//		1595851472361
		
		Date time = new Date(1595851472361L);
		System.out.println(time);  //today�� ����� ����!
		
		//Date date = new Date(2020, 7, 27); 
		//The constructor Date(int, int, int) is deprecated		
	}
	
	public void method2() {
//		Calender c = new Calender(); --> �߻�Ŭ������, Calender ���������� protected�� ��ü����x 
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		Calendar gc = new GregorianCalendar();
		System.out.println(gc);
		
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println(month);  //�̰� 0���� ���Ƹ���
		
		int date = c.get(Calendar.DATE);
		System.out.println(date);		
		
		int amPm = c.get(Calendar.AM_PM);
		System.out.println(amPm);  //������ 0, ���Ĵ� 1
		String sAmPm = amPm == 0 ? "����" : "����";
		System.out.println(sAmPm);		
		
		//int hour = c.get(Calendar.HOUR);
		int hour = c.get(Calendar.HOUR_OF_DAY);  //�̷��� �ϸ� 21�� �̷��� ����!
		System.out.println(hour);
		
		int min = c.get(Calendar.MINUTE);
		System.out.println(min);	
		
		int sec = c.get(Calendar.SECOND);
		System.out.println(sec);
		
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);  //sunday�� 1, monday�� 2 .. saturday�� 7		
	}
	
	public void method3() {
		int year = 2021;
		int month = 2;
		int date = 8;
		int hour = 21;
		int min = 50;
		int sec = 0;
		
		Calendar c = new GregorianCalendar(year, month, date, hour, min, sec);
		long time = c.getTimeInMillis();
		Date endDay = new Date(time);
		System.out.println(endDay);
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd E���� a HH�� mm�� ss��");
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd E���� a hh�� mm�� ss��");
		String formatStr = sdf.format(endDay);
		
		System.out.println(formatStr);
	}
}

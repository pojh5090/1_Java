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
		System.out.println(time);  //today랑 결과가 같음!
		
		//Date date = new Date(2020, 7, 27); 
		//The constructor Date(int, int, int) is deprecated		
	}
	
	public void method2() {
//		Calender c = new Calender(); --> 추상클래스라, Calender 접근제한자 protected라서 객체생성x 
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		Calendar gc = new GregorianCalendar();
		System.out.println(gc);
		
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println(month);  //이건 0부터 세아린다
		
		int date = c.get(Calendar.DATE);
		System.out.println(date);		
		
		int amPm = c.get(Calendar.AM_PM);
		System.out.println(amPm);  //오전은 0, 오후는 1
		String sAmPm = amPm == 0 ? "오전" : "오후";
		System.out.println(sAmPm);		
		
		//int hour = c.get(Calendar.HOUR);
		int hour = c.get(Calendar.HOUR_OF_DAY);  //이렇게 하면 21시 이렇게 나옴!
		System.out.println(hour);
		
		int min = c.get(Calendar.MINUTE);
		System.out.println(min);	
		
		int sec = c.get(Calendar.SECOND);
		System.out.println(sec);
		
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);  //sunday는 1, monday는 2 .. saturday는 7		
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
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd E요일 a HH시 mm분 ss초");
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd E요일 a hh시 mm분 ss초");
		String formatStr = sdf.format(endDay);
		
		System.out.println(formatStr);
	}
}

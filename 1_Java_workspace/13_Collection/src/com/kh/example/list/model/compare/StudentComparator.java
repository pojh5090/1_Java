package com.kh.example.list.model.compare;

import java.util.Comparator;

import com.kh.example.list.model.vo.Student;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		int standard = o1.getScore();
		int object = o2.getScore();
		
		//이름 정렬할 때 로직 그대로 (점수 오름차순)
		if(standard  > object) {
			return 1;
		} else if(standard == object) {
//			return 0;			
			//같은 점수지만 이름 다를경우 오름차순으로 정렬하려한다
			String standardName = o1.getName();
			String objectName = o2.getName();
			return standardName.compareTo(objectName);  
		} else {
			return -1;
		}
		
		//내림차순 하고싶다면 뒤집어주면 된다!
	}
	
}

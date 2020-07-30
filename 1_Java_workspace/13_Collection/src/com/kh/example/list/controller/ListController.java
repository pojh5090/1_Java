package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.example.list.model.compare.StudentComparator;
import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() {
		ArrayList list1 = new ArrayList();
		list1.add(null);  //->여긴 Object 타입 들어감 ...
		
		ArrayList<Student> list = new ArrayList<Student>(3); 
		          //여기 제네릭을 통해 타입 제한 시켜줬다! + 3개짜리 공간
		//list.add(null);   //->이제 Student 타입만 들어감!
		
		// add(E e) : 리스트 끝에 데이터 추가
		list.add(new Student("테스트", 0));
		list.add(new Student("도대담", 60));
		
		System.out.println("list : " + list);
		
		list.add(new Student("남나눔", 90));
		list.add(new Student("하현호", 85));
		
		System.out.println("list : " + list);
		System.out.println("현재 list에 담긴 element 개수 : " + list.size()); //장점 1. 크기에 제약 없음
		
		list.add(new Student("문미미", 66));
		System.out.println("list : " + list);
		
		
		// 장점2. 추가/삭제/정렬 등의 기능처리 간단
		// add(int index, E e) : index번째에 데이터 추가
		list.add(0, new Student("류라라", 100));
		System.out.println("list : " + list);
		
		list.add(3, new Student("강건강", 40));
		System.out.println("list : " + list);
		
		
		// remove(int index) : index번째 데이터  삭제
		list.remove(1);
		System.out.println("list : " + list);
		
		// remove(Object o) : 해당 데이터 삭제
		list.remove(new Student("강건강", 40));  // ->삭제 안됨!
		// 이유 : remove(//) 여기 괄호 안에 equals 메소드로 같은지 판별 먼저 하는데, equals는 원래 object 클래스 메소드.
		// -->주소값이 같은지 비교함 (단, String에서는 문자열 비교) 
		//--> Student에도 equals가 있음 -> 오버라이딩 해줘야함! 주소값 아닌, 필드값으로 비교 될 수 있도록!!
		System.out.println("list : " + list);
		
		
		//정렬 방법1. Collections클래스 이용 : 컬렉션을 이용할 때 유용한 메소드를 모아놓은 클래스 (자매품 : Arrays)
		Collections.sort(list); 
		System.out.println("list 정렬1: " + list);
		
		
		//정렬 방법2. List.sort()메소드 이용
		list.add(new Student("박보배", 85));
		list.sort(new StudentComparator());
		System.out.println("list 정렬2: " + list);
		
		//정렬 방법3. 여러 타입을 저장할 수 있음
//		list.add("끝");
		
		//set(int index, E e) : index번째에 있는 요소를 e로 수정
		list.set(2, new Student("도대담", 60));
		System.out.println("list : " + list);
		
		//get(int index) : index번째에 있는 요소를 가지고 옴
		Student s = list.get(2);
		System.out.println(s);
		System.out.println("list : " + list);
		
		//subList(int index1 , int index2) : index1번째부터 index2번째 까지의 리스트 반환
		System.out.println(list.subList(2, 5));
		
		//contains(Object o) : o가 리스트에 존재한다면 true반환
		//indexOf(Object o) : o가 리스트에 위치하는 인덱스 반환
		boolean bool = list.contains(new Student("남나눔", 90));
		System.out.println(bool);
		int index = list.indexOf(new Student("남나눔", 90));
		System.out.println(index);
		
		int index2 = list.indexOf(new Student("남나눔", 50));
		System.out.println(index2); //없을경우 -1 반환함
		
		//clear() : 저장된 모든 객체 삭제
		//isEmpty() : 리스트가 비어있으면 true 반환
		System.out.println("list : " + list);
		list.clear();
		System.out.println("list : " + list);
		
		System.out.println("list가 비어있나요? : " + list.isEmpty());
	}
}

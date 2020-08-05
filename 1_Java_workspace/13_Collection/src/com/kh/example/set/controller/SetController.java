package com.kh.example.set.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.kh.example.set.model.compare.DogComparator;
import com.kh.example.set.model.vo.Dog;

public class SetController {
	public void doSet() {
//		HashSet<Dog> set = new HashSet<>(); //이렇게 제네릭 생략 가능 : 타입 추론
		HashSet<Dog> set = new HashSet<Dog>();
		
		//add(E e) : set 안에 데이터 추가
		set.add(new Dog("마음", 3.3));
		set.add(new Dog("모모", 2.3));
		set.add(new Dog("이든", 5.6));
		System.out.println(set);   //->순서 마음대로 출력됨
		
		set.add(new Dog("모모", 2.3));		
		System.out.println(set);  //->중복제거 되지 않음
		//이유 : new 연산자 사용을 해서 다른 주소값을 가지고 있기 때문 (동등객체)
		//방법 : hashCode(), equals() 오버라이딩 해주면 해결됨.
		
		//<String> ,<Interger> 타입으로 중복 데이터 넣어도 한번씩만 출력됨
		//이유 : 둘다 equals를 상속 받고 있기 때문!
		
		LinkedHashSet set2 = new LinkedHashSet<Dog>();
		set2.add(new Dog("초코", 2.1));
		set2.add(new Dog("콩이", 8.3));
		set2.add(new Dog("두부", 5.0));
		set2.add(new Dog("초코", 2.1));
		System.out.println(set2);
		
		set2.add(new Dog("로이", 6.1));
		set2.add(new Dog("공주", 5.2));
		set2.add(new Dog("왕자", 9.5));
		set2.add(new Dog("조이", 12.5));
		System.out.println(set2);  //순서 유지 됨을 알 수 있다
		
		TreeSet<Dog> set3 = new TreeSet<Dog>(set2);
		System.out.println(set3);  //비교 CompareTo 메소드 만들어줘서 이름 오름차순으로 정렬됨
		
		//몸무게로 비교하여 정렬하겠다
		TreeSet<Dog> set4 = new TreeSet<Dog>(new DogComparator());
		set4.addAll(set2);
		set4.add(new Dog("봄이", 6.1)); //추가 안되었음! 이유 : 로이랑 무게가 같아서 같은 객체로 인식
		System.out.println(set4); 
		System.out.println(set4.size());
		
		Iterator<Dog> it = set4.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		while(it.hasNext()) {
			System.out.println("re : " + it.next());
		}  //여기는 출력 안됨.. 이유 : 한번 끝에 도달했으면 재활용이 되지 않기 때문에 (더 하고싶으면 새로운 객체 또 만들어주기)
		
		
	}
}

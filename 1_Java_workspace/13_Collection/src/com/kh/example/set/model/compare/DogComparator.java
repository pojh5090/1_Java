package com.kh.example.set.model.compare;

import java.util.Comparator;

import com.kh.example.set.model.vo.Dog;

public class DogComparator implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		
		double standard = o1.getWeight();
		double object = o2.getWeight();
		
		if(standard > object) {
			return 1;
		} else if(standard == object) {
//			return 0;
			return o1.getName().compareTo(o2.getName()); 
			//이렇게 해주면 같은 무게여도 출력되고 이름도 오름차순으로 출력됨!
		} else {
			return -1;
		}
	}
}

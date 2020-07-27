package package3.controller;

import package3.model.vo.Animal;
import package3.model.vo.Cat;
import package3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] aArr = new Animal[5];
		
		aArr[0] = new Dog("소주", "푸들", 7);
		aArr[1] = new Cat("야옹이", "고양이", "엄마 집" , "검은색");
		aArr[2] = new Dog("밍크", "시바견", 10);
		aArr[3] = new Cat("나비", "페르시안", "동물병원" , "하얀색");
		aArr[4] = new Dog("피자", "비숑", 4);
		
		for(int i = 0; i < aArr.length; i++) {
			if(aArr[i] instanceof Dog) {
				((Dog)aArr[i]).speak();
			} else {
				((Cat)aArr[i]).speak();
			}
		}
	}
}

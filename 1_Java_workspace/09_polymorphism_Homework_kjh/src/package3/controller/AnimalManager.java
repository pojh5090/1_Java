package package3.controller;

import package3.model.vo.Animal;
import package3.model.vo.Cat;
import package3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] aArr = new Animal[5];
		
		aArr[0] = new Dog("����", "Ǫ��", 7);
		aArr[1] = new Cat("�߿���", "�����", "���� ��" , "������");
		aArr[2] = new Dog("��ũ", "�ùٰ�", 10);
		aArr[3] = new Cat("����", "�丣�þ�", "��������" , "�Ͼ��");
		aArr[4] = new Dog("����", "���", 4);
		
		for(int i = 0; i < aArr.length; i++) {
			if(aArr[i] instanceof Dog) {
				((Dog)aArr[i]).speak();
			} else {
				((Cat)aArr[i]).speak();
			}
		}
	}
}

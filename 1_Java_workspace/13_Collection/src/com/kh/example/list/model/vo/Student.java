package com.kh.example.list.model.vo;

public class Student implements Comparable<Student>{

	private String name;
	private int score;
	
	public Student() {}
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String toString() {
		return name + "(" + score + "점)";
	}
	//여기 equals 오버라이딩 할거다.. 제일 관련 높은 hashCode() 메소드도 함께 오버라이딩 해줘야함
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		//객체 자체 비교
		if(this == obj) {
			return true; //같은 객체이니까 true 반환
		}
		if(obj == null) {
			return false; //내가 만든 객체랑 비교하는거니까 당연히 false 반환
		}
		if(getClass() != obj.getClass()) {
			return false;  //내 정보를 담아놓은 메소드(getClass())랑 다르니까 false 반환
		}
				
		//객체 필드 비교
		Student other = (Student)obj; //형변환 먼저
		if(name == null) {
			if(other.name != null) {
				return false; 
			}
		} else if(!name.equals(other.name)) {
			return false;
		}
		if(score != other.score) {
			return false;
		}	
		return true;
	}
	@Override
	public int compareTo(Student o) {
		
		//이름(String) 오름차순
		String otherName = o.name;
		
		//String 클래스 메소드인 compareTo에서 오름차순으로 정렬해줌으로 가져다가 쓰기
		int result = name.compareTo(otherName); 
		/*             비교주체                비교대상
		   	비교 주체가 비교 대상과 같으면 0 반환,
		   	비교 주체가 비교 대상보다 크면 1 반환,
		   	비교 주체가 비교 대상보다 작으면 -1 반환
		 */	
		
//		return -result; //내림차순
		return result;
	}	
}

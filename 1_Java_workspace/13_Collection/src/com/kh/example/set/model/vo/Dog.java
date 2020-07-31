package com.kh.example.set.model.vo;

public class Dog implements Comparable<Dog>{
	private String name;
	private double weight;
	
	public Dog() {}
	public Dog(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String toString() {
		return name + "(" + weight + "kg)";
	}	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int)weight;
		
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		Dog other = (Dog)obj;
		if(name == null) {
			if(other.name != null)
				return false;
		} else if(!name.equals(other.name)) {
			return false;
		}
		if(weight != other.weight) {
			return false;
		}
		return true; //하면 중복 알아봄!
	}
	@Override
	public int compareTo(Dog o) {
		String otherName = o.name;
		
		int result = name.compareTo(otherName);
		/*             비교주체                비교대상
	   	비교 주체가 비교 대상과 같으면 0 반환,
	   	비교 주체가 비교 대상보다 크면 1 반환,
	   	비교 주체가 비교 대상보다 작으면 -1 반환
		 */	
		return result;
	}
}

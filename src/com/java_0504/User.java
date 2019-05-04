package com.java_0504;

public class User { // 멤버 객체 or 자바 빈 == Bean;
	
	String name;
	String age;
	String tall;
	String weight;
	
	public User(String name, String age, String tall, String weight) {
	setName(name);
	setAge(age);
	setTall(tall);
	setWeight(weight);
}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getTall() {
		return tall;
	}
	public void setTall(String tall) {
		this.tall = tall;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
}

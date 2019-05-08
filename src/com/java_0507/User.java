package com.java_0507;

public class User { // 멤버 객체 or 자바 빈 == Bean;
	
	String name;
	int age;
	int tall;
	int weight;
	
	public User(String name, int age, int tall, int weight) {
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
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getTall() {
		return tall;
	}
	
	public void setTall(int tall) {
		this.tall = tall;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}

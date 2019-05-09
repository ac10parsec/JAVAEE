package com.java_0508;

public interface Main11Interface {
	
	// 4개의 기능 추상 메소드 선언
	public boolean addstu(Student stu); // 학생 추가
	public Student finstu(String name); // 학생 검색
	public boolean modstu(Student stu); // 학생 수정
	public boolean remstu(Student stu); // 학생 삭제
}

package com.java_0508;

import java.util.List;
import java.util.ArrayList;

public class Main11 implements Main11Interface {
	
	public static List<Student> userList = new ArrayList<Student>();
	
	@Override
	public boolean addstu(Student stu) { // 학생 추가
		userList.add(stu);
//		System.out.println(userList.get(0).getGender());
		return true;
	}

	@Override
	public Student finstu(String name2) { // 학생 검색
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getName().equals(name2)) {
				return userList.get(i);
//				String name = userList.get(i).getName();
//				String gender = userList.get(i).getGender();
//				String id = userList.get(i).getId();
//				String pw = userList.get(i).getPw();
//				Student stu = new Student(name,gender,id,pw);
//				return stu;
			}
		}
		return null;
	}

	@Override
	public boolean modstu(Student stu) { // 학생 변경
		for (int i = 0; i < userList.size(); i++) {
			String name = stu.getName();
			String id = stu.getId();
			if (userList.get(i).getName().equals(name)&&userList.get(i).getId().equals(id)) {
				userList.remove(i);
				userList.add(stu);
			}
		}
		return true;
	}

	@Override
	public boolean remstu(Student stu) { // 학생 삭제
		for (int i = 0; i < userList.size(); i++) {
			String name = stu.getName();
			String id = stu.getId();
			if (userList.get(i).getName().equals(name)&&userList.get(i).getId().equals(id)) {
				userList.remove(i);
			}
		}
		return true;
	}

}

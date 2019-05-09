package com.java_0508;

public class Main11 implements Main11Interface {
	
	// public static List<Student> userList = new ArrayList<Student>(); 가능
	// static을 사용할때는 정확하게 식별 가능한 주소가 필요함!!
	// static이 어디에 있어도 상관은 없지만 새로운 클래스를 하나 더 만들어서 관리하는 것이 좋음
	// 디자인패턴 싱글톤? 참조
	
	@Override
	public boolean addstu(Student stu) { // 학생 추가
		Util11.userList.add(stu);
		// userList.add(stu); 로 하면 userList가 전역 변수처럼 사용되기때문에 앞에 클래스를 써줘야 함
		return true;
	}

	@Override
	public Student finstu(String name2) { // 학생 검색
		for (int i = 0; i < Util11.userList.size(); i++) {
			if (Util11.userList.get(i).getName().equals(name2)) {
				return Util11.userList.get(i);
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
		for (int i = 0; i < Util11.userList.size(); i++) {
			String name = stu.getName();
			if (Util11.userList.get(i).getName().equals(name)) {
				Util11.userList.remove(i);
				Util11.userList.add(stu);
			}
		}
		return true;
	}

	@Override
	public boolean remstu(Student stu) { // 학생 삭제
		for (int i = 0; i < Util11.userList.size(); i++) {
			String name = stu.getName();
			String id = stu.getId();
			if (Util11.userList.get(i).getName().equals(name) && Util11.userList.get(i).getId().equals(id)) {
				Util11.userList.remove(i);
			}
		}
		return true;
	}

}

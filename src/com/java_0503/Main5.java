package com.java_0503;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

@WebServlet("/Main5")
public class Main5 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		User user = new User();
//		user.age = 1;
//		user.tall = 2;
//		user.weight = 1000;
//		user.name = "goodee";
		
//		user.setName("goodee");
//		String name = user.getName();
//		System.out.println(name);
		
//		User goodee = new User("goodee",1,2,1000);
//		User gasan = new User("gasan",10,185,50);
//		
//		if (goodee.getAge() > gasan.getAge()) {
//			System.out.println("goodee");
//		} else {
//			System.out.println("gasan");
//		}
		
		HashMap<String,Object> resultMap = new HashMap<String, Object>();
		// K = Key (String), V = Value (Object) // Object = 상위 객체
		// Object >> 숫자, 문자, 배열, 객체 모두 가능
		resultMap.put("name","goodee");
		resultMap.put("age",1);
		resultMap.put("tall",2);
		resultMap.put("weight",1000);
		resultMap.put("school","goodeeac");
		
		String name = resultMap.get("name").toString();
		System.out.println(name);
		// 배열은 순서가 있어서 index가 필요하지만 HashMap은 순서가 없고 Key가 있음
		
		
		List<User> userList = new ArrayList<User>(); // E = Elements (User)
		userList.add(new User("goodee",1,2,1000)); // index 0번 위치에 User 객체 담기
		userList.add(new User("gasan",10,185,50)); // index 1번 위치에 User 객체 담기
		
		
//		if (userList.get(0).getAge() < userList.get(1).getAge()) {
//			System.out.println(userList.get(0).getName());
//		} else {
//			System.out.println(userList.get(1).getName());
//		}
		
		User goodee = userList.get(0);
		User gasan = userList.get(1);
		
		if (goodee.getAge() > gasan.getAge()) {
			System.out.println(goodee.getName());
		} else {
			System.out.println(gasan.getName());
		}
		
		// List<> >> <> 안에는 객체만 넣을 수 있는데 다른 변수 타입을 넣고싶다면 Object 형식으로 넣을 수 있음
		List 정수형리스트 = new ArrayList();
		정수형리스트.add(1);
		정수형리스트.add("2");
		정수형리스트.add(3.4);
		정수형리스트.add(true);
		
		for (int i = 0; i < 정수형리스트.size(); i++) {
			System.out.println(정수형리스트.get(i));
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}

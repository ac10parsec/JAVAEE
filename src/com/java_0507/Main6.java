package com.java_0507;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main6")
public class Main6 extends HttpServlet {
	
	List<User> userList = new ArrayList<User>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8"); // 화면 출력
		response.setCharacterEncoding("UTF-8"); // 자바
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		int tall = Integer.parseInt(request.getParameter("tall"));
		int weight = Integer.parseInt(request.getParameter("weight"));
		userList.add(new User(name,age,tall,weight));
		
		String html = "";
		html += "저장되었습니다 :D <br><br>";
		html += "<a href='http://localhost:8080/JAVAEE/'>처음으로</a>";
		response.getWriter().print(html);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("UTF-8");		
		// Get과 Post는 통신 방식이 다르기 때문에, Post는 한글이 깨질 수 있음
		response.setContentType("text/html; charset=UTF-8;");
		response.setCharacterEncoding("UTF-8");
		
//		// 파라메터 확인
//		Enumeration<String> params = request.getParameterNames();
//		while (params.hasMoreElements()) {
//			System.out.println(params.nextElement());
//		}
		
		String html = "";
		String name = request.getParameter("name");
		boolean check = true;
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getName().equals(name)) {
				html += "Name: " +userList.get(i).getName()+ "<br><br>";
				html += "Age: " +userList.get(i).getAge()+ "<br><br>";
				html += "Tall: " +userList.get(i).getTall()+ "<br><br>";
				html += "Weight: " +userList.get(i).getWeight()+ "<br><br>";
				check = false;
			}
		}
		if (check) {
			html += "그런 이름은 없네요?<br><br>";
		}
		html += "<a href='http://localhost:8080/JAVAEE/'>처음으로</a>";
		response.getWriter().print(html);
	}

}

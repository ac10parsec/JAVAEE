package com.java_0504;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HomeWork2")
public class HomeWork2 extends HttpServlet {
	
	List<User> userList = new ArrayList<User>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8"); // 화면 출력
		response.setCharacterEncoding("UTF-8"); // 자바
		
		// Query 1
		String name1 = request.getParameter("name1");
		String age = request.getParameter("age");
		String tal = request.getParameter("tall");
		String wei = request.getParameter("weight");
		
		// Query 2
		String name2 = request.getParameter("name2");
		
		int num = -2;
		if (name1 != null) {
			userList.add(new User(name1,age,tal,wei));
			num = -1;
		} else if (name2 != null){
			for (int i = 0; i < userList.size(); i++) {
				if (name2.equals(userList.get(i).getName())) {
					num = i;
					break;
				}
			}
		}
		
		String html = "";
		if (num >= 0) {
			html += "Name: " +userList.get(num).getName()+ "<br><br>";
			html += "Age: " +userList.get(num).getAge()+ "<br><br>";
			html += "Tall: " +userList.get(num).getTall()+ "<br><br>";
			html += "Weight: " +userList.get(num).getWeight()+ "<br><br>";
		} else if (num == -1) {
			html += "저장되었습니다 :D <br><br>";
		} else if (num == -2) {
			html += "그런 이름은 없네요?<br><br>";
		}
		
		html += "<a href='http://localhost:8080/JAVAEE/'>처음으로</a>";
		response.getWriter().print(html);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

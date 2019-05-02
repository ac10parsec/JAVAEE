package com.java_0502;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main2")
public class Main2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// url // http://localhost:8080/JAVAEE/Main2?a=1&b=2 
		
		String a = request.getParameter("a"); // 변수 a = 1; // 숫자를 문자로 받음 << Parameter = String
		String b = request.getParameter("b"); // 변수 b = 2;
		String cc = request.getParameter("c");
		
		System.out.println(cc);
		
		String c = a + b; // c = 12
//		System.out.println(c); 
		
		int d = Integer.parseInt(a) + Integer.parseInt(b); // d = 3 
//		System.out.println(d);
		
		response.getWriter().print(c + ", "+d);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}

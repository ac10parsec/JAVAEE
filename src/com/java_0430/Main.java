package com.java_0430;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main") // URL : http://localhost:8080/JAVAEE/Main
public class Main extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		
		response.setContentType("text/html; charset=UTF-8"); // 화면 출력
		response.setCharacterEncoding("UTF-8"); // 자바
		response.getWriter().print("안녕 :D");
		
	}
}

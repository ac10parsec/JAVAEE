package com.java_0503;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java_0502.계산기;

@WebServlet("/HomeWork2")
public class HomeWork2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8"); // 화면 출력
		response.setCharacterEncoding("UTF-8"); // 자바
		
		String name1 = request.getParameter("name1");
		String name2 = request.getParameter("name2");
		int age = Integer.parseInt(request.getParameter("Age"));
		int tal = Integer.parseInt(request.getParameter("Tall"));
		int wei = Integer.parseInt(request.getParameter("Weight"));
		
		String html = "";
		if (name1 == null) {
			html = "name1";
		} else {
			html = "name2";
		}
		
		html += "입력 받음 :D <br><br>";
		html += "<a href='http://localhost:8080/JAVAEE/'>처음으로</a>";
		response.getWriter().print(html);
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

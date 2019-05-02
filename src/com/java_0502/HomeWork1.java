package com.java_0502;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HomeWork1")
public class HomeWork1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8"); // 화면 출력
		response.setCharacterEncoding("UTF-8"); // 자바
		
		계산기 calc = new 계산기();
		
		String in1 = request.getParameter("in1"); // 변수 a = 1; // 숫자를 문자로 받음 << Parameter = String
		String cal = request.getParameter("cal"); // 변수 b = 2;
		String in2 = request.getParameter("in2");
		
		int a = Integer.parseInt(in1);
		int b = Integer.parseInt(in2);
		int c = 0;
		
		switch (cal) {
		case "+":
			c = calc.덧셈(a,b);
			break;
		case "-":
			c = calc.뺄셈(a,b);
			break;
		case "*":
			c = (int)calc.곱셈(a,b);
			break;
		case "/":
			c = (int)calc.나눗셈(a,b);
			break;
		default:
			break;
		}

		String html = "";
		html = html + in1 + " " + cal + " " + in2 + " = " + c + "<br>";
		html = html + "<a href='http://localhost:8080/JAVAEE/'>처음으로</a>";

		response.getWriter().print(html);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}

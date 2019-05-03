package com.java_0503;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main4")
public class Main4 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		구구단 gg = new 구구단();
		
		String out1 = gg.lv1();
		response.getWriter().print(out1+"<br>");
		
		String out2 = gg.lv2();
		response.getWriter().print(out2);
		
		String out3 = gg.lv3();
		response.getWriter().print(out3);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}

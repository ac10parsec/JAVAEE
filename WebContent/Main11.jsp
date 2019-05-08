<%@page import="com.java_0508.Student"%>
<%@page import="com.java_0508.Main11"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// Query1
	String name1 = request.getParameter("name1");
	String gender1 = request.getParameter("gender1");
	String id1 = request.getParameter("id1");
	String pw1 = request.getParameter("pw1");
	
	// Query2
	String name2 = request.getParameter("name2");
		
	// Query3
	String name3 = request.getParameter("name3");
	String gender3 = request.getParameter("gender3");
	String id3 = request.getParameter("id3");
	String pw3 = request.getParameter("pw3");
		
	// Query4
	String name4 = request.getParameter("name4");
	String gender4 = request.getParameter("gender4");
	String id4 = request.getParameter("id4");
	String pw4 = request.getParameter("pw4");
	
	String html = "";
	Main11 main11 = new Main11();
	if (name1 != null) {
		boolean check = main11.addstu(new Student(name1,gender1,id1,pw1));
		if (check) {
			html += "저장되었습니다 :D<br><br>";
		}
	} else if (name2 != null) {
		Student stu = main11.finstu(name2);
		if (stu != null) {
			html += "Name: " + stu.getName() +"<br><br>";
			html += "Gender: " + stu.getGender() +"<br><br>";
			html += "Id: " + stu.getId() +"<br><br>";
			html += "Passward: " + stu.getPw() +"<br><br>";
		} else {
			html += "그런 이름은 없네요?<br><br>";
		}
	} else if (name3 != null) {
		boolean check = main11.modstu(new Student(name3,gender3,id3,pw3));
		if (check) {
			html += "변경되었습니다 :D<br><br>";
		}
	} else if (name4 != null) {
		boolean check = main11.remstu(new Student(name4,gender4,id4,pw4));
		if (check) {
			html += "삭제되었습니다 :D<br><br>";
		}
	}
	html += "<a href='http://localhost:8080/JAVAEE/'>처음으로</a>";
	response.getWriter().print(html);
%>
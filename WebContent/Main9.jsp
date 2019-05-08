<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.java_0504.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
	List<User> userList = new ArrayList<User>();
%>
<%
	String name1 = request.getParameter("name1");
	String age = request.getParameter("age");
	String tal = request.getParameter("tall");
	String wei = request.getParameter("weight");
	
	String name2 = request.getParameter("name2");
	
	int check = -2;
	if (name1 != null) {
		userList.add(new User(name1,age,tal,wei));
		check = -1;
	} else if (name2 != null){
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getName().equals(name2)) {
				check = i;
				break;
			}
		}
	}
	
	String html = "";
	if (check >= 0) {
		html += "Name: " +userList.get(check).getName()+ "<br><br>";
		html += "Age: " +userList.get(check).getAge()+ "<br><br>";
		html += "Tall: " +userList.get(check).getTall()+ "<br><br>";
		html += "Weight: " +userList.get(check).getWeight()+ "<br><br>";
	} else if (check == -1) {
		html += "저장되었습니다 :D<br><br>";
	} else if (check == -2) {
		html += "그런 이름은 없네요?<br><br>";
	}
	html += "<a href='http://localhost:8080/JAVAEE/'>처음으로</a>";
	response.getWriter().print(html);
%>
</body>
</html>
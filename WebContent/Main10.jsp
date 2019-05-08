<%@page import="com.java_0508.Test1Interface"%>
<%@page import="com.java_0507.Test"%>
<%@page import="com.java_0508.TestInterface"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	TestInterface ti; // 선언
// 	ti = new TestInterface; // 인터페이스는 생성자가 없어서 생성자 생성 못 함
	ti = new Test();
	int result = ti.add();
// 	ti.print() // 인터페이스에 없는 메소드라서 사용 불가
	
	Test1Interface t1i = new Test();
	t1i.add(10);
	
	Test t = new Test();
	t.add();
	t.add(10);
	t.print();
%>
<%= result %> <!-- 변수 값 출력  -->
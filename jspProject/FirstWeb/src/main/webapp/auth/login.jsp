<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String method = request.getMethod();
// out.println(method);    	
if (method.equals("GET")) {
	response.sendRedirect("login_form.jsp");
} else {
	String userid = request.getParameter("userid");
	String password = request.getParameter("password");

	if (userid.equals(password)) {
		// 로그인 성공
		// session 객체의 속성에 login 정보를 저장
		session.setAttribute("loginInfo", userid);
		response.sendRedirect("mypage.jsp");
	} else {
		// 로그인 실패
		response.sendRedirect("login_form.jsp");
	}
}
%>

<!-- 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리 페이지</title>
</head>
<body>

</body>
</html> 
-->
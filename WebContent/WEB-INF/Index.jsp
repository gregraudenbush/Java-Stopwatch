<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Stop watch</title>
</head>
<body>
<h1>Enjoy a Stop Watch friends</h1>

<a href="StopwatchServlet">Start</a><br>
<a href="Stop">Stop</a><br>
<a href="StopwatchServlet">Reset</a>


<table>
	<tr>
		<td>Start</td>
		<td>End</td>
		<td>Elapsed</td>
	</tr>
	<tr>
		<td>${starttime}</td>
		<td>${endtime}</td>
		<td>${elapsed}</td>
	</tr>


</table>
<%-- ${starttime}<br>
${endtime}<br> --%>




</body>
</html>
<%@ taglib prefix="c" 
       uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spittles</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/resouces/style.css"/>">
</head>
<body>
	<c:forEach items="${spittleList}" var="spittle">
	<li>
		<div>
			<c:out value="${spittle.message}" />
		</div>
		<div>
			<span><c:out value="${spittle.time}" /></span> 
			<span> (<c:out value="${spittle.latitude}" />, <c:out value="${spittle.longitude}" />) </span>
		</div>
	</li>
</c:forEach>
</body>
</html>
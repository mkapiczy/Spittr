<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spittr</title>

<style type="text/css">
span.error {
	color: red;
}

label.error {
	color: red;
}
</style>
</head>
<body>
	<h1>Register</h1>
	<sf:form method="POST" modelAttribute="spitter">
		<sf:label path="firstName" cssErrorClass="error">First Name:</sf:label>
		<sf:input path="firstName" />
		<sf:errors path="firstName" cssClass="error" />
		<br />
		<sf:label path="lastName" cssErrorClass="error">Last Name:</sf:label>
		<sf:input path="lastName" />
		<sf:errors path="lastName" cssClass="error" />
		<br />
		<sf:label path="username" cssErrorClass="error">Username:</sf:label>
		<sf:input path="username" />
		<sf:errors path="username" cssClass="error" />
		<br />
		<sf:label path="password" cssErrorClass="error">Password:</sf:label>
		<sf:password path="password" />
		<sf:errors path="password" cssClass="error" />
		<br />
		<input type="submit" value="Register" />
	</sf:form>
</body>
</html>
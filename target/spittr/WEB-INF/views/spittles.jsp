<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Spittles</title>
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

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<h3> XYZ Bank's Online Loan Eligibility Test Application </h3><br><br>
	<form:form action="Success.obj" modelAttribute="customer" method="POST">
	 			Your PAN Card Number :<form:input  path="panCardNumber" placeholder="panCardNumber"/><br>
		 		<input type="submit" class="btn btn-primary" value="Test Eligibility"/><br>
	 </form:form>
</body>
</html>
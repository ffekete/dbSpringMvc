<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>

<head>
	<link rel="stylesheet" href="<spring:theme code='css'/>">
</head>
<body>
<form:form commandName="newClientsRequestModel" type="form" action="newClientPost.html">
	<spring:message code="client_info"/>
	
	<form:input type="text" path="name"></form:input>   <form:errors path="*"></form:errors><br>
</form:form>
</body>
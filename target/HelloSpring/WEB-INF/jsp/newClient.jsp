<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<form:form commandName="newClientsRequestModel" type="form" action="newClientPost.html">
	<spring:message code="client_info"/>
	<form:errors path="*"></form:errors><br>
	<form:input type="text" path="name"></form:input>
	
	
</form:form>
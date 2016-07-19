<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form:form commandName="newClientsRequestModel" type="form" action="newClientPost.html">
	<form:errors path="*"></form:errors><br>
	<form:input type="text" path="name"></form:input>
	
	
</form:form>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<form action="<c:url value='/j_spring_security_check'/>" method="post">
	<div class="form-group">
		<label for="j_username"><spring:message code="user_name"/></label> <input type="text"
			name="j_username" />
	</div>
	<div class="form-group">
		<label for="j_password"><spring:message code="password"/></label> <input type="password"
			name="j_password" />
	</div>
	<button type="submit" class="btn btn-default"><spring:message code="submit"/></button>
</form>


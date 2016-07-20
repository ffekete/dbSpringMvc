<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<link rel="stylesheet"
	href="//cdn.datatables.net/1.10.0/css/jquery.dataTables.css">
<script type="text/javascript" charset="utf8"
	src="//code.jquery.com/jquery-1.10.2.min.js"></script>
<script type="text/javascript"
	src="//cdn.datatables.net/1.10.0/js/jquery.dataTables.js"></script>
</head>

<body>
	<table id="clientsTable">
		<thead>
			<tr>
				<th>id</th>
				<th>Name</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="client" items="${listClientsModel.clients}">
				<tr>
					<td>${client.id}</td>
					<td>${client.name}</td>
					<td><a href="<c:url value='${client.viewUrl}' /> ">Show</a></td>
					</tr>
			</c:forEach>
		</tbody>
	</table>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#clientsTable").dataTable();
		});
	</script>
</body>
</html>
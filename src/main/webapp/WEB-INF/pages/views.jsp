<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Users Manager</title>
<style>
	table, td, th {
	    border: 1px solid black;
	}
	
	table {
	    border-collapse: collapse;
	}
	
	th {
	    text-align: left;
	}
</style>
</head>
<body>
	<div>
		<table>
	        <tr>
	            <td>ID</td>
	            <td>Username</td>
	            <td>Fullname</td>
	            <td>Email</td>
	            <td>Edit</td>
	        </tr>
	        <c:forEach items="${listUsers}" var="ls">
	            <tr>
	            <td>${ls.id}</td>
	            <td>${ls.username}</td>
	            <td>${ls.fullname}</td>
	            <td>${ls.email}</td>
	            <td><a href="<c:url value='#' />">Edit</a></td>
	            </tr>
	        </c:forEach>
    	</table>
	</div>
	<a href="new">Add User</a>
</body>
</html>
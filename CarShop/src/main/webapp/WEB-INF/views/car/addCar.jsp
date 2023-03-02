<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자동차 등록</title>
</head>
<body>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

	<%@ include file="/WEB-INF/views/navbar.jsp" %>

	<div class="alert alert-dark" role="alert">
		<div class="container">
			<h1>차량 등록</h1>
		</div>
	</div>
	
	<form:form modelAttribute="NewCar" class="form-horizontal container">
		<fieldset>
			<legend>${addTitle }</legend>
			자동차 ID : <form:input path="cid" class="form-control"/>
			자동차 이름 : <form:input path="cname" class="form-control"/>
			자동차 가격 : <form:input path="cprice" class="form-control"/>
			자동차 카테고리 : <form:input path="ccate" class="form-control"/>
			자동차 소개 : <form:textarea path="cdesc" cols="50" rows="2" class="form-control"/>
			<br>
			<input type="submit" class="btn btn-primary" value="등록">
		</fieldset>
	</form:form>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Car List</title>
</head>
<body>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">

	<%@ include file="/WEB-INF/views/navbar.jsp" %>

	<div class="alert alert-dark" role="alert">
		<div class="container">
			<h1>차량 보기</h1>
		</div>
	</div>

	<div class="container">
		<div class="row" align="center">
			<c:forEach items="${carList }" var="car">
				<div class="col-md-4">
					<h3>${car.cid }</h3>
					<p>${car.cname }</p>
					<p>${car.cprice } 만원</p>
					<a href='<c:url value="/car?id=${car.cid }"/>' class="btn btn-secondary">상세보기1</a>
					<a href='/car?id=${car.cid }' class="btn btn-secondary">상세보기2</a>
				</div>
			</c:forEach>
		</div>
	</div>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>
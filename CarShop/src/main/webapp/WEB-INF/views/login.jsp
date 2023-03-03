<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
    <!-- Favicons -->
	<link rel="apple-touch-icon" href="https://getbootstrap.kr/docs/5.2/assets/img/favicons/apple-touch-icon.png" sizes="180x180">
	<link rel="icon" href="https://getbootstrap.kr/docs/5.2/assets/img/favicons/favicon-32x32.png" sizes="32x32" type="image/png">
	<link rel="icon" href="https://getbootstrap.kr/docs/5.2/assets/img/favicons/favicon-16x16.png" sizes="16x16" type="image/png">
	<link rel="manifest" href="https://getbootstrap.kr/docs/5.2/assets/img/favicons/manifest.json">
	<link rel="mask-icon" href="https://getbootstrap.kr/docs/5.2/assets/img/favicons/safari-pinned-tab.svg" color="#712cf9">
	<link rel="icon" href="https://getbootstrap.kr/docs/5.2/assets/img/favicons/favicon.ico">
	<meta name="theme-color" content="#712cf9">

	<style>
		.form-signin {
		  max-width: 330px;
		  padding: 15px;
		}
		
		.form-signin .form-floating:focus-within {
		  z-index: 2;
		}
		
		.form-signin input[type="email"] {
		  margin-bottom: -1px;
		  border-bottom-right-radius: 0;
		  border-bottom-left-radius: 0;
		}
		
		.form-signin input[type="password"] {
		  margin-bottom: 10px;
		  border-top-left-radius: 0;
		  border-top-right-radius: 0;
		}
    </style>
</head>
<body>
	<%@ include file="/WEB-INF/views/header.jsp" %>

	<div class="alert alert-dark">
		<div class="container">
			<h1>로그인</h1>
		</div>
	</div>
	
	<main class="form-signin w-100 m-auto">
	  <form action="/login" method="post">
	    <img class="mb-4" src="https://getbootstrap.kr/docs/5.2/assets/brand/bootstrap-logo.svg" alt="" width="72" height="57">
	    <h1 class="h3 mb-3 fw-normal">로그인하세요</h1>
	
	    <div class="form-floating">
	      <input type="text" name="username" class="form-control" id="floatingInput" placeholder="아이디를 입력하세요">
	      <label for="floatingInput">아이디</label>
	    </div>
	    <div class="form-floating">
	      <input type="password" name="password" class="form-control" id="floatingPassword" placeholder="비밀번호를 입력하세요">
	      <label for="floatingPassword">비밀번호</label>
	    </div>
	
	    <div class="checkbox mb-3">
	      <label>
	        <input type="checkbox" value="remember-me"> 기억해줘요
	      </label>
	    </div>
	    <button class="w-100 btn btn-lg btn-primary" type="submit">로그인</button>
	    <input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }"/>
	    <p class="mt-5 mb-3 text-muted">&copy; 2017–2023</p>
	  </form>
	</main>

	<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>
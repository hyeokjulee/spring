<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload</title>
</head>
<body>
	<form action="" method="post" enctype="multipart/form-data">
		이름 : <input type="text" name="name">
		사진 : <input type="file" name="fileImage">
		<input type="submit" value="전송">
	</form>
</body>
</html>
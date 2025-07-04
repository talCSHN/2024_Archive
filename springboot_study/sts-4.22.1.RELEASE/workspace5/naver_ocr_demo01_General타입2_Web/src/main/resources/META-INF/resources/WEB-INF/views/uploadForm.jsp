<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>파일 업로드 화면</h1>
<form action="uploadOcr" method="POST" encType="multipart/form-data">
내용:<input type="text" name="theText"><br>
파일:<input type="file" name="theFile"><br>
<input type="submit" value="로그인">
</form>
</body>
</html>
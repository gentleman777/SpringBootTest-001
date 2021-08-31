<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>사용자 정보 입력</h1>

<form action="/user/put" method="post">
ID : <input type="text" name="id"><p>
Name :  <input type="text" name="name"><p> 
Phone :  <input type="text" name="phone"><p>
Address :  <input type="text" name="address"><p>
<input type="submit" value="입력">
</form>

</body>
</html>
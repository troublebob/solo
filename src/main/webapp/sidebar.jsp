<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="login_form">
		<div class="left">
			<label class="need_white"><b>Username</b></label>
		</div>
		<div class="right">
			<input type="text" placeholder="Enter Username" name="user_name" required>
		</div>
		<div class="left">
			<label class="need_white"><b>Password</b></label>
		</div>
		<div class="right">
			<input type="password" placeholder="Enter Password" name="password" required>
		</div>
	</div>
	<div id="remember">
		<button type="submit">Login</button>
		<input type="checkbox" checked="checked">
		<p class="need_white">Remember me</p>
	</div>
</body>
</html>
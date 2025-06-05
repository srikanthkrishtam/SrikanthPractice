<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">

body{
margin:0;
padding :0;
font-family: montserrat;
background:linear-gradient(to right, rgba(255,0,0,0), rgba(255,0,0,1));
height: 100vh;
overflow: hidden;
}

.center{
position: absolute;
top:50%;
left:40%;
background: white;
border-radius: 10px;
width: 400px;
}

.center h1{
text-align: center;
padding: 0 0 20px 0;
}
.center form{
padding: 0 40px ;
}
form .txt_field {
	position: relative;
	border-bottom: 2px solid #adadad;
	margin: 30px 0;
}


</style>
</head>

<body>

	<div class="center">
		<h1>Login</h1>
		<form action="" method="post">
			<div class="txt_field">
				<input type="text" required="required"> <label>UserName</label>

			</div>

			<div class="txt_field">
				<input type="password" required="required"> <label>Password</label>

			</div>

			<div class="pass">Forgot Password?</div>

			<input type="submit" value="Login">



		</form>

	</div>

</body>
</html>
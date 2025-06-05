<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
html {
	height: 100%;
}

body {
	margin: 0;
	padding: 0;
	font-family: sans-serif;
	background: linear-gradient(#141e30, #243b55);
}

.login-box {
	position: absolute;
border: 5px solid pink;
	top: 45%;
	left: 45%;
	width: 420px;
	padding: 70px;
	transform: translate(-50%, -50%);
	background: rgba(0, 0, 0, .5);
	box-sizing: border-box;
	box-shadow: 0 15px 25px rgba(0, 0, 0, .6);
	border-radius: 10px;
}

.login-box h2 {
	margin: 0 0 30px;
	padding: 0;
	color: white;
	text-align: center;
}

.login-box .user-box {
	position: relative;
}

.login-box .user-box input {
	width: 100%;
	padding: 10px 0;
	font-size: 16px;
	color: #fff;
	margin-bottom: 30px;
	border: none;
	border-bottom: 1px solid #fff;
	outline: none;
	background: transparent;
}

.login-box .user-box label {
	position: absolute;
	top: 0;
	left: 0;
	padding: 10px 0;
	font-size: 16px;
	color: #fff;
	pointer-events: none;
	transition: .5s;
}

.login-box .user-box input:focus ~ label, .login-box .user-box input:valid 
	 ~ label {
	top: -20px;
	left: 0;
	color: #03e9f4;
	font-size: 12px;
}

.login-box form a {
	position: relative;
	display: inline-block;
	padding: 10px 20px;
	color: #03e9f4;
	font-size: 16px;
	text-decoration: none;
	text-transform: uppercase;
	overflow: hidden;
	transition: .5s;
	margin-top: 40px;
	letter-spacing: 4px
}

.login-box a:hover {
	background: #03e9f4;
	color: #fff;
	border-radius: 5px;
	box-shadow: 0 0 5px #03e9f4, 0 0 25px #03e9f4, 0 0 50px #03e9f4, 0 0
		100px #03e9f4;
}

.login-box a span {
	position: absolute;
	display: block;
}

.login-box a span:nth-child(1) {
	top: 0;
	left: -100%;
	width: 100%;
	height: 2px;
	background: linear-gradient(90deg, transparent, #03e9f4);
	animation: btn-anim1 1s linear infinite;
}

@
keyframes btn-anim1 { 0% {
	left: -100%;
}

50




%
,
100




%
{
left




:




100


%;
}
}
.login-box a span:nth-child(2) {
	top: -100%;
	right: 0;
	width: 2px;
	height: 100%;
	background: linear-gradient(180deg, transparent, #03e9f4);
	animation: btn-anim2 1s linear infinite;
	animation-delay: .25s
}

@
keyframes btn-anim2 { 0% {
	top: -100%;
}

50




%
,
100




%
{
top




:




100


%;
}
}
.login-box a span:nth-child(3) {
	bottom: 0;
	right: -100%;
	width: 100%;
	height: 2px;
	background: linear-gradient(270deg, transparent, #03e9f4);
	animation: btn-anim3 1s linear infinite;
	animation-delay: .5s
}

@
keyframes btn-anim3 { 0% {
	right: -100%;
}

50




%
,
100




%
{
right




:




100


%;
}
}
.login-box a span:nth-child(4) {
	bottom: -100%;
	left: 0;
	width: 2px;
	height: 100%;
	background: linear-gradient(360deg, transparent, #03e9f4);
	animation: btn-anim4 1s linear infinite;
	animation-delay: .75s
}

@
keyframes btn-anim4 { 0% {
	bottom: -100%;
}
50




%
,
100




%
{
bottom




:




100


%;
}
}
</style>



<meta charset="ISO-8859-1">
<title>Login Here</title>

<%-- <script src="${context}/resources/js/jquery-1-11-3.min.js"
	type="text/javascript"></script>
<script src="${context}/resources/js/bootstrap.js"
	type="text/javascript"></script>
<script type="text/javascript"
	src='<c:url value="/resources/js/jquery.validate.min.js"/>'></script>
<script src="${context}/resources/js/jquery.sticky.min.js"
	type="text/javascript"></script> --%>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-form-validator/2.3.79/jquery.form-validator.min.js"
	integrity="sha512-7+hQkXGIswtBWoGbyajZqqrC8sa3OYW+gJw5FzW/XzU/lq6kScphPSlj4AyJb91MjPkQc+mPQ3bZ90c/dcUO5w=="
	crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/jquery-form-validator/2.3.79/theme-default.min.css"
	integrity="sha512-8wU/gsExpTv8PS32juUjuZx10OBHgxj5ZWoVDoJKvBrFy524wEKAUgS/64da3Qg4zD5kVwQh3+xFmzzOzFDAtg=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
	<div class="login-box">
		<h2>Login</h2>
		<form action="loginValidate" modelAttribute="login"
			id="loginValidateForm">
			<div class="user-box">
				<input type="text" name="userName"> <label>Username:<span
					style="color: red;">*</span></label>
			</div>
			<div class="user-box">
				<input type="password" name="password"> <label>Password</label>
			</div>
			<a href="loginValidate" id="loginValidate"> <span></span> <span></span>
				<span></span> <span></span> <input type="submit" value="Submit"
				onclock="loginsubmitForm()" />
			</a>
		</form>
		<input type="button" class="btn btn-danger" id="CallId" align="center"
			vaign="middle" value="registerNewBook" onclick="registerNewBook()">
	</div>




	<div></div>
	
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

	 <script type="text/javascript"	src="${context}/resources/js/bootstrap.min.js"></script>
<script type="text/javascript"	src="${context}/resources/js/jquery-ui.js"></script>
<script src="${context}/resources/js/jquery.sticky.min.js" type="text/javascript"></script>
<script type="text/javascript" src="${context}/resources/js/download.js"></script>
<script type="text/javascript" src="${context}/resources/js/jquery.mmenu.min.all.js"></script>
<script type="text/javascript" src='<c:url value="/resources/js/jquery.validate.min.js"/>'></script>

	<script type="text/javascript">
		// for click on submit Jquery
		/* $('#saveBtn').click(function() {
			alert("11111111");
			var validator = $("#loginValidateForm").valid();
			alert("2222222222222" + validator);

			if (validator == true) {
				$('#loginValidateForm').submit();
			}
		}); */

		
		function loginsubmitForm(){
			alert("1111");
		}
		
		
		
		/* 
		$("#loginValidateForm").validate({
			rules : {
				userName : {
					required : true,
					letterswithspace : true,
				},
				password : {
					required : true,
					letterswithspace : true,
				},
			},
			messages : {
				firstName : {
					required : "Please Enter userName",
					letterswithspace : "Alphabets only  Allowed"
				},
				lastName : {
					required : "Please Enter password",
					letterswithspace : "Alphabets only  Allowed"
				},
				submitHandler : function(form) {
					form.submit();
				}
			}

		}); */
	</script>


</body>
</html>
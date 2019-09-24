<%-- 
    Document   : mainlogin
    Created on : Apr 22, 2019, 8:21:15 PM
    Author     : RAJAT MATHUR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>login</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width,intial-scale=1">
	<link rel="stylesheet" type="text/css" href="main.css">
	<link rel="stylesheet" type="text/css" href="util.css">
	<script type="text/javascript">

</script>
</head>
<body>
	<div class="login">
		 <div class="r-login p-l-55 p-r-55 p-t-65 p-b-54">
	    <h2>LOGIN</h2>

	    <form action="http://localhost:8084/FoodFun/Loginservlet" method="post">

	    	<div class="input1">
	    		<input type="text" name="username" required>
	    		<label>Username</label>
	    	</div>

	    	<div class="input1">
	    		<input id="psw" type="password" name="pass"  required>
	    		<label>Password</label>
	    	</div>

			<button type="Submit" class="btn">Submit</button>
			
		    <div >

		    		<a class="signin" href="signup.html" style="">Or Sign Up As
						</a>
					</div>
	    	

	    </form>
	</div>
        </div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
<<<<<<< HEAD
<<<<<<< HEAD
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Login</title>

<!-- Main css -->
<link rel="stylesheet" href="css/style.css">

</head>
<body>
	<div class="main">
		<!-- Sing in  Form -->
		<section class="sign-in">
			<div class="container">
				<div class="signin-content">
					<div class="signin-image">
						<figure>
							<img src="https://colorlib.com/etc/lf/Login_v1/images/img-01.png" alt="sing up image">
						</figure>
						<a href="registration.jsp" class="signup-image-link">Create an	account</a>
					</div>

					<div class="signin-form">
						<h2 class="form-title">Sign in</h2>
						<form class="register-form" id="login-form">
							<div class="form-group">
								<label for="eMail"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="email" name="eMail" id="your_email"
									placeholder="Your Email" />
							</div>
							<div class="form-group">
								<label for="your_pass"><i class="zmdi zmdi-lock"></i></label> <input
									type="password" name="password" id="your_pass"
									placeholder="Password" />
							</div>

							<div class="form-group form-button">
								<input type="submit" name="signin" id="signin"
									class="form-submit" value="Log in" />
							</div>
							<div class="form-group">
								<p style="display: none; color: red">Please fill all fields!</p>
							</div>
						</form>
						<!-- <div class="social-login">
							<span class="social-label">Or login with</span>
							<ul class="socials">
								<li><a href="#"><i
										class="display-flex-center zmdi zmdi-facebook"></i></a></li>
								<li><a href="#"><i
										class="display-flex-center zmdi zmdi-twitter"></i></a></li>
								<li><a href="#"><i
										class="display-flex-center zmdi zmdi-google"></i></a></li>
							</ul>
						</div> -->
					</div>
				</div>
			</div>
		</section>
	</div>

	<jsp:include page="footer.jsp"></jsp:include>

	<!-- JS -->
	<script src="js/login.js"></script>

=======
=======
>>>>>>> e708fbc78046e666d9fca27a5ab4199925875ce8
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<style>
	form {
		width: 250px;
		margin: 10px 0 0 150px;
	}
	
	label {
		display: flex;
		justify-content: space-between;
	}
</style>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	
	<h3>Log in to your personal account.</h3>
	
	<form action="login" method="post">
        <label>eMail: <input type="email" name="eMail"></label><br>
        <label>Password: <input type="password" name="password"></label><br>
        <input type=submit value="Sign in">   
    </form>
    <p>Not registered yet? <a href="registration.jsp">Register.</a></p>
	<jsp:include page="footer.jsp"></jsp:include>
<<<<<<< HEAD
>>>>>>> branch 'project-1-jsp-servlets-jdbc' of https://github.com/KVova/Java_Advanced_11-new.git
=======
>>>>>>> e708fbc78046e666d9fca27a5ab4199925875ce8
</body>
</html>
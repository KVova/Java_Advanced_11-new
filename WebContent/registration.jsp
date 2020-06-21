<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<<<<<<< HEAD
<<<<<<< HEAD
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Registration</title>

    <!-- Main css -->
  <link rel="stylesheet" href="css/style.css"> 
</head>
<body>
	
	 <div class="main">

        <!-- Sign up form -->
        <section class="signup">
            <div class="container">
                <div class="signup-content">
                    <div class="signup-form">
                        <h2 class="form-title">Sign up</h2>
                        <form method="POST" action="registration" class="register-form" id="register-form">
                            <div class="form-group">
                                <label for="name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                <input type="text" name="name" id="name" placeholder="First Name"/>
                            </div>
                            <div class="form-group">
                                <label for="surname"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                <input type="text" name="surname" id="surname" placeholder="Last Name"/>
                            </div>
                            <div class="form-group">
                                <label for="name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                <input type="number" name="age" id="age" placeholder="Age"/>
                            </div>
                            <div class="form-group">
                                <label for="address"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                <input type="text" name="address" id="address" placeholder="Address"/>
                            </div>
                            <div class="form-group">
                                <label for="email"><i class="zmdi zmdi-email"></i></label>
                                <input type="email" name="email" id="email" placeholder="Your Email"/>
                            </div>
                            <div class="form-group">
                                <label for="pass"><i class="zmdi zmdi-lock"></i></label>
                                <input type="password" name="pass" id="pass" placeholder="Password"/>
                            </div>
                            <div class="form-group">
                                <label for="re-pass"><i class="zmdi zmdi-lock-outline"></i></label>
                                <input type="password" name="re_pass" id="re_pass" placeholder="Repeat your password"/>
                            </div>
                            <div class="form-group">
								<p style="display: none; color: red">Please fill all fields!</p>
							</div>
                            <div class="form-group form-button">
                                <input type="submit" name="signup" id="signup" class="form-submit" value="Register"/>
                            </div>
                        </form>
                    </div>
                    <div class="signup-image">
                        <figure><img src="https://colorlib.com/etc/cf/ContactFrom_v1/images/img-01.png" alt="sing up image"></figure>
                        <a href="index.jsp" class="signup-image-link">I am already member</a>
                    </div>
                </div>
            </div>
        </section>
        </div>
    
    <jsp:include page="footer.jsp"></jsp:include>
    
    <!-- JS -->
    <script src="js/login.js"></script>
    
</body>
</html>
=======
=======
>>>>>>> e708fbc78046e666d9fca27a5ab4199925875ce8
<meta charset="ISO-8859-1">
<title>Registration</title>
<style>
	form {
		width: 250px;
		margin: 50px;
	}
	label {
		display: flex;
		justify-content: space-between
	}
</style>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<h3>Enter your data</h3>
	
	<form action="registration" method="post">
        <label>Name: <input type="text" name="firstName"></label><br>
        <label>Surname: <input type="text" name="lastName"></label><br>
        <label>Age: <input type="number" name="age"></label><br>
        <label>Address: <input type="text" name="address"></label><br>
        <label>eMail: <input type="email" name="eMail"></label><br>
        <label>Password: <input type="password" name="password"></label><br>
        <label>Role: <input type="text" name="role"></label><br>
        <input type=submit value="Register">   
    </form>
    
    <jsp:include page="footer.jsp"></jsp:include>
    </body>
<<<<<<< HEAD
    </html>
>>>>>>> branch 'project-1-jsp-servlets-jdbc' of https://github.com/KVova/Java_Advanced_11-new.git
=======
    </html>
>>>>>>> e708fbc78046e666d9fca27a5ab4199925875ce8

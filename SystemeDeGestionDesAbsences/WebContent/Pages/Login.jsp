<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@ taglib prefix="sw" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="fr">
 <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="./CSS/img/ensim-logo.png"> 

    <title>Login</title>

    <!-- Bootstrap core CSS -->
    <link href="./CSS/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="./CSS/signin.css" rel="stylesheet">
    
    <script src="./js/ie-emulation-modes-warning.js"></script>

   
  </head>

<body>


	<header>
	<h1>
		<span><font color="#5F84BC" size="100px">A</font><font
			color="#000" size="36px">bstix</font> <font color="#5F84BC"
			size="90px">E</font><font color="#000" size="36px">nsim</font> </span>
		<p class="sous-titre">
			<strong><font size="4.8px">Ensim 5A-info 2015/2016</font></strong>
			<!-- Sous titre -->
		</p>
	</header>


  <body>


      <form class="form-signin" action="abs.aspx"
			method="post">
        <h2 class="form-signin-heading">Identification </h2>
        <label for="inputEmail" class="sr-only">Identifiant</label>
        <input type="email" name="inputEmail" id="inputEmail" class="form-control" placeholder="Identifiant" required autofocus>
        <label for="inputPassword" class="sr-only">Mot de passe</label>
        <input type="password" name="inputPassword" id="inputPassword" class="form-control" placeholder="Mot de passe" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Garder ma session active
          </label>
        </div>
        <input class="btn btn-lg btn-primary btn-block" type="submit" value="Connexion" />
      </form>

    </div> <!-- /container -->

    <script src="./js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
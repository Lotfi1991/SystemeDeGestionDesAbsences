<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="sw" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="./CSS/Style.css" rel="stylesheet">
<title>Etu</title>
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


	<div id=contenu>

		<article>
		<form id="formID" class="formular">
			<sw:forEach items="${listep}" var="o">
				<fieldset>
					<legend>${o.prenom } ${o.nom } </legend>
					<img alt="" src="./${o.photo }"> <input id=green
						type="submit" value="Present" /> <input id=red type="submit"
						value="Absent" /> <input id=orange type="submit" value="Retard" />

				</fieldset>

			</sw:forEach>


		</form>
	</div>

	</article>
	<footer> vdks,vsd svs dkvsdkvksd </footer>
</body>
</html>
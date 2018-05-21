<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function validate() {
    if (document.f.username.value == "" && document.f.password.value == "") {
        alert("Username and password are required");
        document.f.username.focus();
        return false;
    }
    if (document.f.username.value == "") {
        alert("Username is required");
        document.f.username.focus();
        return false;
    }
    if (document.f.password.value == "") {
    alert("Password is required");
    document.f.password.focus();
        return false;
    }
}
</script>
<body>
<div class="container-fluid">
<nav class="navbar navbar-dark fixed-top " id="navar" style="background-color: #000A1C">
  <a class="navbar-brand" href="index.html" id="index" >
    <img src="imagenes/alexa1.gif" width="60" height="60" class="d-inline-block align-top" alt="" >
    ALEXA
  </a>
</nav>
<div class="form">
<br>
<br>
	<br>
	<h1>Sesión</h1>
	<br>
	<form:form method="POST" action="login" name='f' >
		<div class="form-group">
			<form:input path="usuario" type="text" value='' class="form-control"/>
			
			<br>
		</div>
		<div class="form-group">
		
			<form:input path="password" name='password' class="form-control"/>
		</div>
		
			<input type="submit" value="submit" class="btn-login" >
		
		
			
	</form:form>
	</div>
</div>

</body>
</html>
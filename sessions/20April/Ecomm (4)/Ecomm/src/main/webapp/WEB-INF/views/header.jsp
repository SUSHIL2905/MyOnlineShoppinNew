<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js">
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<nav id ="navbar-red" class="navbar navbar-inverse navbar-static-top" 
role="navigation">
    <div class="container">
        <ul class="nav navbar-nav">
            <button type="button" class="navbar-toggle collapsed" 
            data-toggle="collapse" 
            data-target="#nav-collapse"/>
               
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
       </ul>
       </div>

      
        <div class="collapse navbar-collapse" id="nav-collapse">
                   
           <ul class="nav navbar-nav">
                <li><a href="index">Home</a></li>
         <li><a href="#">Contact us</a></li>
         <li><a href="${pageContext.request.contextPath }/login">Sign in</a></li>
         <li><a href="${pageContext.request.contextPath }/register">Register</a></li>
          <li><a href="${pageContext.request.contextPath }/admin/adding">Admin</a></li>
        <li class="dropdown">
         <a class="dropdown-toggle" data-toggle="dropdown" href="#">Category
         <span class="caret"></span></a>
            <ul class="dropdown-menu">
              <li><a href="${pageContext.request.contextPath }/js">Jumpstart</a>
              <li><a href="#">Skill Based</a></li>
              <li><a href="#">Others</a></li>
            </ul>
          
          
          </li>
                
        </div>
    
</nav>


</body>
</html>






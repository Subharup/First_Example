<!DOCTYPE html>
<html lang="en">
<head>
  <title>Registration Form</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    

<%@ include  file="header.jsp" %>


  
<div class="container">
        <div class="row centered-form">
        <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
        	<div class="panel panel-default">
        		<div class="panel-heading">
			    		<h3 class="panel-title">Please sign up to continue <small>It's free!</small></h3>
			 			</div>
			 			<div class="panel-body">
			 			
			 			<form:form method="post" action="saveUser" > 
			 			
			    		<form role="form">
			    			
			    			<div class="form-group">
			    				<form:input path="id" class="form-control input-sm" placeholder="Enter Your User Name"/>
			    			</div>
			    			
			    			<div class="form-group">
			    				<form:input path="name" class="form-control input-sm" placeholder="Enter Your Full Name"/>
			    			</div>
			    			

			    			<div class="row">
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			    						<form:input path="password" id="password" class="form-control input-sm" placeholder="Password must contain 5 charecters"/>
			    					</div>
			    				</div>
			    				
			    			</div>
			    			
			    			<input type="submit" value="Register" class="btn btn-info btn-block">
			    		
			    		</form>
			    		</form>
			    	</form:form>
			    	
			    	</div>
	    		</div>
    		</div>
    	</div>
    </div>
</body>
</html>

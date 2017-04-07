<!DOCTYPE html>
<html lang="en">
<head>
  <title>Add Product</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include  file="header.jsp" %>

  
<div class="container">
  <form:form method="post" action="AdminAddProductController" enctype="multipart/form-data"> 

<table border="1">
<tr>


<td>Product Name <form:input path="productName"  /></td>
<td>Product Price <form:input path="productPrice"  /></td>
<td><form:hidden path="productImage"/></td>  

	<td>Choose Image</td>
	<td><input type="file" name="file"/></td>
	
	<td><input type="submit" value="save"></td></tr>
	</table>
</form:form>
</div>

</body>
</html>

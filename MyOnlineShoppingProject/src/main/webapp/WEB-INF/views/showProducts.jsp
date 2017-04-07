<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>

  <title>Home Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet" integrity="sha256-MfvZlkHCEqatNoGiOXveE8FIwMzZg4W85qfrfIFBfYc= sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include  file="header.jsp" %>
<body>
<div class="container">
<h1>Product List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Product ID</th><th>Product Name</th><th>Product Price</th><th>View Product</th></tr>  
   <c:forEach var="product" items="${productList}">   
   <tr>
   <td>${product.productId}</td>  
   <td>${product.productName}</td>  
   <td>${product.productPrice}</td>
 <td><a href="${pageContext.request.contextPath}/viewProduct/${product.productId}">View Product</a></td>    
 </tr>  
   </c:forEach>  
   </table> 
   </div> 
    </body>
    </html>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Case</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include  file="header.jsp" %>

  
<div class="container">
  <h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Price</th><th>Image</th><th>Edit Product</th><th>Delete Product</th></tr>  
   <c:forEach var="product" items="${list1}">   
   <tr>  
   <td>${product.productId}</td>  
   <td>${product.productName}</td>  
   <td>${product.productPrice}</td>  
  <td>${product.productImage}</td>
    <td><a href="editProduct/${user.userid}">Edit</a></td>  
   <td><a href="deleteProduct/${user.userid}">Delete</a></td>
   </tr>  
   </c:forEach>  
   </table>
   
   </table>  
   <br/>
    <a href="AdminAddProduct">Add New Product</a>
</div>

</body>
</html>

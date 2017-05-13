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
<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include  file="header.jsp" %>
<div class="container">
<c:forEach items="${list}" var="cart">
<table border="2">
<tr><th>Product Name</th><th>Product Price</th><th>Quantity</th><th>Sub Total</th><th>Product Image</th><th>Delete Product</th></tr>
<tr><td>${cart.product.productName}</td>
<td>${cart.product.productPrice}</td>
<td>${cart.quantity}</td>
<td>${cart.subTotal}</td>
<td><img src="${pageContext.request.contextPath}/${cart.product.productImage}"></td>
<td><a href="${pageContext.request.contextPath}/deleteItems/${cart.cartItemId}">Delete</a></td>
</tr>
</table>

</c:forEach>
<a href="${pageContext.request.contextPath}/billing"><input type="submit" value="Proceed to Check Out"/></a>
</div>
</body>
</html>
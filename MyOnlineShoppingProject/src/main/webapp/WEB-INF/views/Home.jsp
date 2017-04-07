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
<link rel="stylesheet" href="<c:url value="/resources/css/footer.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/buttoncolor.css"/>">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include  file="header.jsp" %>

  
<div class="container">

  
  
  
  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
  
  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
    <div class="item active">
      <img src="<c:url value="/resources/Img/Fullscreen capture 31-03-2017 113054.jpg "/>"> 
    </div>

    <div class="item">
      <img src="<c:url value="/resources/Img/Fullscreen capture 31-03-2017 112028.jpg "/>"> 
    </div>

    <div class="item">
      <img src="<c:url value="/resources/Img/Fullscreen capture 31-03-2017 112237.jpg"/>">
    </div>

    <div class="item">
      <img src="<c:url value="/resources/Img/Fullscreen capture 31-03-2017 112911.jpg"/>">
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
<footer>
    <div class="footer" id="footer">
        <div class="container">
            <div class="row">
                <div class="col-lg-2  col-md-2 col-sm-4 col-xs-6">
                    <h3> Let Us Help You </h3>
                    <ul>
                        <li> <a href="#"> FAQ </a> </li>
                        <li> <a href="#"> Cancellation & Return </a> </li>
                        <li> <a href="#"> Report Infringement </a> </li>
                        <li> <a href="#"> Saved Cards </a> </li>
                    </ul>
                </div>
                <div class="col-lg-2  col-md-2 col-sm-4 col-xs-6">
                    <h3>--------------------> </h3>
                    <ul>
                        <li> <a href="#">  </a> </li>
                        <li> <a href="#">  </a> </li>
                        <li> <a href="#">  </a> </li>
                        <li> <a href="#">  </a> </li>
                    </ul>
                </div>
                <div class="col-lg-2  col-md-2 col-sm-4 col-xs-6">
                    <h3> Get To Know Us </h3>
                    <ul>
                        <li> <a href="#"> About Us </a> </li>
                        <li> <a href="#"> Contact Us </a> </li>
                        <li> <a href="#"> Careers </a> </li>
                        <li> <a href="#"> Sell on OnlineShopping.com</a> </li>
                    </ul>
                </div>
                <div class="col-lg-2  col-md-2 col-sm-4 col-xs-6">
                    <h3> --------------------></h3>
                    <ul>
                        <li> <a href="#">  </a> </li>
                        <li> <a href="#">  </a> </li>
                        <li> <a href="#">  </a> </li>
                        <li> <a href="#">  </a> </li>
                    </ul>
                </div>
                <div class="col-lg-3  col-md-3 col-sm-6 col-xs-12 ">
                    <h3> Ask me anything </h3>
                    <ul>
                        <li>
                            <div class="input-append newsletter-box text-center">
                                <input type="text" class="full text-center" placeholder="Email ">
                                <button class="btn" type="button"> Ask Now <i class="fa fa-long-arrow-right"> </i> </button>
                            </div>
                        </li>
                    </ul>
                    <ul class="social">
                        <li> <a href="#"> <i class=" fa fa-facebook">   </i> </a> </li>
                        <li> <a href="#"> <i class="fa fa-twitter">   </i> </a> </li>
                        <li> <a href="#"> <i class="fa fa-google-plus">   </i> </a> </li>
                        <li> <a href="#"> <i class="fa fa-pinterest">   </i> </a> </li>
                        <li> <a href="#"> <i class="fa fa-youtube">   </i> </a> </li>
                    </ul>
                </div>
            </div>
            <!--/.row--> 
        </div>
        <!--/.container--> 
    </div>
    <!--/.footer-->
    
    <div class="footer-bottom">
        <div class="container">
            <div class="pull-right">
                <ul class="nav nav-pills payments">
                	<li><i class="fa fa-cc-visa"></i></li>
                    <li><i class="fa fa-cc-mastercard"></i></li>
                    <li><i class="fa fa-cc-amex"></i></li>
                    <li><i class="fa fa-cc-paypal"></i></li>
                </ul> 
            </div>
        </div>
    </div>
    <!--/.footer-bottom--> 
</footer>
  
  

</div>
</body>
</html>

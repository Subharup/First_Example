<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
  <html>
  <body>
  <%@include file="header.jsp" %>
<div class="container">
    <h1 class="well">Registration Form</h1>
	
	<div class="row">  -->
				<form:form method="post" action="saveUser" >
				 <table >
        
          <tr> 
           <td>Name : </td>
           <td><form:input path="id"  /></td>
          </tr>
          <tr>    
          <td>UserId : </td>
           <td><form:input path="name"  /></td>
          </tr>
          <tr>    
          <td>Password : </td>
           <td><form:input path="password"  /></td>
          </tr>
          
         
				 <tr>    
          <td> </td>    
          <td><input type="submit"  value="Register"/></td>    
         </tr>  
          </table>
			</form:form>

</div>

</body>
</html>
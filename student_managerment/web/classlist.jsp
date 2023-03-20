<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : classlist
    Created on : Feb 13, 2023, 1:10:52 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>class list!</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Room</th>
                </tr>
            </thead>
            <tbody>
              
                
                
                <c:forEach var="c" items="${list}">
                    <tr>
                        <td>${c.id}</td>
                        <td><a href="Studentlist?cid=${c.id}">${c.name}</a>
                        
                        </td>
                          
                          <td>${c.code}</td>
                        
                    </tr>
              
                </c:forEach>
            
 
             
            </tbody>
        </table>

   
        
        
    </body>
</html>

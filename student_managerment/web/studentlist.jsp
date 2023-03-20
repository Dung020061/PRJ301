<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : studentlist
    Created on : Feb 13, 2023, 9:44:02 AM
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
        <h1>student list!</h1>
        
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>gender</th>
                    <th>dob</th>
                    <th>classID</th>
                </tr>
            </thead>
            <tbody>
                   <c:forEach var="s" items="${list}">
                           <tr>
                    <td>${s.id}</td>
                    <td>${s.name}</td>
         
                    <td>
                        <c:if test="${s.gender}">
                            <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/Mars_symbol.svg/800px-Mars_symbol.svg.png" width="30px"><!-- comment -->
                        </c:if>
                      <c:if test="${!s.gender}">
                            <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Venus_symbol.svg/1200px-Venus_symbol.svg.png" width="30px"><!-- comment -->
                        </c:if>
                            <input type="checkbox"${s.gender==true?"checked":""}>
                    </td>
                          <td>${s.dob}</td>
                    <td>${s.classID}</td>
                </tr>  
                       
                       
                       
                       
                       
                       
        </c:forEach>
        
               
            </tbody>
        </table>

        
        
    
    </body>
</html>

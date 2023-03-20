<%-- 
    Document   : filter
    Created on : Feb 13, 2023, 10:55:20 AM
    Author     : ADMIN
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form method="get" action="FilterStudent">
            Search by name :<input type="text" name="name" value="${param["name"]}"><!-- comment --><br><!-- comment -->
            Gender :<input type="radio" value="" name="gender"${param["gender"]==""?"checked":""} >All<input type="radio" value="1" name="gender" ${param["gender"]=="1"?"checked":""}>Male<input type="radio" value="0" name="gender"${param["gender"]=="0"?"checked":""}>Female
            <br><!-- comment -->
            Class: 
            <select name="cid">
                <option value="">All</option> 
                <c:forEach var="c" items="${clist}">
                    
                    <option value="${c.id}">${c.name}</option>
         
                    
                </c:forEach>
                
                
                
               
            </select>
            
            
            <button type="submit">Search</button>
        </form>
        
        <h1>Hello World!</h1>
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
                    </td>
                          <td>${s.dob}</td>
                    <td>${s.classID}</td>
                </tr>  
                       
              
                       
                       
                       
                       
        </c:forEach>
        
               
            </tbody>
        </table>

    </body>
</html>

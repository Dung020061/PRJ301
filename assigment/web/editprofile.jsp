<%-- 
    Document   : editprofile
    Created on : Mar 22, 2023, 1:02:25 AM
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
        <h1>Edit profile!</h1>
        <form action="editprofile" method="post">
            <input type="hidden" name="id" value="${sessionScope.user.id}">
            UserName <input type="text" name="name" value="${profile}" ><br><!-- comment -->
            Password <input type="password" name="pass" value="${sessionScope.user.pasword}"> <br><!-- comment -->


            Address <input type="text" name="address"value="${sessionScope.user.addres}"><br><!-- comment -->
            Phone <input type="text" name="phone"value="${sessionScope.user.phone}"><br>
            <input type="submit" value="Submit">
            </body>
            </html>

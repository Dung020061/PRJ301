<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : menu
    Created on : Mar 9, 2023, 9:04:26 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>-->
   <nav class="navbar navbar-expand-md navbar-dark bg-dark">
            <div class="container">
                <a class="navbar-brand" href="Home">Tour</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault">
                    <ul class="navbar-nav m-auto">
                        
                        <c:if test="${sessionScope.acc.roleid==1}">
                             <li class="nav-item">
                            <a class="nav-link" href="ManagerAccont">Manager Account</a>
                        </li>
                            <li class="nav-item">
                            <a class="nav-link" href="Manager">Manager Tour</a>
                        </li>
                        
                            
                        </c:if>
                        
                        
                        <c:if test="${sessionScope.acc.roleid==0}">
                                                   <li class="nav-item">
                            <a class="nav-link" href="TourUser?id=${sessionScope.acc.id}">tour dang ky</a>
                        </li>
                        </c:if>
                    
                        
                        <c:if test="${sessionScope.acc!=null}">
                                    <li class="nav-item">
                            <a class="nav-link" href="#">Hello${sessionScope.acc.username}</a>
                        </li>
                               <li class="nav-item">
                            <a class="nav-link" href="logout">Logout</a>
                        </li>
                            
                        </c:if>
                        <c:if test="${sessionScope.acc==null}">
                             <li class="nav-item">
                            <a class="nav-link" href="login.jsp">Login</a>
                        </li>
                            
                        </c:if>
                       
                     
                    </ul>

              
                </div>
            </div>
        </nav>
        <section class="jumbotron text-center">
            <div class="container">
                <h1 class="jumbotron-heading">Trao giá trị,nhận niềm tin</h1>
                <p class="lead text-muted mb-0">Mang lại những cảm xúc không bao giờ quên</p>
            </div>
                   </section>
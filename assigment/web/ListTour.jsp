    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : ListTour
    Created on : Mar 11, 2023, 10:46:14 PM
    Author     : ADMIN
--%>

<%@page import="model.Tour"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
       
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css" integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==" crossorigin="anonymous" referrerpolicy="no-referrer" /><link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
                <jsp:include page="menu.jsp"></jsp:include>
        <h1>Tour List!</h1>
        
        <table class="table table-bordered table-hover">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Dob</th>
                    <th>Img</th>
                    <th>Price</th>
                    <th>Description</th>
                </tr>
            </thead>
            <tbody>
     
         <c:forEach items="${mlist}" var="c">
                
                 <tr>
                    <td>${c.getId()}</td>
                    <td>${c.getName()}</td>
                    <td>${c.getDob()}</td>
                    <td><img src="${c.getImg()}"width="100px"></td>
                    <td>${c. getPrice()}</td>
                    <td>${c.getDescription()}</td>
                    <td> <a href="UpdateTour?id=${c.getId()}"><i class="fa-solid fa-pen-to-square"></i></a> </td>
                        <td> <a href="delete?id=${c.getId()}"><i class="fa-solid fa-trash-can"></i></a><td>
                </tr>
                 
            </c:forEach>
              
                      <a href="Add.jsp" class="btn btn-success" >Create Tour</a>   
            </tbody>
            

    </body>
</html>

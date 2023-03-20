<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : Listusers
    Created on : Mar 13, 2023, 9:09:33 AM
    Author     : ADMIN
--%>

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
        <h1>User List!</h1>
        
        <table class="table table-bordered table-hover">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>username</th>
                    <th>password</th>
                    <th>address</th>
                    <th>phone</th>
                    <th>role</th>
                </tr>
            </thead>
            
            
            <tbody>
              <c:forEach items="${alist}" var="c">
                
                 <tr>
                    <td>${c.id}</td>
                    <td>${c.username}</td>
                    <td>${c.pasword}</td>
                 
                    <td>${c.addres}</td>
                    <td>${c.phone}</td>
                    <td>
                        <c:if test="${c.roleid==1}">
                        Admin
                    </c:if> 
                         <c:if test="${c.roleid==0}">
                        Customer
                    </c:if>
                        
                    </td>
                             <td> <a href="Blockuser?id=${c.id}" class="btn btn-danger">block</a><td>
                                          <td> <a href="Unblockuser?id=${c.id}" class="btn btn-warning">unblock</a><td>
                                <td> <a href="DeleteUser?pid=${c.id}"  class="btn btn-success">Delete</a><td>
                                          <td> <a href="DetailTour?id=${c.id}"  class="btn btn-primary">detailtour</a><td>
                        
                </tr>
                </tr>
                 
            </c:forEach>
               
            </tbody>
        </table>

    </body>
</html>

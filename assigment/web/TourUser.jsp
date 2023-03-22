<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : TourUser
    Created on : Mar 20, 2023, 10:28:13 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css" integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==" crossorigin="anonymous" referrerpolicy="no-referrer" /><link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
            <h1>abc!</h1><!-- comment -->
            <form action="TourUser" method="get">

                <table class="table table-success table-striped">
                    <thead>
                        <tr>
                            <th>UserId</th>
                            <th>Username</th>
                            <th>address</th>
                            <th>phone</th>
                            <th>TourId</th>
                            <th>name</th>
                            <th>dob</th>
                            <th>price</th>
                        </tr>
                    </thead>

                    <tbody>
                    <c:forEach var="c" items="${list}">

                        <tr>
                            <td>${c.id}</td>
                            <td>${c.username}</td>
                            <td>${c.addres}</td>
                            <td>${c.phone}</td>
                            <td>${c.getTour().getId()}</td>
                            <td> ${c.getTour().getName()} </td>
                            <td> ${c.getTour().getDob()} </td>
                            <td> ${c.getTour().getPrice()} </td>

                        </tr>


                    </c:forEach>


                </tbody>
            </table>


        </form>






    </body>
</html>

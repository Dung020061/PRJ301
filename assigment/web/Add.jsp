<%-- 
    Document   : Add
    Created on : Oct 12, 2020, 9:17:52 PM
    Author     : trinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
       
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css" integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==" crossorigin="anonymous" referrerpolicy="no-referrer" /><link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>JSP Page</title>
                  <jsp:include page="menu.jsp"></jsp:include>
    </head>
    <body>
        <form action="AddTour"method="post">
            <table class="table table-bordered table-hover">
                     <tr>
                    <td>ID</td>
                    <td>
                        <input type="text" name="id">
                    </td>
                </tr>
                
                <tr>
                    <td>Name</td>
                    <td>
                        <input type="text" name="name">
                    </td>
                </tr>
                <tr>
                    
                    <td>Dob</td>
                    <td>
                        <input type="text" name="dob">
                    </td>
                </tr>
                <tr>
                    <td>img</td>
                    <td><input type="text" name="img"></td>
                </tr>
                 <tr>
                    <td>Price</td>
                    <td>
                        <input type="text" name="price">
                    </td>
                </tr>
                    <tr>
                    <td>Description</td>
                    <td>
                        <input type="text" name="description">
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" value="add" name="add">
                    
                    
                    </td>
<!--                    <td><button type="submit" value="add" >Add Tour</button></td>-->
                </tr>
     
            </table>
        </form>
    </body>
</html>

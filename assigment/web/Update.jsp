<%-- 
    Document   : Update
    Created on : Oct 12, 2020, 8:29:35 PM
    Author     : trinh
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
        <form action="UpdateTour" method="post">
            <table class="table table-bordered table-hover">
                <tr>
                    <td>ID</td>
                    <td>
                        <input value="${st.id}" type="text" name="id" readonly>
                    </td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td>
                        <input value="${st.name}" type="text" name="name">
                    </td>
                </tr>
                <tr>
                    <td>Dob</td>
                    <td><input value="${st.dob}"type="text" name="dob"></td>
                </tr>
                <tr>
                    <td>Img</td>
                    <td><input value="${st.img}"type="text" name="img"></td>
                </tr>
                  <tr>
                    <td>price</td>
                    <td><input value="${st.price}"type="text" name="price"></td>
                </tr>
                  <tr>
                    <td>description</td>
                    <td><input value="${st.description}"type="text" name="description"></td>
                </tr>
                <tr>
             
                    <td><button type="submit">Update</button></td>
                </tr>
            </table>
        </form>
    </body>
</html>

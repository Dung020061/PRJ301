<%-- 
    Document   : login
    Created on : Mar 8, 2023, 2:08:20 PM
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
    <body style="display: flex;flex-direction: column;justify-content: center;align-items:center">
        <form action="Login" method="post">
            <p>UserName: <input type="text" name="name" class="form-control" value="${userName}"></p>
            <p>Password: <input type="password" name="pass"class="form-control"  value="${passWord}"></p>
            <p><input type="checkbox" name="checkbox"  class="btn btn-success" value="true"> Remember me</p>
            <p><input id="Login" type="submit" class="btn btn-success" value="Login"></p>

        </form>
    </body>
    <a href="Register" class="btn-btn-primary"><i class="fa-solid fa-registered"></i>Register</a>
    ${mess}





</html>

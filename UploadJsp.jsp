<%-- 
    Document   : UploadJsp
    Created on : 6 Jan, 2017, 10:06:43 AM
    Author     : mtech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <script src="https://code.jquery.com/jquery-1.10.2.js"></script>
        
    </head>
    <body>
        <form action="http://localhost:8080/Logical/UploadServlet" method="post" enctype="multipart/form-data" >
            <input type="file" name="file" id="f" multiple><br>
            <input type="submit" value="Upload File">
                   
        </form>
        
      
    
    </body>
</html>

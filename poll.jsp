<%-- 
    Document   : poll
    Created on : 5 Jan, 2017, 3:08:12 PM
    Author     : mtech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://code.jquery.com/jquery-1.10.2.js"></script>
        <script>
            $(document).ready(function () {

                setInterval(function () {


                    var value = document.getElementById("u").value;
                    // alert(value);
                    $.get("http://localhost:8080/Logical/res", {q: value}, function (data) {
                        $("#temp").html(data);
                    });


                }, 4000);

            });


        </script>
    </head>
    <body>
        <select id="u">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
        </select><br><br>
        
        
        <div id="temp" ></div>
    
    </body>
</html>

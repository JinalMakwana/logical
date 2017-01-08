<%-- 
    Document   : jq
    Created on : Jan 8, 2017, 4:05:13 PM
    Author     : admin
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
                $("#u").click(function () {
                  
                    var value = "";
                    //alert(value);
                    $.get("result.jsp", {q: value}, function (data) {
                        $("#javaquery").html(data);
                    });
                });
            });

        </script>
    </head>
    <body>
        <input type="button"  id="u" value="Click Here" >
        <div id="javaquery">
            Result will be Printed Here.
        </div>
    </body>
</html>

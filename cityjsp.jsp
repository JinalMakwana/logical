<%-- 
    Document   : GETjsp
    Created on : Dec 17, 2016, 6:05:17 PM
    Author     : admin
--%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://code.jquery.com/jquery-1.10.2.js"></script>

        <script>
            
            $(document).ready(function () {
                $("#u").click(function () {
                    var from = document.getElementById("f").value;
                    var to = document.getElementById("t").value;
                    var value = from + " " + to;
                    //alert(value);
                    $.get("getjsp.jsp", {q: value}, function (data) {
                        $("#javaquery").html(data);
                    });
                });
            });

        </script>
    </head>
    <body>


        <form  method="post">

         Enter Your Cityname<input type="text"  name="from" value="" id="f"><br><br>
          Enter City You Want  To Go<input type="text"  name="from" value="" id="t"><br><br>
            <input type="button"  name="btn" value="Check Roots" id="u"><br><br>
            <div id="javaquery"> 
            </div> 


        </form>

    </body>
</html>
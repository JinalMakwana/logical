<%-- 
    Document   : Getjsp
    Created on : Jan 8, 2017, 9:25:40 AM
    Author     : admin
--%>

<%@page import="java.util.StringTokenizer"%>
<%@page import="util.Search" %>
<%@page import="util.GetResult" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String s = request.getParameter("q");
            StringTokenizer stk = new StringTokenizer(s);
            String from = stk.nextToken();
            String to = stk.nextToken();
            Search sh = new Search(from, to);
            GetResult g = new GetResult();
if(from.equals(to))
{%>
    <p>Please Enter Different City Name</p>
<%}
else{
        %>
        
        <table border=1>
            <tr><th>Root</th>
                <th>Cost</th>
                <th>Time</th></tr>
                    <%
                        StringTokenizer st = new StringTokenizer(sh.test(), "@");
                        while (st.hasMoreTokens()) {
                            String singlepath = st.nextToken();

                            String finalpath = g.finalpath(singlepath);
                            int finalcost = g.finalcost(singlepath);
                            int finaltime = g.finaltime(singlepath);
                    %>

            <tr><td><%=finalpath%></td>

                <td><%=finalcost%> </td>

                <td><%=finaltime%></td></tr>


            <%}%> </table>  <%}%>

    </body>
</html>

<%-- 
    Document   : tablepage
    Created on : 26-03-2018, 20:22:34
    Author     : Juste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Table for order <%=request.getParameter("orderID")%></h1>
        <table border = "1">
            <thead>
                <tr>
                    <th> type </th>
                    <th> antal</th>   
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th>4x2</th>
                    <th><%=session.getAttribute("four")%></th>
                </tr>
                <tr>
                    <th>2x2</th>
                    <th><%=session.getAttribute("two")%></th>
                </tr>    
                <tr>               
                    <th>1x2</th>
                    <th><%=session.getAttribute("one")%></th>
                </tr>
                <tr>               
                    <th>status</th>
                    <th><%=session.getAttribute("status")%></th>
                </tr>
            </tbody>
        </table>    
    </body>
</html>

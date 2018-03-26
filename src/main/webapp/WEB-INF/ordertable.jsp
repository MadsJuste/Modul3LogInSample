<%-- 
    Document   : ordertable
    Created on : 26-03-2018, 15:04:49
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
                    <th> Højde </th>
                    <th> Bredde</th>  
                    <th> Længde</th> 
                    <th> status</th> 
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th><%=session.getAttribute("hight")%></th>
                    <th><%=session.getAttribute("width")%></th>
                    <th><%=session.getAttribute("length")%></th>
                    <th><%=session.getAttribute("status")%></th>
                </tr>              
            </tbody>
        </table>    
                
        <form name="Back" action="FrontController" method="post">        
            <input type="hidden" name="command" value="Back" />
            <input type="submit" value="Back" />
        </form>
     </body>
</html>

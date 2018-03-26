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
                    <th> side 1</th>  
                    <th> side 2</th> 
                    <th> side 3</th> 
                    <th> side 4</th> 
                    <th> totalt</th> 
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th>4x2</th>
                    <th><%=session.getAttribute("fourOne")%></th>
                    <th><%=session.getAttribute("fourTwo")%></th>
                    <th><%=session.getAttribute("fourThree")%></th>
                    <th><%=session.getAttribute("fourFour")%></th>
                    <th><%=session.getAttribute("fourTotal")%></th>
                </tr>
                <tr>
                    <th>2x2</th>
                    <th><%=session.getAttribute("twoOne")%></th>
                    <th><%=session.getAttribute("twoTwo")%></th>
                    <th><%=session.getAttribute("twoThree")%></th>
                    <th><%=session.getAttribute("twoFour")%></th>
                    <th><%=session.getAttribute("twoTotal")%></th>
                </tr>    
                <tr>               
                    <th>1x2</th>
                    <th><%=session.getAttribute("oneOne")%></th>
                    <th><%=session.getAttribute("oneTwo")%></th>
                    <th><%=session.getAttribute("oneThree")%></th>
                    <th><%=session.getAttribute("oneFour")%></th>
                    <th><%=session.getAttribute("oneTotal")%></th>
                </tr>
                <tr>               
                    <th>status</th>
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

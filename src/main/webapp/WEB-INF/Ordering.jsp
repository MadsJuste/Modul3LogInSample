<%-- 
    Document   : Ordering
    Created on : 25-03-2018, 22:48:02
    Author     : Juste
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="LegoStyle.css" rel="stylesheet" type="text/css"/>
        <title>Order Complete</title>
    </head>
    <body>
        <div>
        <h1>Order <%=session.getAttribute("order_id")%> Created</h1>
        
         <form name="Back" action="FrontController" method="post">        
            <input type="hidden" name="command" value="Back" />
            <input type="submit" value="Back" />
        </form>
        </div>
    </body>
</html>

<%-- 
    Document   : statuschanged
    Created on : 28-03-2018, 14:34:26
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
        <div>
        <h1>Order <%=session.getAttribute("order_id")%> Created</h1>
        
         <form name="Back" action="FrontController" method="post">        
            <input type="hidden" name="command" value="Back" />
            <input type="submit" value="Back" />
        </form>
        </div>
    </body>
</html>

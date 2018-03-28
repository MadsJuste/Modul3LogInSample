<%-- 
    Document   : employeepage.jsp
    Created on : Aug 24, 2017, 6:31:57 AM
    Author     : kasper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee home page</title>
    </head>
    <body>
        
        <h1>Hello <%=session.getAttribute( "email")%> </h1>
        You are now logged in as a EMPLOYEE of our wonderful site.
        
        
         <h2>Find Order</h2>
        <form name="Find" action="FrontController" method="post">        
            <input type="hidden" name="command" value="Find" />  
                Order ID:<br>
                    <input type="text" name="orderID" value="1">
                    <br>
            <input type="submit" value="Find" />
        </form>
         
         
         <h2>Set Order</h2>
         <form name="Set" action="FrontController" method="post">
             <input type="hidden" name="command" value="Set"/>
                insert Order ID:
                <input type="text" name="order_id" value="2">
                <br>
             <input type="submit" value="Set" />     
         </form>
    </body>
</html>

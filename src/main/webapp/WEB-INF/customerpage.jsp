<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
    </head>
    <body>
       <h1>Hello <%=session.getAttribute( "email" )%> </h1>
        You are now logged in as a customer of our wonderful site.
        
        <h2>Purchase legohouse</h2>
        
        <form name="purchase" action="FrontController" method="post">        
            <input type="hidden" name="command" value="purchase" />
                    Hight in blocks:<br>
                    <input type="text" name="hight" value="1">
                    <br>
                    width in dots:<br>
                    <input type="text" name="width" value="1">
                    <br>
                    length in dots:<br>
                    <input type="text" name="length" value="1">
                    <br>
            <input type="submit" value="purchase" />
        </form>
       
         
        <h2>Find Order</h2>
        <form name="Find" action="FrontController" method="post">        
            <input type="hidden" name="command" value="Find" />  
                length in dots:<br>
                    <input type="text" name="orderID" value="1">
                    <br>
            <input type="submit" value="Find" />
        </form>
        
        <h2>See privious purchases</h2>
        
        <form name="check" action="FrontController" method="post">
            <input type="hidden" name="command" value="check" />
            <input type="submit" value="check" />
        </form>
        
    </body>
</html>

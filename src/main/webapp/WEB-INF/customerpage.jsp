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
        <link href="LegoStyle.css" rel="stylesheet" type="text/css"/>
        <title>Customer home page</title>
    </head>
    <body>
        <div>
       <h1>Welcome to our site you may now order or check previous purcahse </h1>
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
       
         
        <h2>Get Order List</h2>
        <form name="getList" action="FrontController" method="post">        
            <input type="hidden" name="command" value="getList" />  
            <input type="submit" value="getList" />
        </form>
        
        <h2>See privious purchases</h2>
        
        <form name="check" action="FrontController" method="post">
            <input type="hidden" name="command" value="check" />
            Order ID:<br>
                    <input type="text" name="orderID" value="1">
                    <br>
            <input type="submit" value="check" />
        </form>
      </div>  
    </body>
</html>

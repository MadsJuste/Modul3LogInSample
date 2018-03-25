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
        <h1>Hello <%=request.getParameter( "email" )%> </h1>
        You are now logged in as a customer of our wonderful site.
        
        <h2>Purchase legohouse</h2>
        
        <form action="Control" method="post">        
            <input type="hidden" name="origin" value="update" />
            <input type="submit" value="Purchase" />
        </form>
        
        <h2>See privious purchases</h2>
        
        <form action="Control" method="post">
            <input type="hidden" name="origin" value="delete" />
            <input type="submit" value="seePre" />
        </form>
        
    </body>
</html>

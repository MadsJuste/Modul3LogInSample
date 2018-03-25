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
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Choose size of the house. Length and width in number of dots and hight in numbers of blocks </h2>
        <form action="Control" method="post">
            <input type="text" name="length" value="" placeholder="length" />
            <input type="text" name="width" value="" placeholder="width" />
            <input type="text" name="hight" value="" placeholder="hight" />
            <input type="hidden" name="origin" value="login" />
            <input type="submit" value="Build" />
        </form>
    </body>
</html>

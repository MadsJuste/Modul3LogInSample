<%-- 
    Document   : getOrderList
    Created on : 28-03-2018, 15:04:54
    Author     : Juste
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="LegoStyle.css" rel="stylesheet" type="text/css"/>
        <title>getOrderID</title>
    </head>
    <body>
        <div>
        <table id="table">
            <thead>
                <tr>
                    <td>Order ID</td>
                </tr>
            </thead>
            <tbody>
                 <% ArrayList order = (ArrayList)session.getAttribute("list");
                 for (int i = 0; i < order.size(); i++){ %>
                 <tr>
                    <td> <%=order.get(i)%> </td>
                    <br>
                 </tr>
                 <tr>
                     <td><%=order.get(++i)%></td>
                    <br>
                 </tr>
                 <%  } %>              
            </tbody>
        </table>
                 
        <h2>Find Order</h2>
        <form name="Find" action="FrontController" method="post">        
            <input type="hidden" name="command" value="Find" />  
                Order ID:<br>
                    <input type="text" name="orderID" value="1">
                    <br>
            <input type="submit" value="Find" />
        </form>
         <% if(session.getAttribute("okay").equals("notok")){ %>
        <h5>Please enter a valid ORDER ID</h5>
        <% } %>
        </div>
    </body>
</html>

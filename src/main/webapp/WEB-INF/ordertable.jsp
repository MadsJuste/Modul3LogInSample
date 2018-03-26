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
       <% 
           int r = (Integer) session.getAttribute("rows");
       %>
       
        <center>
            
            <label>Order</label>
                <select class="form-control" style="width: 250px;">
                    <option value="-1">Select order</option>
                    <% 
                    try{ 
                    for(int i=1;i <= r; i++){
                    %> 
                     <option value="<%=i%>" name="orderID"><%=i%></option>            
                    <%
                    }
                    }catch(Exception ex){
                        ex.printStackTrace();
                        out.println("Error " +ex.getMessage());
                    }
                    %>
                </select>       
        </center>
     </body>
</html>

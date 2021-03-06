/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;


import FunctionLayer.Build;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import FunctionLayer.WrongOrderException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Juste
 */
public class GetOrders extends Command{
    
    @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws WrongOrderException {
           int oid = Integer.parseInt(request.getParameter( "orderID" ));
                HttpSession session = request.getSession();
                User user = (User) session.getAttribute("user");
                int id = user.getId();
                Build build = LogicFacade.list(id,oid);
                session.setAttribute( "hight", build.getHight());
                session.setAttribute( "width", build.getWidth());
                session.setAttribute( "length", build.getLength());
                session.setAttribute( "status", build.getStatus());            
        return "ordertable";
    } 
}

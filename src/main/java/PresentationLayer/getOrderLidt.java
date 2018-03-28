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
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Juste
 */
public class getOrderLidt extends Command {
                
                 @Override
                String execute( HttpServletRequest request, HttpServletResponse response ) throws LoginSampleException { 
                HttpSession session = request.getSession();
                User user = (User) session.getAttribute("user");
                int id = user.getId();
                String role = user.getRole();
                ArrayList<Integer> finalArray = new ArrayList<Integer>(LogicFacade.orderList(id, role));
                session.setAttribute("list", finalArray);
                
                return "getOrderList";
                }
                
}

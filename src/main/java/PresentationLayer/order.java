/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;


import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import FunctionLayer.Build;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Juste
 */
public class order extends Command{
    
    @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws LoginSampleException {
                int hight = Integer.parseInt(request.getParameter( "hight" ));
                int width = Integer.parseInt(request.getParameter( "width" ));
                int length = Integer.parseInt(request.getParameter( "length" )); 
                HttpSession session = request.getSession();
                User user = (User) session.getAttribute("user");
                int id = user.getId();
                Build build = LogicFacade.build( hight, width, length, 1 );
        return "Ordering";
    }
    
}

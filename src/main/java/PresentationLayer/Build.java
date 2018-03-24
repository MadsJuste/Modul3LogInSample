/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;


import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Juste
 */
public class Build extends Command{
    
    @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws LoginSampleException {
                String hight = request.getParameter( "hight" );
                String width = request.getParameter( "width" );
                String depth = request.getParameter("depth");
                
        return "hej";
    }
    
}

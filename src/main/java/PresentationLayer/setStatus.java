/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

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
public class setStatus extends Command{
    @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws LoginSampleException, WrongOrderException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        int oid = Integer.parseInt(request.getParameter( "order_id" ));
        LogicFacade.setStatus(oid);
        return "statuschanged";
    }
}

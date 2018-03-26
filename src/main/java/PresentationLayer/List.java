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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Juste
 */
public class List extends Command{
    
     @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws LoginSampleException { 
                int oid = Integer.parseInt(request.getParameter( "orderID" ));
                HttpSession session = request.getSession();
                User user = (User) session.getAttribute("user");
                int id = user.getId();
                Build build = LogicFacade.list(id,oid);
                session.setAttribute( "fourOne", build.getFourOne());
                session.setAttribute( "fourTwo", build.getFourTwo());
                session.setAttribute( "fourThree", build.getFourThree());
                session.setAttribute( "fourFour", build.getFourFour());
                session.setAttribute( "twoOne", build.getTwoOne() );
                session.setAttribute( "twoTwo", build.getTwoTwo() );
                session.setAttribute( "twoThree", build.getTwoThree() );
                session.setAttribute( "twoFour", build.getTwoFour() );
                session.setAttribute( "oneOne", build.getOneOne() );
                session.setAttribute( "oneTwo", build.getOneTwo() );
                session.setAttribute( "oneThree", build.getOneThree() );
                session.setAttribute( "oneFour", build.getOneFour() );
                session.setAttribute( "fourTotal", build.getFourTotal());
                session.setAttribute( "twoTotal", build.getTwoTotal());
                session.setAttribute( "oneTotal", build.getOneTotal());
                session.setAttribute( "status", build.getStatus() );
        return "tablepage";
    }
}

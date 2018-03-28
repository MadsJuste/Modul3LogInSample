package PresentationLayer;

import FunctionLayer.LoginSampleException;
import FunctionLayer.WrongOrderException;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put( "login", new Login() );
        commands.put( "register", new Register() );
        commands.put( "purchase", new order() );
        commands.put( "check", new GetOrders() );
        commands.put( "Back", new Back());
        commands.put( "Find", new List());
        commands.put( "Set", new setStatus());
        commands.put( "getList", new getOrderLidt());
    }

    static Command from( HttpServletRequest request ) {
        String commandName = request.getParameter( "command" );
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(commandName, new UnknownCommand() );
    }

    abstract String execute( HttpServletRequest request, HttpServletResponse response ) 
            throws LoginSampleException, WrongOrderException;
   

}

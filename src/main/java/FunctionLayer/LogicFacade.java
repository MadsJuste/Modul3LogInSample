package FunctionLayer;

import DBAccess.UserMapper;
import java.util.ArrayList;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }
    
    public static Build build(int hight,int width, int length , int id) throws LoginSampleException{
        Build build = new Build(hight, width, length, 0);
        UserMapper.build(build, id);
        return build;
    }
    
    public static Build list(int id, int oid) throws WrongOrderException{
        return  UserMapper.list(id, oid);
    }
    
    public static int rows(int id) throws LoginSampleException{
        return UserMapper.rows(id);
    }
    
    public static void setStatus(int oid) throws WrongOrderException{
        UserMapper.setStatus(oid);
    }
    
    public static ArrayList<Integer> orderList(int id, String role) throws LoginSampleException{ 
       return UserMapper.orderList(id, role);
    }

}

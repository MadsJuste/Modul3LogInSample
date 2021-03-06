package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import FunctionLayer.Build;
import FunctionLayer.WrongOrderException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 The purpose of UserMapper is to...

 @author kasper
 */
public class UserMapper {

    public static void createUser( User user ) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO user (email, password, role) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setString( 1, user.getEmail() );
            ps.setString( 2, user.getPassword() );
            ps.setString( 3, user.getRole() );
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt( 1 );
            user.setId( id );
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage() );
        }
    }

    public static User login( String email, String password ) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT user_id, role FROM user "
                    + "WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement( SQL );
            ps.setString( 1, email );
            ps.setString( 2, password );
            ResultSet rs = ps.executeQuery();
            if ( rs.next() ) {
                String role = rs.getString( "role" );
                int id = rs.getInt( "user_id" );
                User user = new User( email, password, role );
                user.setId( id );
                return user;
            } else {
                throw new LoginSampleException( "Could not validate user" );
            }
        } catch ( ClassNotFoundException | SQLException ex ) {
            throw new LoginSampleException(ex.getMessage());
        }
    }
    
    public static Build build(Build build, int id) throws LoginSampleException{
         try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO `order` (length, width, hight, user_id, status) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1,build.getLength());
            ps.setInt(2,build.getWidth());
            ps.setInt(3,build.getHight());
            ps.setInt(4,id);
            ps.setInt(5,0);
            
            ps.executeUpdate();
          
            return build;
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage());
        }   
    }
    
    public static Build list(int id, int oid) throws WrongOrderException {
       try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM `order` WHERE order_id=? AND user_id=?";
            PreparedStatement ps = con.prepareStatement( SQL );
            ps.setInt( 1, oid);
            ps.setInt( 2, id);
            ResultSet rs = ps.executeQuery();
             if ( rs.next() ) {
                     int length = rs.getInt( "length" );
                     int width = rs.getInt("width");
                     int hight = rs.getInt("hight");
                     int status = rs.getInt("status");
                     Build build = new Build (hight, width, length, status);
            return build;
             } else {
                throw new WrongOrderException( "Invalid order id" );
            }
          
        } catch ( ClassNotFoundException | SQLException ex ) {
            throw new WrongOrderException(ex.getMessage());
        }
    }
    
    public static int rows(int id) throws LoginSampleException {
        try {
            int rows = 0;
            Connection con = Connector.connection();
            String SQL = "SELECT count(*) FROM `order` WHERE user_id=?";
            PreparedStatement ps = con.prepareStatement( SQL );
            ps.setInt( 1, id );
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                rows = rs.getInt("count(*)");
                return rows;
            }
        } catch ( ClassNotFoundException | SQLException ex ) {
            throw new LoginSampleException(ex.getMessage());
        }
        return 0;
    }

    public static void setStatus(int oid) throws WrongOrderException {
        try{
            Connection con = Connector.connection();
            String SQL = "UPDATE `order` SET status=1 WHERE order_id=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1 ,oid);
            ps.executeUpdate();
        } catch(ClassNotFoundException | SQLException ex){
            throw new WrongOrderException(ex.getMessage());
        }
       
    }
    
    public static ArrayList<Integer> orderList(int id, String role) throws LoginSampleException {
       try {
            Connection con = Connector.connection();
            if(role.equals("customer")){
            String SQL = "SELECT order_id FROM `order` WHERE user_id=?";
            PreparedStatement ps = con.prepareStatement( SQL );
            ps.setInt( 1, id);
            ResultSet rs = ps.executeQuery();
            
            ArrayList<Integer> tempArray = new ArrayList<Integer>();
            while( rs.next() ) {
                     int orderid = rs.getInt("order_id");
                     tempArray.add(orderid);
            }
            return tempArray;
            }else{
                 String SQL = "SELECT order_id FROM `order`";
            PreparedStatement ps = con.prepareStatement( SQL );
            ResultSet rs = ps.executeQuery();

            ArrayList<Integer> tempArray2 = new ArrayList<Integer>();
            while( rs.next() ) {
                     int orderid = rs.getInt("order_id");
                     tempArray2.add(orderid);
            }
            return tempArray2;
            }
          
        } catch ( ClassNotFoundException | SQLException ex ) {
            throw new LoginSampleException(ex.getMessage());
        }
    }
}

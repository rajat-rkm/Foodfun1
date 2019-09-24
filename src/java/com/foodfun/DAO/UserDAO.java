/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foodfun.DAO;

/**
 *
 * @author RAJAT MATHUR
 */
import com.foodfun.model.User;
import com.foofun.connection.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;
public class UserDAO 
{
     public static boolean saveUser(User u) throws SQLException
  {
      boolean status = false;
      Connection con = null;
      try{
          con = GetConnection.getConnection();
          String sql = "insert into user (username,email,password,repeat_password) values(?,?,?,?)";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1,u.getUsername());
          ps.setString(2, u.getEmail());
           ps.setString(3, u.getPassword());
            ps.setString(4, u.getRepeat_password());
            
            if(ps.executeUpdate()!=0)
          status = true;  
      }
      catch(Exception e)
      {
        e.printStackTrace();
      }
      finally{
          try{
             con.close();
          }
          catch(Exception e)
          {
            e.printStackTrace();
          }
          
      }
      return status;
      
}
     public static boolean aunticateUser(String username,String pass)
  {
    boolean status = false;
    Connection con = null;
    try{
      con = GetConnection.getConnection();
      
      
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    finally{
        try{
          con.close();
        }
        catch(Exception e)
        {
          e.printStackTrace();
        }
    }
    return status;
  }
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.foodfun.DAO.UserDAO;
import com.foodfun.model.User;
import com.foofun.connection.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RAJAT MATHUR
 */
public class signup extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       PrintWriter out = response.getWriter();
       response.setContentType("text/html");
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
      Connection con = null;
        PrintWriter out=response.getWriter();
        
        try{
          con = GetConnection.getConnection();
          String Name = request.getParameter("Name");
          String email = request.getParameter("email");  
          String password = request.getParameter("password");
          String password2 = request.getParameter("password2");
          
          String sql = "insert into user (username,email,password,repeat_password) values(?,?,?,?)";
          PreparedStatement ps = con.prepareStatement(sql);
          
          ps.setString(1, Name);
           ps.setString(2, email);
            ps.setString(3, password);
             ps.setString(4, password2);
             
             int i=ps.executeUpdate();
             if(i>0) 
             {
             response.sendRedirect("/FoodFun/login/mainlogin.html");
             
             }
             else{
                 response.sendRedirect("/FoodFun/login/signup.html"); 
             }
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
   
        
        
        
        
        
    }

   
}

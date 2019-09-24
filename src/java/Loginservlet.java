

import com.foodfun.DAO.UserDAO;
import com.foofun.connection.GetConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;



/**
 *
 * @author RAJAT MATHUR
 */
@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
      
        Connection con = null;
        PrintWriter out=response.getWriter();
        try{
          con = GetConnection.getConnection();
          String username = request.getParameter("username");
          String pass = request.getParameter("pass");
          String user1 = null;
          String pass1 = null;
        
            String sql = "select * from user where username = ? and password = ?";
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setString(1,username);
      ps.setString(2, pass);
      ResultSet rs = ps.executeQuery();
    
            while(rs.next()){
                user1 = rs.getString("username");
                pass1 = rs.getString("password");
            }
            if(user1.equals(username)&& pass1.equals(pass)){
                response.sendRedirect("/FoodFun/index.jsp");

            }
            else{  
              response.sendRedirect("/FoodFun/login/mainlogin.html"); 
            }
        
        }
        catch(Exception e)
        {   out.println("<script type=\"text/javascript\">");
         out.println("location='/FoodFun/login/mainlogin.html';");
   out.println("alert('User or password incorrect');");
  
   out.println("</script>");
        //response.sendRedirect("/FoodFun/login/mainlogin.html");
          e.printStackTrace();
        }
        finally{
            try{
              con.close();
            }
            catch(Exception er)
            {
              er.printStackTrace();
            }
        }
    }
  
}

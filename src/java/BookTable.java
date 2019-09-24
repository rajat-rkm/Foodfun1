

import com.foofun.connection.GetConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import static javafx.beans.binding.Bindings.select;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RAJAT MATHUR
 */
public class BookTable extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
        Connection con = null;
        PrintWriter out=response.getWriter();
        try
        {
          con = GetConnection.getConnection();
           String date = request.getParameter("date1");
              
           String sels =" ";
               String sel[] = request.getParameterValues("sel");  
                for(int i=0; i<sel.length; i++)
                {
                sels+= sel[i]+" ";
             }
               String views =" "; 
              String view[] = request.getParameterValues("view");   
                for(int i=0; i<view.length; i++){
                 views+= view[i] + " ";
             }
                String ids =" "; 
                  String[] id = request.getParameterValues("type");
                for(int i=0; i<id.length; i++){
                 ids+= id[i]+" ";
             }
          String message1 = request.getParameter("message1");
          String name = request.getParameter("name");
                  String contact = request.getParameter("contact");
                          String email = request.getParameter("email");
                          String textbox = request.getParameter("textbox");

          String sql = "insert into book (date,no_guest,purpose,types,text1,name,contact,email,text2) values(?,?,?,?,?,?,?,?,?)";
           PreparedStatement ps = con.prepareStatement(sql);
          
          ps.setString(1, date);
          ps.setString(2, sels);
          ps.setString(3, views);
          ps.setString(4, ids);
           ps.setString(5, message1);
            ps.setString(6, name);
             ps.setString(7, contact);
              ps.setString(8, email);
               ps.setString(9, textbox);
             
           
             
             int i=ps.executeUpdate();
             if(i>0) 
             {
               //  out.println("<script type=\"text/javascript\">");
                 // out.println("$(document).ready(function()){");
                   //out.println("alert('welcome'); ");
                    response.sendRedirect("/FoodFun/my index.html");
                    //out.println("});");
                    
                   //  out.println("</script");
                           
            
             
             }
             else{
                 response.sendRedirect("/FoodFun/book.html"); 
             }
      } 
        
        
        
         catch(Exception e)
      {
        e.printStackTrace();
         response.sendRedirect("error.html"); 
        
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
        
        
        
        
        
        
        
   




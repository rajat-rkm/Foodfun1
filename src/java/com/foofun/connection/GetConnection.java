/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foofun.connection;

/**
 *
 * @author RAJAT MATHUR
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {
  private static Connection con = null;
  public static Connection getConnection()
  {
    try{
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodfun","root","rkmnhik27");
    }   
    catch(Exception e)
    {
      e.printStackTrace();
    }
    
    return con;
  }
}

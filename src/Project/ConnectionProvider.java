/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;

/**
 *
 * @author krsat
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try{
            String url = "jdbc:mysql://localhost:3306/qems";
                        System.out.println("Database connected 1");

          Class.forName("com.mysql.cj.jdbc.Driver");
                      System.out.println("Database connected 2");

          Connection con = DriverManager.getConnection(url,"root","w@2915djkq#");
            System.out.println("Database connected 3");
          return con;
        }
        catch(Exception e)
        {
         return null;        
        }
    }
    
}

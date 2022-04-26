/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author Aswin Amarnath
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class connectionProvider 
{
   public static Connection getcon()
   {
       try
       {
           Class.forName("com.mysql.cj.jdbc.Driver");  
           Connection con=DriverManager.getConnection(  
              "jdbc:mysql://localhost:3306/hotel","root","ASWin@2000");  
           return con;
           
           
       }
       catch(Exception e)
       {
         return null;
       }
       
       
   }  
    
    
}

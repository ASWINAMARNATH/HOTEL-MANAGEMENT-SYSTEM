/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import java.sql.Statement; 
import javax.swing.JOptionPane;

/**
 *
 * @author Aswin Amarnath
 */
public class Select {
    public static ResultSet getData(String query)
    {
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        
       
        try
        {
            con=connectionProvider.getcon();
            st=con.createStatement();
            rs=st.executeQuery(query);
            return rs;
        }   
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }    
               
    }
    
}


import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sofyan
 */
public class koneksi {
    Connection cn;
    public static Connection BukaKoneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tour","root","");
            return cn;
        } catch (Exception e) {
            return null;
        }
        
    }
    
}

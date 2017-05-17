
package conexión;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Conexión {
    
    private static final String User="root";
    private static final String Password="rootroot";
    private static final String Url="jdbc:mysql://localhost/tienda";
    private static final String Driver="com.mysql.jdbc.Driver";
     private static Connection cn;
   
    public static Connection Abrir()
    {
        try {
            Class.forName(Driver);
            cn=(Connection) DriverManager.getConnection(Url,User,Password);
            
            return cn;
            
        } catch (Exception ex) {
            System.out.println("Error:"+ex);
            return null;
        }
        
        
        
        
    }
    
}
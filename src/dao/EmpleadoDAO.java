
package dao;

import bean.Empleado;
import conexión.Conexión;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class EmpleadoDAO {
    
    
    public static String Insertar(Empleado emp)
    {
        String sql="INSERT INTO empleado(nombre, apepat, apemat, cargo) VALUES(?,?,?,?)";
            Connection cn = Conexión.Abrir();
        try {
            
            
            
            PreparedStatement  ps = cn.prepareStatement(sql);
            
            ps.setString(1, emp.getNombre());
            ps.setString(2, emp.getApepat());
            ps.setString(3, emp.getApemat());
            ps.setString(4, emp.getCargo());
            
            ps.executeUpdate();
            
            cn.close();
            return "Retorna-Ok";
            
        } catch (SQLException ex) {
            
            System.out.println("Error-Metodo-Insertar:"+ex);
            return null;
        }
      
}
    //Buscar empleado por codigo y retornar en una cadena
    //de texto String.
    public static Empleado Buscar(int cod)        
    {
        //Sentencia SQL Buscar.
        String sql="select * from empleado where idempleado=?";
        //Abrimos Conexión
        Connection cn = Conexión.Abrir();
        
        try {
            //Ejecutamos la Sentencia SQL.
            PreparedStatement ps =cn.prepareStatement(sql);
            //Asignamos valores a los parametros.
            ps.setInt(1, cod);
            //Ejecutar sentencia SQL atraves del ps y asignar resultados en resulset.
            ResultSet rs =ps.executeQuery();
            //Luego leemos nuestros Resultados.
            Empleado emp=null;
            while(rs.next())
            {//Creamos un objeto empleado para encapsular los datos que se leen del resulset.
                emp = new Empleado();
                emp.setIdempleado(rs.getInt(1));
                emp.setNombre(rs.getString(2));
                emp.setApepat(rs.getString(3));
                emp.setApemat(rs.getString(4));
                emp.setCargo(rs.getString(5));
            }
            //Cerramos los objetos.
            
           rs.close();
           ps.close();
           cn.close();
           return emp;
            
        } catch (SQLException ex) {
            
            System.out.println("Error-Metodo-Buscar:"+ex);
            return null;
        }
    
    }
    
    public static String Eliminar(int cod)
    {
        
        //Sentencia SQL
        String sql="delete from empleado where idempleado=?";
        //Abrimos Conexión.
        Connection cn = Conexión.Abrir();
        
        try {
            //Ejecutamos Sentencia SQL.
            PreparedStatement ps =cn.prepareStatement(sql);
            //Asignamos datos a los parametros.
            ps.setInt(1, cod);
            //Ejecutamos la Sentencia catravez del ps y asignar los resultados en resulset.
            ps.executeUpdate();
            
            cn.close();
            
            return "Retorna-Ok";
        } catch (SQLException ex) {
            System.out.println("Error-Metodo-ELiminar:"+ex);
            return null;
        }
        
    }
    
    public static String Actualizar(Empleado emp)
    {
        //Sentencia SQL.
        String sql="update  empleado   set nombre=?, apepat=?, apemat=?, cargo=? where idempleado=?";
        //Abrimos Conexión.
        Connection cn = Conexión.Abrir();
        try {
            //Ejecutamos SQL.
            PreparedStatement ps =cn.prepareStatement(sql);
            //Asignamos los datos a los parametros.
            ps.setString(1, emp.getNombre());
            ps.setString(2, emp.getApepat());
            ps.setString(3, emp.getApemat());
            ps.setString(4, emp.getCargo());
            ps.setInt(5, emp.getIdempleado());
            ps.executeUpdate();
            cn.close();
            return "Retorna-Ok";
        } catch (SQLException ex) {
            System.out.println("Error-Metodo-Actualizar:"+ex);
            return null;
        }
        
        
    }
    
}
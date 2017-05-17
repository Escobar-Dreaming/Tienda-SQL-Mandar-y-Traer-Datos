
package dao;

import bean.Articulo;
import conexión.Conexión;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ArticuloDAO {
    
    
    
    public static ArrayList<Articulo> Listar_por_Categoria(String cat)
    {
        //Sentencia SQL
        String sql="select idarticulo,nombre,descripcion,precio from articulo,categoria where categoria=? "
                + "and articulo.idcategoria=categoria.idcategoria";
        //Abrimos Conexión
        Connection cn = Conexión.Abrir();
        
        try {
            //Ejecutamos la sentencia sql.
            PreparedStatement ps = cn.prepareStatement(sql);
            //Asignar datos a los parametros.
            ps.setString(1, cat);
            //Ejecutamos el sql atravez de ps y asignamos resultados al resulset.
            ResultSet rs =ps.executeQuery();
            
            ArrayList<Articulo> Lista = new ArrayList<Articulo>();
            Articulo a = null;
            
            //Leemos los resultados
            while(rs.next())
            {
                a = new Articulo();
                
                a.setIdarticulo(rs.getInt(1));
                a.setNombre(rs.getString(2));
                a.setDescripción(rs.getString(3));
                a.setPrecio(rs.getFloat(4));
              /* a.setIdcategoria(rs.getInt(5));*/  
                Lista.add(a);
            }
            rs.close();
            ps.close();
            cn.close();
            return Lista;
            
        } catch (SQLException ex) {
            System.out.println("Error:"+ex);
            return null;
        }
        
        
        
        
        
        
        
        
        
    }
    
}

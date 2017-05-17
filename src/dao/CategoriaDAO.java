
package dao;

import bean.Categoria;
import conexión.Conexión;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class CategoriaDAO {
    
    
    
    
    public static ArrayList<Categoria>listar(){
        Connection cn=Conexión.Abrir();
        
        //arregelo con elementos tipo articulo 
            ArrayList<Categoria> lista =new ArrayList<Categoria>();
        try {
            //preparar statament para ejecutar sql con parametros ?
            PreparedStatement ps=cn.prepareStatement("select *from categoria");
            
    
            //ejecutar ps 
            ResultSet rs = ps.executeQuery();
            
            
            
            //variable tipo articulo
            Categoria cat;
            //leer articulos de rs
            while(rs.next()){
                cat=new Categoria();
                cat.setIdcategoria(rs.getInt(1));
                cat.setCategoria(rs.getString(2));
                //agregar objeto a la lista
                lista.add(cat);
                
      
            }
            //cerrar objetos
                cn.close();
                ps.close();
                rs.close();
        } catch (SQLException ex) {
           System.out.println("Error"+ex);
        }
        
        return lista;
    }
    
}

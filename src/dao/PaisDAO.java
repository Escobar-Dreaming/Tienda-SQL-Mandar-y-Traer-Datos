/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Pais;
import conexión.Conexión;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edcobar
 */
public class PaisDAO {
    
    
    
    
    public static String InsertarPais(Pais pa)
            
    {
        
        String sql="INSERT INTO pais(pais)VALUES(?)";
        Connection cn = Conexión.Abrir();
        try {
            PreparedStatement ps =cn.prepareStatement(sql);
            ps.setString(1, pa.getPais());
            ps.executeUpdate();
            cn.close();
            return "ok";
        } catch (SQLException ex) {
            
            System.out.println("Error:"+ex);
           return null;
        }
    
    
    }
}

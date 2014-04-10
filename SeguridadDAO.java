/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fjsp.seguridad;

import com.mysql.jdbc.Connection;
import fjsp.modelo.Usuario;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dan
 */
class SeguridadDAO {
    
    public static boolean esUsuarioValido(Usuario user) throws SQLException {
        boolean esValido = false;
        Connection con = null;
        
        try {
            
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String strConex = "jdbcsqlserver://localhost:1433;databaseName=innerJob";
           
            con = (Connection) DriverManager.getConnection(strConex, "prueba", "prueba123");
            Statement sta = con.createStatement();
            String strQuery = "SELECT * FROM usuario WHERE username = '"+ user.getUsername().trim()+ "' ";
            ResultSet rs = sta.executeQuery(strQuery);
            
            if (rs.next()){// si hay un usuario con ese username
                //verificamos si la clave es correcta o no
                if (rs.getString("clave").equals(user.getPassword())){
                user.setNombre(rs.getString("nombre"));
                esValido = true;
                }
            
            }//cierra el if
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SeguridadDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (con !=null && !con.isClosed()){
            con.close();
            }
        
        }
        return esValido;
    }
    
    
}

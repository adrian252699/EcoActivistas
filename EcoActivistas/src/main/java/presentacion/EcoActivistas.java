/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package presentacion;

import config.ConexionDB;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author jalt2
 */
public class EcoActivistas {

    public static void main(String[] args) throws SQLException {
        System.out.println("Hello World!");
        
        try(Connection conn = ConexionDB.getConnection()){
            System.out.println("Conexion establecida");
        }catch(SQLException ex){
            System.err.println("error de conexion: "+ ex.getMessage());
        }
    }
}

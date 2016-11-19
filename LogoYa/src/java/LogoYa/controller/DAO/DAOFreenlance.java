/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogoYa.controller.DAO;

import LogoYa.beans.freelance;
import com.prjhuellvotweb.Util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * dentro de controller creo una carpeta servlet y una dao ; para que se vea mas
 * organizado
 *
 * @author Familia Mazo
 */
public class DAOFreenlance extends Conexion {

    PreparedStatement pst;
    ResultSet rs;
//insertar  freenlace
    public int insertFreenlance(freelance f) {
        int result = 0;
        Connection con = null;
        try {
            con = this.conectar("mysql");
            String sql = "INSERT INTO Freenlace (name,email,cell_phone,password) values ?, ?, ?, ? ";
            pst.setString(1,f.getName());
            pst.setString(2,f.getEmail());
            pst.setString(3,f.getCell_phone());
            pst.setString(4,f.getPassword());
            pst = con.prepareStatement(sql);
            if (pst.executeUpdate() > 0) {
                result = 1;
            }
        } catch (Exception e) {
            System.out.println("Error en la clase DaoFreenlace, metodo insertFreenlance: " + e.getMessage());
        } finally {
            try {
                pst.close();
                this.desconectar(con);
            } catch (Exception ex) {
                System.out.println("error en el finally clase DaoFreenlace, metodo insertFreenlance:" + ex.getMessage());
            } finally {
                return result;
            }
        }
    }//fin de insertar freelance.
    
}//fin de la clase daoFreenlance.

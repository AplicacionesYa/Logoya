/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logoya.controller.DAO;

import logoya.beans.freelance;
import logoya.util.Conexion;
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
        System.out.println("");
        int result = 0;
        Connection con = null;
        try {
            con = conectar("mysql");
            String sql = "INSERT INTO Freelance (name,email,cell_phone,password,PrecioBanner,priceCard,priceFlayer,priceLogo) values (?, ?, ?, ? , ?, ?, ?, ?)";
             pst = con.prepareStatement(sql);
            pst.setString(1,f.getName());
            pst.setString(2,f.getEmail());
            pst.setString(3,f.getCell_phone());
            pst.setString(4,f.getPassword());
            pst.setDouble(5, f.getPriceBanner());
            pst.setDouble(6, f.getPriceCard());
            pst.setDouble(7, f.getPriceFlayer());
            pst.setDouble(8, f.getPriceLogo());
           System.out.println(f.getName()+f.getEmail()+f.getCell_phone()+f.getPassword());
            System.out.println(pst.toString());
            if (pst.executeUpdate() > 0) {
                result = 1;
            }
        } catch (Exception e) {
            System.out.println("Error en la clase DaoFreenlace, metodo insertFreenlance: " + e.getMessage());
        } finally {
            try {
                pst.close();
                desconectar(con);
            } catch (Exception ex) {
                System.out.println("error en el finally clase DaoFreenlace, metodo insertFreenlance:" + ex.getMessage());
            } finally {
                return result;
            }
        }
    }//fin de insertar freelance.
    
}//fin de la clase daoFreenlance.

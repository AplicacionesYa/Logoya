/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logoya.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Familia Mazo
 */
public class Conexion {

      public Conexion() {
    }

    public  Connection conectar(String db) {
        Connection con = null;
        try {
            if (db.compareTo("mysql") == 0) {
                String conexion = "";

                {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logoya", "root", "1234");

                    //con.setAutoCommit(true);
                }

            }

        } catch (ClassNotFoundException cnfe) {
            System.out.println(cnfe + "Error En El Controlador, No Se Ha Podido Establecer La Conexi�n con la Base De Datos. Clase Conexion");
        } catch (SQLException sqle) {
            System.out.println(
                    sqle+ "  ErrorSQL Problemas en la Ejecucion de Alguna Cla�sula SQL. . Clase Conexion");
        } catch (Exception e) {
            System.out.println(
                    e+ "Ha Ocurrido Una Excepci�n. Clase Conexi�n");
        }
        return con;
    }

    public void desconectar(Connection con) {
        try {
            con.close();
        } catch (SQLException ex) {
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BDatos;

import clases.clientes;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author StarMedia
 */
public class bdCliente {
    
    conexiones BLcon = new conexiones();
    
    public int InsertarCliente(clientes objCliente) 
            throws ClassNotFoundException, SQLException {
       String Sentencia = "Insert into Clientes (cedula,Nombres, Apellidos) "
               + "values (?,?,?)";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        ps.setString(1,objCliente.getCedula());
        ps.setString(2,objCliente.getNombres());
        ps.setString(3,objCliente.getApellidos());
        return ps.executeUpdate(); //1 si se inserta -- 0 si no inserta
    }
    
}

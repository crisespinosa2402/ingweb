/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import BDatos.bdCliente;
import clases.clientes;
import java.sql.SQLException;

/**
 *
 * @author StarMedia
 */
public class Lcliente {
bdCliente objBDCliente = new bdCliente();

    public void IngresarCliente(clientes objCliente) throws ClassNotFoundException, SQLException {
         objBDCliente.InsertarCliente(objCliente);
    }
    
}

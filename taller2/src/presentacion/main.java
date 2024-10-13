/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import clases.clientes;
import java.sql.SQLException;
import java.util.Scanner;
import logica.Lcliente;

/**
 *
 * @author StarMedia
 */
public class main {
    
    static clientes objCliente = new clientes(0, "1102", "Danilo", "Jaramillo");
    static Lcliente objLcliente = new Lcliente();
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        String aux;
        do {
            System.out.println("Ingresar Clientes      1");
            System.out.println("Salir                  5");
            aux = entrada.nextLine();
            op = Integer.parseInt(aux);

            switch (op) {
                case 1:
                    ingresarCliente();
                    break;
                default:
                    throw new AssertionError();
            } 
        }while(true);
    }

    private static void ingresarCliente() {
        Scanner entrada = new Scanner(System.in);
        
        objLcliente.IngresarCliente(objCliente);
    }
    public class LLoginUsuario {
    static BDUsuario objBDusuario = new BDUsuario();
    public static void ObtenerUsurio(Usuario objUsuario) throws ClassNotFoundException, SQLException {
        //TRABAJPO de los algoritmos
        ResultSet rs = objBDusuario.RecuperarUsuarios(objUsuario);
        while (rs.next()){
                objUsuario.setUsuario(rs.getString(1));
                objUsuario.setClave(rs.getString(2));
        }
        rs.close();
    }
    public ResultSet RecuperarUsuarios1(Usuario objUsuario) throws ClassNotFoundException, SQLException{
        String Sentencia = "SELECT * FROM Usuarios where usuario = ? and clave = ?";
        PreparedStatement ps= BLcon.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objUsuario.getUsuario());
        ps.setString(2, objUsuario.getClave());
        return ps.executeQuery();
    }
}
    
}

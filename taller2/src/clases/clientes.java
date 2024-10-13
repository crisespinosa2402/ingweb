/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author StarMedia
 */
public class clientes {
    int idCliente;
    String cedula;
    String nombres;
    String apellidos;

    public clientes() {
    }

    public clientes(int idCliente, String cedula, String nombres, String apellidos) {
        this.idCliente = idCliente;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "clientes{" + "idCliente=" + idCliente + ", cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + '}';
    }
    
    
}

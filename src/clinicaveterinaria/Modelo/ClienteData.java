/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.Modelo;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author usuario
 */
public class ClienteData {
    private Connection connection = null;
    private int id_cliente;
    private int dni;
    private String apellido;
    private String nombre;
    private String direccion;
    private String telefono;
    private String persona_alternativa;

    public ClienteData(int id_cliente, int dni, String apellido, String nombre, String direccion, String telefono, String persona_alternativa) {
        this.id_cliente = id_cliente;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.persona_alternativa = persona_alternativa;
    }

    public ClienteData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    public int getId_cliente() {
        int id_cliente = 0;
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getDni() {
        int dni = 0;
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPersona_alternativa() {
        return persona_alternativa;
    }

    public void setPersona_alternativa(String personaAlternativa) {
        this.persona_alternativa = personaAlternativa;
    }

    
}

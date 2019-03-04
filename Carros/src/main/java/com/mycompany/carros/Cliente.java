package com.mycompany.carros;

/**
 * @Description: Clase que contiene los datos del cliente
 * @author gtior
 */ 
public class Cliente {
    
    private int codCliente;
    private String nombres;
    private String apellidos;
    private int cedula;

    /**
     * Constructor que inicializa la clase
     * @param codCliente
     * @param nombres
     * @param apellidos
     * @param cedula 
     */
    public Cliente(int codCliente, String nombres, String apellidos, int cedula) {
        this.codCliente = codCliente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
    }

 
    /**
     * 
     * @return codCliente 
     */
    public int getCodCliente() {
        return codCliente;
    }

    /**
     * 
     * @param codCliente 
     */
    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    /**
     * 
     * @return nombres 
     */ 
    public String getNombres() {
        return nombres;
    }

    /**
     * 
     * @param nombres 
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * 
     * @return apellidos 
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * 
     * @param apellidos 
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * 
     * @return cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * 
     * @param cedula 
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    
    
}

package com.mycompany.carros;

/**
 * @Description: Clase que contiene los datos del vendedor
 * @author gtior
 */
public class Vendedor {
    
    /**
     * Atributos de la clase Vendedor
     */
    private int codVendedor;
    private String nombres;
    private String apellidos;
    private int cedula;

    public Vendedor(){
        
    }
    
    /**
     * @description: constructor de la clase vendedor para inicializar las variables
     * @param codVendedor
     * @param nombres
     * @param apellidos
     * @param cedula 
     */
    public Vendedor(int codVendedor, String nombres, String apellidos, int cedula) {
        this.codVendedor = codVendedor;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
    }

    /**
     * @description: getters and setters
     * @return codVendedor
     */
    public int getCodVendedor() {
        return codVendedor;
    }

    /**
     * 
     * @param codVendedor 
     */
    public void setCodVendedor(int codVendedor) {
        this.codVendedor = codVendedor;
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

package com.mycompany.carros;

/**
 * @description: Clase que contiene un objeto de la clase Vendedor para poder realizar la comision por ventas
 * @author gtior
 */
public class Pago {
    
    private int codPago;

    /**
     * Constructor
     * @param codPago 
     */
    public Pago(int codPago) {
        this.codPago = codPago;
    }

    /**
     * 
     * @return codPago 
     */
    public int getCodPago() {
        return codPago;
    }
    /**
     * 
     * @param codPago 
     */

    public void setCodPago(int codPago) {
        this.codPago = codPago;
    }

    
    
}

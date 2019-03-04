package com.mycompany.carros;

import java.util.ArrayList;

/**
 * @description: Clase que contiene los datos de la factura;
 * @author gtior
 */
public class Factura {
    
    private int codFactura;
    private String fecha;
    private ArrayList[] Venta;

    /**
     * Constructor
     * @param codFactura
     * @param fecha
     * @param Venta 
     */
    public Factura(int codFactura, String fecha, ArrayList[] Venta) {
        this.codFactura = codFactura;
        this.fecha = fecha;
        this.Venta = Venta;
    }

    /**
     * 
     * @return 
     */
    public ArrayList[] getVenta() {
        return Venta;
    }

    /**
     * 
     * @param Venta 
     */
    public void setVenta(ArrayList[] Venta) {
        this.Venta = Venta;
    }

    /**
     * 
     * @return 
     */
    public int getCodFactura() {
        return codFactura;
    }

    /**
     * 
     * @param codFactura 
     */
    public void setCodFactura(int codFactura) {
        this.codFactura = codFactura;
    }

    /**
     * 
     * @return 
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * 
     * @param fecha 
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}

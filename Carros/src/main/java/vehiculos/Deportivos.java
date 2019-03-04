package vehiculos;

import vehiculos.Vehiculo;

/**
 * @description: Clase que contiene los datos de los carros deportivos y hereda de la clase padre Vehiculo
 * @author gtior
 */
public class Deportivos extends Vehiculo{
    
    private int codDeportivo;
    private String cilindraje;
    private int numPasajeros;
    private String segmento;

    public Deportivos(int codDeportivo, String cilindraje, int numPasajeros, String segmento, int codVehiculo, String color, String marca, int modelo, float precio, int cantidad) {
        super(codVehiculo, color, marca, modelo, precio, cantidad);
        this.codDeportivo = codDeportivo;
        this.cilindraje = cilindraje;
        this.numPasajeros = numPasajeros;
        this.segmento = segmento;
    }

    public Deportivos(){
        
    }
       
    public Deportivos(int codDeportivo, String cilindraje, int numPasajeros, String segmento) {
        this.codDeportivo = codDeportivo;
        this.cilindraje = cilindraje;
        this.numPasajeros = numPasajeros;
        this.segmento = segmento;
    }



    
    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public int getCodDeportivo() {
        return codDeportivo;
    }

    public void setCodDeportivo(int codDeportivo) {
        this.codDeportivo = codDeportivo;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
    
    
    
    
}

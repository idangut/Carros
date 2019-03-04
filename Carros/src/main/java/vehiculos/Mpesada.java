package vehiculos;

import vehiculos.Vehiculo;

/**
 * @description: Clase que contiene los datos de vehiculos de maquinaria pesada y hereda de la clase padre Vehiculo
 * @author gtior
 */
public class Mpesada extends Vehiculo{
    
    private int codmPesada;
    private String tipo;
    private String clasificacion;

    
    public Mpesada(int codmPesada, String tipo, String clasificacion, int codVehiculo, String color, String marca, int modelo, float precio, int cantidad) {
        super(codVehiculo, color, marca, modelo, precio, cantidad);
        this.codmPesada = codmPesada;
        this.tipo = tipo;
        this.clasificacion = clasificacion;
    }

    public Mpesada(){
        
    }
    
    public Mpesada(int codmPesada, String tipo, String clasificacion) {
        this.codmPesada = codmPesada;
        this.tipo = tipo;
        this.clasificacion = clasificacion;
    }

    

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getCodmPesada() {
        return codmPesada;
    }

    public void setCodmPesada(int codmPesada) {
        this.codmPesada = codmPesada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}

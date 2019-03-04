package vehiculos;

import vehiculos.Vehiculo;

/**
 * @description: Clase que contiene los datos de los carros estandar y hereda de la clase padre Vehiculo
 * @author gtior
 */
public class Estandar extends Vehiculo {
    
    public int codEstandar;
    private String tipoTransmision;
    private int numMotor;
    private int numeroChasis;

    /**
     * @description: constructor de la clase Estandar
     * @param codEstandar
     * @param tipoTransmision
     * @param numMotor
     * @param numeroChasis
     * @param codVehiculo
     * @param color
     * @param marca
     * @param modelo
     * @param precio
     * @param cantidad 
     */
    public Estandar(int codEstandar, String tipoTransmision, int numMotor, int numeroChasis, int codVehiculo, String color, String marca, int modelo, float precio, int cantidad) {
        super(codVehiculo, color, marca, modelo, precio, cantidad);
        this.codEstandar = codEstandar;
        this.tipoTransmision = tipoTransmision;
        this.numMotor = numMotor;
        this.numeroChasis = numeroChasis;
    }

    public Estandar(){
        
    }
    
    /**
     * @description: Constructor de la clase estandar
     * @param codEstandar
     * @param tipoTransmision
     * @param numMotor
     * @param numeroChasis 
     */
    public Estandar(int codEstandar, String tipoTransmision, int numMotor, int numeroChasis) {
        this.codEstandar = codEstandar;
        this.tipoTransmision = tipoTransmision;
        this.numMotor = numMotor;
        this.numeroChasis = numeroChasis;
    }

    /**
     * @description: Getters and setters
     * @return codEstandar 
     */
    public int getCodEstandar() {
        return codEstandar;
    }

    /**
     * 
     * @param codEstandar 
     */
    public void setCodEstandar(int codEstandar) {
        this.codEstandar = codEstandar;
    }

    /**
     * 
     * @return tipoTransmision
     */
    public String getTipoTransmision() {
        return tipoTransmision;
    }

    /**
     * 
     * @param tipoTransmision 
     */
    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    /**
     * 
     * @return numMotor 
     */
    public int getNumMotor() {
        return numMotor;
    }

    /**
     * 
     * @param numMotor 
     */
    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    /**
     * 
     * @return numeroChasis 
     */
    public int getNumeroChasis() {
        return numeroChasis;
    }

    /**
     * 
     * @param numeroChasis 
     */
    public void setNumeroChasis(int numeroChasis) {
        this.numeroChasis = numeroChasis;
    }
    
    
    
}

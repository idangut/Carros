
package vehiculos;

import vehiculos.Vehiculo;

/**
 * @description: Clase que contiene los atributos de los carros personalizados
 * esta hereda de la clase padre Vehiuculo
 * @author gtior
 */
public class Personalizados extends Vehiculo {
   
   private int codPersonalizado;
   private String tipoRines;
   private String tipoPolarizado;
   private String colorNeon;

    public Personalizados(int codVehiculo, String color, String marca, int modelo, float precio, int cantidad) {
        super(codVehiculo, color, marca, modelo, precio, cantidad);
        this.codPersonalizado = codPersonalizado;
        this.tipoRines = tipoRines;
        this.tipoPolarizado = tipoPolarizado;
        this.colorNeon = colorNeon;
    }
    
    public Personalizados(){
        
    }
   
    public Personalizados(int codPersonalizado, String tipoRines, String tipoPolarizado, String colorNeon) {
        this.codPersonalizado = codPersonalizado;
        this.tipoRines = tipoRines;
        this.tipoPolarizado = tipoPolarizado;
        this.colorNeon = colorNeon;
    }

   
    public int getCodPersonalizado() {
        return codPersonalizado;
    }

    public void setCodPersonalizado(int codPersonalizado) {
        this.codPersonalizado = codPersonalizado;
    }

    public String getTipoRines() {
        return tipoRines;
    }

    public void setTipoRines(String tipoRines) {
        this.tipoRines = tipoRines;
    }

    public String getTipoPolarizado() {
        return tipoPolarizado;
    }

    public void setTipoPolarizado(String tipoPolarizado) {
        this.tipoPolarizado = tipoPolarizado;
    }

    public String getColorNeon() {
        return colorNeon;
    }

    public void setColorNeon(String colorNeon) {
        this.colorNeon = colorNeon;
    }
   
   
    
}

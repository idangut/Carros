package vehiculos;

/**
 *
 * @author gtior
 * Description: Clase padre que contiene los datos de los vehiculos
 */
public class Vehiculo {
 
    
    private int codVehiculo;
    private String color;
    private String marca;
    private int modelo;
    private float precio;
    private int cantidad;
    
    public Vehiculo(){
        
    }
    
    /**
     * Description: Constructor de la clase Vehiculo
     * @param codVehiculo
     * @param color
     * @param marca
     * @param modelo
     * @param precio 
     * @param cantidad
     */
    public Vehiculo(int codVehiculo, String color, String marca, int modelo, float precio, int cantidad) {
        this.codVehiculo = codVehiculo;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

  

    /**
     * Description: Getters and Setters
     * @return precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * 
     * @param precio 
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * 
     * @return codVehiculo
     */
    public int getCodVehiculo() {
        return codVehiculo;
    }

    /**
     * 
     * @param codVehiculo 
     */
    public void setCodVehiculo(int codVehiculo) {
        this.codVehiculo = codVehiculo;
    }

    /**
     * 
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 
     * @return marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * 
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * 
     * @return modelo 
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * 
     * @param modelo 
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    /**
     * 
     * @return cantidad 
     */
    public int getCantidad(){
        return cantidad;
    }
    
    /**
     * 
     * @param cantidad 
     */
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    

}

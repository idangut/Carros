
package com.mycompany.carros;

import java.io.IOException;
import java.util.Scanner;

/**
 * @description: Clase que contiene el menu y los metodos para agregar los tipos de vehiculos
 * @author gtior
 */
public class Menu {
    Scanner datos = new Scanner(System.in);
    /**
     * constructor que inicializa la clase
     */
    public Menu() throws IOException {
        Inicio();
    }//Construrctor
    
    /**
     * Menu Inicial del programa
     * @throws IOException 
     */
    private void Inicio() throws IOException{
        byte opcion;
        System.out.println("///////////////////////////////////////");
        System.out.println("////   Bienvenido");
        System.out.println("////1. Agregar Vehiculo.");
        System.out.println("////2. Realizar Venta de un Vehiculo.");
        
        System.out.println("Seleccione la opcion deseada: ");
        opcion = datos.nextByte();
        Seleccion(opcion);
    }//Inicio
    
    /**
     * Metodo en donde se seleccion lo que se desea realizar
     * @param opcion
     * @throws IOException 
     */
    private void Seleccion(byte opcion) throws IOException{
        switch(opcion){
            case 1:
                Inventario inventario = new Inventario();
                inventario.menuIngresar();
                break;
            //case 1
            case 2:
                Venta venta = new Venta();
                
                break;
            default:
                System.out.println("default");
                break;
            }//default
       
    }//seleccion
    
}

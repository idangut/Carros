package com.mycompany.carros;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @description: clase que contiene un obeto Vehiculo para poder realizar la venta del mismo
 * @author gtior
 */
public class Venta {

   
    private int codVenta;
    public static ArrayList <Vendedor> persona = new ArrayList();
    
    
    public Venta() throws IOException{
       inicio();
    }
    
    /**
     * @description: menu de inicio para la venta
     * @throws IOException 
     */
    public void inicio() throws IOException{
        
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        
        do{
            
            System.out.println("Menu de Venta");
            System.out.println("1. Seleccionar Vendedor");
            System.out.println("2. Volver");
            System.out.println("3. Salir");
            System.out.println("Digite una opcion");
            opcion = sc.nextInt(); 
            
            switch(opcion){
                case 1:
                    imprimir(persona);
                    vendedores(persona);
                    break;
                    
                case 2:
                    Menu menu = new Menu();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }   
        }while(opcion != 3);
    }
    
    /**
     * @description: metodo para guardar los vendedores en la lista persona
     * @param persona 
     */
    public static void vendedores(ArrayList <Vendedor> persona){
        
  
        
        Vendedor vendedor1 = new Vendedor();
        vendedor1.setCodVendedor(1234);
        vendedor1.setNombres("Camilo Andres");
        vendedor1.setApellidos("Martinez Sanches");
        vendedor1.setCedula(12345364);
        persona.add(vendedor1);
        
        Vendedor vendedor2 = new Vendedor();
        vendedor2.setCodVendedor(5678);
        vendedor2.setNombres("Jose German");
        vendedor2.setApellidos("Gutierrez Castro");
        vendedor2.setCedula(12345364);
        persona.add(vendedor2);
        
        
         
    }
    
    /**
     * Metodo para imprimir los vendedores
     * @param persona 
     */
    public static void imprimir(ArrayList <Vendedor> persona){
        
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        for(Vendedor vendedor1 : persona){
            System.out.println("Codigo: " + vendedor1.getCodVendedor() + "Nombres: " + vendedor1.getNombres() + "Apellidos:" + 
                    vendedor1.getApellidos() + "Cedula: " + vendedor1.getCedula());
        }
        
        do{
        System.out.println("Digite uno de los dos codigos de vendedor disponibles: ");
        opcion = sc.nextInt();
        if(opcion == 1234 || opcion == 5678){
            System.out.println("Seleccion el vehiculo que desea vender: ");
        }
        }while(true);
    }
   
    /**
     * 
     * @return persona 
     */
    public static ArrayList <Vendedor> getPersona() {
        return persona;
    }

    public static void setPersona(ArrayList <Vendedor> aPersona) {
        persona = aPersona;
    }
    /**
     * @description: constructor para inicializar la clase
     * @param codVenta 
     */
    public Venta(int codVenta) {
        this.codVenta = codVenta;
    }

    /**
     * 
     * @return codVenta 
     */
    public int getCodVenta() {
        return codVenta;
    }

    /**
     * 
     * @param codVenta 
     */
    public void setCodVenta(int codVenta) {
        this.codVenta = codVenta;
    }
    
    
    
    
    
}

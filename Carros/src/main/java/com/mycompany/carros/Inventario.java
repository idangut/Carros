package com.mycompany.carros;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import vehiculos.Deportivos;
import vehiculos.Estandar;
import vehiculos.Mpesada;
import vehiculos.Personalizados;
import vehiculos.Vehiculo;

/**
 * @description: Clase que contiene los datos del inventario de todos los vehiculos
 * @author gtior
 */
public class Inventario {
    
    /**
     * ArrayList que contiene los datos de la clase Vehiculo y Deportivos
     */
    private static ArrayList <Deportivos> vehiculo2 = new ArrayList<>();
    /**
     * ArrayList que contiene los datos de la clase Vehiculo y Estandar
     */
    private static ArrayList <Estandar> vehiculo3 = new ArrayList<>();
    /**
     * ArrayList que contiene los datos de la clase Vehiculo y Mpesada
     */
    private static ArrayList <Mpesada> vehiculo4 = new ArrayList<>();
    /**
     * ArrayList que contiene los datos de la clase Vehiculo y Personalizados
     */
    private static ArrayList <Personalizados> vehiculo5 = new ArrayList<>();

    public static ArrayList <Deportivos> getVehiculo2() {
        return vehiculo2;
    }

    public static void setVehiculo2(ArrayList <Deportivos> aVehiculo2) {
        vehiculo2 = aVehiculo2;
    }

    public static ArrayList <Estandar> getVehiculo3() {
        return vehiculo3;
    }

    public static void setVehiculo3(ArrayList <Estandar> aVehiculo3) {
        vehiculo3 = aVehiculo3;
    }

    public static ArrayList <Mpesada> getVehiculo4() {
        return vehiculo4;
    }

    public static void setVehiculo4(ArrayList <Mpesada> aVehiculo4) {
        vehiculo4 = aVehiculo4;
    }

    public static ArrayList <Personalizados> getVehiculo5() {
        return vehiculo5;
    }

    public static void setVehiculo5(ArrayList <Personalizados> aVehiculo5) {
        vehiculo5 = aVehiculo5;
    }
    
   
   
    /**
     * @description: Metodo que contiene el menu para poder registrar los vehiculos se implementa(IOException) 
     * Significa que se ha producido un error en la entrada/salida.
     * Se utiliza esta excepcion dado que para leer los datos que se introducen por teclado se esta utilizando
     * la clase BufferedReader()Permite leer texto de un InputStream de una forma sencilla. Permite leer caracteres, arrays y líneas.
     * Con el InputStreamReader Clase que representa una conexión entre un stream de bytes y un stream de caracteres. 
     * Stream con cadenas de caracteres String o de bytes
     * @throws IOException 
     */
    public void menuIngresar()throws IOException{
        
    /**
     * Variable para guardar la opcion que selecciona el usuario 
     */       
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
       
        do{
            
            System.out.println("BIENVENIDO");
            System.out.println("1. Registrar un Deportivo");
            System.out.println("2. Listar Deportivos");
            System.out.println("3. Registrar un Estandar");
            System.out.println("4. Listar Estandar");
            System.out.println("5. Registrar M.Pesada");
            System.out.println("6. Listar M.Pesada");
            System.out.println("7. Agregar Personalizado");
            System.out.println("8. Listar Personalizados");
            System.out.println("9. Listar Estandar Mas Caro y Mas Barato.");
            System.out.println("10. Listar Deportivo Mas Caro y Mas Barato.");
            System.out.println("11. Listar Maquinaria Pesada Mas Caro y Mas Barato.");
            System.out.println("12. Listar Personalizado Mas Caro y Mas Barato.");
            System.out.println("13. Salir");
            System.out.println("Escoga una opcion:");
        opcion = sc.nextInt(); 
        
        switch(opcion){
            
            case 1:
                agregarDeportivo(vehiculo2);
                break;
            case 2:
                deportivosQuemados(vehiculo2);
                imprimirDeportivos(vehiculo2);
                break;
            case 3:
                agregarEstandar(vehiculo3);
                break;
            case 4:
                estandarQuemados(vehiculo3);
                imprimirEstandar(vehiculo3);
                break;
            case 5:
                 agregarPesada(vehiculo4);
                break;
            case 6:
                mPesadaQuemados(vehiculo4);
                imprimirPesada(vehiculo4);
                break;
            case 7:
                agregarPersonalizada(vehiculo5);
                break;
            case 8:
                personalizadosQuemados(vehiculo5);
                imprimirPersonalizados(vehiculo5);
                break;
            case 9:
                estandarQuemados(vehiculo3);
                estandarMasCaro(vehiculo3);
                estandarMasBarato(vehiculo3);
                break;
            case 10:
                deportivosQuemados(vehiculo2);
                deportivoMasCaro(vehiculo2);
                deportivoMasBarato(vehiculo2);
                break;
            case 11:
                mPesadaQuemados(vehiculo4);
                mPesadaMasCaro(vehiculo4);
                mPesadaMasBarato(vehiculo4);
                break;
            case 12:
                personalizadosQuemados(vehiculo5);
                personalizadoMasCaro(vehiculo5);
                personalizadoMasBarato(vehiculo5);
                break;
            case 13:
                System.out.println("Hasta luego");
                System.exit(0);   
        }//switch
        }while(opcion != 13); 
}//menuIngresar
    
    
    
    /**
     * @description: metodo para agregar los datos de los carros deportivos al ArrayList
     * @param vehiculo2
     * @throws IOException 
     */
    public static void agregarDeportivo(ArrayList<Deportivos> vehiculo2) throws IOException{
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deportivos depor = new Deportivos();
        System.out.println("Ingrese el codigo del Vehiculo: ");
        depor.setCodVehiculo(Integer.parseInt(br.readLine()));
        System.out.println("Ingrese la marca del Vehiculo: ");
        depor.setMarca(br.readLine());
        System.out.println("Ingrese el color del Vehiculo: ");
        depor.setColor(br.readLine());
        System.out.println("Ingrese el modelo del Vehiculo: ");
        depor.setModelo(Integer.parseInt(br.readLine()));
        System.out.println("Ingrese el precio del Vehiculo: ");
        depor.setPrecio(Float.parseFloat(br.readLine()));
        System.out.println("Ingrese la cantidad a registrar: ");
        depor.setCantidad(Integer.parseInt(br.readLine()));
        System.out.println("Ingrese el codigo del deportivo: ");
        depor.setCodDeportivo(Integer.parseInt(br.readLine()));
        System.out.println("Ingrese el Cilindraje: ");
        depor.setCilindraje(br.readLine());
        System.out.println("Ingrese el numero de pasajeros: ");
        depor.setNumPasajeros(Integer.parseInt(br.readLine()));
        System.out.println("Ingrese el segmeno(A-B-C-D): ");
        depor.setSegmento(br.readLine());
        vehiculo2.add(depor);
    }//agregarDeportivo
    
    /**
     * description: Meotodo que sirve para agregar los datos de los carros estandar al ArrayList
     * @param vehiculo3
     * @throws IOException 
     */
    public static void agregarEstandar(ArrayList <Estandar> vehiculo3) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        Estandar estand = new Estandar();
        System.out.println("Ingrese el codigo del Vehiculo: ");
        estand.setCodVehiculo(Integer.parseInt(br.readLine()));
        System.out.println("Ingrese la marca del Vehiculo: ");
        estand.setMarca(br.readLine());
        System.out.println("Ingrese el color del Vehiculo: ");
        estand.setColor(br.readLine());
        System.out.println("Ingrese el modelo del Vehiculo: ");
        estand.setModelo(Integer.parseInt(br.readLine()));
        System.out.println("Ingrese el precio del Vehiculo: ");
        estand.setPrecio(Float.parseFloat(br.readLine()));
        System.out.println("Ingrese la cantidad a registrar: ");
        estand.setCantidad(Integer.parseInt(br.readLine()));
        System.out.println("Ingrese el codigo Vehiculo Estandar: ");
        estand.setCodEstandar(Integer.parseInt(br.readLine()));
        System.out.println("Ingrese tipo de Transmision: ");
        estand.setTipoTransmision(br.readLine());
        System.out.println("Ingrese numero del Motor: ");
        estand.setNumMotor(Integer.parseInt(br.readLine()));
        System.out.println("Ingrese el numero del Chasis: ");
        estand.setNumeroChasis(Integer.parseInt(br.readLine()));
        vehiculo3.add(estand);
    }//agregarEstandar
    
    /**
     * description: Metodo para agregar los datos de los vehiculos de Maquinaria Pesada al ArrayList
     * @param vehiculo4
     * @throws IOException 
     */
    public static void agregarPesada(ArrayList <Mpesada> vehiculo4) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        Mpesada pesada = new Mpesada();
        System.out.println("Ingrese el codigo del Vehiculo: ");
        pesada.setCodVehiculo(Integer.parseInt(br.readLine()));
        System.out.println("Ingrese la marca del Vehiculo: ");
        pesada.setMarca(br.readLine());
        System.out.println("Ingrese el color del Vehiculo: ");
        pesada.setColor(br.readLine());
        System.out.println("Ingrese el modelo del Vehiculo: ");
        pesada.setModelo(Integer.parseInt(br.readLine()));
        System.out.println("Ingrese el precio del Vehiculo: ");
        pesada.setPrecio(Float.parseFloat(br.readLine()));
        System.out.println("Ingrese la cantidad a registrar: ");
        pesada.setCantidad(Integer.parseInt(br.readLine()));
        System.out.println("Ingrese codigo Mpesada: ");
        pesada.setCodmPesada(Integer.parseInt(br.readLine()));
        System.out.println("Ingrese el tipo(Excavadora-Retroexcavadora-compactadora-etc): ");
        pesada.setTipo(br.readLine());
        System.out.println("Ingrese la Clasificacion(Semipesada-Ligera): ");
        pesada.setClasificacion(br.readLine()); 
        vehiculo4.add(pesada);
    }//agregarPesada
    
    /**
     * Metodo para agregar los carros personalizados al inventario
     * @param vehiculo5
     * @throws IOException 
     */
    public static void agregarPersonalizada(ArrayList <Personalizados> vehiculo5) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        Personalizados pers = new Personalizados();
        System.out.println("Ingrese el codigo del Vehiculo: ");
        pers.setCodVehiculo(Integer.parseInt(br.readLine()));
        System.out.println("Ingrese la marca del Vehiculo: ");
        pers.setMarca(br.readLine());
        System.out.println("Ingrese el color del Vehiculo: ");
        pers.setColor(br.readLine());
        System.out.println("Ingrese el modelo del Vehiculo: ");
        pers.setModelo(Integer.parseInt(br.readLine()));
        System.out.println("Ingrese el precio del Vehiculo: ");
        pers.setPrecio(Float.parseFloat(br.readLine()));
        System.out.println("Ingrese la cantidad a registrar: ");
        pers.setCantidad(Integer.parseInt(br.readLine()));
        System.out.println("Ingrese codigo Personalizado: ");
        pers.setCodPersonalizado(Integer.parseInt(br.readLine()));
        System.out.println("Ingrese el tipo de Rines: ");
        pers.setTipoRines(br.readLine());
        System.out.println("Ingrese tipo de polarizado: ");
        pers.setTipoPolarizado(br.readLine());
        System.out.println("Ingrese el color del Neon: ");
        pers.setColorNeon(br.readLine());
        vehiculo5.add(pers);
    }
    
    /**
     * description: metodo para imprimir los datos del ArrayList<Deportivos>
     * @param vehiculo2 
     */
    public static void imprimirDeportivos(ArrayList <Deportivos> vehiculo2){
        
        if(vehiculo2.isEmpty()){
            System.out.println("No hay autos Deportivos Registrados!!");
        }else{
        for(Deportivos depor : vehiculo2){
            
            System.out.println("Codigo: " + depor.getCodVehiculo() + 
                    "\nMarca:" + depor.getMarca() + 
                    "\nColor: " + depor.getColor() + 
                    "\nModelo: " + depor.getModelo() + 
                    "\nPrecio: " + depor.getPrecio() + 
                    "\nCantidad: " + depor.getCantidad() +
                    "\nCodigo Deportivo: " + depor.getCodDeportivo() +
                    "\nCilindraje: " + depor.getCilindraje() +
                    "\nNumero Pasajeros: " + depor.getNumPasajeros() +
                    "\nSegmento: " + depor.getSegmento());
        }//for
        }//else
    }//imprimirDeportivos
    
    /**
     * @description: metodo para imprimir los datos del ArrayList<Estandar>
     * @param vehiculo3 
     */
    public static void imprimirEstandar(ArrayList <Estandar> vehiculo3){
        
        if(vehiculo3.isEmpty()){
            System.out.println("No hay autos Estandar Registrados!!!");
        }else{
        for(Estandar estand : vehiculo3){
            
            System.out.println("Codigo: " + estand.getCodVehiculo() + 
                    "\nMarca:" + estand.getMarca() + 
                    "\nColor: " + estand.getColor() + 
                    "\nModelo: " + estand.getModelo() + 
                    "\nPrecio: " + estand.getPrecio() + 
                    "\nCantidad: " + estand.getCantidad() + 
                    "\nCodigo Vehiculo Estandar: " + estand.getCodEstandar() + 
                    "\nTipo de Transmision: " + estand.getTipoTransmision() +
                    "\nNumero del Motor: " + estand.getNumMotor() +
                    "\nNumero del Chasis: " + estand.getNumeroChasis());
    }//for
        }//else
        
    }//imprimirEstandar
    
    /**
     * @description: metodo para imprimir los datos del ArrayList<Mpesada>
     * @param vehiculo4 
     */
    public static void imprimirPesada(ArrayList <Mpesada> vehiculo4){
        if(vehiculo4.isEmpty()){
            System.out.println("No hay auntos de Maquinaria Pesada Registrados!!");
        }else{
            for(Mpesada pesada : vehiculo4){
            
            System.out.println("Codigo: " + pesada.getCodVehiculo() + 
                    "\nMarca:" + pesada.getMarca() + 
                    "\nColor: " + pesada.getColor() + 
                    "\nModelo: " + pesada.getModelo() + 
                    "\nPrecio: " + pesada.getPrecio() + 
                    "\nCantidad: " + pesada.getCantidad() +
                    "\nCodigo MPesada: " + pesada.getCodmPesada() + 
                    "\nTipo: " + pesada.getTipo() + 
                    "\nClasificacion: " + pesada.getClasificacion() + 
                    "\n/////////////////////////////");
            }//for
        }//else
    }//imprimirPesada
    
    /**
     * @description: Metodo para imprimir los daots del ArrayList<Personalizados>
     * @param vehiculo5 
     */
    public static void imprimirPersonalizados(ArrayList <Personalizados> vehiculo5){
        if(vehiculo5.isEmpty()){
            System.out.println("No hay vehiculos Personalizados Registrados!!");
        }else{
            for(Personalizados pers : vehiculo5 ){
                System.out.println("Codigo: " + pers.getCodVehiculo() + 
                        "\nMarca: " + pers.getMarca() + 
                        "\nColor: " + pers.getColor() + 
                        "\nModelo: " + pers.getModelo() + 
                        "\nPrecio: " + pers.getPrecio() + 
                        "\nCantidad: " + pers.getCantidad() + 
                        "\nCodigo Personalizado: " + pers.getCodPersonalizado() + 
                        "\nTipo Rines: " + pers.getTipoRines() + 
                        "\nTipo Polarizado: " + pers.getTipoPolarizado() + 
                        "\nColor de Neon: " + pers.getColorNeon());
            }//for
        }//else
    }//imprimirPersonalizados
    
    /**
     * @description: metodo que ingresa datos por default a la lista de vehiculos estandar
     * @param vehiculo3 
     */
    public static void estandarQuemados(ArrayList <Estandar> vehiculo3){
        
        Estandar es1 = new Estandar();
        es1.setCodVehiculo(1);
        es1.setMarca("Chevrolet");
        es1.setColor("Negro");
        es1.setModelo(2019);
        es1.setPrecio(200000);
        es1.setCantidad(3);
        es1.setCodEstandar(1111);
        es1.setTipoTransmision("Automatica");
        es1.setNumMotor(9897);
        es1.setNumeroChasis(5678);
        vehiculo3.add(es1);
        
        Estandar es2 = new Estandar();
        es2.setCodVehiculo(2);
        es2.setMarca("KIA");
        es2.setColor("Blanco");
        es2.setModelo(2018);
        es2.setPrecio(300000);
        es2.setCantidad(5);
        es2.setCodEstandar(2222);
        es2.setTipoTransmision("Manual");
        es2.setNumMotor(9894);
        es2.setNumeroChasis(5571);
        vehiculo3.add(es2);
        
        Estandar es3 = new Estandar();
        es3.setCodVehiculo(3);
        es3.setMarca("FORD");
        es3.setColor("Azul");
        es3.setModelo(2020);
        es3.setPrecio(100000);
        es3.setCantidad(2);
        es3.setCodEstandar(3333);
        es3.setTipoTransmision("Automatica");
        es3.setNumMotor(9227);
        es3.setNumeroChasis(1278);
        vehiculo3.add(es3);   
    }//estandarQuemados
    
    /**
     * @description: metodo para ingresar por default datos en la lista de vehiculos deportivos
     * @param vehiculo2 
     */
    public static void deportivosQuemados(ArrayList <Deportivos> vehiculo2){
        
        Deportivos depor1 = new Deportivos();
        depor1.setCodVehiculo(12);
        depor1.setMarca("Lamborgini");
        depor1.setColor("Amarillo");
        depor1.setModelo(2020);
        depor1.setPrecio(250000);
        depor1.setCantidad(6);
        depor1.setCodDeportivo(1212);
        depor1.setCilindraje("1500");
        depor1.setNumPasajeros(2);
        depor1.setSegmento("A");
        vehiculo2.add(depor1);
        
        Deportivos depor2 = new Deportivos();
        depor2.setCodVehiculo(14);
        depor2.setMarca("AUDI");
        depor2.setColor("Rojo");
        depor2.setModelo(2020);
        depor2.setPrecio(450000);
        depor2.setCantidad(3);
        depor2.setCodDeportivo(1313);
        depor2.setCilindraje("1600");
        depor2.setNumPasajeros(2);
        depor2.setSegmento("C");
        vehiculo2.add(depor2);
        
        Deportivos depor3 = new Deportivos();
        depor3.setCodVehiculo(14);
        depor3.setMarca("Ferrary");
        depor3.setColor("Negro");
        depor3.setModelo(2020);
        depor3.setPrecio(350000);
        depor3.setCantidad(2);
        depor3.setCodDeportivo(1414);
        depor3.setCilindraje("1200");
        depor3.setNumPasajeros(4);
        depor3.setSegmento("B");
        vehiculo2.add(depor3);  
    }//deportivosQuemados
    
    /**
     * @description: metodo para ingresar por default datos en la lista de maquinaria pesada
     * @param vehiculo4 
     */
    public static void mPesadaQuemados(ArrayList <Mpesada> vehiculo4){
        
        Mpesada pes1 = new Mpesada();
        pes1.setCodVehiculo(21);
        pes1.setMarca("CAT");
        pes1.setColor("Amarillo");
        pes1.setModelo(2019);
        pes1.setPrecio(120000);
        pes1.setCantidad(2);
        pes1.setCodmPesada(2121);
        pes1.setTipo("Retroexcavadora");
        pes1.setClasificacion("Pesada");
        vehiculo4.add(pes1);
        
        Mpesada pes2 = new Mpesada();
        pes2.setCodVehiculo(22);
        pes2.setMarca("CAT");
        pes2.setColor("Amarillo");
        pes2.setModelo(2018);
        pes2.setPrecio(220000);
        pes2.setCantidad(1);
        pes2.setCodmPesada(2222);
        pes2.setTipo("Aplanadora");
        pes2.setClasificacion("Pesada");
        vehiculo4.add(pes2);
        
        Mpesada pes3 = new Mpesada();
        pes3.setCodVehiculo(23);
        pes3.setMarca("CAT");
        pes3.setColor("Amarillo");
        pes3.setModelo(2019);
        pes3.setPrecio(122000);
        pes3.setCantidad(2);
        pes3.setCodmPesada(2323);
        pes3.setTipo("Retroexcavadora");
        pes3.setClasificacion("Semi-Pesada");
        vehiculo4.add(pes3); 
    }//mPesadaQuemados
    
    /**
     * @description: metodo para ingresar por default datos en la lista de vehiculos personalizados
     * @param vehiculo5 
     */
    public static void personalizadosQuemados(ArrayList <Personalizados> vehiculo5){
        
        Personalizados pers1 = new Personalizados();
        pers1.setCodVehiculo(31);
        pers1.setMarca("Mini Cooper");
        pers1.setColor("Rojo");
        pers1.setModelo(2019);
        pers1.setPrecio(221000);
        pers1.setCantidad(3);
        pers1.setCodPersonalizado(3131);
        pers1.setTipoRines("Rines de lujo Plateados");
        pers1.setTipoPolarizado("Alto");
        pers1.setColorNeon("Azul");
        vehiculo5.add(pers1);
        
        Personalizados pers2 = new Personalizados();
        pers2.setCodVehiculo(31);
        pers2.setMarca("Mini Cooper");
        pers2.setColor("Rojo");
        pers2.setModelo(2019);
        pers2.setPrecio(234000);
        pers2.setCantidad(3);
        pers2.setCodPersonalizado(3131);
        pers2.setTipoRines("Rines de lujo Plateados");
        pers2.setTipoPolarizado("Alto");
        pers2.setColorNeon("Azul");
        vehiculo5.add(pers2);
        
        Personalizados pers3 = new Personalizados();
        pers3.setCodVehiculo(31);
        pers3.setMarca("Mini Cooper");
        pers3.setColor("Rojo");
        pers3.setModelo(2019);
        pers3.setPrecio(250000);
        pers3.setCantidad(3);
        pers3.setCodPersonalizado(3131);
        pers3.setTipoRines("Rines de lujo Plateados");
        pers3.setTipoPolarizado("Alto");
        pers3.setColorNeon("Azul");
        vehiculo5.add(pers3);
    }
    
    /**
     * @description: metodo para calcular el vehiculo estandar mas caro
     * @param vehiculo3 
     */
    public static void estandarMasCaro(ArrayList <Estandar> vehiculo3){
        
        float mayor = 0;
        String marca = "";
        String color = "";
        for(Estandar test : vehiculo3){
            if(test.getPrecio() > mayor){
                mayor = test.getPrecio();      
                marca = test.getMarca();
                color = test.getColor();
            }//if
        }//for
        System.out.println("El auto mas caro es "+marca+" con un precio de: "+mayor+ "de color: " + color );  
    }
    
    /**
     * @description: metodo para calcular el vehiculo deportivo mas caro
     * @param vehiculo2 
     */
    public static void deportivoMasCaro(ArrayList <Deportivos> vehiculo2){
        
        float mayor = 0;
        String marca = "";
        String color = "";
        for(Deportivos test : vehiculo2){
            if(test.getPrecio() > mayor){
                mayor = test.getPrecio();      
                marca = test.getMarca();
                color = test.getColor();
            }//if
        }//for
        System.out.println("El auto mas caro es "+marca+" con un precio de: "+mayor+ "de color: " + color );  
    }
    
    /**
     * @description: metodo para calcular el vehiculo de maquinaria pesada mas caro
     * @param vehiculo4 
     */
    public static void mPesadaMasCaro(ArrayList <Mpesada> vehiculo4){
        
        float mayor = 0;
        String marca = "";
        String color = "";
        for(Mpesada test : vehiculo4){
            if(test.getPrecio() > mayor){
                mayor = test.getPrecio();      
                marca = test.getMarca();
                color = test.getColor();
            }//if
        }//for
        System.out.println("El auto mas caro es "+marca+" con un precio de: "+mayor+ "de color: " + color );
    }
    
    /**
     * @description: metodo para calcular el vehiculo personalizado mas caro
     * @param vehiculo5 
     */
    public static void personalizadoMasCaro(ArrayList <Personalizados> vehiculo5){
        
        float mayor = 0;
        String marca = "";
        String color = "";
        for(Personalizados test : vehiculo5){
            if(test.getPrecio() > mayor){
                mayor = test.getPrecio();      
                marca = test.getMarca();
                color = test.getColor();
            }//if
        }//for
        System.out.println("El auto mas caro es "+marca+" con un precio de: "+mayor+ "de color: " + color );
    }
    
    /**
     * @description: metodo para calcular el vehiculo estandar mas barato
     * @param vehiculo3 
     */
    public static void estandarMasBarato(ArrayList <Estandar> vehiculo3){
        
        float menor = 1999999999;
        String marca = "";
        String color = "";
        for(Estandar test : vehiculo3){
            if(test.getPrecio() < menor){
                menor = test.getPrecio();
                marca = test.getMarca();
                color = test.getColor();
            }//if
        }//for
        System.out.println("El auto mas barato es:  "+marca+" con un precio de:  "+menor+ "de color:  " + color);
    }
    
    /**
     * @description: metodo para calcular el vehiculo deportivo mas barato
     * @param vehiculo2 
     */
    public static void deportivoMasBarato(ArrayList <Deportivos> vehiculo2){
        
        float menor = 1999999999;
        String marca = "";
        String color = "";
        for(Deportivos test : vehiculo2){
            if(test.getPrecio() < menor){
                menor = test.getPrecio();
                marca = test.getMarca();
                color = test.getColor();
            }//if
        }//for
        System.out.println("El auto mas barato es:  "+marca+" con un precio de:  "+menor+ "de color:  " + color);
    }
    
    /**
     * @description: metodo para calcular el vehiculo de maquinaria pesado mas barato
     * @param vehiculo4 
     */
    public static void mPesadaMasBarato(ArrayList <Mpesada> vehiculo4){
        
        float menor = 1999999999;
        String marca = "";
        String color = "";
        for(Mpesada test : vehiculo4){
            if(test.getPrecio() < menor){
                menor = test.getPrecio();
                marca = test.getMarca();
                color = test.getColor();
            }//if
        }//for
        System.out.println("El auto mas barato es:  "+marca+" con un precio de:  "+menor+ "de color:  " + color);
    }
    
    /**
     * @description: metodo para calcular el vehiculo personalizado mas barato
     * @param vehiculo5 
     */
    public static void personalizadoMasBarato(ArrayList <Personalizados> vehiculo5){
        
        float menor = 1999999999;
        String marca = "";
        String color = "";
        for(Personalizados test : vehiculo5){
            if(test.getPrecio() < menor){
                menor = test.getPrecio();
                marca = test.getMarca();
                color = test.getColor();
            }//if
        }//for
        System.out.println("El auto mas barato es:  "+marca+" con un precio de:  "+menor+ "de color:  " + color);
    }
}//Inventario
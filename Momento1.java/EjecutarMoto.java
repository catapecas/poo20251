
import java.util.Scanner;

public class EjecutarMoto {
    // Arreglo para seleccionar parqueadero por cilindraje
    private static Motocicletas[] bajocc = new Motocicletas[20]; // parqueadero para motos de bajo cilindraje.
    private static Motocicletas[] altocc = new Motocicletas[10]; // parqueadero para moto de alto cilindraje .
    //objeto scanner para toma y captura de datos.
    private static Scanner entrada = new Scanner (System.in);
    
    public static void main(String[] args) {
        int opcion;
        // se crea el switch para el menu principal
        do {
            System.out.println("--- menu principal---");
            System.out.println("1. Registrar moto bajo cilindraje");
            System.out.println("2. Registrar moto de alto cilindraje");
            System.out.println("3. Cobro del parqueadero");
            System.out.println("4. mostar estado del parqueadero");
            System.out.println("5. cerrar  la aplicacion ");
            System.out.println("seleccione una opcion");
            opcion = entrada.nextInt();

            switch (opcion) {
                // case= cuando necesito ejecutar diferentes bloques de codigo segun el valor de la variable 
                case 1 :
                  registrarMoto(bajocc,250,"bajo cilindraje");    
                    break;
                case 2:
                  registrarMoto(altocc,400,"alto cilindraje");
                  break;
                case 3:
                  cobrarTarifa();
                  break;
                case 4:
                   mostarEstadoParqueadero();
                   break;
                case 5:
                  System.out.println("cerrar la aplicacion...");
                  break;
                default:
                    System.out.println("opcion no valida. intente de nuevo."); 
            }
            // do while = ciclo de repeticion 
        } while (opcion !=5);
    }
     //se creo Metodo o funcion para registrar una moto
  public static void registrarMoto(Motocicletas[]motos,double cilindrajeLimite, String tipo) {
     System.out.println("---Registro de moto(" + tipo +")---");
     System.out.println("ingrese la placa de la moto:");
     String placa = entrada.next();
     // se ingresa un toUppercase para que pueda leer la placa mayuscula y minuscula
     placa=placa.toUpperCase();

     //verificar si la moto ya esta registrada

     if (buscarMoto(placa) != null) {
        System.out.println("Error la moto con placa " + placa + "ya esta registrada");
        return;
     }
      System.out.println("Ingrese el cilindraje de la moto:");
     double cilindraje = entrada.nextDouble();
     System.out.println("Ingrese la marca de la moto:");
     String marca = entrada.next();

     // validad cilindraje segun el tipo de parqueadero
     if (tipo.equals("bajo cilindraje")) {
        if (cilindraje > 400) {
            System.out.println("Error : esta moto debe registrarse en el parqueadero de alto cilindraje ");
            return;    
        }
        // else = cuando no se cumple una funcion
     } else if (tipo.equals("alto cilindraje")) {
        if (cilindraje < 401) {
            System.out.println("Error: Esta moto debe registrarse en el parqueadeo de bajo cilindraje:");
            return;  
        }
     }
     Motocicletas moto = new Motocicletas(placa, cilindraje, marca,0);
    
      // Mostrar puestos disponibles 
      System.out.println("Puestos disponibles :");
      for (int i = 0; i < motos.length; i++){ 
        /*i = posicion del arreglo dentro del ciclo ,inicia en 0
          moto.length es la cantidad de espacio total en el parqueadero
          */

        if (motos[i]== null) {
            System.out.println((i + 1)+ " ");    
        }
      }
      System.out.println();
     
      // Seleccionar puesto
      System.out.println("seleccione un puesto:");
      int puesto = entrada.nextInt()-1;
      
      // verifiamos que el puesto este dentro del rango permitido 
      // puesto >= a motos.length evita que el usuario indique un numero mayor al pusto total.
      if (puesto < 0 || puesto >= motos.length) {
        System.out.println("Error puesto no valido.");
        // return: si el numero digitado es invalido muestra error y sale de metodo
        return;
      }
      // la condicion comprueba si el puesto esta ocupado,asociandolo a diferente de null muestra error 
      if (motos[puesto] !=null) {
        System.out.println("Error en el puesto" +(puesto + 1)+ "ya esta ocupado.");
        return;
      }
      // Registra la moto en el puesto seleccionado.
       motos[puesto] = moto;
       System.out.println("moto registrada en el puesto" +(puesto + 1) + "ya esta ocupado.");
    }

    // Metodo para cobrar la tarifa
    private static void cobrarTarifa(){
        System.out.println("--- cobro de la tarifa");
        System.out.println("Ingrese la placa de la moto:");
        String placa = entrada.next();

        placa = placa.toUpperCase();
     // llamamos la funcion que recorre los arreglos bajo cc y alto cc para encontrar la moto
     // si la moto exite devuelve el objeto motocicleta
     // si no se encuentra sera null
        Motocicletas moto = buscarMoto(placa);

        // si la moto != null fue encontrada.
        // se solicita el tiempo de estaionamiento en minutos.
        if (moto != null) {
            System.out.println("ingrese el tiempo del estacionamiento en minutos:");
            int tiempo = entrada.nextInt();
             
            // se calcula el valor de la tarifa usando calcularTarifa(tiempo).
            double tarifa = calcularTarifa(tiempo);
            System.out.println("la tarifa a pagar es :$" + tarifa);
         // se llama a liberar puesto(moto) que lo que hace es eliminar del arreglo la moto y deja disponible el puesto.
            liberarPuesto(moto);
        }else{
            // si la moto no es encontrada muestra mensaje error
            System.out.println("moto no encontrada.");
        }
    }

    // Meetodo para calcular la tarifa
    private static double calcularTarifa(int tiempo){
        if (tiempo <= 30) {
            return 0;
        } else if (tiempo <= 60) {
            return 800;
        } else {
            return 2000;
        }
    }

    // Metodo para liberar un puesto,busca en el arreglo bajo cc, si lo encuentra , lo elimina
    private static void liberarPuesto(Motocicletas moto){
        for(int i = 0; i < bajocc.length; i++){
            if (bajocc[i] != null && bajocc[i].getPlaca().equals(moto.getPlaca())) {
                // identifica si el arreglo es = null y libera el puesto
                bajocc[i] = null;
                System.out.println("puesto liberado en el parqueadero de bajo cilindraje");
                return;  
            }
        }

        for( int i = 0; i< altocc.length; i++){
            if(altocc[i] != null && altocc[i].getPlaca().equals(moto.getPlaca())){
                altocc[i] = null;
                System.out.println("puesto liberado en el paqueadero de alto cilindraje");
                return;
            }
        }
    }

    // Metodo mostrar estado del parqueadero
    private static void mostarEstadoParqueadero(){
        System.out.println("---Estado del parqueadero---");
        System.out.println("Bajo cilindraje (20 puestos):");
        for(int i = 0; i < bajocc.length; i++){
            // bajocc [i]==null? si es true = disponible , si false = ocupado.
            System.out.println("puesto" + (i + 1)+ ":" + (bajocc[i]==null? "disponible" : "ocupado"));
        }

        System.out.println("Alto cilindraje (10 puestos):");
        for (int i = 0; i < altocc.length; i++) {
            System.out.println("puesto" + (i + 1)+ ":" + (altocc[i]==null?"disponible" : "ocupado"));     
        }
    }

    // metodo para buscar una moto por su placa
    private static Motocicletas buscarMoto(String placa){
        // recorre el arreglo con un ciclo, si encuentra moto con la misma placa la va a retornar
        for(Motocicletas moto : bajocc){
            if (moto != null && moto.getPlaca().equals(placa)) {
                return moto;
            }
        }

        for(Motocicletas moto : altocc){
            if (moto != null && moto.getPlaca().equals(placa)) {
                return moto;    
            }
        }

        return null;
    } 
}

  
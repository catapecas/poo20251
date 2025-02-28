package Clase4;

public class Vehiculo {
    
    //atributos de la clase
    private String marca;
    private String color;
    private double cilindraje;
    private String chasis;
    private double peso;
    private String potencia;

    /*
     * Constructor de la clase ->permite  inicializar el objeto.
     * El constructor de la clase se reconoce porque tiene el mismo 
     * nombre de la clase 
     */

     public Vehiculo (String marca,String color,double cilindraje,String chasis,
     double peso,String potencia ) {

        this.marca = marca;
        this.color = color;
        this.cilindraje = cilindraje;
        this.chasis = chasis ;
        this.peso = peso;
        this.potencia = potencia;

     }
     // metodo getter/setter

     public String getMarca(){
        return marca;

     }

     public void setMarca( String marca){
        this.marca = marca ;

     }
        

        // permite mostrar el objetivo

     public String toString(){

            return " vehiculo { Marca:" + marca + ", color: "+ color +", cilindraje:"+ cilindraje
        + "chasis:" + chasis + ", peso:"+ peso + ",potencia: " + potencia + " }";

     }

        
        // Metodos de la clase

        public void acelerar(){

            System.out.println("Vehiculo acelerando...");
        }
        public void frenar(){
            System.out.println("vehiculo frenado...");
        }

        public void girarIzquierda(){
            System.out.println("vehiculo girando a la izquierda...");
        }
        public void girarDerecha(){
            System.out.println("vehiculo girando a la derecha...");

        }

        public void retroceder(){
            System.out.println("vehiculo retrocediendo...");
        }
     }



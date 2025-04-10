public class Camara extends Producto {

    //Atributos
    private String marca;
    private String modelo;
    private double codigo;    


  // constructor
    public Camara (int numero, String marca, String modelo, double codigo, double ancho, double alto,
      String nombre, String referencia){
      super(numero, nombre, referencia, ancho, alto);
     this.marca = marca;
     this.modelo = modelo;
     this.codigo = codigo;
    }


}
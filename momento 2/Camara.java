public class Camara extends Producto {

    //Atributos
    private String marca;
    private String modelo;
    private double codigo;    
}

  // constructor
  public Camara (String marca, String modelo, double codigo){
    super(getNumero(), marca, modelo, codigo, codigo)
    this.marca = marca;
    this.modelo = modelo;
    this.codigo = codigo;
  }

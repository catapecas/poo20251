public class Impresion extends Producto {

    // Atributos

    private String color;
    private Foto[] foto; // Arreglo de la foto

    // Constructor
    public Impresion(String color, Foto[] foto) {
        this.color = color;
        this.foto = foto;
    }

    // Metodos
    // get lo uso para retornar informacion puntual
    public String getColor() {
        return color;
    }

    public Foto[] getFoto() {
        return foto;
    }
    // set lo uso para modificar la info , color.
    // metodos set y get se realizan solo a los atributos.

    public void setColor(String color) {
        this.color = color;
    }

    public void setFoto(Foto[] foto) {
        this.foto = foto;
    }
      // toSTring es un metodo que se usa para mostrar la info de la clase

    public String toString() {
        return "Impresion{" +
                "color='" + color + '\'' +
                ", foto=" + java.util.Arrays.toString(foto) +
                '}';
    }
}

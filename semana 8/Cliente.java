public class Cliente {

    private long cedula;
    private String nombre;
    public cliente(long cedula, String nombre){
        this.cedula= cedula;
        this.nombre=nombre;

    }

    public String toString(){
        return "cliente{ cedula :" + cedula + "nombre:" + nombre + "}";
    }
}
public class Cliente {

    private long cedula;
    private String nombre;
    public Cliente(long cedula, String nombre){
        this.cedula= cedula;
        this.nombre=nombre;

    }

    public String toString(){
        return "cliente{ cedula :" + cedula + "nombre:" + nombre + "}";
    }

    public String getNombre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }

    public String getCedula() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCedula'");
    }
}
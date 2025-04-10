public class Cliente {

    // Atributos
    private String cedula;
    private String nombre;
    private int numeroTelefono;
    private String correoEletronico;

    // constructor

    public Cliente(String cedula, String nombre, int numeroTelefono, String correoElectronico) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.correoEletronico = correoElectronico;
    }

    // metodos
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getCorreoEletronico() {
        return correoEletronico;
    }

    public String toString() {
        return "Cliente [" +
                "Cedula: " + cedula + '\'' +
                ", Nombre: " + nombre + '\'' +
                ", NumeroTelefono: " + numeroTelefono + '\'' +
                ", CorreoElectronico: " + correoEletronico + '\'' +
                ']';
    }

}

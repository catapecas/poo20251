public class Cliente {

    // Atributos
    private int cedula;
    private String nombre;
    private String numeroTelefono;
    private String correoEletronico;

    // constructor

    public Cliente(int cedula, String nombre, String numeroTelefono, String correoElectronico) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.correoEletronico = correoElectronico;
    }

    // metodos
    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getCorreoEletronico() {
        return correoEletronico;
    }

    // Setters (opcional, si necesitas modificar los valores)
    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoEletronico = correoElectronico;
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

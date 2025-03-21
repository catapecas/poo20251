package semana 7;

public class Trabajador {

    // Atributos 
    private int idtrabajador;
    private String nombre;
    private String apellido;

    //constructor = mismo nombre de la clase 
    public Trabajador(int idtrabajador,String nombre ,String apellido){
        this.idtrabajador = idtrabajador;
        this.nombre = nombre;
        this.apellido = apellido;

    }
    // metodos getter
    public String getNombre(){
        return nombre;

    }

    public String getApellido(){
        return apellido;
    }

    public int getIdtrabajador(){
        return idtrabajador;

    }

    public double pagar(){
        return 0.0;
    }


    public String toString(){
        return"Trabajador { idtrabajador:" + idtrabajador +
              "Nombre:" + nombre +
            " Apellidos: "+ apellido +"}";
    }
    


    
}

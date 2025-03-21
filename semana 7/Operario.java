
import javax.print.DocFlavor.STRING;


public class Operario extends Trabajador {
    
    private double horas;
    public final double SALARIO_BASE = 1000; // las constantes vasn en mayuscula 


     // constructor--> Hereda de la superclase idtrabajador, nombre ,apellido.
    public Operario(int idtrabajador, String nombre, String apellido, Double horas){
        super (idtrabajador, nombre, apellido);
        this.horas = horas;
    }

    public double pagar(){
        return SALARIO_BASE *horas;
    }

    public String toString(){
        return"Operario { idTrabajador: " + super.getIdtrabajador() +
         "Nombre:" + super.getNombre() + 
         "Apellido:" + super.getApellido() +
         "Horas Laboradas:" + horas + "}";

    }

    
}

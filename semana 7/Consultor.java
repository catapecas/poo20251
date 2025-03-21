
public class Consultor extends Trabajador {

   private double comision;
   public final double SALARIO_BASE = 3500.0; // constante

   public Consultor(int idTrabajador, String nombre, String apellido, Double comision){
      super(idTrabajador, nombre, apellido);
      this.comision = comision;

   }
   public double pagar(){
      return SALARIO_BASE + (SALARIO_BASE * (comision/100)); 
      
  }

  public String toString() {
      return "Consultor { idTrabajador: " + super.getIdtrabajador() +
       "Nombre:" + super.getNombre() + 
       "Apellido:" + super.getApellido() +
       "comision:" + comision + "}";

  }

  
}





    

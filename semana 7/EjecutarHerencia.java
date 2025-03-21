import semana.Trabajador;

public class EjecutarHerencia {

    public static void main(String[] args) {
        
        //creacion de los abjetos (Instanciar)
        Trabajador objT1 = new Operario (1, "pepito", "puertas", 135.0);
        Trabajador objT2 = new Consultor (2, "juan", "Islas", 10);

        System.out.println(objT1);
        System.out.println(objT2);

        for ( Trabajador x: t){
            System.out.println(x.getClass() + " - " + x.pagar());

            
        }
    }
    
}

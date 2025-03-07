
import java.util.Scanner;

public class EjecutarMoto{
    public static void main(String[] args) {

            Motocicletas bajocc[] = new Motocicletas[20];
            Motocicletas altocc[] = new Motocicletas[10];

            String marca;
            String placa;
            double cilindraje;
            
            Scanner entrada = new Scanner(System.in);

            int opcion;

        do {
            System.out.println("menu principal");
            System.out.println("1 registro motos bajo cilindraje");
            System.out.println("2 registro motos altos cilindraje");
            System.out.println("3 cobro del parqueadero");
            System.out.println(" 4 cerrar la aplicacion");
            System.out.println("5 seleccionar una opcion");
            
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("ingrese por favor su placa:");
                    placa = entrada.next();
                    System.out.println("ingrese por favor el cilindraje de su moto:");
                    cilindraje= entrada.nextDouble();
                    System.out.println("ingrese por favor la marca de su motocicleta :");
                    marca = entrada.next();

                break;

                case 2 :

                    System.out.println("Accediendo al menu de cobros del parqueadero... ");

                break;
                    
                case 3: System.out.println(" cerrar la aplicacion...");
            
                break;
            }
        } while (true);


    }
}    
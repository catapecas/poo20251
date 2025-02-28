import java.util.Scanner;

public class punto15 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        // solicitar numero de trabajadores
      System.out.println("ingrese la cantidad de trabajadores");
      int n = scanner.nextInt();
      scanner.nextLine();

      // Arreglos para almacenar nombres y sueldos 
      String[] nombre= new String[n];
      double[] sueldos = new double[n];

      // ingresar datos de los trabajadores

      for(int i = 0; i<n; i++){
        System.out.println("ingresar el nombre del trabajador" +(i+1)+":");
        sueldos[i]= scanner.nextLine();

        System.out.println("Ingrese el sueldo de"+ nombre[i]+":");
        sueldos[i] = scanner.nextDouble();
        scanner.nextLine()
      }

      // calcular el sueldo promedio
      double sumaSueldo = 0 ;
      for (double sueldo : sueldos) {
        sumaSueldo +=sueldo;

      }

      double sueldoPromedio = sumaSueldo

      // mostrar el resultado

    System.out.println("\nEl sueldo promedio es : % 2 f\n", sueldoPromedio);
    if (trabajadoresPromedio.isEmpty()) {
        System.out.println("ningun trabajador tiene el sueldo promedio");
    } else{

        System.out.println("trabajadores con el dueldo promedio");
        for (String nombre: trabajadoresPromedio){
            System.out.println("-"+ nombre);
        }
        
    }

    scanner.close();

    }
}

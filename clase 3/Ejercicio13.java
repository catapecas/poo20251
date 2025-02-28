public class Ejercicio13 {
    public static void main(String[] args) {
        /*
        *Dado  un arreglo A de N, almacenar los elementos mayores y menores 
        *que ñla media , almacenarlos en arreglos diferentes.
        *
        *Analisis: necesitamos crear el arreglo de tamaño aleatorio y generar numero         *
        *aleatorios para que sean almacenados en el arreglo , posteripormente obtenemos 
        *la media del arreglo y comparamos cada posicion del arreglo patra determonar 
        *si es mayor o menos a la media 
        */

        //n sera el numero aleatorio hasta el tamaño del arreglo


        int n= (int) (Math.random() * (15 - 5 )) +5;

        //Declarar el arreglo 
        int[] a = new int[n];

        //llenar el arreglo
        for(int i= 0; i < a.length; i++) {
            a[i]= (int) (Math.random() * (50 - 0 )) + 0;

        }
        //calcular la media del arreglo
        //declarar una variable que almacene la suma del arreglo
        int sumaArreglo =0;
        for(int i= 0 ; i < a.length; i++) {
            sumaArreglo += a[i];
        }
        double media =sumaArreglo / ( double) a.length;
        System.out.println("la media del arreglo es " + media);

        //definir la cantidad de elementos que tiene el arreglo por encima de la media 
        // y por debajo de la media;

        int contadorMayorMedia = 0, contadorMenorMedia =0;

        for(int i = 0; i < a.length; i++){
            if (a[i] >= media) {
                contadorMayorMedia++;

            }else{
                contadorMenorMedia++;

            }
        }
        //creacion de los arreglos que almacenaran los numeros mayores y menores 
        // a la media 
        int[] mayores = new int[contadorMayorMedia];
        int[] menores = new int[ contadorMenorMedia];

        int posMayores = 0, posMenores = 0;

        for (int i =0; i < a.length; i++) {
            if (a[i] >= media) {
                mayores[posMayores] = a[i];
                posMayores++;

            }else{
                menores[posMenores]= a[i];
                posMenores++;

            }
        }
        // mostrar el arreglo de los mayores a la media 

        System.out.print("elementos mayores o iguales a la media ");
        for( int i =0 ; i < mayores.length; i++) {
            System.out.println(mayores[i]+" ");
        }
    System.out.println();

        // mostrar el arreglo de los menores a la media
        System.out.println("Elementos menores que la media ");

        for (int i= 0; i < menores.length; i++) {

         System.out.println( menores[i] + " "); 

        }
     
        System.out.println();

    }
    
}

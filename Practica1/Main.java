package Practica1;

public class Main {
    public static void main(String[] args) {
        // Crear dos estudiantes
        Estudy estudiante1 = new Estudy("Ana", 20, 8.5);
        Estudy estudiante2 = new Estudy("Luis", 22, 5.0);

        // Mostrar información del primer estudiante
        estudiante1.mostrarInformacion();
        System.out.println("¿Aprobó? " + (estudiante1.aprobo() ? "Sí" : "No"));
        System.out.println();

        // Mostrar información del segundo estudiante
        estudiante2.mostrarInformacion();
        System.out.println("¿Aprobó? " + (estudiante2.aprobo() ? "Sí" : "No"));
    }
}


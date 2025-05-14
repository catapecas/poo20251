package momento3;
 
import java.util.Scanner;
public class JuegoLucha {
    private Personaje jugador1;
    private Personaje jugador2;
 
    public JuegoLucha(Personaje p1, Personaje p2) {
        this.jugador1 = p1;
        this.jugador2 = p2;
    }
 
    public void iniciarPelea() {
        System.out.println("\n¡Comienza la pelea entre " + jugador1.getNombre() + " y " + jugador2.getNombre() + "!\n");
 
        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2);
            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }
 
        if (jugador1.estaVivo()) {
            System.out.println("\n🏆 " + jugador1.getNombre() + " ha ganado la pelea.");
        } else {
            System.out.println("\n🏆 " + jugador2.getNombre() + " ha ganado la pelea.");
        }
    }
 
   private void turno(Personaje atacante, Personaje defensor) {
    Scanner scanner = new Scanner(System.in);
 
    System.out.println("--------------------------------------------------");
    System.out.println("Turno de " + atacante.getNombre());
    System.out.println(defensor.getNombre() + " tiene " + defensor.getPuntosDeVida() + " puntos de vida.");
 
    System.out.println("¿Qué desea hacer?");
    System.out.println("1. Atacar");
    System.out.println("2. Tirar hechizo");
    System.out.print("Opción: ");
    int opcion = scanner.nextInt();
    scanner.nextLine(); // limpiar Enter
 
    switch (opcion) {
        case 1:
            atacante.atacar(defensor);
            break;
        case 2:
            // Solo el mago tiene hechizo
            if (atacante instanceof Mago) {
                ((Mago) atacante).atacar(defensor); // Usa su hechizo (daño más alto)
            } else {
                System.out.println("¡" + atacante.getNombre() + " no es un mago! Se realiza un ataque normal.");
                atacante.atacar(defensor);
            }
            break;
        default:
            System.out.println("Opción inválida. Se realizará un ataque normal.");
            atacante.atacar(defensor);
            break;
    }
 
    System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getPuntosDeVida() + " puntos de vida.");
    System.out.println("Presiona Enter para continuar...");
    scanner.nextLine();
    System.out.println("--------------------------------------------------\n");
}

    public static Personaje crearPersonaje(String tipo, String nombre) {
        if (tipo.equalsIgnoreCase("guerrero")) {
            return new Guerrero(nombre);
        } else if (tipo.equalsIgnoreCase("mago")) {
            return new Mago(nombre);
        } else {
            System.out.println("Tipo no válido, se asignará Guerrero por defecto.");
            return new Guerrero(nombre);
        }
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Jugador 1 - Ingresa tu nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Jugador 1 - ¿Quieres ser Guerrero o Mago? ");
        String tipo1 = scanner.nextLine();
        Personaje jugador1 = crearPersonaje(tipo1, nombre1);
 
        System.out.print("Jugador 2 - Ingresa tu nombre: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Jugador 2 - ¿Quieres ser Guerrero o Mago? ");
        String tipo2 = scanner.nextLine();
        Personaje jugador2 = crearPersonaje(tipo2, nombre2);
 
        JuegoLucha juego = new JuegoLucha(jugador1, jugador2);
        juego.iniciarPelea();
 
        scanner.close();
    }
}
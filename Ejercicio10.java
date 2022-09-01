
// Crear un programa que simule un juego de dados. Cada jugador
// lanza 2 dados. Se juega con la computadora y gana el que tenga la
// mayor suma de los resultados. El programa debe ser iterativo
import java.util.*;

public class Ejercicio10 {
    // Variables que sumaran los puntos que obtienen los jugadores en cada
    // lanzzamiento
    static int puntosJugador = 0, puntosComputadora = 0;

    public static void main(String[] args) {
        int dado1, dado2, suma1, suma2, i = 0;
        do {
            i++;
            System.out.println("INTENTO N° " + i);
            dado1 = numAletorio();
            dado2 = numAletorio();
            suma1 = dado1 + dado2;
            System.out.println("* Lanzamiento del jugador;\n" + "Primer dado: " + dado1 + "\nSegundo dado: " + dado2);
            dado1 = numAletorio();
            dado2 = numAletorio();
            suma2 = dado1 + dado2;
            System.out.println("* Lanzamiento de la computadora;\n" + "Primer dado: " + dado1 + "\nSegundo dado: " + dado2);
            ganador(suma1, suma2); // Muestra el ganador del lanzamiento
            System.out.println("MARCADOR: \n- Jugador: " + puntosJugador + "\n- Computadora: " + puntosComputadora);
        } while (continuarJuego() == 1);
        if (puntosComputadora != puntosJugador) {
            System.out.print("Tenemos un ganador... ");
            ganador(puntosJugador, puntosComputadora);  // Muestra el ganador del juego
        } else {
            System.out.println("El juego fue empatado.");
        }
    }

    // Retorna un numero aleatorio de un dado
    public static int numAletorio() {
        return (int) (Math.random() * (6) + 1);
    }

    // Compara las sumas y muestra al ganador de la suma de dos puntajes
    public static void ganador(int suma1, int suma2) {
        // No se sumara puntos si hubo empate
        if (suma1 > suma2) {
            puntosJugador += 1;
            System.out.println("Ganó el jugador.");
        } else if (suma2 > suma1) {
            puntosComputadora += 1;
            System.out.println("Ganó la computadora.");
        }
    }

    // Pregunta si desea continuar jugando
    public static int continuarJuego() {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Desea intentarlo de nuevo?\nPresione 1 para continuar otro numero para salir...");
        scan.close(); //******************OJO****************** */
        return scan.nextInt();
    }
}

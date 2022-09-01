
// Realizar un juego donde se configure la cantidad de turnos y el nivel de dificultad; luego para jugar, el programa genera por turno un
// aleatorio entre 1 y el nivel de dificultad especificado (ej. 5) y el jugador trata de adivinarlo, a cada coincidencia entre ambos se va
// aumentando el score a favor del jugador, de lo contrario a favor de la computadora. Para cada turno ir mostrando el score. Al finalizar el
// juego, realizar el informe final con el score, indicar quién ganó, nivel de dificultad y cantidad de turnos del juego. Crear los métodos
// convenientes.
import java.util.*;

public class Ejercicio12 {
    static int puntajeJugador = 0, puntajeComputadora = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nivelDif, numAdiv, numAleatorio, i = 0;
        char continuar;

        System.out.print("Bienvenido(a), ingrese el nivel de dificultad: ");
        nivelDif = scan.nextInt();
        do {
            i++;
            numAleatorio = generarNumRango(nivelDif);
            numAdiv = 0;
            for (; numAdiv < 1 || numAdiv > nivelDif;) {
                System.out.print(">>> TURNO " + i + "\nAhora debe adivinar el numero generado aleatoriamente entre [1, "
                        + nivelDif + "]: ");
                numAdiv = scan.nextInt();
            } // El bucle se repite si el numero adivinado esta fuera del rango establecido
            System.out.println("* La computadora eligio el numero: " + numAleatorio);
            contadorPuntos(numAdiv, numAleatorio);
            mostrarScore(puntajeJugador, puntajeComputadora);
            System.out.println("¿Desea continuar?\nPresione 's' para continuar otra letra para salir...");
            continuar = scan.next().charAt(0); // Determina si continua jugando o no
        } while (continuar == 's' || continuar == 'S');        
        System.out.println(">>> INFORME FINAL");
        mostrarScore(puntajeJugador, puntajeComputadora);
        mostrarGanador("computadora", puntajeComputadora, "jugador", puntajeJugador);
        System.out.println("El nivel de dificultad fue " + nivelDif + " y se jugaron " + i + " turnos.");
        scan.close();
    }
    // Genera un numero aleatorio de un rango [1, #]]
    public static int generarNumRango(int num) {
        return (int) (Math.random() * (num - 1 + 1) + 1);
    }
    // Realiza el conteo de puntos del jugador y computadora
    public static void contadorPuntos(int num1, int num2) {
        if (num1 == num2) {
            puntajeJugador++;
        } else {
            puntajeComputadora++;
        }
    }
    // Muestra el marcador
    public static void mostrarScore(int puntaje1, int puntaje2) {
        System.out.println("MARCADOR:\n- Jugador: " + puntajeJugador + "\n- Computadora: " + puntajeComputadora);
    }
    // Muestra al ganador de dos
    public static void mostrarGanador(String a, int puntajeA, String b, int puntajeB) {
        if (puntajeA > puntajeB) {
            System.out.println("+ Ganó: " + a.toUpperCase());
        } else if (puntajeA < puntajeB) {
            System.out.println("+ Ganó: " + b.toUpperCase());
        } else {
            System.out.println("- Empataron");
        }
    }
}

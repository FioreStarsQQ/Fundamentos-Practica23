
// Realizar un programa que indique si el número ingresado es par o
// impar. 2 versiones: método muestra y método retorna
import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero: ");
        numero = scan.nextInt();
        scan.close();
        System.out.println("PRIMERA VERSIÓN: Usando un metodo de muestra.");
        mostrarParImpar(numero);
        System.out.println("SEGUNDA VERSIÓN: Usando un metodo con retorno.");
        System.out.println(parImpar(numero));
    }

    // Metodo que muestra si un numero es par o impar
    public static void mostrarParImpar(int num) {
        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es par.");
        } else {
            System.out.println("El numero " + num + " es impar.");
        }
    }

    // Metodo que retorna la clasificacion del numero
    public static String parImpar(int num) {
        if (num % 2 == 0) {
            return "Par";
        }
        return "Impar";
    }
}

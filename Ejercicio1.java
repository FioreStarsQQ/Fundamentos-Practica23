// Programa donde se muestre un par ordenado con el formato (a, b).
// Método muestra

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1, y1;
        System.out.println("Ingrese un numero: ");
        x1 = scan.nextDouble();
        System.out.println("Ingrese un numero: ");
        y1 = scan.nextDouble();
        scan.close();
        System.out.println("El par ordenado es:");
        mostrarCoordenada(x1, y1);
    }

    public static void mostrarCoordenada(double x, double y) {
        System.out.println("(" + x + ", " + y + ")");
    }
}
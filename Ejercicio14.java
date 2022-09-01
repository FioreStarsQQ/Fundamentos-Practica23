
// Crear un programa que calcule el fibonacci de un número.
// Método fibonacci recursivo 
import java.util.*;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un numero: ");
        num = scan.nextInt();
        System.out.print("Fibonacci del termino " + num + ": ");
        System.out.println(fibonacciRecursivo(num));
        scan.close();
    }

    // Muestra la suma del termino ingreado con el anterior
    public static int fibonacciRecursivo(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else if (num > 1) {
            return fibonacciRecursivo(num - 1) + fibonacciRecursivo(num - 2);
        } else {
            System.out.println("No se pudo realizar el calculo.");
            return 0;
        }
    }
}
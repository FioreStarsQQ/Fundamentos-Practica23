
// Crear un programa que calcule el fibonacci de un número.
// Método fibonacci iterativo
import java.util.*;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un numero: ");
        num = scan.nextInt();
        System.out.print("Fibonacci hasta el numero " + num + ": ");
        fibonacciIterativo1(num);
        System.out.print("Fibonacci de " + num + " terminos: ");
        fibonacciIterativo2(num);
        scan.close();
    }

    // Muestra la sucesion hasta que sea igual o menor al numero ingresado
    public static void fibonacciIterativo1(int num) {
        int anterior = 0, reciente = 0, nuevo = 1;
        if (num > 0) {
            for (; nuevo <= num;) {
                System.out.print(reciente + (", "));
                anterior = reciente;
                reciente = nuevo;
                nuevo += anterior;
            }
            System.out.println(reciente);
        } else {
            System.out.println("No se pudo realizar el calculo.");
        }
    }

    // Muestra la sucesion fibonacci de n terminos
    public static void fibonacciIterativo2(int num) {
        int anterior = 0, reciente = 0, nuevo = 1;
        if (num > 0) {
            for (int i = 1; i < num; i++) {
                System.out.print(reciente + (", "));
                anterior = reciente;
                reciente = nuevo;
                nuevo += anterior;
            }
            System.out.println(reciente);
        } else {
            System.out.println("No se pudo realizar el calculo.");
        }
    }
}

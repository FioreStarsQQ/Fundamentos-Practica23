
// Programa con un método que tome como argumentos un número
// real: x, un número entero: n, y calcule x elevado a la n. Sin pow().
// Versión iterativa y recursiva
import java.util.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x;
        int y;
        System.out.print("Ingrese un numero (base): ");
        x = scan.nextDouble();
        System.out.print("Ingrese un numero (exponente): ");
        y = scan.nextInt();
        scan.close();
        System.out.println("VERSION ITERATIVA: " + potencia(x, y));
        System.out.println("VERSION RECURSIVA: " + potenciaRecursiva(x, y));
    }

    public static double potencia(double base, int expon) {
        double potencia = 1;
        if (expon == 0) {
            return 1;
        } else {
            for (int i = 1; i <= expon; i++) {
                potencia *= base;
            }
            return potencia;
        }
    }

    public static double potenciaRecursiva(double base, int expon) {
        if (expon == 0) {
            return 1;
        } else {
            return base *= potenciaRecursiva(base, --expon);
        }
    }
}

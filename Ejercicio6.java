
// Escriba un programa que multiplique dos enteros, sólo si el segundo
// de ellos es múltiplo del primero en caso contrario los divida
import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        System.out.print("Ingrese el primer valor: ");
        num1 = scan.nextInt();
        System.out.print("Ingrese el primer valor: ");
        num2 = scan.nextInt();
        scan.close();
        // El segundo numero deberia ser diferente de cero
        if (num2 != 0) {
            System.out.println(condicion(num1, num2));
        } else {
            System.out.println("El segundo numero debe ser diferente de cero.");
        }
    }

    // Retorna el resultado de acuerdo a la condicion
    public static double condicion(int num1, int num2) {
        if (num1 != 0 && num2 % num1 == 0) {
            return (num1 * num2);
        }
        return (num1 * 1.0) / (num2 * 1.0);
    }
}

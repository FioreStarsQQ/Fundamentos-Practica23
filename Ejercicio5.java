
// Realizar un programa que permita ir ingresando diferentes números
// reales hasta que ingrese 0 y que vaya imprimiendo su entero más
// próximo para cada uno. Usar round()
import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numero = 1;
        do {
            System.out.print("Ingrese un numero: ");
            numero = scan.nextDouble();
            if (numero != 0) {
                System.out.println(imprimirEntero(numero));
            }
        } while (numero != 0);
        scan.close();
    }

    // Retorna el entero más proximo de un numero
    public static int imprimirEntero(double num) {
        return ((int) Math.round(num));
    }

}

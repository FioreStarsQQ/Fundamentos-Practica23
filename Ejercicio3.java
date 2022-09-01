
// Realizar un programa que indique la hipotenusa de un triángulo. 2
// versiones: método muestra y método retorna
import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double altura, base;
        System.out.print("Ingrese la altura del triangulo: ");
        altura = scan.nextDouble();
        System.out.print("Ingrese la base del triangulo: ");
        base = scan.nextDouble();
        scan.close();
        System.out.println("PRIMERA VERSION: Mostrando el resultado.");
        mostrarHipotenusa(altura, base);
        System.out.println("SEGUNDA VERSION: Usando un metodo para retornar el valor de la hipotenusa.");
        System.out.println(hipotenusa(altura, base));
    }

    // Metodo para mostrar el valor de la hipotenusa
    public static void mostrarHipotenusa(double h, double b) {
        double hipotenusa;
        hipotenusa = Math.sqrt(Math.pow(h, 2) + Math.pow(b, 2));
        System.out.println("La hipotenusa del triangulo es: " + hipotenusa);
    }

    // Metodo para retornar el valor de la hipotenusa
    public static double hipotenusa(double h, double b) {
        return (Math.sqrt(Math.pow(h, 2) + Math.pow(b, 2)));
    }
}


// Programa donde se muestre un número complejo con el formato
// a + bi. Método muestra, 5+3i, 5-3i, 5
import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numero;

        System.out.println("Ingrese el numero (#+#i): ");
        numero = scan.next();
        scan.close();
        System.out.println("El numero es:");
        formatoNumComplejo(extraerParteReal(numero), extraerParteImaginaria(numero));
    }

    public static double extraerParteReal(String cadenaNum) {
        double a;
        a = Double.parseDouble(cadenaNum.substring(0, cadenaNum.indexOf("+")));
        return a;
    }

    public static double extraerParteImaginaria(String cadenaNum) {
        double b;
        b = Double.parseDouble(cadenaNum.substring(cadenaNum.indexOf("+") + 1, cadenaNum.indexOf("i")));
        return b;
    }

    public static void formatoNumComplejo(double real, double imaginario) {
        if (imaginario < 0) {
            System.out.println(real + "-" + (imaginario * -1) + "i");
        } else if (imaginario > 0) {
            System.out.println(real + "+" + imaginario + "i");
        } else {
            System.out.println(real);
        }
    }

}

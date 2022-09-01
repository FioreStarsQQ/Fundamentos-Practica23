
// Realizar un programa que busque la nota menor entre 5 números
// enteros (reutilizar un menor3). Sin usar min()
import java.util.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        System.out.print("Ingrese un numero: ");
        num1 = scan.nextInt();
        System.out.print("Ingrese un numero: ");
        num2 = scan.nextInt();
        System.out.print("Ingrese un numero: ");
        num3 = scan.nextInt();
        System.out.print("Ingrese un numero: ");
        num4 = scan.nextInt();
        System.out.print("Ingrese un numero: ");
        num5 = scan.nextInt();
        scan.close();
        System.out.println(menor3(menor3(num1, num2, num3), num4, num5));
    }

    public static int menor3(int a, int b, int c) {
        if (a < b) {
            if (a > c) {
                return c;
            }
            return a;
        } else {
            if (b > c) {
                return c;
            }
            return b;
        }
    }

}

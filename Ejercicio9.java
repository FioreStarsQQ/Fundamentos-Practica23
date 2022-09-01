
// Realizar un programa que calcule un número aleatorio que
// pertenezca a cualquier rango que se le especifique [m..n]. Que lo
// haga incluso si m>n.
import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m, n;
        System.out.print("Ingrese un valor para delimitar el rango: ");
        m = scan.nextInt();
        System.out.print("Ingrese otro valor para delimitar el rango: ");
        n = scan.nextInt();
        scan.close();
        System.out.println(numAletorio(m, n));
    }
    // Retorna un valor aleatorio del rango [m,n]
    public static int numAletorio(int a, int b) {
        return (int) (Math.random() * (Math.max(a, b) - Math.min(a, b) + 1) + Math.min(a, b));
    }
}

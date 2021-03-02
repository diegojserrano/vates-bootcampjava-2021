import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws FileNotFoundException {

        int a, b, c, d;

        Scanner sc = new Scanner(new File("casos.txt"));

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int suma = a + b + c + d;
        int prod1 = a * b;
        int prod2 = c * d;
        float cociente = prod1 / (float)prod2;

        System.out.println("La suma de los 4: " + suma );
        System.out.println("El producto de los dos primeros: " + prod1);
        System.out.println("El producto de los otros dos: " + prod2);
        System.out.printf("El cociente de los dos productos: %.2f\n",cociente);

        boolean hayMultiplo = a % 3 == 0 || b % 3 == 0 || c % 3 == 0 || d % 3 == 0;

        String resultado = hayMultiplo ?
                "Hay algún":
                "No hay ningún";

        System.out.println(resultado + " múltiplo de tres");
    }
}

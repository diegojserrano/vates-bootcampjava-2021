import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

    // Leer un conjunto de números desde un archivo de texto
    // Calcular y mostrar
    //   - sumatoria
    //   - mayor y menor
    //   - promedio
    //   - cantidad de pares

    public static void main(String[] args) throws FileNotFoundException {
        Scanner archivo = new Scanner(new File("numeros.txt"));

        int suma = 0;
        int x;
        while(archivo.hasNextInt()) {
            x = archivo.nextInt();
            suma += x;
//            System.out.println(x);
        }

        System.out.println("La suma es " + suma);


    }
}

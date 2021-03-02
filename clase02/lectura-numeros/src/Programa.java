import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("numeros.txt"));

        int c = 0, suma = 0;
        int menor = 0, cp = 0;
        while (sc.hasNextInt()) {
            c++;
            int n = sc.nextInt();
            suma += n;
            if (c == 1 || n < menor)
                menor = n;
            if (n % 2 == 0) cp++;
        }

        float promedio = (float) suma / c;
        System.out.println(suma);
        System.out.println(promedio);
        System.out.println(menor);
        System.out.println(cp);

    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Programa {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner archivo = new Scanner(new File("numeros.txt"));

        ArrayList<String> lista = new ArrayList<>();
        //TreeSet<String> lista = new TreeSet<>();
        //HashSet<String> lista = new HashSet<>();

        long inicio = System.currentTimeMillis();
        while(archivo.hasNextInt()) {
            lista.add(String.valueOf(archivo.nextInt()));
        }
        long fin = System.currentTimeMillis();
        long tiempo = fin - inicio;
        System.out.println("Carga: " + tiempo);

        for (String x : lista) {
            System.out.println(x);
        }

        int c=0;
        inicio = System.currentTimeMillis();
        for (int i = 0; i < 1500; i++)
        {
            if (lista.contains(String.valueOf(i))) c++;
        }
        fin = System.currentTimeMillis();
        tiempo = fin - inicio;
        System.out.println("Busqueda: " + tiempo);
        System.out.println("Encontró: " + c);

    }
}

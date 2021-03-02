import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("personas.txt"));

        sc.useDelimiter("[;,\\n]");

        int edadMayor = 0, edadMenor = 0;
        String nombreMayor = "", nombreMenor = "";
        int documentoMayor = 0, documentoMenor = 0;
        // Este ciclo debe dar una vuelta por cada persona (es decir, por cada linea)
        while(sc.hasNextInt())
        {
            int documento = sc.nextInt();
            String nombre = sc.next();
            int edad = sc.nextInt();

            if (edad > edadMayor) {
                edadMayor = edad;
                nombreMayor = nombre;
                documentoMayor = documento;
            }

            if (edadMenor == 0 |  edad < edadMenor) {
                edadMenor = edad;
                nombreMenor = nombre;
                documentoMenor = documento;
            }
            System.out.printf("%4d %-20s %3d\n",documento, nombre, edad);
        }

        System.out.println("Persona de mayor edad: ");
        System.out.printf("%4d %-20s %3d\n",documentoMayor, nombreMayor, edadMayor);

        System.out.println("Persona de menor edad: ");
        System.out.printf("%4d %-20s %3d\n",documentoMenor, nombreMenor, edadMenor);

    }
}

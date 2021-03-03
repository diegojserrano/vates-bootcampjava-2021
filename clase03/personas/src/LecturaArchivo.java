import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("personas.txt"));

        sc.useDelimiter("[;,\\n]");

        Persona mayor = null;
        while(sc.hasNextInt()) {
            int documento = sc.nextInt();
            String nombre = sc.next();
            int edad = sc.nextInt();

            Persona p = new Persona(documento, nombre, edad);
            if (mayor == null || p.getEdad() > mayor.getEdad()) {
                mayor = p;
            }

            System.out.printf("%4d %-20s %3d\n", p.getDocumento(), p.getNombre(), p.getEdad());
        }

        System.out.println("Persona de mayor edad: ");
        System.out.printf("%4d %-20s %3d\n",mayor.getDocumento(), mayor.getNombre(), mayor.getEdad());

    }

}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner archivo = new Scanner(new File("personas2.txt"));

        archivo.useDelimiter("[;\\n]");
        Persona mayor = null;
        int mayoresEdad = 0, cantidadPerez = 0;

        while(archivo.hasNextInt()) {
            int docu = archivo.nextInt();
            String nom = archivo.next();
            String ape = archivo.next();
            int edad = archivo.nextInt();

            Persona nueva = new Persona(docu, nom, ape, edad);
            //System.out.println(nueva.getNombre()+" "+nueva.getApellido());

            if (mayor == null || nueva.getEdad() > mayor.getEdad())
                mayor = nueva;

            if (nueva.getEdad() >= 18)
                mayoresEdad ++;

            if (nueva.getApellido().contains("PEREZ")) {
                cantidadPerez++;
            }
        }

        System.out.println("Persona de mayor edad:" + mayor.getNombre() + " " + mayor.getApellido());
        System.out.println("Cantidad de mayores de edad: " + mayoresEdad);
        System.out.println("Cantidad de PEREZ: " + cantidadPerez);
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner archivo = new Scanner(new File("personas2.txt"));
        Scanner teclado = new Scanner(System.in);
        ArrayList<Persona> listaPersonas = new ArrayList<>();


        archivo.useDelimiter("[;\\n]");
        Persona mayor = null;
        int mayoresEdad = 0, cantidadPerez = 0;

        while(archivo.hasNextInt()) {
            int docu = archivo.nextInt();
            String nom = archivo.next();
            String ape = archivo.next();
            int edad = archivo.nextInt();

            Persona nueva = new Persona(docu, nom, ape, edad);
            listaPersonas.add(nueva);
        }
        archivo.close();

        for(Persona p: listaPersonas) {
            if (mayor == null || p.getEdad() > mayor.getEdad())
                mayor = p;
        }

        for(Persona p: listaPersonas) {
            if (p.getEdad() > 18)
                mayoresEdad++;
        }
        System.out.println("Persona de mayor edad:" + mayor.getNombre() + " " + mayor.getApellido());
        System.out.println("Cantidad de mayores de edad: " + mayoresEdad);

        System.out.printf("Ingrese el apellido a buscar, fin con .");
        String buscado = teclado.next();
        while(!buscado.equals(".")) {
            for (Persona p : listaPersonas) {
                if (p.getApellido().equalsIgnoreCase(buscado)) {
                    System.out.printf("%8d %20s %20s %-5d\n", p.getDocumento(), p.getNombre(),
                            p.getApellido(), p.getEdad());
                }

            }
            buscado = teclado.next();
        }
    }
}

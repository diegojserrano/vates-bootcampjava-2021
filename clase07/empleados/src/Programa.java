import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws FileNotFoundException {
        ListaEmpleados lista = new ListaEmpleados();
        Scanner archivo = new Scanner(new File("empleados.txt"));

        archivo.useDelimiter("[;\\n]");
        while(archivo.hasNextInt()) {
            Empleado nuevo = null;
            int tipo = archivo.nextInt();
            int legajo = archivo.nextInt();
            String nombre = archivo.next();
            float sueldo = archivo.nextFloat();
            switch (tipo) {
                case 1: // es un obrero
                    int dias = archivo.nextInt();
                    nuevo = new Obrero(legajo, nombre, sueldo, dias);
                    break;
                case 2:
                    boolean presentismo = archivo.nextBoolean();
                    nuevo = new Administrativo(legajo, nombre, sueldo, presentismo);
                    break;
                case 3:
                    float ventas = archivo.nextFloat();
                    nuevo = new Vendedor(legajo, nombre, sueldo, ventas);
                    break;
            }

            lista.agregar(nuevo);
        }




        System.out.printf("%15.2f",lista.totalSueldos());
    }
}

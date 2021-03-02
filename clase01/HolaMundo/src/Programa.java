import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws FileNotFoundException {

        int a;
        int b;

        // Tipos enteros: byte, short, int, long. Solo vamos a usar int
        // Tipos de punto flotante: float y double.
        // Tipos de caracteres: char y String.
        // Tipo lógico: boolean

        // Operadores numericos: + - * / ++ -- %
        // Operadores de asignación: = += -= *= /=
        // Operadores de comparacion: < > <= >= !=
        // Operadores lógicos: && || !
        // Operador ternario:  ? :

        // Entrada / Salida

        // Para mostrar en la pantalla:
        //System.out.print();
        //System.out.println();
        //System.out.printf();

        // Para ingresar datos por teclado
        // System.in, pero es dificil de usar
        // Para simplificar se dispone de la clase Scanner

        Scanner teclado = new Scanner(new File("numeros1.txt"));

        //System.out.println("Ingrese dos numeros enteros");
        System.out.println("Leyendo datos desde el archivo");
        a = teclado.nextInt();
        b = teclado.nextInt();

        System.out.println(a);
        System.out.println(b);

        int suma = a + b;

        System.out.println("La suma es " + suma);
    }

}

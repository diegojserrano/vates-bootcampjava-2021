import java.util.Scanner;

public class Menu {


    public void mostrar(Scanner sc, String []textos, Runnable []op) {
        int opcion = 0;
        do {
            System.out.println("Menu de opciones");
            for (int i = 0; i < textos.length; i++) {
                System.out.println((i+1) + " - " + textos[i]);
            }
            System.out.println("9 - Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = sc.nextInt();

            if (opcion <= op.length)
                op[opcion-1].run();

        } while (opcion != 9);

    }

    public void mostrar(Scanner sc, String texto1, String texto2, Runnable op1, Runnable op2) {
        int opcion = 0;
        do {
            System.out.println("Menu de opciones");
            System.out.println("1- " + texto1);
            System.out.println("2- " + texto2);
            System.out.println("3- Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    op1.run();
                    break;
                case 2:
                    op2.run();
                    break;
            }

        } while (opcion != 3);

    }
}

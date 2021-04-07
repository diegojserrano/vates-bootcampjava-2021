import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora");
        double ope1, ope2;
        String operacion;
        Calculadora c = new Calculadora();

        do {
            ope1 = sc.nextDouble();
            operacion = sc.next();
            ope2 = sc.nextDouble();

            if (!operacion.equals("."))
                System.out.println(c.calcular(ope1, operacion, ope2));
        } while (!operacion.equals("."));
    }
}

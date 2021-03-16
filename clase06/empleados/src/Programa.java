public class Programa {
    public static void main(String[] args) {
        ListaEmpleados lista = new ListaEmpleados();

        lista.agregar(new Obrero(12,"Juan",50000,25));
        lista.agregar(new Administrativo(34, "Mario",50000,true));

        System.out.println(lista.totalSueldos());
    }
}

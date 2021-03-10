public class Programa {
    public static void main(String[] args) {

        Cliente cl1 = null;//new Cliente(1,"Juan","2341234234");
        Cliente cl2 = new ClienteLocal(1, "Juan", "añsldfjk", 22);
        Cliente cl3 = new ClienteInternet(1, "Juan", "añsldfjk", "juan@asdf.com");


        System.out.println("Desde las referencias");
        System.out.println(cl1.toString());
        System.out.println(cl2.toString());
        System.out.println(cl3.toString());

        Cliente[]v = new Cliente[3];
        v[0] = cl1;
        v[1] = cl2;
        v[2] = cl3;


        System.out.println("Desde el vector");
        for (Cliente c: v) {

            if (c instanceof ClienteInternet) {
                System.out.print("Este es de internet --->");
                ClienteInternet ci = (ClienteInternet)c; // Downcast o casting hacia abajo
                System.out.print(ci.getEmail());  // por qué no compila
            }
            else{
                System.out.print("Este no --->");
            }
            c.mostrar();
            System.out.println(c.toString());  // Llamada polimorfica
        }


    }

}

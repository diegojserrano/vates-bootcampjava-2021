import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ListaEmpleados implements Comparable, Iterable {
    private ArrayList<Empleado> lista;


    public ListaEmpleados() {
        this.lista = new ArrayList<>();
    }

    public void agregar(Empleado nuevo) {
        lista.add(nuevo);
    }

    public float totalSueldos() {
        float total = 0;
        for (Empleado e : lista) {
            total += e.calcularSueldo();//Llamada polimorfica
        }
        return total;
    }

    public float totalObreros() {
        float total = 0;
        for (Empleado e : lista) {
            if (e instanceof Obrero)
                total += e.calcularSueldo();//Llamada polimorfica
        }
        return total;
    }

    public float totalAdministrativos() {
        float total = 0;
        for (Empleado e : lista) {
            if (e instanceof Administrativo)
                total += e.calcularSueldo();//Llamada polimorfica
        }
        return total;
    }

    public float totalVendedores() {
        float total = 0;
        for (Empleado e : lista) {
            if (e instanceof Vendedor)
                total += e.calcularSueldo();//Llamada polimorfica
        }
        return total;
    }

    public Empleado menorSueldo() {
        Empleado menor = lista.get(0);

        for (Empleado e: lista) {
            if (e.calcularSueldo() < menor.calcularSueldo())
                menor = e;
        }
        return menor;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
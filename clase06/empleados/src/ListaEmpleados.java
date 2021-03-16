import java.util.ArrayList;

public class ListaEmpleados {
    private ArrayList<Empleado> lista;

    public ListaEmpleados() {
        this.lista = new ArrayList<>();
    }

    public void agregar(Empleado nuevo) {
        lista.add(nuevo);
    }

    public float totalSueldos() {
        float total = 0;
        for(Empleado e: lista) {
            total += e.calcularSueldo();
        }
        return total;
    }
}

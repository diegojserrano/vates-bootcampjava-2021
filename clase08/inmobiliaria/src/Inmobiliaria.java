import java.util.ArrayList;

public class Inmobiliaria {

    private ArrayList<Propiedad> lista;

    public Inmobiliaria() {
        lista = new ArrayList<>();
    }

    public void agregar(Propiedad nueva) {
        lista.add(nueva);
    }

    public void eliminar(Propiedad aEliminar) {
        lista.remove(aEliminar);
    }

    public float promedioAlquileres(int inquilinos) {
        int c = 0;
        float ac = 0;

        for (Propiedad p: lista) {
             if (p.getInquilinos() == inquilinos) {
                 ac += p.calcularAlquiler();
                 c++;
             }
        }

        float promedio = 0;
        if (c > 0) promedio = ac / c;

        return promedio;
    }

    public float cantidadCasasGaraje(int habitaciones) {
        int c = 0;

        for (Propiedad p: lista) {
            if (p instanceof Casa) {
                // Downcasting
                Casa ca = (Casa)p;
                if (ca.getHabitaciones() >= habitaciones && ca.isGaraje()) {
                    c++;
                }
            }
        }

        return c;
    }

}

public class Vendedor extends Empleado {

    private float totalVentas;

    @Override
    public float calcularSueldo() {
        return sueldoBasico + totalVentas * 0.01f;
    }

    public Vendedor(int legajo, String nombre, float sueldoBasico, float totalVentas) {
        super(legajo, nombre, sueldoBasico);
        this.totalVentas = totalVentas;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "totalVentas=" + totalVentas +
                ", legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", sueldoBasico=" + sueldoBasico +
                '}';
    }
}

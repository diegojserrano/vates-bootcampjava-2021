public class Administrativo extends Empleado {

    private boolean presentismo;

    @Override
    public float calcularSueldo() {
        return sueldoBasico*((presentismo)?1.13f:1);
    }

    public Administrativo(int legajo, String nombre, float sueldoBasico, boolean presentismo) {
        super(legajo, nombre, sueldoBasico);
        this.presentismo = presentismo;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "presentismo=" + presentismo +
                ", legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", sueldoBasico=" + sueldoBasico +
                '}';
    }
}

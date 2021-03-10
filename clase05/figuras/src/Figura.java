public abstract class Figura {

    protected String nombre;

    public abstract float superficie();
    public abstract float perimetro();

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

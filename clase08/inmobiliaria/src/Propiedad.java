public abstract class Propiedad {

    protected int id;
    protected String domicilio;
    protected int habitaciones;
    protected float precioBase;
    protected boolean comercial;
    protected int inquilinos;

    public Propiedad(int id, String domicilio, int habitaciones, float precioBase, boolean comercial, int inquilinos) {
        this.id = id;
        this.domicilio = domicilio;
        this.habitaciones = habitaciones;
        this.precioBase = precioBase;
        this.comercial = comercial;
        this.inquilinos = inquilinos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isComercial() {
        return comercial;
    }

    public void setComercial(boolean comercial) {
        this.comercial = comercial;
    }

    public int getInquilinos() {
        return inquilinos;
    }

    public void setInquilinos(int inquilinos) {
        this.inquilinos = inquilinos;
    }

    public abstract float calcularAlquiler();
}

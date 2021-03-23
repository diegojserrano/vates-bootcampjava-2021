public class Departamento extends Propiedad {

    protected float expensas;

    public Departamento(int id, String domicilio, int habitaciones, float precioBase, boolean comercial, int inquilinos, float expensas) {
        super(id, domicilio, habitaciones, precioBase, comercial, inquilinos);
        this.expensas = expensas;
    }

    public float getExpensas() {
        return expensas;
    }

    public void setExpensas(float expensas) {
        this.expensas = expensas;
    }

    @Override
    public float calcularAlquiler() {
        float extra = 0;
        if (comercial) extra = 500;
        return precioBase + expensas + extra;
    }
}

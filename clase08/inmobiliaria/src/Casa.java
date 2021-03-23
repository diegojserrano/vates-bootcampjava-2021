public class Casa extends Propiedad {

    protected boolean garaje;

    public Casa(int id, String domicilio, int habitaciones, float precioBase, boolean comercial, int inquilinos, boolean garaje) {
        super(id, domicilio, habitaciones, precioBase, comercial, inquilinos);
        this.garaje = garaje;
    }

    public boolean isGaraje() {
        return garaje;
    }

    public void setGaraje(boolean garaje) {
        this.garaje = garaje;
    }

    @Override
    public float calcularAlquiler() {
        float extra = 0;
        if (comercial) extra = 1000;
        return precioBase + extra;
        // return precioBase + ((comercial)? 1000: 0);
    }
}

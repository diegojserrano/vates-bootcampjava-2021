public class Circulo extends Figura {

    private float radio;

    @Override
    public float superficie() {
        return (float)Math.PI * radio * radio;
    }

    @Override
    public float perimetro() {
        return 2 * (float)Math.PI * radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Circulo(String nombre, float radio) {
        super(nombre);
        this.radio = radio;
    }
}

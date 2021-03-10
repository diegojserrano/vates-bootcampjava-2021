public class ClienteLocal extends Cliente {
    private int nroLocal;

    public int getNroLocal() {
        return nroLocal;
    }

    public void setNroLocal(int nroLocal) {
        this.nroLocal = nroLocal;
    }

    @Override
    public String mostrar() {
        return null;
    }

    public String toString() {
        return "No se como programarlo";
    }

    public ClienteLocal(int codigo, String nombre, String telefono, int nroLocal) {
        super(codigo, nombre, telefono);
        this.nroLocal = nroLocal;
    }
}

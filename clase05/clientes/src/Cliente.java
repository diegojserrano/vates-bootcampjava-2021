public abstract class Cliente { // abstract en una clase obliga la herencia
    protected int codigo;
    protected String nombre;
    protected String telefono;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cliente(int codigo, String nombre, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Cliente() {
    }

    public abstract String mostrar(); // abstract en un metodo obliga la sobreescritura y ademas
    // obliga que la clase sea abstracta también.

    public  String toString() {
        return codigo + " - " + nombre + " - " + telefono;
    }

    // final en una clase impide la herencia
    // final en un método impide la sobreescritura
    // final en un atributo impide la asignacion (crea una constante)
}

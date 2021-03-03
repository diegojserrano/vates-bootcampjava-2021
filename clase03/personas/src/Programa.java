public class Programa {
    public static void main(String[] args) {

        // Crear dos personas, llenar sus atributos y mostrarlas.

        // La instrucción (en realidad el operador) new sirve para crear objetos
        //new Persona();

        // También podemos declarar variables de "tipo Persona"
        Persona p, q;


        p = new Persona(2234243,"Juan Perez",32);

        q = new Persona(1234234,"Maria Gomez",29);
        // Luego de la asignacion, p actua como "nombre" del objeto.

        p = q;

        q.setEdad(-5);

        System.out.println(p.getDocumento());
        System.out.println(p.getNombre());
        System.out.println(p.getEdad());

        System.out.println(q.getDocumento());
        System.out.println(q.getNombre());
        System.out.println(q.getEdad());

    }
}

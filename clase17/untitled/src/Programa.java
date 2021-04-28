import java.sql.*;
import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/Libros","root","root");
            System.out.println("Conexion establecida");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from Autores");
            ArrayList<Autor> lista  = new ArrayList<>();
            while(rs.next()) {
                // Una vuelta por cada fila.
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");

                Autor nuevo = new Autor(id, nombre);
                lista.add(nuevo);
            }

            rs.close();
            st.close();
            conn.close();

            lista.forEach(System.out::println);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}


// ORM: Object relational mapping
// JPA: Java persistence API

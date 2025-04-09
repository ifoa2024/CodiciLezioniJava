import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class App {

    static final String connection_string = "jdbc:mysql://localhost:3306/jdbcdbconnection?user=root&password=root";

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        //forName è un metodo statico della classe Class che consente di attivare il driver tramite una stringa di connessione
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(connection_string);
        Statement statement = connection.createStatement();
        // ResultSet resultSet = statement.executeQuery("select * from products");

        // while(resultSet.next()){
        //     System.out.println("id: " + resultSet.getLong("id"));
        //     System.out.println("nome: " + resultSet.getString("name"));
        //     System.out.println("descizione: " + resultSet.getString("description"));
        //     System.out.println("prezzo: " + resultSet.getFloat("price"));
        // }

        ResultSet resultSet = statement.executeQuery("SELECT p.name, v.attribute, v.value FROM products p join variants v ON p.id = v.product_id");

        while(resultSet.next()){
            // System.out.println("nome: " + resultSet.getString("name"));
            // System.out.println("attributo: " + resultSet.getString("attribute"));
            // System.out.println("valore: " + resultSet.getString("value"));

            System.out.println("nome: " + resultSet.getString(1));
            System.out.println("attributo: " + resultSet.getString(2));
            System.out.println("valore: " + resultSet.getString(3));
        }

    }
}

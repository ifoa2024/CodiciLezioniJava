import java.sql.Statement;

import models.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CrudOrm {
    static final String connection_string = "jdbc:mysql://localhost:3306/jdbcdbconnection?user=root&password=root";

    public Statement statement;

    public CrudOrm() {

        this.statement = getStatement();

    }

    public Statement getStatement() {

        Statement statement = null;

        try {  
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(connection_string);
            statement = connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }

        return statement;
    }

    public Product getProductByName(String name) throws Exception {

        StringBuilder query = new StringBuilder("select * from products where name = '" + name + "'");

        ResultSet resultSet = this.statement.executeQuery(query.toString());

        Product product = new Product();

        if(resultSet.next()){
            product.setId(resultSet.getInt("id"));
            product.setName(resultSet.getString("name"));
            product.setPrice(resultSet.getFloat("price"));
            product.setDescription(resultSet.getString("description"));
        }

        return product;
    }






}

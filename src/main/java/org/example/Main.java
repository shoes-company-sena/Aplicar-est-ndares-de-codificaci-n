package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/test-jdbc";
        String user = "root";
        String password = "";

        Connection connection = null;
        Statement statement = null;

        // Intentar establecer la conexión
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa!");

            statement = connection.createStatement();
            String sql = "CREATE TABLE test (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(100))";
            int result = statement.executeUpdate(sql);  // Usamos executeUpdate para actualizaciones

            System.out.println("Tabla creada con éxito");

        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos");
            e.printStackTrace();
        }


    }
}
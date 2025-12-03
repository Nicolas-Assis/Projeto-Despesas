package org.despesa.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // ATENÇÃO: Substitua estas credenciais pelas suas
    private static final String URL = "jdbc:postgresql://localhost:5433/despesasdb";
    private static final String USER = "devuser";
    private static final String PASSWORD = "devpass";

    public static Connection getConnection() throws SQLException {
        try {
            // Tenta estabelecer a conexão
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            throw e;
        }
    }
}


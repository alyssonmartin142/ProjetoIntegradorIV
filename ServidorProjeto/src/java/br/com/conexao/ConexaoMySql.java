package br.com.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alysson Martin
 */
public class ConexaoMySql {
    
    private static boolean connect = false;
    
    public static java.sql.Connection getConexao() {
        Connection connection = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            String serverName = "localhost:3306";
            String dataBaseName = "projeto";
            String url = "jdbc:mysql://" + serverName + "/" + dataBaseName;
            String username = "trabalhosFaculdade";
            String password = "trabalhosFaculdade";
            
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Conectado!");
            connect = (connection != null);
        } catch (ClassNotFoundException e) {
            System.out.println("O driver expecificado nao foi encontrado.");
        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
        }
        
        return connection;
    }
    
    public static boolean conectado() {
        return connect;
    }
    
    public static boolean FecharConexao() {
        try {
            ConexaoMySql.getConexao().close();
            System.out.println("Desconectado!");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}

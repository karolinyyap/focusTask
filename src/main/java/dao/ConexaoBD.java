
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Karoliny
 */
public class ConexaoBD {
    private static Connection conexao;
    
    public static Connection obterConexao() throws ClassNotFoundException, SQLException {
        //Variáveis de ambiente
        String login = "postgres";
        String senha = "postgre";
        String ip = "localhost";
        String nomeBanco = "focusTask";
        String url = "jdbc:postgresql://" + ip + ":5432/" + nomeBanco;
        
        Class.forName("org.postgresql.Driver");
        
        conexao = DriverManager.getConnection(url, login, senha);
        
        return conexao;
    }
    
}

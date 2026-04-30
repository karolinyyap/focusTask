
package dao;

import domain.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Karoliny
 */
public class UsuarioDAO {
    
    public UsuarioDAO(){
        
    }
    
    public void inserir(Usuario usu) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO usuario (nome_usuario, cpf, email, sexo, dt_nascimento, telefone, id_equipe, senha) VALUES (?,?,?,?, ?,?,?,?)";

        PreparedStatement pstmt = ConexaoBD.obterConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

        int ind = 1;
        pstmt.setString(ind++, usu.getNomeUsuario());
        pstmt.setString(ind++, usu.getCpf());
        pstmt.setString(ind++, usu.getEmail());
        pstmt.setString(ind++, usu.getSexo());
        pstmt.setDate(ind++, new java.sql.Date(usu.getDtNascimento().getTime()));
        pstmt.setString(ind++, usu.getTelefone());
        pstmt.setInt(ind++, usu.getEquipe().getIdEquipe());
        pstmt.setString(ind++, usu.getSenha());
        
        pstmt.execute();

    }
}

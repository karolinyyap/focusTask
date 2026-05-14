package dao;

import domain.Equipe;
import domain.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Karoliny
 */
public class UsuarioDAO {

    public UsuarioDAO() {

    }

    public void inserir(Usuario usu) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO usuario (nome_usuario, cpf, email, sexo, dt_nascimento, telefone, id_equipe, senha) VALUES (?,?,?,?, ?,?,?,?)";

        PreparedStatement pstmt = ConexaoBD.obterConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

        int ind = 1;
        pstmt.setString(ind++, usu.getNome());
        pstmt.setString(ind++, usu.getCpf());
        pstmt.setString(ind++, usu.getEmail());
        pstmt.setString(ind++, usu.getSexo());
        pstmt.setDate(ind++, new java.sql.Date(usu.getDtNascimento().getTime()));
        pstmt.setString(ind++, usu.getTelefone());
        pstmt.setInt(ind++, usu.getEquipe().getId());
        pstmt.setString(ind++, usu.getSenha());

        pstmt.execute();

    }

    public void alterar(Usuario usuario) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE usuario SET nome_usuario=?, cpf=?, email=?, sexo=?, dt_nascimento=?, telefone=?, id_equipe=?, senha=? WHERE id_usuario=?";

        PreparedStatement pstmt = ConexaoBD.obterConexao().prepareStatement(sql);

        int i = 1;
        pstmt.setString(i++, usuario.getNome());
        pstmt.setString(i++, usuario.getCpf());
        pstmt.setString(i++, usuario.getEmail());
        pstmt.setString(i++, usuario.getSexo());
        pstmt.setDate(i++, new java.sql.Date(usuario.getDtNascimento().getTime()));
        pstmt.setString(i++, usuario.getTelefone());
        pstmt.setInt(i++, usuario.getEquipe().getId());
        pstmt.setString(i++, usuario.getSenha());
        pstmt.setInt(i++, usuario.getId());

        pstmt.execute();
    }

    public List<Usuario> pesquisarPorNome(String nome) throws SQLException, ClassNotFoundException {
        List<Usuario> lista = new ArrayList<>();

        String sql = "SELECT * FROM usuario WHERE nome_usuario ILIKE ?";

        PreparedStatement pstmt = ConexaoBD.obterConexao().prepareStatement(sql);
        pstmt.setString(1, "%" + nome + "%");

        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            Usuario usu = new Usuario();

            usu.setId(rs.getInt("id_usuario"));
            usu.setNome(rs.getString("nome_usuario"));
            usu.setCpf(rs.getString("cpf"));
            usu.setEmail(rs.getString("email"));
            usu.setSexo(rs.getString("sexo"));
            usu.setDtNascimento(rs.getDate("dt_nascimento"));
            usu.setTelefone(rs.getString("telefone"));
            usu.setSenha(rs.getString("senha"));

            Equipe eq = new Equipe();
            eq.setId(rs.getInt("id_equipe"));
            usu.setEquipe(eq);

            lista.add(usu);
        }

        return lista;
    }

    public void excluir(int idUsuario) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM usuario WHERE id_usuario=?";

        PreparedStatement pstmt = ConexaoBD.obterConexao().prepareStatement(sql);

        pstmt.setInt(1, idUsuario);

        pstmt.execute();
    }
}

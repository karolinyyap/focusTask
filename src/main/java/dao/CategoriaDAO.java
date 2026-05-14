
package dao;

import domain.Categoria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Karoliny
 */
public class CategoriaDAO {
    
    public CategoriaDAO() {
    
    }
    
    public void inserir(Categoria cat) throws SQLException, ClassNotFoundException {

        String sql = "INSERT INTO categoria (nome_categoria, descricao) VALUES (?, ?)";

        PreparedStatement stmt = ConexaoBD.obterConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

        stmt.setString(1, cat.getNome());
        stmt.setString(2, cat.getDescricao());

        stmt.executeUpdate();
        stmt.close();
    }

    public List<Categoria> listar() throws SQLException, ClassNotFoundException {

        List<Categoria> lista = new ArrayList<>();

        String sql = "SELECT * FROM categoria";

        PreparedStatement stmt = ConexaoBD.obterConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {

            Categoria cat = new Categoria();

            cat.setId(rs.getInt("id_categoria"));
            cat.setNome(rs.getString("nome_categoria"));
            cat.setDescricao(rs.getString("descricao"));

            lista.add(cat);
        }

        rs.close();
        stmt.close();

        return lista;
    }

    public void alterar(Categoria cat) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE categoria SET nome_categoria=?, descricao=? WHERE id_categoria=?";

        PreparedStatement pstmt = ConexaoBD.obterConexao().prepareStatement(sql);

        int ind = 1;
        pstmt.setString(ind++, cat.getNome());
        pstmt.setString(ind++, cat.getDescricao());
        pstmt.setInt(ind++, cat.getId());

        pstmt.execute();
    }

    public void excluir(int idCategoria) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM categoria WHERE id_categoria = ?";

        PreparedStatement pstmt = ConexaoBD.obterConexao().prepareStatement(sql);

        pstmt.setInt(1, idCategoria);

        pstmt.execute();
    }
}

package dao;

import domain.Equipe;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Karoliny
 */
public class EquipeDAO {
    
    public EquipeDAO() {
    
    }

    public void inserir(Equipe equipe) throws SQLException, ClassNotFoundException {

        String sql = "INSERT INTO equipe (nome_equipe, setor) VALUES (?, ?)";

        PreparedStatement stmt = ConexaoBD.obterConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

        stmt.setString(1, equipe.getNome());
        stmt.setString(2, equipe.getSetor());

        stmt.executeUpdate();
        stmt.close();
    }

    public List<Equipe> listar() throws SQLException, ClassNotFoundException {

        List<Equipe> lista = new ArrayList<>();

        String sql = "SELECT * FROM equipe";

        PreparedStatement stmt = ConexaoBD.obterConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {

            Equipe equipe = new Equipe();

            equipe.setId(rs.getInt("id_equipe"));
            equipe.setNome(rs.getString("nome_equipe"));
            equipe.setSetor(rs.getString("setor"));

            lista.add(equipe);
        }

        rs.close();
        stmt.close();

        return lista;
    }

    public void alterar(Equipe equipe) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE equipe SET nome_equipe=?, setor=? WHERE id_equipe=?";

        PreparedStatement pstmt = ConexaoBD.obterConexao().prepareStatement(sql);

        int ind = 1;
        pstmt.setString(ind++, equipe.getNome());
        pstmt.setString(ind++, equipe.getSetor());
        pstmt.setInt(ind++, equipe.getId());

        pstmt.execute();
    }

    public void excluir(int idEquipe) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM equipe WHERE id_equipe = ?";

        PreparedStatement pstmt = ConexaoBD.obterConexao().prepareStatement(sql);

        pstmt.setInt(1, idEquipe);

        pstmt.execute();
    }

}

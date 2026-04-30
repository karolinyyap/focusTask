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

    public void inserir(Equipe equipe) throws SQLException, ClassNotFoundException {

        String sql = "INSERT INTO equipe (nome_equipe, setor) VALUES (?, ?)";

        PreparedStatement stmt = ConexaoBD.obterConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

        stmt.setString(1, equipe.getNomeEquipe());
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

            equipe.setIdEquipe(rs.getInt("id_equipe"));
            equipe.setNomeEquipe(rs.getString("nome_equipe"));
            equipe.setSetor(rs.getString("setor"));

            lista.add(equipe);
        }

        rs.close();
        stmt.close();

        return lista;
    }
}

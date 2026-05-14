package dao;

import domain.Categoria;
import domain.Equipe;
import domain.Prioridade;
import domain.Status;
import domain.Tarefa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Karoliny
 */
public class TarefaDAO {

    public TarefaDAO() {

    }

    public void inserir(Tarefa tarefa) throws ClassNotFoundException, SQLException {

        String sql = "INSERT INTO tarefa (nome_tarefa, data_limite, id_categoria, status, prioridade) VALUES (?, ?, ?, ?, ?)";

        PreparedStatement pstmt = ConexaoBD.obterConexao()
                .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

        int i = 1;
        pstmt.setString(i++, tarefa.getNome());
        pstmt.setDate(i++, new java.sql.Date(tarefa.getDataLimite().getTime()));
        pstmt.setInt(i++, tarefa.getCategoria().getId());

        pstmt.setString(i++, tarefa.getStatus().name());
        pstmt.setString(i++, tarefa.getPrioridade().name());

        pstmt.executeUpdate();

        ResultSet rs = pstmt.getGeneratedKeys();
        int idTarefa = 0;
        if (rs.next()) {
            idTarefa = rs.getInt(1);
        }

        String sqlAloc = "INSERT INTO alocacao (id_tarefa, id_equipe) VALUES (?, ?)";
        PreparedStatement pstmtAloc = ConexaoBD.obterConexao().prepareStatement(sqlAloc);

//        for (Equipe eq : tarefa.getEquipes()) {
//            pstmtAloc.setInt(1, idTarefa);
//            pstmtAloc.setInt(2, eq.getId());
//            pstmtAloc.execute();
//        }
    }

    public void alterar(Tarefa tarefa) throws SQLException, ClassNotFoundException {

        String sql = "UPDATE tarefa SET nome_tarefa=?, data_limite=?, id_categoria=?, status=?, prioridade=? WHERE id_tarefa=?";

        PreparedStatement pstmt = ConexaoBD.obterConexao().prepareStatement(sql);

        int i = 1;
        pstmt.setString(i++, tarefa.getNome());
        pstmt.setDate(i++, new java.sql.Date(tarefa.getDataLimite().getTime()));
        pstmt.setInt(i++, tarefa.getCategoria().getId());
        pstmt.setString(i++, tarefa.getStatus().name());
        pstmt.setString(i++, tarefa.getPrioridade().name());
        pstmt.setInt(i++, tarefa.getId());

        pstmt.executeUpdate();

        String delete = "DELETE FROM alocacao WHERE id_tarefa=?";
        PreparedStatement pstmtDel = ConexaoBD.obterConexao().prepareStatement(delete);
        pstmtDel.setInt(1, tarefa.getId());
        pstmtDel.executeUpdate();

        String insert = "INSERT INTO alocacao (id_tarefa, id_equipe) VALUES (?, ?)";
        PreparedStatement pstmtIns = ConexaoBD.obterConexao().prepareStatement(insert);

//        for (Equipe eq : tarefa.getEquipes()) {
//            pstmtIns.setInt(1, tarefa.getId());
//            pstmtIns.setInt(2, eq.getId());
//            pstmtIns.execute();
//        }
    }

    public List<Tarefa> listar() throws SQLException, ClassNotFoundException {

        List<Tarefa> lista = new ArrayList<>();

        String sql = "SELECT * FROM tarefa";

        PreparedStatement pstmt = ConexaoBD.obterConexao().prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            Tarefa t = new Tarefa();

            t.setId(rs.getInt("id_tarefa"));
            t.setNome(rs.getString("nome_tarefa"));
            t.setDataLimite(rs.getDate("data_limite"));
            t.setStatus(Status.valueOf(rs.getString("status")));
            t.setPrioridade(Prioridade.valueOf(rs.getString("prioridade")));

            Categoria cat = new Categoria();
            cat.setId(rs.getInt("id_categoria"));
            t.setCategoria(cat);

            lista.add(t);
        }

        return lista;
    }

    public void excluir(int idTarefa) throws SQLException, ClassNotFoundException {

        String sqlAloc = "DELETE FROM alocacao WHERE id_tarefa=?";
        PreparedStatement pstmt1 = ConexaoBD.obterConexao().prepareStatement(sqlAloc);
        pstmt1.setInt(1, idTarefa);
        pstmt1.executeUpdate();

        String sql = "DELETE FROM tarefa WHERE id_tarefa=?";
        PreparedStatement pstmt2 = ConexaoBD.obterConexao().prepareStatement(sql);
        pstmt2.setInt(1, idTarefa);
        pstmt2.execute();
    }
}

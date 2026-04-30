package controller;

import dao.ConexaoBD;
import dao.EquipeDAO;
import dao.UsuarioDAO;
import domain.Equipe;
import domain.Usuario;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Karoliny
 */
public class GerenciadorDominio {

    private EquipeDAO equipeDAO;
    private UsuarioDAO usuarioDAO;

    public GerenciadorDominio() throws ClassNotFoundException, SQLException {
        ConexaoBD.obterConexao();

        equipeDAO = new EquipeDAO();
        usuarioDAO = new UsuarioDAO();
    }

    public List<Equipe> listarEquipes() throws SQLException, ClassNotFoundException {
        EquipeDAO dao = new EquipeDAO();
        return dao.listar();
    }
    
    public void inserirUsuario(Usuario usu) throws ClassNotFoundException, SQLException{
        UsuarioDAO dao = new UsuarioDAO();
        dao.inserir(usu);
    }
    
    public void inserirEquipe(Equipe equ) throws SQLException, ClassNotFoundException {
        EquipeDAO dao = new EquipeDAO();
        dao.inserir(equ);
    }
}

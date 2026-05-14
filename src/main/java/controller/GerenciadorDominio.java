package controller;

import dao.CategoriaDAO;
import dao.ConexaoBD;
import dao.EquipeDAO;
import dao.TarefaDAO;
import dao.UsuarioDAO;
import domain.Categoria;
import domain.Equipe;
import domain.Tarefa;
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
    private CategoriaDAO categoriaDAO;
    private TarefaDAO tarefaDAO;

    public GerenciadorDominio() throws ClassNotFoundException, SQLException {
        ConexaoBD.obterConexao();

        equipeDAO = new EquipeDAO();
        usuarioDAO = new UsuarioDAO();
        categoriaDAO = new CategoriaDAO();
        tarefaDAO = new TarefaDAO();
    }

    //------------------USUÁRIO
    public void inserirUsuario(Usuario usu) throws ClassNotFoundException, SQLException {
        UsuarioDAO dao = new UsuarioDAO();
        dao.inserir(usu);
    }
    
    public void alterarUsuario(Usuario usu) throws ClassNotFoundException, SQLException {
        UsuarioDAO dao = new UsuarioDAO();
        dao.alterar(usu);
    }
    
    public List<Usuario> pesquisarUsuario(String nome) throws ClassNotFoundException, SQLException {
        UsuarioDAO dao = new UsuarioDAO();
        return dao.pesquisarPorNome(nome);
    }
    
    public void excluirUsuario(int idUsu) throws ClassNotFoundException, SQLException {
        UsuarioDAO dao = new UsuarioDAO();
        dao.excluir(idUsu);
    }

    //------------------EQUIPE
    public void inserirEquipe(Equipe equ) throws SQLException, ClassNotFoundException {
        EquipeDAO dao = new EquipeDAO();
        dao.inserir(equ);
    }

    public void alterarEquipe(Equipe equ) throws SQLException, ClassNotFoundException {
        EquipeDAO dao = new EquipeDAO();
        dao.alterar(equ);
    }

    public void excluirEquipe(int idEquipe) throws SQLException, ClassNotFoundException {
        EquipeDAO dao = new EquipeDAO();
        dao.excluir(idEquipe);
    }
    
    public List<Equipe> listarEquipes() throws SQLException, ClassNotFoundException {
        EquipeDAO dao = new EquipeDAO();
        return dao.listar();
    }
    
    //------------------CATEGORIA
    
    public void inserirCategoria(Categoria cat) throws SQLException, ClassNotFoundException {
        CategoriaDAO dao = new CategoriaDAO();
        dao.inserir(cat);
    }

    public void alterarCategoria(Categoria cat) throws SQLException, ClassNotFoundException {
        CategoriaDAO dao = new CategoriaDAO();
        dao.alterar(cat);
    }

    public void excluirCategoria(int idCategoria) throws SQLException, ClassNotFoundException {
        CategoriaDAO dao = new CategoriaDAO();
        dao.excluir(idCategoria);
    }
    
    public List<Categoria> listarCategoria() throws SQLException, ClassNotFoundException {
        CategoriaDAO dao = new CategoriaDAO();
        return dao.listar();
    }
    
    //------------------TAREFA
    
    public void inserirTarefa(Tarefa tarefa) throws SQLException, ClassNotFoundException {
        TarefaDAO dao = new TarefaDAO();
        dao.inserir(tarefa);
    }

    public void alterarTarefa(Tarefa tarefa) throws SQLException, ClassNotFoundException {
        TarefaDAO dao = new TarefaDAO();
        dao.alterar(tarefa);
    }

    public void excluirTarefa(int idTarefa) throws SQLException, ClassNotFoundException {
        TarefaDAO dao = new TarefaDAO();
        dao.excluir(idTarefa);
    }
    
    public List<Tarefa> listarTarefa() throws SQLException, ClassNotFoundException {
        TarefaDAO dao = new TarefaDAO();
        return dao.listar();
    }
}

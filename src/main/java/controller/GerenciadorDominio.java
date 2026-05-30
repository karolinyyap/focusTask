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
    public void inserirUsuario(Usuario usu) {
        usuarioDAO.inserir(usu);
    }

    //------------------EQUIPE
    public void inserirEquipe(Equipe equ) {
        equipeDAO.inserir(equ);
    }

    public List<Equipe> listarEquipes() {
        return equipeDAO.listar();
    }

    //------------------CATEGORIA
    public void inserirCategoria(Categoria cat) {
        categoriaDAO.inserir(cat);
    }
    
    public List<Categoria> listarCategorias() {
        return categoriaDAO.listar();
    }

    //------------------TAREFA
    public void inserirTarefa(Tarefa tarefa) {
        tarefaDAO.inserir(tarefa);
    }
    
    public List<Tarefa> listarTarefas() {
        return tarefaDAO.listar();
    }

}

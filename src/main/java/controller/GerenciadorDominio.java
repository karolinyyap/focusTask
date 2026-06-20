package controller;

import dao.CategoriaDAO;
import dao.ConexaoHibernate;
import dao.EquipeDAO;
import dao.GenericDAO;
import dao.TarefaDAO;
import dao.UsuarioDAO;
import domain.Alocacao;
import domain.AlocacaoPK;
import domain.Categoria;
import domain.Equipe;
import domain.Prioridade;
import domain.Status;
import domain.Tarefa;
import domain.Usuario;
import domain.UsuarioEquipe;
import domain.UsuarioEquipePK;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Karoliny
 */
public class GerenciadorDominio {

    private GenericDAO genDAO;
    private EquipeDAO equipeDAO;
    private UsuarioDAO usuarioDAO;
    private CategoriaDAO categoriaDAO;
    private TarefaDAO tarefaDAO;

    public GerenciadorDominio() throws HibernateException {
        ConexaoHibernate.getSessionFactory().openSession();

        genDAO = new GenericDAO();
        equipeDAO = new EquipeDAO();
        usuarioDAO = new UsuarioDAO();
        categoriaDAO = new CategoriaDAO();
        tarefaDAO = new TarefaDAO();
    }

    // LISTAR GENÉRICO
    public List listar(Class classe) throws HibernateException {
        return genDAO.listar(classe);
    }

    //------------------USUÁRIO
    public void inserirUsuario(String nome, String cpf, String email, String sexo, Date dtNascimento, String telefone, Equipe equipe) {
        Usuario usuario = new Usuario();

        usuario.setNome(nome);
        usuario.setCpf(cpf);
        usuario.setEmail(email);
        usuario.setSexo(sexo);
        usuario.setDtNascimento(dtNascimento);
        usuario.setTelefone(telefone);
        usuario.setEquipe(equipe);

        List<UsuarioEquipe> historico = new ArrayList<>();

        UsuarioEquipe ue = new UsuarioEquipe();

        UsuarioEquipePK pk = new UsuarioEquipePK();
        pk.setUsuario(usuario);
        pk.setEquipe(equipe);

        ue.setId(pk);
        ue.setDataEntrada(new Date());
        ue.setDataSaida(null);

        historico.add(ue);

        usuario.setHistoricoEquipes(historico);

        genDAO.inserir(usuario);
    }

    public void alterarUsuario(int id, String nome, String cpf, String email, String telefone, Date dtNascimento, String sexo, Equipe equipe) {
        Usuario usuario = (Usuario) usuarioDAO.get(Usuario.class, id);

        usuario.setNome(nome);
        usuario.setCpf(cpf);
        usuario.setEmail(email);
        usuario.setTelefone(telefone);
        usuario.setDtNascimento(dtNascimento);
        usuario.setSexo(sexo);

        if (usuario.getEquipe().getId() != equipe.getId()) {
            for (UsuarioEquipe ue : usuario.getHistoricoEquipes()) {

                if (ue.getDataSaida() == null) {
                    ue.setDataSaida(new Date());
                    break;
                }
            }

            UsuarioEquipe novo = new UsuarioEquipe();

            UsuarioEquipePK pk = new UsuarioEquipePK();

            pk.setUsuario(usuario);
            pk.setEquipe(equipe);

            novo.setId(pk);
            novo.setDataEntrada(new Date());
            novo.setDataSaida(null);

            usuario.getHistoricoEquipes().add(novo);
        }
        usuario.setEquipe(equipe);

        usuarioDAO.alterar(usuario);
    }

    public void excluirUsuario(int id) {
        Usuario usuario = (Usuario) usuarioDAO.get(Usuario.class, id);

        genDAO.excluir(usuario);
    }

    public Usuario pesquisarUsuarioPorNome(String nome) {
        return usuarioDAO.pesquisarPorNome(nome);
    }

    public List<Usuario> listarUsuariosDasEquipes(List<Equipe> equipes) {
        return usuarioDAO.listarUsuariosDasEquipes(equipes);
    }

    public boolean usuarioPossuiTarefas(Usuario usuario) {
        return usuarioDAO.possuiTarefasResponsavel(usuario);
    }

    //------------------EQUIPE
    public void inserirEquipe(String nome, String setor) {
        Equipe equipe = new Equipe();

        equipe.setNome(nome);
        equipe.setSetor(setor);

        genDAO.inserir(equipe);
    }

    public void alterarEquipe(int id, String nome, String setor) {
        Equipe equipe = (Equipe) equipeDAO.get(Equipe.class, id);

        equipe.setNome(nome);
        equipe.setSetor(setor);

        genDAO.alterar(equipe);
    }

    public void excluirEquipe(int id) {
        Equipe equipe = (Equipe) equipeDAO.get(Equipe.class, id);
        genDAO.excluir(equipe);
    }

    public boolean equipePossuiTarefas(Equipe equipe) {
        return equipeDAO.possuiTarefas(equipe);
    }

    public boolean equipePossuiUsuarios(Equipe equipe) {
        return equipeDAO.possuiUsuarios(equipe);
    }

    //------------------CATEGORIA
    public void inserirCategoria(String nome, String desc) {
        Categoria cat = new Categoria();

        cat.setNome(nome);
        cat.setDescricao(desc);

        genDAO.inserir(cat);
    }

    public void alterarCategoria(int id, String nome, String desc) {
        Categoria cat = (Categoria) categoriaDAO.get(Categoria.class, id);

        cat.setNome(nome);
        cat.setDescricao(desc);

        genDAO.alterar(cat);
    }

    public void excluirCategoria(int id) {
        Categoria cat = (Categoria) categoriaDAO.get(Categoria.class, id);
        genDAO.excluir(cat);
    }

    public boolean categoriaPossuiTarefas(Categoria categoria) {
        return categoriaDAO.possuiTarefas(categoria);
    }

    //------------------TAREFA
    public void inserirTarefa(String nome, Date dataInicio, Date dataLimite, Categoria categoria, Prioridade prioridade, Status status, List<Equipe> equipes, Usuario responsavel) {
        Tarefa tarefa = new Tarefa();

        tarefa.setNome(nome);
        tarefa.setDataInicio(dataInicio);
        tarefa.setDataLimite(dataLimite);
        tarefa.setCategoria(categoria);
        tarefa.setPrioridade(prioridade);
        tarefa.setStatus(status);
        List<Alocacao> alocacoes = new ArrayList<>();

        for (Equipe equipe : equipes) {

            AlocacaoPK pk = new AlocacaoPK();
            pk.setTarefa(tarefa);
            pk.setEquipe(equipe);

            Alocacao alocacao = new Alocacao();
            alocacao.setId(pk);

            alocacoes.add(alocacao);
        }

        tarefa.setAlocacoes(alocacoes);
        tarefa.setResponsavel(responsavel);

        tarefaDAO.inserir(tarefa);
    }

    public void alterarTarefa(int id, String nome, Date dataInicio, Date dataLimite, Categoria categoria, Prioridade prioridade, Status status, List<Equipe> equipes, Usuario responsavel) {
        Tarefa tarefa = (Tarefa) tarefaDAO.get(Tarefa.class, id);

        tarefa.setNome(nome);
        tarefa.setDataInicio(dataInicio);
        tarefa.setDataLimite(dataLimite);
        tarefa.setCategoria(categoria);
        tarefa.setPrioridade(prioridade);
        tarefa.setStatus(status);
        List<Alocacao> alocacoes = new ArrayList<>();

        for (Equipe equipe : equipes) {

            AlocacaoPK pk = new AlocacaoPK();
            pk.setTarefa(tarefa);
            pk.setEquipe(equipe);

            Alocacao alocacao = new Alocacao();
            alocacao.setId(pk);

            alocacoes.add(alocacao);
        }

        tarefa.setAlocacoes(alocacoes);
        tarefa.setResponsavel(responsavel);

        tarefaDAO.alterar(tarefa);
    }

    public void excluirTarefa(int id) {
        Tarefa tarefa = (Tarefa) tarefaDAO.get(Tarefa.class, id);
        genDAO.excluir(tarefa);
    }

    public long contarTarefas() {
        return tarefaDAO.contarTarefas();
    }

    public long contarPorStatus(Status status) {
        return tarefaDAO.contarPorStatus(status);
    }

    public int contarTarefasEquipe(Equipe equipe) {
        return tarefaDAO.contarTarefasEquipe(equipe);
    }

}

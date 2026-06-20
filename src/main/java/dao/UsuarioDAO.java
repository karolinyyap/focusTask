package dao;

import domain.Equipe;
import domain.Tarefa;
import domain.Usuario;
import jakarta.persistence.criteria.*;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Karoliny
 */
public class UsuarioDAO extends GenericDAO {

    public UsuarioDAO() {
    }

    public Usuario pesquisarPorNome(String nome) {

        Session sessao = null;

        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();

            CriteriaBuilder cb = sessao.getCriteriaBuilder();
            CriteriaQuery<Usuario> cq = cb.createQuery(Usuario.class);
            Root<Usuario> usuario = cq.from(Usuario.class);
            cq.select(usuario);
            cq.where(cb.equal(usuario.get("nome"), nome));
            List<Usuario> lista = sessao.createQuery(cq).getResultList();
            sessao.close();

            if (lista.isEmpty()) {
                return null;
            }
            return lista.get(0);

        } catch (Exception e) {
            if (sessao != null) {
                sessao.close();
            }
            throw e;
        }
    }

    public List<Usuario> listarUsuariosDasEquipes(List<Equipe> equipes) {

        Session sessao = ConexaoHibernate.getSessionFactory().openSession();

        CriteriaBuilder cb = sessao.getCriteriaBuilder();
        CriteriaQuery<Usuario> cq = cb.createQuery(Usuario.class);
        Root<Usuario> root = cq.from(Usuario.class);
        cq.select(root).where(root.get("equipe").in(equipes));
        List<Usuario> lista = sessao.createQuery(cq).getResultList();

        sessao.close();

        return lista;
    }

    public boolean possuiTarefasResponsavel(Usuario usuario) {

        Session sessao = ConexaoHibernate.getSessionFactory().openSession();

        CriteriaBuilder cb = sessao.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Tarefa> root = cq.from(Tarefa.class);

        cq.select(cb.count(root));
        cq.where(cb.equal(root.get("responsavel"), usuario));

        Long total = sessao.createQuery(cq).getSingleResult();
        sessao.close();

        return total > 0;
    }
}

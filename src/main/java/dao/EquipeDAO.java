package dao;

import domain.Alocacao;
import domain.Equipe;
import domain.Tarefa;
import domain.Usuario;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Karoliny
 */
public class EquipeDAO extends GenericDAO {

    public EquipeDAO() {
    }

    public int contarTarefasEquipe(Equipe equipe) {

        int total = 0;

        List<Tarefa> tarefas = new TarefaDAO().listar();
        for (Tarefa t : tarefas) {
            for (Alocacao a : t.getAlocacoes()) {
                if (a.getId().getEquipe().getId() == equipe.getId()) {
                    total++;
                    break;
                }
            }
        }

        return total;
    }

    public boolean possuiTarefas(Equipe equipe) {

        Session sessao = ConexaoHibernate.getSessionFactory().openSession();

        Long total = (Long) sessao.createQuery(
                "select count(a) from Alocacao a where a.id.equipe = :equipe")
                .setParameter("equipe", equipe)
                .uniqueResult();

        sessao.close();

        return total > 0;
    }

    public boolean possuiUsuarios(Equipe equipe) {

        List<Usuario> usuarios = listar(Usuario.class);

        for (Usuario u : usuarios) {
            if (u.getEquipe() != null
                    && u.getEquipe().getId() == equipe.getId()) {
                return true;
            }
        }

        return false;
    }
}

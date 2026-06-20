package dao;

import domain.Alocacao;
import domain.Equipe;
import domain.Status;
import domain.Tarefa;
import java.util.List;

/**
 *
 * @author Karoliny
 */
public class TarefaDAO extends GenericDAO {

    public TarefaDAO() {

    }

    public List<Tarefa> listar() {
        return super.listar(Tarefa.class);
    }

    public long contarTarefas() {
        return listar().size();
    }

    public long contarPorStatus(Status status) {
        long total = 0;
        for (Tarefa t : listar()) {
            if (t.getStatus() == status) {
                total++;
            }
        }
        return total;
    }

    public int contarTarefasEquipe(Equipe equipe) {
        int total = 0;

        List<Tarefa> tarefas = listar();
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
}

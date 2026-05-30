package dao;

import domain.Tarefa;
import java.util.List;
import org.hibernate.HibernateException;

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

    public void inserir(Tarefa tarefa) throws HibernateException {
        super.inserir(tarefa);
    }

}

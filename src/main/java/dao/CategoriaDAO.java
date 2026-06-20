package dao;

import domain.Categoria;
import org.hibernate.Session;

/**
 *
 * @author Karoliny
 */
public class CategoriaDAO extends GenericDAO {

    public CategoriaDAO() {

    }

    public boolean possuiTarefas(Categoria categoria) {

        Session sessao = ConexaoHibernate.getSessionFactory().openSession();

        Long total = (Long) sessao.createQuery(
                "select count(t) from Tarefa t where t.categoria = :cat")
                .setParameter("cat", categoria)
                .uniqueResult();

        sessao.close();

        return total > 0;
    }

}

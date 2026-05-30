package dao;

import domain.Equipe;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Karoliny
 */
public class EquipeDAO extends GenericDAO {

    public EquipeDAO() {

    }

    public void inserir(Equipe equipe) throws HibernateException {
        super.inserir(equipe);
    }

    public List<Equipe> listar() {
        return super.listar(Equipe.class);
    }

    private List<Equipe> pesquisar(int tipo, String pesq) throws HibernateException {
        List<Equipe> lista = new ArrayList<>();

        // TESTE
        lista = this.listar(Equipe.class);

        return lista;
    }

}

package dao;

import domain.Categoria;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Karoliny
 */
public class CategoriaDAO extends GenericDAO {

    public CategoriaDAO() {

    }

    public void inserir(Categoria categoria) throws HibernateException {
        super.inserir(categoria);
    }

    public List<Categoria> listar() {
        return super.listar(Categoria.class);
    }
    
        private List<Categoria> pesquisar(int tipo, String pesq) throws HibernateException {
        List<Categoria> lista = new ArrayList<>();

        // TESTE
        lista = this.listar(Categoria.class);

        return lista;
    }
}

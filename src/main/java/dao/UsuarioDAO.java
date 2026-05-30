package dao;

import domain.Equipe;
import domain.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Karoliny
 */
public class UsuarioDAO extends GenericDAO {

    public UsuarioDAO() {
    }

    public void inserir(Usuario usuario) throws HibernateException {
        super.inserir(usuario);
    }

    private List<Usuario> pesquisar(int tipo, String pesq) throws HibernateException {

        List<Usuario> lista = new ArrayList<>();

        // TESTE
        lista = this.listar(Usuario.class);

        return lista;
    }

}

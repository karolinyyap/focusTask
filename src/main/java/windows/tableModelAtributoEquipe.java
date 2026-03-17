
package windows;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Karoliny
 */
public class tableModelAtributoEquipe extends AbstractTableModel{

    private List listaEquipes = new ArrayList();
    
    @Override
    public int getRowCount() {
        return listaEquipes.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        AtributoEquipe equipe = (AtributoEquipe) listaEquipes.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return equipe.getNomeEquipe();
            case 1: return equipe.getSetor();
            case 2: return equipe.getLider();
            case 3: return equipe.getMembros();
        }
        
        return null;
    }
    
    @Override
    public String getColumnName (int column) {
        String nomes[] = {"Nome", "Setor", "Líder", "Membros"};
        return nomes[column];
    }
    
    public Object getTarefa (int rowIndex){
        return listaEquipes.get(rowIndex);
    }
    
    public void adicionar (Object obj) {
        listaEquipes.add(obj);
        fireTableRowsInserted( listaEquipes.size() - 1, listaEquipes.size() - 1 );
        
    }
    
    public void remover (int indice) {
        listaEquipes.remove(indice);
        fireTableRowsDeleted( indice, indice );
        
    }
    
    public void setLista(List novaLista) {
        if ( novaLista == null || novaLista.isEmpty()) {
            if ( !listaEquipes.isEmpty() ) {
                listaEquipes.clear();
                fireTableRowsDeleted(0,0);
            }
        } else {
            listaEquipes = novaLista;
            fireTableRowsInserted( 0, listaEquipes.size() - 1);
        }
        
    }
    
    public List getLista() {
        return listaEquipes;
    }
    
}

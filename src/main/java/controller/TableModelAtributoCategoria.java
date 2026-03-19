
package controller;

import domain.AtributoCategoria;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Karoliny
 */
public class TableModelAtributoCategoria extends AbstractTableModel{

     private List listaCategorias = new ArrayList();
    
    @Override
    public int getRowCount() {
        return listaCategorias.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        AtributoCategoria categoria = (AtributoCategoria) listaCategorias.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return categoria.getNome();
            case 1: return categoria.getDescricao();
        }
        
        return null;
    }
    
    @Override
    public String getColumnName (int column) {
        String nomes[] = {"Categoria", "Descrição"};
        return nomes[column];
    }
    
    public Object getTarefa (int rowIndex){
        return listaCategorias.get(rowIndex);
    }
    
    public void adicionar (Object obj) {
        listaCategorias.add(obj);
        fireTableRowsInserted( listaCategorias.size() - 1, listaCategorias.size() - 1 );
        
    }
    
    public void remover (int indice) {
        listaCategorias.remove(indice);
        fireTableRowsDeleted( indice, indice );
        
    }
    
    public void setLista(List novaLista) {
        if ( novaLista == null || novaLista.isEmpty()) {
            if ( !listaCategorias.isEmpty() ) {
                listaCategorias.clear();
                fireTableRowsDeleted(0,0);
            }
        } else {
            listaCategorias = novaLista;
            fireTableRowsInserted( 0, listaCategorias.size() - 1);
        }
        
    }
    
    public List getLista() {
        return listaCategorias;
    }
    
}

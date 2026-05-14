
package controller;

import domain.Tarefa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelTarefa extends AbstractTableModel{

    private List listaTarefas = new ArrayList();
    
    @Override
    public int getRowCount() {
        return listaTarefas.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Tarefa tarefa = (Tarefa) listaTarefas.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return tarefa.getNome();
            case 1: return tarefa.getCategoria();
            case 2: return tarefa.getDataLimite();
            case 3: return tarefa.getEquipes();
            case 4: return tarefa.getPrioridade();
            case 5: return tarefa.getStatus();
        }
        
        return null;
    }
    
    @Override
    public String getColumnName (int column) {
        String nomes[] = {"Nome", "Equipe", "Prioridade", "Data Limite", "Categoria", "Status"};
        return nomes[column];
    }
    
    public Object getTarefa (int rowIndex){
        return listaTarefas.get(rowIndex);
    }
    
    public void adicionar (Object obj) {
        listaTarefas.add(obj);
        fireTableRowsInserted( listaTarefas.size() - 1, listaTarefas.size() - 1 );
        
    }
    
    public void remover (int indice) {
        listaTarefas.remove(indice);
        fireTableRowsDeleted( indice, indice );
        
    }
    
    public void setLista(List novaLista) {
        if ( novaLista == null || novaLista.isEmpty()) {
            if ( !listaTarefas.isEmpty() ) {
                listaTarefas.clear();
                fireTableRowsDeleted(0,0);
            }
        } else {
            listaTarefas = novaLista;
            fireTableRowsInserted( 0, listaTarefas.size() - 1);
        }
        
    }
    
    public List getLista() {
        return listaTarefas;
    }
    
}

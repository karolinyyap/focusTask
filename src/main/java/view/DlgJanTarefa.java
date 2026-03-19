package view;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import domain.AtributoTarefa;
import controller.TableModelAtributoTarefa;
/**
 *
 * @author Karoliny
 */
public class DlgJanTarefa extends javax.swing.JDialog {
    private TableModelAtributoTarefa tblModelTarefa;

    public DlgJanTarefa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        btnSalvarTarefa.setEnabled(false);

        // Listener do campo nome
        txtNomeTarefa.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                verificarCampos();
            }
        });
        
        tblModelTarefa = new TableModelAtributoTarefa();
        tabelaListarTarefa.setModel(tblModelTarefa);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUpMenu = new javax.swing.JPopupMenu();
        menuLimpar = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenuItem();
        menuExcluir = new javax.swing.JMenuItem();
        painelTitulo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        panelTabela = new javax.swing.JTabbedPane();
        tabCadastrar = new javax.swing.JPanel();
        labelNomeTarefa = new javax.swing.JLabel();
        txtNomeTarefa = new javax.swing.JTextField();
        labelCategoria = new javax.swing.JLabel();
        labelDtLimite = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        comboBoxCategoria = new javax.swing.JComboBox<>();
        txtDtLimite = new javax.swing.JFormattedTextField();
        comboBoxStatus = new javax.swing.JComboBox<>();
        btnSalvarTarefa = new javax.swing.JButton();
        labelPrioridade = new javax.swing.JLabel();
        comboBoxPrioridade = new javax.swing.JComboBox<>();
        panelEquipe = new javax.swing.JPanel();
        labelEquipe = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listEquipes = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaListarTarefa = new javax.swing.JTable();
        btnVoltarJanTarefa = new javax.swing.JButton();

        menuLimpar.setText("Limpar");
        menuLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLimparActionPerformed(evt);
            }
        });
        popUpMenu.add(menuLimpar);

        menuEditar.setText("Editar");
        menuEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarActionPerformed(evt);
            }
        });
        popUpMenu.add(menuEditar);

        menuExcluir.setText("Excluir");
        menuExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluirActionPerformed(evt);
            }
        });
        popUpMenu.add(menuExcluir);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FocusTask - Tarefas");

        txtTitulo.setFont(new java.awt.Font("Source Sans Pro Black", 0, 24)); // NOI18N
        txtTitulo.setText("TAREFAS");

        javax.swing.GroupLayout painelTituloLayout = new javax.swing.GroupLayout(painelTitulo);
        painelTitulo.setLayout(painelTituloLayout);
        painelTituloLayout.setHorizontalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTituloLayout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addComponent(txtTitulo)
                .addGap(197, 197, 197))
        );
        painelTituloLayout.setVerticalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabCadastrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabCadastrar.setToolTipText("");

        labelNomeTarefa.setText("Nome da tarefa");

        txtNomeTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeTarefaActionPerformed(evt);
            }
        });

        labelCategoria.setText("Categoria");

        labelDtLimite.setText("Data Limite");

        labelStatus.setText("Status");

        comboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "             ", "Desenvolvimento", "Manutenção", "Entregas", "Reunião", "Documentação" }));

        try {
            txtDtLimite.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtLimite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDtLimiteActionPerformed(evt);
            }
        });

        comboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A começar", "Em andamento", "Completa" }));

        btnSalvarTarefa.setText("Salvar");
        btnSalvarTarefa.setEnabled(false);
        btnSalvarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarTarefaActionPerformed(evt);
            }
        });

        labelPrioridade.setText("Prioridade");

        comboBoxPrioridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Média", "Baixa" }));

        panelEquipe.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelEquipe.setText("Equipe");

        listEquipes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listEquipes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Marketing", "Comunicação", "Recursos Humanos" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listEquipes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listEquipesValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listEquipes);

        javax.swing.GroupLayout panelEquipeLayout = new javax.swing.GroupLayout(panelEquipe);
        panelEquipe.setLayout(panelEquipeLayout);
        panelEquipeLayout.setHorizontalGroup(
            panelEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquipeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEquipe)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelEquipeLayout.setVerticalGroup(
            panelEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquipeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEquipe)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelaListarTarefa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tarefa", "Equipe", "Prioridade", "Data Limite", "Categoria", "Status"
            }
        ));
        tabelaListarTarefa.setComponentPopupMenu(popUpMenu);
        jScrollPane4.setViewportView(tabelaListarTarefa);

        javax.swing.GroupLayout tabCadastrarLayout = new javax.swing.GroupLayout(tabCadastrar);
        tabCadastrar.setLayout(tabCadastrarLayout);
        tabCadastrarLayout.setHorizontalGroup(
            tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCadastrarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCadastrarLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(tabCadastrarLayout.createSequentialGroup()
                        .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboBoxStatus, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDtLimite)
                                        .addComponent(txtNomeTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                        .addComponent(labelDtLimite)
                                        .addComponent(labelNomeTarefa)
                                        .addComponent(comboBoxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(labelCategoria)))
                            .addComponent(labelStatus)
                            .addComponent(btnSalvarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboBoxPrioridade, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelEquipe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabCadastrarLayout.createSequentialGroup()
                                .addComponent(labelPrioridade)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(29, 29, 29))))
        );
        tabCadastrarLayout.setVerticalGroup(
            tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCadastrarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(tabCadastrarLayout.createSequentialGroup()
                        .addComponent(labelNomeTarefa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelDtLimite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDtLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(labelCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStatus)
                    .addComponent(labelPrioridade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnSalvarTarefa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelTabela.addTab("Cadastrar Tarefa", tabCadastrar);

        btnVoltarJanTarefa.setText("<< Voltar");
        btnVoltarJanTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarJanTarefaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVoltarJanTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltarJanTarefa)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarJanTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarJanTarefaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarJanTarefaActionPerformed

    private void listEquipesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listEquipesValueChanged

    }//GEN-LAST:event_listEquipesValueChanged

    private void btnSalvarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarTarefaActionPerformed
        String nomeTarefa = txtNomeTarefa.getText();
        String dataLimite = txtDtLimite.getText();

        List<String> equipesSelecionadas = listEquipes.getSelectedValuesList();
        String nomeEquipe = String.join(", ", equipesSelecionadas);

        String tipoCategoria = comboBoxCategoria.getSelectedItem().toString();
        String tipoStatus = comboBoxStatus.getSelectedItem().toString();
        String tipoPrioridade = comboBoxPrioridade.getSelectedItem().toString();

        adicionarTabela(nomeTarefa, nomeEquipe, tipoPrioridade, dataLimite, tipoCategoria, tipoStatus);
    }//GEN-LAST:event_btnSalvarTarefaActionPerformed

    private void txtDtLimiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDtLimiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDtLimiteActionPerformed

    private void txtNomeTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeTarefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeTarefaActionPerformed

    private void menuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_menuExcluirActionPerformed

    private void menuLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_menuLimparActionPerformed

    private void menuEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarActionPerformed
        editar();
    }//GEN-LAST:event_menuEditarActionPerformed

    //Função de adicionar linhas da tabela
    private void adicionarTabela(String nomeTarefa, String nomeEquipe, String tipoPrioridade,
            String dataLimite, String tipoCategoria, String tipoStatus){
        
        AtributoTarefa tarefa = new AtributoTarefa(nomeTarefa, nomeEquipe, tipoPrioridade,
            dataLimite, tipoCategoria, tipoStatus);
        
        tblModelTarefa.adicionar(tarefa);
        /*
        //Contador de linhas
        int linha = tabelaListarTarefa.getRowCount();
        
        //Transformando para tabela padrão
        ((DefaultTableModel)tabelaListarTarefa.getModel()).addRow(new Object[7]);
        tabelaListarTarefa.setValueAt(nomeTarefa, linha, 0);
        tabelaListarTarefa.setValueAt(nomeEquipe, linha, 1);
        tabelaListarTarefa.setValueAt(usuarioResponsavel, linha, 2);
        tabelaListarTarefa.setValueAt(tipoPrioridade, linha, 3);
        tabelaListarTarefa.setValueAt(dataLimite, linha, 4);
        tabelaListarTarefa.setValueAt(tipoCategoria, linha, 5);
        tabelaListarTarefa.setValueAt(tipoStatus, linha, 6);*/
        
    }
    
    private void verificarCampos() {
        boolean temTexto = !txtNomeTarefa.getText().trim().isEmpty();
        boolean equipeSelecionada = !listEquipes.isSelectionEmpty();

        btnSalvarTarefa.setEnabled(temTexto);
    }
    
    private void excluir() {
        int linha = tabelaListarTarefa.getSelectedRow();

        if (linha >= 0) {

            int resposta = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja realmente excluir?",
                    "Confirmar exclusão",
                    JOptionPane.YES_NO_OPTION
            );

            if (resposta == JOptionPane.YES_OPTION) {
                TableModelAtributoTarefa modelo = (TableModelAtributoTarefa) tabelaListarTarefa.getModel();
                modelo.remover(linha);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }
    }
    
    private void limparCampos() {
        txtNomeTarefa.setText("");
        txtDtLimite.setText("");

        comboBoxCategoria.setSelectedIndex(-1);
        comboBoxStatus.setSelectedIndex(-1);
        comboBoxPrioridade.setSelectedIndex(-1);

        listEquipes.clearSelection();
    }
    
    private void editar() {
        int linha = tabelaListarTarefa.getSelectedRow();
        
        if (linha >= 0){
            txtNomeTarefa.setText(tabelaListarTarefa.getValueAt(linha, 0).toString());
            
            String equipe = tabelaListarTarefa.getValueAt(linha, 1).toString();
            for (int i = 0; i < listEquipes.getModel().getSize(); i++) {
                String item = listEquipes.getModel().getElementAt(i);
                if (equipe.contains(item)) {
                    listEquipes.addSelectionInterval(i, i);
                }
            }
            comboBoxPrioridade.setSelectedItem(tabelaListarTarefa.getValueAt(linha, 2).toString());
            txtDtLimite.setText(tabelaListarTarefa.getValueAt(linha, 3).toString());
            comboBoxCategoria.setSelectedItem(tabelaListarTarefa.getValueAt(linha, 4).toString());
            comboBoxStatus.setSelectedItem(tabelaListarTarefa.getValueAt(linha, 5).toString());
            
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DlgJanTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgJanTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgJanTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgJanTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgJanTarefa dialog = new DlgJanTarefa(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
  
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarTarefa;
    private javax.swing.JButton btnVoltarJanTarefa;
    private javax.swing.JComboBox<String> comboBoxCategoria;
    private javax.swing.JComboBox<String> comboBoxPrioridade;
    private javax.swing.JComboBox<String> comboBoxStatus;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelDtLimite;
    private javax.swing.JLabel labelEquipe;
    private javax.swing.JLabel labelNomeTarefa;
    private javax.swing.JLabel labelPrioridade;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JList<String> listEquipes;
    private javax.swing.JMenuItem menuEditar;
    private javax.swing.JMenuItem menuExcluir;
    private javax.swing.JMenuItem menuLimpar;
    private javax.swing.JPanel painelTitulo;
    private javax.swing.JPanel panelEquipe;
    private javax.swing.JTabbedPane panelTabela;
    private javax.swing.JPopupMenu popUpMenu;
    private javax.swing.JPanel tabCadastrar;
    private javax.swing.JTable tabelaListarTarefa;
    private javax.swing.JFormattedTextField txtDtLimite;
    private javax.swing.JTextField txtNomeTarefa;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}

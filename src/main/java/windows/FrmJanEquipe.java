
package windows;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Karoliny
 */
public class FrmJanEquipe extends javax.swing.JDialog {
    private tableModelAtributoEquipe tblModelEquipe;


    public FrmJanEquipe(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        comboBoxLider.setEnabled(false);
        btnSalvarEquipe.setEnabled(false);
        
        listPessoasEquipe.addListSelectionListener(e -> {
            verificarEquipeSelecionada();
         });
        
         // Listener do campo nome
        txtNomeEquipe.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                verificarCampos();
            }
        });
        
        tblModelEquipe = new tableModelAtributoEquipe();
        tableEquipe.setModel(tblModelEquipe);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUpMenuEquipes = new javax.swing.JPopupMenu();
        menuLimpar = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenuItem();
        menuExcluir = new javax.swing.JMenuItem();
        painelTituloEquipe = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        paneCadEquipe = new javax.swing.JTabbedPane();
        paneCadastrarEquipe = new javax.swing.JPanel();
        labelNomeEquipe = new javax.swing.JLabel();
        txtNomeEquipe = new javax.swing.JTextField();
        labelLider = new javax.swing.JLabel();
        comboBoxLider = new javax.swing.JComboBox<>();
        panelMembros = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPessoasEquipe = new javax.swing.JList<>();
        btnSalvarEquipe = new javax.swing.JButton();
        labelSetor = new javax.swing.JLabel();
        comboBoxSetor = new javax.swing.JComboBox<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        tableEquipe = new javax.swing.JTable();
        btnVoltarJanEquipe = new javax.swing.JButton();

        menuLimpar.setText("Limpar");
        menuLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLimparActionPerformed(evt);
            }
        });
        popUpMenuEquipes.add(menuLimpar);

        menuEditar.setText("Editar");
        menuEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarActionPerformed(evt);
            }
        });
        popUpMenuEquipes.add(menuEditar);

        menuExcluir.setText("Excluir");
        menuExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluirActionPerformed(evt);
            }
        });
        popUpMenuEquipes.add(menuExcluir);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FocusTask - Equipes");

        txtTitulo.setFont(new java.awt.Font("Source Sans Pro Black", 0, 24)); // NOI18N
        txtTitulo.setText("Equipes");

        javax.swing.GroupLayout painelTituloEquipeLayout = new javax.swing.GroupLayout(painelTituloEquipe);
        painelTituloEquipe.setLayout(painelTituloEquipeLayout);
        painelTituloEquipeLayout.setHorizontalGroup(
            painelTituloEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTituloEquipeLayout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(txtTitulo)
                .addGap(197, 197, 197))
        );
        painelTituloEquipeLayout.setVerticalGroup(
            painelTituloEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTituloEquipeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitulo)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        paneCadastrarEquipe.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelNomeEquipe.setText("Nome da equipe");

        txtNomeEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeEquipeActionPerformed(evt);
            }
        });

        labelLider.setText("Líder");

        comboBoxLider.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "              ", "Luisa", "Felipe", "Camila", "Paula", "Lucas" }));
        comboBoxLider.setEnabled(false);

        panelMembros.setBorder(javax.swing.BorderFactory.createTitledBorder("Membros"));

        listPessoasEquipe.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ana Luisa Feliz", "Paulo Candido", "Samuel Vieira", "Lucas Almeida", "Pamela Laerte" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listPessoasEquipe);

        javax.swing.GroupLayout panelMembrosLayout = new javax.swing.GroupLayout(panelMembros);
        panelMembros.setLayout(panelMembrosLayout);
        panelMembrosLayout.setHorizontalGroup(
            panelMembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMembrosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelMembrosLayout.setVerticalGroup(
            panelMembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMembrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnSalvarEquipe.setText("Salvar");
        btnSalvarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarEquipeActionPerformed(evt);
            }
        });

        labelSetor.setText("Setor");

        comboBoxSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "           ", "Marketing", "Comunicação", "T.I." }));

        tableEquipe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Equipe", "Setor", "Líder", "Membros"
            }
        ));
        tableEquipe.setComponentPopupMenu(popUpMenuEquipes);
        jScrollPane10.setViewportView(tableEquipe);

        javax.swing.GroupLayout paneCadastrarEquipeLayout = new javax.swing.GroupLayout(paneCadastrarEquipe);
        paneCadastrarEquipe.setLayout(paneCadastrarEquipeLayout);
        paneCadastrarEquipeLayout.setHorizontalGroup(
            paneCadastrarEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCadastrarEquipeLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(paneCadastrarEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addGroup(paneCadastrarEquipeLayout.createSequentialGroup()
                        .addGroup(paneCadastrarEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneCadastrarEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelNomeEquipe)
                                .addComponent(labelSetor)
                                .addComponent(comboBoxSetor, 0, 204, Short.MAX_VALUE)
                                .addComponent(txtNomeEquipe)
                                .addComponent(labelLider)
                                .addComponent(comboBoxLider, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnSalvarEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelMembros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        paneCadastrarEquipeLayout.setVerticalGroup(
            paneCadastrarEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCadastrarEquipeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(paneCadastrarEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(paneCadastrarEquipeLayout.createSequentialGroup()
                        .addComponent(labelNomeEquipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelSetor)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelLider)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxLider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvarEquipe))
                    .addComponent(panelMembros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        paneCadEquipe.addTab("Cadastrar Equipe", paneCadastrarEquipe);

        btnVoltarJanEquipe.setText("<< Voltar");
        btnVoltarJanEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarJanEquipeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVoltarJanEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paneCadEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(painelTituloEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTituloEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paneCadEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltarJanEquipe)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarJanEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarJanEquipeActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarJanEquipeActionPerformed

    private void txtNomeEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeEquipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeEquipeActionPerformed

    private void btnSalvarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEquipeActionPerformed
        String nomeEquipe = txtNomeEquipe.getText();
        String setor = comboBoxSetor.getSelectedItem().toString();
        String lider = comboBoxLider.getSelectedItem().toString();
        
        List<String> pessoasSelecionadas = listPessoasEquipe.getSelectedValuesList();
        String equipe = String.join(", ", pessoasSelecionadas);
        
        adicionarTabela(nomeEquipe, setor, lider, equipe);
    }//GEN-LAST:event_btnSalvarEquipeActionPerformed

    private void menuLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_menuLimparActionPerformed

    private void menuEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarActionPerformed
        editar();
    }//GEN-LAST:event_menuEditarActionPerformed

    private void menuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_menuExcluirActionPerformed

    private void verificarEquipeSelecionada() {

        boolean equipeSelecionada = !listPessoasEquipe.isSelectionEmpty();
        comboBoxLider.setEnabled(equipeSelecionada);
    }
    
    private void verificarCampos() {
        boolean temTexto = !txtNomeEquipe.getText().trim().isEmpty();

        btnSalvarEquipe.setEnabled(temTexto);
    }
    
    private void adicionarTabela(String nomeEquipe, String setor, String lider,
            String equipe){
        
        AtributoEquipe tarefa = new AtributoEquipe(nomeEquipe, setor, lider,
            equipe);
        
        tblModelEquipe.adicionar(tarefa);

    }
    
    private void excluir() {
        int linha = tableEquipe.getSelectedRow();

        if (linha >= 0) {

            int resposta = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja realmente excluir?",
                    "Confirmar exclusão",
                    JOptionPane.YES_NO_OPTION
            );

            if (resposta == JOptionPane.YES_OPTION) {
                tableModelAtributoEquipe modelo = (tableModelAtributoEquipe) tableEquipe.getModel();
                modelo.remover(linha);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }
    }
    
    private void limparCampos() {
        txtNomeEquipe.setText("");

        comboBoxSetor.setSelectedIndex(-1);
        comboBoxLider.setSelectedIndex(-1);

        listPessoasEquipe.clearSelection();
    }
    
    private void editar() {
        int linha = tableEquipe.getSelectedRow();
        
        if (linha >= 0){
            txtNomeEquipe.setText(tableEquipe.getValueAt(linha, 0).toString());
            
            String pessoas = tableEquipe.getValueAt(linha, 3).toString();
            for (int i = 0; i < listPessoasEquipe.getModel().getSize(); i++) {
                String item = listPessoasEquipe.getModel().getElementAt(i);
                if (pessoas.contains(item)) {
                    listPessoasEquipe.addSelectionInterval(i, i);
                }
            }
            comboBoxSetor.setSelectedItem(tableEquipe.getValueAt(linha, 1).toString());
            comboBoxLider.setSelectedItem(tableEquipe.getValueAt(linha, 2).toString());
            
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
            java.util.logging.Logger.getLogger(FrmJanEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmJanEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmJanEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmJanEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmJanEquipe dialog = new FrmJanEquipe(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnSalvarEquipe;
    private javax.swing.JButton btnVoltarJanEquipe;
    private javax.swing.JComboBox<String> comboBoxLider;
    private javax.swing.JComboBox<String> comboBoxSetor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JLabel labelLider;
    private javax.swing.JLabel labelNomeEquipe;
    private javax.swing.JLabel labelSetor;
    private javax.swing.JList<String> listPessoasEquipe;
    private javax.swing.JMenuItem menuEditar;
    private javax.swing.JMenuItem menuExcluir;
    private javax.swing.JMenuItem menuLimpar;
    private javax.swing.JPanel painelTituloEquipe;
    private javax.swing.JTabbedPane paneCadEquipe;
    private javax.swing.JPanel paneCadastrarEquipe;
    private javax.swing.JPanel panelMembros;
    private javax.swing.JPopupMenu popUpMenuEquipes;
    private javax.swing.JTable tableEquipe;
    private javax.swing.JTextField txtNomeEquipe;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}

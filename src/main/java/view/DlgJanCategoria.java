
package view;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import domain.AtributoCategoria;
import controller.TableModelAtributoCategoria;

/**
 *
 * @author Karoliny
 */
public class DlgJanCategoria extends javax.swing.JDialog {
    private TableModelAtributoCategoria tblModelCategoria;
    
    public DlgJanCategoria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
         // Listener do campo nome
        txtNomeCategoria.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                verificarCampos();
            }
        });
        
        tblModelCategoria = new TableModelAtributoCategoria();
        tabelaListarCategoria.setModel(tblModelCategoria);
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
        txtNomeCategoria = new javax.swing.JTextField();
        labelDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescricaoCategorias = new javax.swing.JTextArea();
        btnSalvarCategoria = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaListarCategoria = new javax.swing.JTable();
        btnVoltarJanCategoria = new javax.swing.JButton();

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
        setTitle("FocusTask - Categorias");

        txtTitulo.setFont(new java.awt.Font("Source Sans Pro Black", 0, 24)); // NOI18N
        txtTitulo.setText("Categorias");

        javax.swing.GroupLayout painelTituloLayout = new javax.swing.GroupLayout(painelTitulo);
        painelTitulo.setLayout(painelTituloLayout);
        painelTituloLayout.setHorizontalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTituloLayout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(txtTitulo)
                .addGap(197, 197, 197))
        );
        painelTituloLayout.setVerticalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitulo)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tabCadastrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabCadastrar.setToolTipText("");

        labelNomeTarefa.setText("Nome da categoria");

        txtNomeCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCategoriaActionPerformed(evt);
            }
        });

        labelDescricao.setText("Descrição");

        txtAreaDescricaoCategorias.setColumns(20);
        txtAreaDescricaoCategorias.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescricaoCategorias);

        btnSalvarCategoria.setText("Salvar");
        btnSalvarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCategoriaActionPerformed(evt);
            }
        });

        tabelaListarCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Categoria", "Descrição"
            }
        ));
        tabelaListarCategoria.setComponentPopupMenu(popUpMenu);
        jScrollPane2.setViewportView(tabelaListarCategoria);

        javax.swing.GroupLayout tabCadastrarLayout = new javax.swing.GroupLayout(tabCadastrar);
        tabCadastrar.setLayout(tabCadastrarLayout);
        tabCadastrarLayout.setHorizontalGroup(
            tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCadastrarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(tabCadastrarLayout.createSequentialGroup()
                        .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNomeCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelNomeTarefa))
                            .addComponent(btnSalvarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDescricao)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        tabCadastrarLayout.setVerticalGroup(
            tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCadastrarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeTarefa)
                    .addComponent(labelDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabCadastrarLayout.createSequentialGroup()
                        .addComponent(txtNomeCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvarCategoria)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        panelTabela.addTab("Cadastrar Categoria", tabCadastrar);

        btnVoltarJanCategoria.setText("<< Voltar");
        btnVoltarJanCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarJanCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnVoltarJanCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltarJanCategoria)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarJanCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarJanCategoriaActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarJanCategoriaActionPerformed

    private void txtNomeCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCategoriaActionPerformed

    private void btnSalvarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCategoriaActionPerformed
        String nomeCategoria = txtNomeCategoria.getText();
        String descricao = txtAreaDescricaoCategorias.getText();
        
        adicionarTabela(nomeCategoria, descricao);
    }//GEN-LAST:event_btnSalvarCategoriaActionPerformed

    private void menuLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_menuLimparActionPerformed

    private void menuEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarActionPerformed
        editar();
    }//GEN-LAST:event_menuEditarActionPerformed

    private void menuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_menuExcluirActionPerformed

    private void verificarCampos() {
        boolean temTexto = !txtNomeCategoria.getText().trim().isEmpty();

        btnSalvarCategoria.setEnabled(temTexto);
    }
    
    private void adicionarTabela(String nomeCategoria, String descricao){
        
        AtributoCategoria tarefa = new AtributoCategoria(nomeCategoria, descricao);
        
        tblModelCategoria.adicionar(tarefa);

    }
    
    private void excluir() {
        int linha = tabelaListarCategoria.getSelectedRow();

        if (linha >= 0) {

            int resposta = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja realmente excluir?",
                    "Confirmar exclusão",
                    JOptionPane.YES_NO_OPTION
            );

            if (resposta == JOptionPane.YES_OPTION) {
                TableModelAtributoCategoria modelo = (TableModelAtributoCategoria) tabelaListarCategoria.getModel();
                modelo.remover(linha);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }
    }
    
    private void limparCampos() {
        txtNomeCategoria.setText("");
        txtAreaDescricaoCategorias.setText("");
    }
    
    private void editar() {
        int linha = tabelaListarCategoria.getSelectedRow();
        
        if (linha >= 0){
            txtNomeCategoria.setText(tabelaListarCategoria.getValueAt(linha, 0).toString());
            txtAreaDescricaoCategorias.setText(tabelaListarCategoria.getValueAt(linha, 1).toString());
            
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
            java.util.logging.Logger.getLogger(DlgJanCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgJanCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgJanCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgJanCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgJanCategoria dialog = new DlgJanCategoria(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnSalvarCategoria;
    private javax.swing.JButton btnVoltarJanCategoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelNomeTarefa;
    private javax.swing.JMenuItem menuEditar;
    private javax.swing.JMenuItem menuExcluir;
    private javax.swing.JMenuItem menuLimpar;
    private javax.swing.JPanel painelTitulo;
    private javax.swing.JTabbedPane panelTabela;
    private javax.swing.JPopupMenu popUpMenu;
    private javax.swing.JPanel tabCadastrar;
    private javax.swing.JTable tabelaListarCategoria;
    private javax.swing.JTextArea txtAreaDescricaoCategorias;
    private javax.swing.JTextField txtNomeCategoria;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}

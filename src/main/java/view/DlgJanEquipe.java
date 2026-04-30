package view;

import static controller.FuncoesUteis.strToDate;
import controller.GerenciadorInterface;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import domain.Equipe;
import controller.TableModelEquipe;
import domain.Usuario;

/**
 *
 * @author Karoliny
 */
public class DlgJanEquipe extends javax.swing.JDialog {

    private TableModelEquipe tblModelEquipe;

    public DlgJanEquipe(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        btnSalvarEquipe.setEnabled(false);

        // Listener do campo nome
        txtNomeEquipe.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                verificarCampos();
            }
        });

        tblModelEquipe = new TableModelEquipe();
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
                "Equipe", "Setor"
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
                .addGroup(paneCadastrarEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paneCadastrarEquipeLayout.createSequentialGroup()
                        .addComponent(btnSalvarEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(paneCadastrarEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                        .addGroup(paneCadastrarEquipeLayout.createSequentialGroup()
                            .addGroup(paneCadastrarEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelNomeEquipe)
                                .addComponent(txtNomeEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(24, 24, 24)
                            .addGroup(paneCadastrarEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelSetor)
                                .addComponent(comboBoxSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28))
        );
        paneCadastrarEquipeLayout.setVerticalGroup(
            paneCadastrarEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCadastrarEquipeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(paneCadastrarEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeEquipe)
                    .addComponent(labelSetor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneCadastrarEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnSalvarEquipe)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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
                .addComponent(paneCadEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnVoltarJanEquipe)
                .addContainerGap(30, Short.MAX_VALUE))
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
        try {
            Equipe equipe = new Equipe();

            equipe.setNomeEquipe(txtNomeEquipe.getText());
            equipe.setSetor(comboBoxSetor.getSelectedItem().toString());
            
            GerenciadorInterface.getMyInstance().getDominio().inserirEquipe(equipe);

            JOptionPane.showMessageDialog(null, "Equipe salva com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao salvar equipe");
        }
        //Fazer Listar ao invés de inserir na tabela
        //inserirTabela(nomeEquipe, setor);
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

    private void verificarCampos() {
        boolean temTexto = !txtNomeEquipe.getText().trim().isEmpty();

        btnSalvarEquipe.setEnabled(temTexto);
    }

    private void inserirTabela(String nomeEquipe, String setor) {

        Equipe equipe = new Equipe();
        equipe.setNomeEquipe(nomeEquipe);
        equipe.setSetor(setor);

        tblModelEquipe.adicionar(equipe);

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
                TableModelEquipe modelo = (TableModelEquipe) tableEquipe.getModel();
                modelo.remover(linha);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para excluir!");
        }
    }

    private void limparCampos() {
        txtNomeEquipe.setText("");

        comboBoxSetor.setSelectedIndex(-1);
    }

    private void editar() {
        int linha = tableEquipe.getSelectedRow();

        if (linha >= 0) {
            txtNomeEquipe.setText(tableEquipe.getValueAt(linha, 0).toString());
            comboBoxSetor.setSelectedItem(tableEquipe.getValueAt(linha, 1).toString());

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
            java.util.logging.Logger.getLogger(DlgJanEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgJanEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgJanEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgJanEquipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgJanEquipe dialog = new DlgJanEquipe(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> comboBoxSetor;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JLabel labelNomeEquipe;
    private javax.swing.JLabel labelSetor;
    private javax.swing.JMenuItem menuEditar;
    private javax.swing.JMenuItem menuExcluir;
    private javax.swing.JMenuItem menuLimpar;
    private javax.swing.JPanel painelTituloEquipe;
    private javax.swing.JTabbedPane paneCadEquipe;
    private javax.swing.JPanel paneCadastrarEquipe;
    private javax.swing.JPopupMenu popUpMenuEquipes;
    private javax.swing.JTable tableEquipe;
    private javax.swing.JTextField txtNomeEquipe;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}

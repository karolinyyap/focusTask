/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.GerenciadorInterface;
import domain.Equipe;
import domain.Status;
import java.util.List;

/**
 *
 * @author Karoliny
 */
public class DlgJanRelatorio extends javax.swing.JDialog {

    /**
     * Creates new form FrmJanRelatorio
     */
    public DlgJanRelatorio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        carregarResumo();
        carregarRelatorioEquipe();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelTitulo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        panelTotalTarefas = new javax.swing.JPanel();
        labelTotalTarefas = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        panelTarefasPendentes = new javax.swing.JPanel();
        labelTarefasComecar = new javax.swing.JLabel();
        lblAcomecar1 = new javax.swing.JLabel();
        panelTarefasEmAndamento = new javax.swing.JPanel();
        labelTarefasAndamento = new javax.swing.JLabel();
        lblAndamento = new javax.swing.JLabel();
        panelTarefasConcluidas = new javax.swing.JPanel();
        labelTarefasFinalizadas = new javax.swing.JLabel();
        lblFinalizadas = new javax.swing.JLabel();
        panelTarefaEquipe = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRelatorio = new javax.swing.JTextArea();
        btnVoltarRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FocusTask - Relatórios");

        txtTitulo.setFont(new java.awt.Font("Source Sans Pro Black", 0, 24)); // NOI18N
        txtTitulo.setText("RELATÓRIOS DO SISTEMA");

        javax.swing.GroupLayout painelTituloLayout = new javax.swing.GroupLayout(painelTitulo);
        painelTitulo.setLayout(painelTituloLayout);
        painelTituloLayout.setHorizontalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTitulo)
                .addGap(197, 197, 197))
        );
        painelTituloLayout.setVerticalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTituloLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtTitulo)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        panelTotalTarefas.setBackground(new java.awt.Color(179, 217, 255));
        panelTotalTarefas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelTotalTarefas.setForeground(new java.awt.Color(255, 255, 255));

        labelTotalTarefas.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        labelTotalTarefas.setText("TOTAL DE TAREFAS");

        lblTotal.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblTotal.setText("0");

        javax.swing.GroupLayout panelTotalTarefasLayout = new javax.swing.GroupLayout(panelTotalTarefas);
        panelTotalTarefas.setLayout(panelTotalTarefasLayout);
        panelTotalTarefasLayout.setHorizontalGroup(
            panelTotalTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalTarefasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelTotalTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTotalTarefas))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panelTotalTarefasLayout.setVerticalGroup(
            panelTotalTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalTarefasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelTotalTarefas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        panelTarefasPendentes.setBackground(new java.awt.Color(255, 50, 50));
        panelTarefasPendentes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelTarefasComecar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        labelTarefasComecar.setText("A COMEÇAR");

        lblAcomecar1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblAcomecar1.setText("0");

        javax.swing.GroupLayout panelTarefasPendentesLayout = new javax.swing.GroupLayout(panelTarefasPendentes);
        panelTarefasPendentes.setLayout(panelTarefasPendentesLayout);
        panelTarefasPendentesLayout.setHorizontalGroup(
            panelTarefasPendentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTarefasPendentesLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(labelTarefasComecar)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTarefasPendentesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAcomecar1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panelTarefasPendentesLayout.setVerticalGroup(
            panelTarefasPendentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTarefasPendentesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(labelTarefasComecar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAcomecar1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTarefasEmAndamento.setBackground(new java.awt.Color(255, 255, 69));
        panelTarefasEmAndamento.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelTarefasAndamento.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        labelTarefasAndamento.setText("EM ANDAMENTO");

        lblAndamento.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblAndamento.setText("0");

        javax.swing.GroupLayout panelTarefasEmAndamentoLayout = new javax.swing.GroupLayout(panelTarefasEmAndamento);
        panelTarefasEmAndamento.setLayout(panelTarefasEmAndamentoLayout);
        panelTarefasEmAndamentoLayout.setHorizontalGroup(
            panelTarefasEmAndamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTarefasEmAndamentoLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(panelTarefasEmAndamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTarefasEmAndamentoLayout.createSequentialGroup()
                        .addComponent(labelTarefasAndamento)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTarefasEmAndamentoLayout.createSequentialGroup()
                        .addComponent(lblAndamento, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        panelTarefasEmAndamentoLayout.setVerticalGroup(
            panelTarefasEmAndamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTarefasEmAndamentoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelTarefasAndamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAndamento, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTarefasConcluidas.setBackground(new java.awt.Color(57, 255, 106));
        panelTarefasConcluidas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelTarefasFinalizadas.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        labelTarefasFinalizadas.setText("FINALIZADAS");

        lblFinalizadas.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblFinalizadas.setText("0");

        javax.swing.GroupLayout panelTarefasConcluidasLayout = new javax.swing.GroupLayout(panelTarefasConcluidas);
        panelTarefasConcluidas.setLayout(panelTarefasConcluidasLayout);
        panelTarefasConcluidasLayout.setHorizontalGroup(
            panelTarefasConcluidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTarefasConcluidasLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(labelTarefasFinalizadas)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTarefasConcluidasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFinalizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panelTarefasConcluidasLayout.setVerticalGroup(
            panelTarefasConcluidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTarefasConcluidasLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelTarefasFinalizadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFinalizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTarefaEquipe.setBorder(javax.swing.BorderFactory.createTitledBorder("Tarefas por Equipe"));

        txtRelatorio.setColumns(20);
        txtRelatorio.setRows(5);
        jScrollPane1.setViewportView(txtRelatorio);

        javax.swing.GroupLayout panelTarefaEquipeLayout = new javax.swing.GroupLayout(panelTarefaEquipe);
        panelTarefaEquipe.setLayout(panelTarefaEquipeLayout);
        panelTarefaEquipeLayout.setHorizontalGroup(
            panelTarefaEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTarefaEquipeLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTarefaEquipeLayout.setVerticalGroup(
            panelTarefaEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTarefaEquipeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnVoltarRelatorio.setText("<< Voltar");
        btnVoltarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnVoltarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelTarefaEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(panelTotalTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelTarefasPendentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelTarefasEmAndamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelTarefasConcluidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTarefasPendentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTarefasEmAndamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTarefasConcluidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTotalTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addComponent(panelTarefaEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltarRelatorio)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarRelatorioActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarRelatorioActionPerformed

    private void carregarResumo() {

        lblTotal.setText(String.valueOf(
                GerenciadorInterface.getMyInstance().getDominio().contarTarefas()));

        lblAcomecar1.setText(String.valueOf(
                GerenciadorInterface.getMyInstance().getDominio()
                        .contarPorStatus(Status.A_COMECAR)));

        lblAndamento.setText(String.valueOf(
                GerenciadorInterface.getMyInstance().getDominio()
                        .contarPorStatus(Status.EM_ANDAMENTO)));

        lblFinalizadas.setText(String.valueOf(
                GerenciadorInterface.getMyInstance().getDominio()
                        .contarPorStatus(Status.FINALIZADA)));
    }

    private void carregarRelatorioEquipe() {

        txtRelatorio.setText("");

        List<Equipe> equipes = GerenciadorInterface.getMyInstance().getDominio().listar(Equipe.class);

        for (Equipe e : equipes) {
            int total = GerenciadorInterface.getMyInstance().getDominio().contarTarefasEquipe(e);

            txtRelatorio.append(
                    e.getNome()
                    + "\nTotal de tarefas: "
                    + total
                    + "\n\n"
            );
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
            java.util.logging.Logger.getLogger(DlgJanRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgJanRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgJanRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgJanRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgJanRelatorio dialog = new DlgJanRelatorio(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnVoltarRelatorio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTarefasAndamento;
    private javax.swing.JLabel labelTarefasComecar;
    private javax.swing.JLabel labelTarefasFinalizadas;
    private javax.swing.JLabel labelTotalTarefas;
    private javax.swing.JLabel lblAcomecar1;
    private javax.swing.JLabel lblAndamento;
    private javax.swing.JLabel lblFinalizadas;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel painelTitulo;
    private javax.swing.JPanel panelTarefaEquipe;
    private javax.swing.JPanel panelTarefasConcluidas;
    private javax.swing.JPanel panelTarefasEmAndamento;
    private javax.swing.JPanel panelTarefasPendentes;
    private javax.swing.JPanel panelTotalTarefas;
    private javax.swing.JTextArea txtRelatorio;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}

package view;

import static controller.FuncoesUteis.dateToStr;
import static controller.FuncoesUteis.strToDate;
import controller.GerenciadorInterface;
import java.util.List;
import javax.swing.JOptionPane;
import domain.Tarefa;
import controller.TableModelTarefa;
import domain.Alocacao;
import domain.AlocacaoPK;
import domain.Categoria;
import domain.Equipe;
import domain.Prioridade;
import domain.Status;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Karoliny
 */
public class DlgJanTarefa extends javax.swing.JDialog {

    private TableModelTarefa tblModelTarefa;

    public DlgJanTarefa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        btnSalvarTarefa.setEnabled(true);
        carregarEquipes();

        try {
            List<Categoria> lista = GerenciadorInterface.getMyInstance().getDominio().listarCategoria();
            carregarComboCategorias(lista);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao carregar Categoria");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar classe");
        }

        tblModelTarefa = new TableModelTarefa();
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
        labelDtInicio = new javax.swing.JLabel();
        txtDtInicio = new javax.swing.JFormattedTextField();
        btnListar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
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

        comboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A começar", "Em andamento", "Finalizada" }));

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
        listEquipes.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                listEquipesComponentShown(evt);
            }
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEquipeLayout.setVerticalGroup(
            panelEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquipeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEquipe)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
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

        labelDtInicio.setText("Data Início");

        try {
            txtDtInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDtInicioActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabCadastrarLayout = new javax.swing.GroupLayout(tabCadastrar);
        tabCadastrar.setLayout(tabCadastrarLayout);
        tabCadastrarLayout.setHorizontalGroup(
            tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCadastrarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCadastrarLayout.createSequentialGroup()
                        .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBoxStatus, 0, 226, Short.MAX_VALUE)
                            .addComponent(txtDtLimite)
                            .addComponent(txtNomeTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(labelDtLimite)
                            .addComponent(labelNomeTarefa)
                            .addComponent(labelStatus)
                            .addComponent(labelDtInicio)
                            .addComponent(txtDtInicio))
                        .addGap(45, 45, 45)
                        .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCategoria)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabCadastrarLayout.createSequentialGroup()
                                .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboBoxPrioridade, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBoxCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelEquipe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabCadastrarLayout.createSequentialGroup()
                                        .addComponent(labelPrioridade)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(57, 57, 57))))
                    .addGroup(tabCadastrarLayout.createSequentialGroup()
                        .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tabCadastrarLayout.createSequentialGroup()
                                .addComponent(btnSalvarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 44, Short.MAX_VALUE))))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelDtInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelDtLimite))
                    .addGroup(tabCadastrarLayout.createSequentialGroup()
                        .addComponent(panelEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelCategoria)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDtLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPrioridade)
                    .addComponent(labelStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarTarefa)
                    .addComponent(btnListar)
                    .addComponent(btnAlterar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addGap(15, 15, 15))
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
        try {
            Tarefa tarefa = new Tarefa();

            tarefa.setNome(txtNomeTarefa.getText());
            tarefa.setDataInicio(strToDate(txtDtInicio.getText()));
            tarefa.setDataLimite(strToDate(txtDtLimite.getText()));

            List<Equipe> equipesSelecionadas = listEquipes.getSelectedValuesList();

            List<Alocacao> alocacoes = new ArrayList<>();

            for (Equipe equipe : equipesSelecionadas) {

                AlocacaoPK pk = new AlocacaoPK();
                pk.setTarefa(tarefa);
                pk.setEquipe(equipe);

                Alocacao alocacao = new Alocacao();
                alocacao.setId(pk);

                alocacoes.add(alocacao);
            }

            tarefa.setAlocacoes(alocacoes);

            tarefa.setCategoria((Categoria) comboBoxCategoria.getSelectedItem());
            tarefa.setStatus((Status) comboBoxStatus.getSelectedItem());
            tarefa.setPrioridade((Prioridade) comboBoxPrioridade.getSelectedItem());

            GerenciadorInterface.getMyInstance().getDominio().inserirTarefa(tarefa);

            JOptionPane.showMessageDialog(null, "Tarefa salva com sucesso!");

            carregarTabela();
            limparCampos();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao salvar tarefa");
        }
    }//GEN-LAST:event_btnSalvarTarefaActionPerformed

    private void txtDtLimiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDtLimiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDtLimiteActionPerformed

    private void txtNomeTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeTarefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeTarefaActionPerformed

    private void menuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirActionPerformed
        try {
            int linha = tabelaListarTarefa.getSelectedRow();

            if (linha == -1) {
                JOptionPane.showMessageDialog(null, "Selecione uma tarefa!");
                return;
            }

            Tarefa tarefa = (Tarefa) tblModelTarefa.getTarefa(linha);

            int confirm = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja excluir a tarefa \"" + tarefa.getNome() + "\"?",
                    "Confirmar Exclusão",
                    JOptionPane.YES_NO_OPTION
            );

            if (confirm == JOptionPane.YES_OPTION) {
                GerenciadorInterface.getMyInstance().getDominio().excluirTarefa(tarefa.getId());

                JOptionPane.showMessageDialog(null, "Tarefa excluída com sucesso!");

                carregarTabela();
                limparCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_menuExcluirActionPerformed

    private void menuLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_menuLimparActionPerformed

    private void menuEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarActionPerformed
        try {
            btnSalvarTarefa.setEnabled(false);
            btnAlterar.setEnabled(true);

            int linha = tabelaListarTarefa.getSelectedRow();

            if (linha == -1) {
                JOptionPane.showMessageDialog(null, "Selecione uma tarefa!");
                return;
            }

            Tarefa tarefa = (Tarefa) tblModelTarefa.getTarefa(linha);

            txtNomeTarefa.setText(tarefa.getNome());
            txtDtInicio.setText(dateToStr(tarefa.getDataInicio()));
            txtDtLimite.setText(dateToStr(tarefa.getDataLimite()));

            List<Equipe> equipes = tarefa.getEquipes();
            selecionarEquipes(equipes);

            comboBoxCategoria.setSelectedItem(tarefa.getCategoria());
            comboBoxStatus.setSelectedItem(tarefa.getStatus());
            comboBoxPrioridade.setSelectedItem(tarefa.getPrioridade());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_menuEditarActionPerformed

    private void txtDtInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDtInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDtInicioActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            int linha = tabelaListarTarefa.getSelectedRow();

            if (linha == -1) {
                JOptionPane.showMessageDialog(null, "Selecione uma tarefa!");
                return;
            }

            Tarefa tarefa = (Tarefa) tblModelTarefa.getTarefa(linha);

            tarefa.setNome(txtNomeTarefa.getText());
            tarefa.setDataInicio(strToDate(txtDtInicio.getText()));
            tarefa.setDataLimite(strToDate(txtDtLimite.getText()));

            List<Equipe> equipesSelecionadas = listEquipes.getSelectedValuesList();

            List<Alocacao> alocacoes = new ArrayList<>();

            for (Equipe equipe : equipesSelecionadas) {

                AlocacaoPK pk = new AlocacaoPK();
                pk.setTarefa(tarefa);
                pk.setEquipe(equipe);

                Alocacao alocacao = new Alocacao();
                alocacao.setId(pk);

                alocacoes.add(alocacao);
            }

            tarefa.setAlocacoes(alocacoes);

            tarefa.setCategoria((Categoria) comboBoxCategoria.getSelectedItem());
            tarefa.setStatus((Status) comboBoxStatus.getSelectedItem());
            tarefa.setPrioridade((Prioridade) comboBoxPrioridade.getSelectedItem());

            GerenciadorInterface.getMyInstance().getDominio().alterarTarefa(tarefa);

            JOptionPane.showMessageDialog(null, "Tarefa editada com sucesso!");

            carregarTabela();
            limparCampos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        carregarTabela();
    }//GEN-LAST:event_btnListarActionPerformed

    private void listEquipesComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_listEquipesComponentShown

    }//GEN-LAST:event_listEquipesComponentShown

    private void verificarCampos() {
        boolean nomePreenchido = !txtNomeTarefa.getText().trim().isEmpty();
        boolean dtInicioPreenchida = !txtDtInicio.getText().trim().isEmpty();
        boolean dtLimitePreenchida = !txtDtLimite.getText().trim().isEmpty();

        boolean categoriaSelecionada = comboBoxCategoria.getSelectedIndex() >= 0;
        boolean statusSelecionado = comboBoxStatus.getSelectedIndex() >= 0;
        boolean prioridadeSelecionada = comboBoxPrioridade.getSelectedIndex() >= 0;

        boolean equipeSelecionada = !listEquipes.isSelectionEmpty();

        btnSalvarTarefa.setEnabled(nomePreenchido && dtInicioPreenchida && dtLimitePreenchida && categoriaSelecionada && statusSelecionado && prioridadeSelecionada && equipeSelecionada);
    }

    private void limparCampos() {
        txtNomeTarefa.setText("");
        txtDtLimite.setText("");
        txtDtInicio.setText("");

        comboBoxCategoria.setSelectedIndex(-1);
        comboBoxStatus.setSelectedIndex(-1);
        comboBoxPrioridade.setSelectedIndex(-1);

        listEquipes.clearSelection();
    }

    private void carregarComboCategorias(List<Categoria> listaCategorias) {
        comboBoxCategoria.removeAllItems();

        for (Categoria categoria : listaCategorias) {
            comboBoxCategoria.addItem(categoria);
        }
    }

    private void carregarTabela() {
        try {
            Tarefa tarefa = new Tarefa();

            List<Tarefa> lista = GerenciadorInterface.getMyInstance().getDominio().listarTarefa();

            tblModelTarefa.setLista(lista);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    private void carregarEquipes() {
        try {
            List<Equipe> equipes = GerenciadorInterface.getMyInstance()
                    .getDominio()
                    .listarEquipes();

            DefaultListModel<Equipe> model = new DefaultListModel<>();

            for (Equipe e : equipes) {
                model.addElement(e);
            }

            listEquipes.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar equipes: " + e.getMessage());
        }
    }

    private void selecionarEquipes(List<Equipe> equipesTarefa) {
        DefaultListModel<Equipe> model = (DefaultListModel<Equipe>) listEquipes.getModel();
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < model.getSize(); i++) {
            Equipe e = model.getElementAt(i);

            for (Equipe eq : equipesTarefa) {
                if (e.getId() == eq.getId()) {
                    indices.add(i);
                    break;
                }
            }
        }

        int[] array = indices.stream().mapToInt(i -> i).toArray();
        listEquipes.setSelectedIndices(array);
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
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnSalvarTarefa;
    private javax.swing.JButton btnVoltarJanTarefa;
    private javax.swing.JComboBox<Object> comboBoxCategoria;
    private javax.swing.JComboBox<Object> comboBoxPrioridade;
    private javax.swing.JComboBox<String> comboBoxStatus;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelDtInicio;
    private javax.swing.JLabel labelDtLimite;
    private javax.swing.JLabel labelEquipe;
    private javax.swing.JLabel labelNomeTarefa;
    private javax.swing.JLabel labelPrioridade;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JList<Equipe> listEquipes;
    private javax.swing.JMenuItem menuEditar;
    private javax.swing.JMenuItem menuExcluir;
    private javax.swing.JMenuItem menuLimpar;
    private javax.swing.JPanel painelTitulo;
    private javax.swing.JPanel panelEquipe;
    private javax.swing.JTabbedPane panelTabela;
    private javax.swing.JPopupMenu popUpMenu;
    private javax.swing.JPanel tabCadastrar;
    private javax.swing.JTable tabelaListarTarefa;
    private javax.swing.JFormattedTextField txtDtInicio;
    private javax.swing.JFormattedTextField txtDtLimite;
    private javax.swing.JTextField txtNomeTarefa;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}

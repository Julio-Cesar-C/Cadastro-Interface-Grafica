package view;

import javax.swing.JOptionPane;
import model.Aluno;
import model.TabelaModelo;
import model.Turma;

public class Cadastra extends javax.swing.JDialog {

    private Turma turma;
    int i = 0;

    public Cadastra(java.awt.Frame parent, boolean modal, Turma turma) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.turma = turma;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRA = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jBGravar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jTBLimpar = new javax.swing.JButton();
        jTBSair = new javax.swing.JButton();
        jBProximo = new javax.swing.JButton();
        jBPrimeiro = new javax.swing.JButton();
        jBAnterior = new javax.swing.JButton();
        jBUltimo = new javax.swing.JButton();
        jbTabela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)), "CADASTRA ALUNO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel2.setText("R.A:");

        txtIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdadeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel3.setText("Idade:");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel4.setText("Telefone :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRA, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jBGravar.setBackground(new java.awt.Color(255, 255, 255));
        jBGravar.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jBGravar.setForeground(new java.awt.Color(0, 51, 255));
        jBGravar.setText("Gravar");
        jBGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGravarActionPerformed(evt);
            }
        });

        jBExcluir.setBackground(new java.awt.Color(255, 255, 255));
        jBExcluir.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jBExcluir.setForeground(new java.awt.Color(0, 51, 255));
        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBAlterar.setBackground(new java.awt.Color(255, 255, 255));
        jBAlterar.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jBAlterar.setForeground(new java.awt.Color(0, 51, 255));
        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jTBLimpar.setBackground(new java.awt.Color(255, 255, 255));
        jTBLimpar.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jTBLimpar.setForeground(new java.awt.Color(0, 51, 255));
        jTBLimpar.setText("Novo");
        jTBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBLimparActionPerformed(evt);
            }
        });

        jTBSair.setBackground(new java.awt.Color(255, 255, 255));
        jTBSair.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jTBSair.setForeground(new java.awt.Color(0, 51, 255));
        jTBSair.setText("Sair");
        jTBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBSairActionPerformed(evt);
            }
        });

        jBProximo.setBackground(new java.awt.Color(255, 255, 255));
        jBProximo.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jBProximo.setForeground(new java.awt.Color(0, 51, 255));
        jBProximo.setText("<");
        jBProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProximoActionPerformed(evt);
            }
        });

        jBPrimeiro.setBackground(new java.awt.Color(255, 255, 255));
        jBPrimeiro.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jBPrimeiro.setForeground(new java.awt.Color(0, 51, 255));
        jBPrimeiro.setText("<<");
        jBPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPrimeiroActionPerformed(evt);
            }
        });

        jBAnterior.setBackground(new java.awt.Color(255, 255, 255));
        jBAnterior.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jBAnterior.setForeground(new java.awt.Color(0, 51, 255));
        jBAnterior.setText(">");
        jBAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnteriorActionPerformed(evt);
            }
        });

        jBUltimo.setBackground(new java.awt.Color(255, 255, 255));
        jBUltimo.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jBUltimo.setForeground(new java.awt.Color(0, 51, 255));
        jBUltimo.setText(">>");
        jBUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUltimoActionPerformed(evt);
            }
        });

        jbTabela.setBackground(new java.awt.Color(255, 255, 255));
        jbTabela.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jbTabela.setForeground(new java.awt.Color(0, 51, 255));
        jbTabela.setText("Tabela");
        jbTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBGravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBPrimeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBProximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(jBAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(jBUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBExcluir)
                            .addComponent(jbTabela))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBUltimo)
                            .addComponent(jTBSair)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBAnterior))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTBLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBProximo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBPrimeiro)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void jBGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGravarActionPerformed
        String simNao[] = {"Sim", "Nao"};
        if (txtNome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Nome", "Aviso", 0);
            txtNome.setText("");
            txtNome.requestFocusInWindow();
            return;
        }
        if (txtRA.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o campo RA", "Aviso", 0);
            txtRA.setText("");
            txtRA.requestFocusInWindow();
            return;
        }
        if (txtTelefone.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o campo Telefone", "Aviso", 0);
            txtTelefone.setText("");
            txtTelefone.requestFocusInWindow();
            return;
        }
        if (txtIdade.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha o campo idade", "Aviso", 0);
            txtIdade.setText("");
            txtIdade.requestFocusInWindow();
            return;
        }
        if (txtNome != null) {
            int salva = JOptionPane.showOptionDialog(null,
                    "Confirma os dados?",
                    "Gravando...",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null, simNao, simNao[0]);
            if (salva == 0) {
                Aluno p = new Aluno();
                p.setNome(txtNome.getText());
                p.setRA(txtRA.getText());
                p.setIdade(Integer.parseInt(txtIdade.getText()));
                p.setTelefone(txtTelefone.getText());
                turma.adiciona(p);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Dê sua opinião", "Aviso", 0);
        }
    }//GEN-LAST:event_jBGravarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        Aluno p = new Aluno();
        TabelaModelo tabela = new TabelaModelo();
        tabela.excluiLinha(i);
        txtNome.requestFocusInWindow();
        turma.excluir(p, i);
        txtNome.setText(null);
        txtRA.setText(null);
        txtIdade.setText(null);
        txtTelefone.setText(null);
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        String nome = txtNome.getText();
        String ra = txtRA.getText();
        int idade = Integer.parseInt(txtIdade.getText());
        String tel = txtTelefone.getText();
        
        turma.editar(i, nome,ra ,idade , tel);
        
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jTBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBLimparActionPerformed
        txtNome.setText(null);
        txtRA.setText(null);
        txtIdade.setText(null);
        txtTelefone.setText(null);
    }//GEN-LAST:event_jTBLimparActionPerformed

    private void jTBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBSairActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jTBSairActionPerformed

    private void jBProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProximoActionPerformed
             if(i >= turma.getTotAlunosArmazenados()-1){
                i=0;
            txtNome.setText(turma.alunosToString()[i][0]);
            txtRA.setText(turma.alunosToString()[i][1]);
            txtIdade.setText(turma.alunosToString()[i][2]);
            txtTelefone.setText(turma.alunosToString()[i][3]);
             }else{
             i++;
            txtNome.setText(turma.alunosToString()[i][0]);
            txtRA.setText(turma.alunosToString()[i][1]);
            txtIdade.setText(turma.alunosToString()[i][2]);
            txtTelefone.setText(turma.alunosToString()[i][3]);
    }       
    }//GEN-LAST:event_jBProximoActionPerformed

    private void jBPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPrimeiroActionPerformed
        i=0;
        txtNome.setText(turma.alunosToString()[i][0]);
        txtRA.setText(turma.alunosToString()[i][1]);
        txtIdade.setText(turma.alunosToString()[i][2]);
        txtTelefone.setText(turma.alunosToString()[i][3]);
                
    }//GEN-LAST:event_jBPrimeiroActionPerformed

    private void jBAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnteriorActionPerformed
            if(i <=0){
                i = turma.getTotAlunosArmazenados();
            }
            i--;
            txtNome.setText(turma.alunosToString()[i][0]);
            txtRA.setText(turma.alunosToString()[i][1]);
            txtIdade.setText(turma.alunosToString()[i][2]);
            txtTelefone.setText(turma.alunosToString()[i][3]);
    }//GEN-LAST:event_jBAnteriorActionPerformed

    private void jBUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUltimoActionPerformed
        i = turma.getTotAlunosArmazenados()-1;
        txtNome.setText(turma.alunosToString()[i][0]);
        txtRA.setText(turma.alunosToString()[i][1]);
        txtIdade.setText(turma.alunosToString()[i][2]);
        txtTelefone.setText(turma.alunosToString()[i][3]);
    }//GEN-LAST:event_jBUltimoActionPerformed

    private void txtIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdadeActionPerformed

    private void jbTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTabelaActionPerformed
        Tabela lista = new Tabela(null, true, turma);
        lista.setLocationRelativeTo(null);
        lista.setVisible(true);
    }//GEN-LAST:event_jbTabelaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBAnterior;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBGravar;
    private javax.swing.JButton jBPrimeiro;
    private javax.swing.JButton jBProximo;
    private javax.swing.JButton jBUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jTBLimpar;
    private javax.swing.JButton jTBSair;
    private javax.swing.JButton jbTabela;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRA;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}

package view;

import javax.swing.JScrollBar;
import model.TabelaModelo;
import model.Turma;

public class Tabela extends javax.swing.JDialog {

    private Turma turma;
    private TabelaModelo tabelaModelo;

    public Tabela(java.awt.Frame parent, boolean modal, Turma turma) { // PASSANDO CONTRUTOR DE ALUNOTABLEMODEL
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.turma = turma;
        exibePesquisa();
    }

   

    private void exibePesquisa() {
        String[] colunas = new String[]{"Nome", "RA", "Idade", "Telefone"};
        tabelaModelo = new TabelaModelo(turma.alunosToString(), colunas);
        jTableAlunos.setModel(tabelaModelo);
        jScrollPane1.setHorizontalScrollBar(new JScrollBar(0));
        jTableAlunos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlunos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TABELA DE ALUNOS");

        jTableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableAlunos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlunos;
    // End of variables declaration//GEN-END:variables
}

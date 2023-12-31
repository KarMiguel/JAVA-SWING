/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Questao4;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlo
 */
public class TelaToList extends javax.swing.JFrame {

    /**
     * Creates new form TelaToList
     */
    private static final String DEFAULT_CATEGORY = "Selecione uma categoría";

    public TelaToList() {
        initComponents();
        updateTable();
        this.setLocationRelativeTo(null);
        StatusCellRenderer statusRenderer = new StatusCellRenderer();
        tableTarefas.setDefaultRenderer(Object.class, statusRenderer);
        initializeTableRenderer();
    }

    private void initializeTableRenderer() {
        StatusCellRenderer statusRenderer = new StatusCellRenderer();
        for (int i = 0; i < tableTarefas.getColumnCount(); i++) {
            tableTarefas.getColumnModel().getColumn(i).setCellRenderer(statusRenderer);
        }
    }

    public class StatusCellRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

            boolean status = (boolean) table.getValueAt(row, 2);

            if (status) {
                component.setBackground(Color.GREEN);
            } else {
                component.setBackground(table.getBackground());
            }

            return component;

        }
    }

    private void updateTable() {
        DefaultTableModel dtmTable = (DefaultTableModel) tableTarefas.getModel();
        dtmTable.setRowCount(0);

        String categoria = comboBoxCategoriaListar.getSelectedItem().toString();

        for (int i = 0; i < ToList.getListTarefas().size(); i++) {

            if ("Todos".equals(categoria) || ToList.getListTarefas().get(i).getCategoria().equals(categoria)) {

                Object[] rowData = new Object[]{
                    ToList.getListTarefas().get(i).getTarefa(),
                    ToList.getListTarefas().get(i).getCategoria(),
                    ToList.getListTarefas().get(i).isConcluida()
                };
    initializeTableRenderer();

                dtmTable.addRow(rowData);

            }
        }

        tableTarefas.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jComboBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        txtTarefa = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTarefas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        comboBoxCategoriaListar = new javax.swing.JComboBox<>();
        btnRemoverTarefa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setText("Gerenciador de Tarefas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoría"));

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma categoría", "Trabalho", "Resídencia", "Saúde", "Estudo", "Lazer", "Outro" }));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox, 0, 231, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tarefa"));

        txtTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTarefaActionPerformed(evt);
            }
        });

        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tableTarefas.setBackground(new java.awt.Color(255, 0, 0));
        tableTarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tarefa", "Categoria", "Status"
            }
        ));
        tableTarefas.setGridColor(new java.awt.Color(255, 0, 0));
        tableTarefas.setInheritsPopupMenu(true);
        tableTarefas.setRowHeight(50);
        tableTarefas.setSelectionBackground(new java.awt.Color(51, 255, 102));
        tableTarefas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTarefasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableTarefas);

        jLabel2.setText("Deseja Listar Tarefas em qual Categoría?");

        comboBoxCategoriaListar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Trabalho", "Resídencia", "Saúde", "Estudo", "Lazer", "Outro" }));
        comboBoxCategoriaListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCategoriaListarActionPerformed(evt);
            }
        });

        btnRemoverTarefa.setBackground(new java.awt.Color(255, 51, 51));
        btnRemoverTarefa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRemoverTarefa.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoverTarefa.setText("Clique na linha 2x para remover Tarefa");
        btnRemoverTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverTarefaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Selecione a tarefa para concluí-la ou remove-la");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 56, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRemoverTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(222, 222, 222))
            .addGroup(layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboBoxCategoriaListar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(327, 327, 327))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxCategoriaListar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoverTarefa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (txtTarefa.getText().equals("") || jComboBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos corretamente!", "Campos em branco ou inválidos", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String tarefa = txtTarefa.getText();
        String categoria = jComboBox.getSelectedItem().toString();

        ToList atv = new ToList(tarefa, categoria);
        ToList.addTarefa(atv);
        updateTable();
        txtTarefa.setText("");
        jComboBox.setSelectedItem(DEFAULT_CATEGORY);

    }//GEN-LAST:event_btnAddActionPerformed

    private void comboBoxCategoriaListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCategoriaListarActionPerformed
        updateTable();
    }//GEN-LAST:event_comboBoxCategoriaListarActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void tableTarefasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTarefasMouseClicked

        int selectedRow = tableTarefas.getSelectedRow();
        if (selectedRow != -1) {
            ToList toListTask = ToList.getListTarefas().get(selectedRow);
            toListTask.marcarComoConcluida();
            updateTable();
        }
        tableTarefas.clearSelection();

    }//GEN-LAST:event_tableTarefasMouseClicked

    private void btnRemoverTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverTarefaActionPerformed
        int linhaSelecionada = tableTarefas.getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha na tabela de Tarefas para excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (ToList.getListTarefas().get(linhaSelecionada).isConcluida() == true) {
            DefaultTableModel dtm = (DefaultTableModel) tableTarefas.getModel();
            int confirmarRemocao = JOptionPane.showConfirmDialog(rootPane, "Realmente deseja remover esta Tarefa?", "Confirmar Remoção", JOptionPane.YES_NO_OPTION);

            if (confirmarRemocao == JOptionPane.YES_OPTION) {
                ToList.removerTarefaLista(linhaSelecionada);
                dtm.removeRow(linhaSelecionada);
                dtm.fireTableDataChanged();
                JOptionPane.showMessageDialog(rootPane, "Tarefa removida com sucesso!!!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                updateTable();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Conclua a tarefa primeiro para remover.", "Tarefa não concluída", JOptionPane.ERROR_MESSAGE);
            }
                tableTarefas.clearSelection();

        }
    }//GEN-LAST:event_btnRemoverTarefaActionPerformed

    private void txtTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTarefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTarefaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaToList.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaToList.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaToList.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaToList.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                java.awt.EventQueue.invokeLater(() -> new TelaToList().setVisible(true));
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemoverTarefa;
    private javax.swing.JComboBox<String> comboBoxCategoriaListar;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableTarefas;
    private javax.swing.JTextField txtTarefa;
    // End of variables declaration//GEN-END:variables
}

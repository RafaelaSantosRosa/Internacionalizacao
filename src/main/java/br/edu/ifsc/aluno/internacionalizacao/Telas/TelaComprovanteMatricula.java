package br.edu.ifsc.aluno.internacionalizacao.Telas;

import java.util.ArrayList;
import java.util.ResourceBundle;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaComprovanteMatricula extends javax.swing.JFrame {

    private void alterarInformacoes(ResourceBundle traducoes, ArrayList<String> registros) {
        lblComprovante.setText(traducoes.getString("cad_tituloComprovante"));
        String conteudo = "";
        for (int i = 0; i < registros.size(); i++) {
            conteudo += registros.get(i);
            conteudo += "\n";

        }
        txtPanelComprovante.setText(conteudo);
    }

    public TelaComprovanteMatricula(ResourceBundle traducao, ArrayList<String> registros) {
        initComponents();
        txtPanelComprovante.setEditable(false);
        alterarInformacoes(traducao, registros);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblComprovante = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPanelComprovante = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblComprovante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblComprovante.setText("COMPROVANTE DE MATRÍCULA");

        jScrollPane2.setViewportView(txtPanelComprovante);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lblComprovante)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblComprovante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblComprovante;
    private javax.swing.JTextPane txtPanelComprovante;
    // End of variables declaration//GEN-END:variables
}

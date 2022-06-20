
package br.edu.ifsc.aluno.internacionalizacao.Telas;

import java.util.Locale;
import java.util.ResourceBundle;

public class TelaPrincipal extends javax.swing.JFrame {
    
    public static String idioma, pais;
    TelaCadastroMatricula telaMatricula;
    
    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBR = new javax.swing.JButton();
        btnES = new javax.swing.JButton();
        btnEUA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnBR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-brasil-30.png"))); // NOI18N
        btnBR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBRMouseClicked(evt);
            }
        });

        btnES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-espanha-2-30.png"))); // NOI18N
        btnES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnESMouseClicked(evt);
            }
        });

        btnEUA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-eua-30.png"))); // NOI18N
        btnEUA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEUAMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(btnBR)
                .addGap(42, 42, 42)
                .addComponent(btnES)
                .addGap(43, 43, 43)
                .addComponent(btnEUA)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEUA)
                    .addComponent(btnES)
                    .addComponent(btnBR))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBRMouseClicked
        idioma = "pt";
        pais = "BR";
        Locale localCorrente = new Locale(idioma, pais);
        ResourceBundle traducoes = ResourceBundle.getBundle("MessagesBundle", localCorrente);
        this.telaMatricula = new TelaCadastroMatricula(traducoes);
        telaMatricula.setLocationRelativeTo(null);
        telaMatricula.setVisible(true);
    }//GEN-LAST:event_btnBRMouseClicked

    private void btnESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnESMouseClicked
        idioma = "es";
        pais = "ES";
        Locale localCorrente = new Locale(idioma, pais);
        ResourceBundle traducoes = ResourceBundle.getBundle("MessagesBundle", localCorrente);
        this.telaMatricula = new TelaCadastroMatricula(traducoes);
        telaMatricula.setLocationRelativeTo(null);
        telaMatricula.setVisible(true);
    }//GEN-LAST:event_btnESMouseClicked

    private void btnEUAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEUAMouseClicked
        idioma = "en";
        pais = "US";
        Locale localCorrente = new Locale(idioma, pais);
        ResourceBundle traducoes = ResourceBundle.getBundle("MessagesBundle", localCorrente);
        this.telaMatricula = new TelaCadastroMatricula(traducoes);
        telaMatricula.setLocationRelativeTo(null);
        telaMatricula.setVisible(true);
    }//GEN-LAST:event_btnEUAMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBR;
    private javax.swing.JButton btnES;
    private javax.swing.JButton btnEUA;
    // End of variables declaration//GEN-END:variables
}

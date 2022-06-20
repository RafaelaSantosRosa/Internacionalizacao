package br.edu.ifsc.aluno.internacionalizacao.Telas;

import static br.edu.ifsc.aluno.internacionalizacao.Telas.TelaPrincipal.idioma;
import static br.edu.ifsc.aluno.internacionalizacao.Telas.TelaPrincipal.pais;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

;

public class TelaCadastroMatricula extends javax.swing.JFrame {

    ArrayList<String> registros = new ArrayList();

    private void alterarInformacoes(ResourceBundle traducoes) {
        lblNome.setText(traducoes.getString("cad_aluno_nome"));
        lblMatricula.setText(traducoes.getString("cad_aluno_matricula"));
        lblTitulo.setText(traducoes.getString("cad_titulo"));
        btnCadastrar.setText(traducoes.getString("btn_cadastrar"));
        cbxLab.setText(traducoes.getString("cbx_1"));
        cbxEstatistica.setText(traducoes.getString("cbx_2"));
        cbxEngSof.setText(traducoes.getString("cbx_3"));
        cbxComp.setText(traducoes.getString("cbx_4"));
        cbxBanco.setText(traducoes.getString("cbx_5"));
    }

    private void adicionarRegistros() {
        registros.add("Nome Aluno: " + txtNome.getText());
        registros.add("Matrícula: " + txtMatricula.getText());
        registros.add("Cursando: ");
        if (cbxLab.isSelected()) {
            registros.add(cbxLab.getText());
        }
        if (cbxEstatistica.isSelected()) {
            registros.add(cbxEstatistica.getText());
        }
        if (cbxEngSof.isSelected()) {
            registros.add(cbxEngSof.getText());
        }
        if (cbxComp.isSelected()) {
            registros.add(cbxComp.getText());
        }
        if (cbxBanco.isSelected()) {
            registros.add(cbxBanco.getText());
        }
    }

    public TelaCadastroMatricula(ResourceBundle resource) {
        initComponents();
        alterarInformacoes(resource);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        cbxLab = new javax.swing.JCheckBox();
        cbxEstatistica = new javax.swing.JCheckBox();
        cbxEngSof = new javax.swing.JCheckBox();
        cbxComp = new javax.swing.JCheckBox();
        cbxBanco = new javax.swing.JCheckBox();
        txtNome = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setText("CADASTRO DE MATRÍCULA");

        lblNome.setText("Nome Aluno:");

        lblMatricula.setText("Número de Matrícula:");

        cbxLab.setText("Laboratório de Programação");

        cbxEstatistica.setText("Estatística");

        cbxEngSof.setText("Engenharia de Software");

        cbxComp.setText("Compiladores");

        cbxBanco.setText("Banco de Dados");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxBanco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxComp)
                            .addComponent(cbxLab)
                            .addComponent(cbxEstatistica)
                            .addComponent(cbxEngSof)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblMatricula)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblNome)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTitulo)
                                        .addComponent(txtNome)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatricula)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cbxLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxEstatistica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxEngSof)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxComp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar)
                    .addComponent(cbxBanco))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        if ((txtMatricula.getText() == null || txtMatricula.getText().trim().equals("")) || (txtNome.getText() == null || txtNome.getText().trim().equals("")))
            JOptionPane.showMessageDialog(null, "Os campos Nome e Matrícula devem ser preenchidos");
        else if (!cbxBanco.isSelected() && !cbxComp.isSelected() && !cbxEngSof.isSelected() && !cbxEstatistica.isSelected() && !cbxLab.isSelected()) {
            JOptionPane.showMessageDialog(null, "Selecione pelo menos uma disciplina para matricular-se");
        } else {
            adicionarRegistros();
            Locale localCorrente = new Locale(idioma, pais);
            ResourceBundle traducoes = ResourceBundle.getBundle("MessagesBundle", localCorrente);
            TelaComprovanteMatricula telaCompravante = new TelaComprovanteMatricula(traducoes, registros);
            telaCompravante.setLocationRelativeTo(null);
            telaCompravante.setVisible(true);
        }
    }//GEN-LAST:event_btnCadastrarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbxBanco;
    private javax.swing.JCheckBox cbxComp;
    private javax.swing.JCheckBox cbxEngSof;
    private javax.swing.JCheckBox cbxEstatistica;
    private javax.swing.JCheckBox cbxLab;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}

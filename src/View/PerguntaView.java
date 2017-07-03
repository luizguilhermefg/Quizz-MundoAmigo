/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.PerguntaDAO;
import DAO.RespostaDAO;
import Model.Pergunta;
import Model.Resposta;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz Guilherme
 */
public class PerguntaView extends javax.swing.JInternalFrame {
        
    
    Pergunta pergunta;
    Resposta resposta;
    PerguntaDAO perguntadao;
    RespostaDAO respostadao;
    List<Resposta> listaresposta;
    List<Pergunta> listapergunta;
        
    public PerguntaView() throws SQLException {
        perguntadao = new PerguntaDAO();
        respostadao = new RespostaDAO();
        pergunta = new Pergunta();
        resposta = new Resposta();
        initComponents();
        this.setVisible(true);
        listaresposta =  new ArrayList<Resposta>();
        listapergunta = new ArrayList<Pergunta>();
        atualizarTabelaRespostas();
        atualizarTabelaPerguntas();
        cancelar_pergunta();
        cancelar_resposta();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_idpergunta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_descpergunta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_coment = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_respostacerta = new javax.swing.JTextField();
        bnt_novapergunta = new javax.swing.JButton();
        btn_cancelarpergunta = new javax.swing.JButton();
        btn_salvarpergunta = new javax.swing.JButton();
        btn_editarpergunta = new javax.swing.JButton();
        btn_excluirpergunta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela_perguntas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_resposta = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_idresposta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_descricaoresposta = new javax.swing.JTextField();
        btn_novaresposta = new javax.swing.JButton();
        btn_salvarresposta = new javax.swing.JButton();
        btn_cancelarresposta = new javax.swing.JButton();
        btn_editarresposta = new javax.swing.JButton();
        btn_excluirresposta = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_idpergunta = new javax.swing.JLabel();
        lbl_descpergunta = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setClosable(true);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ID Pergunta");

        txt_idpergunta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Descrição da Pergunta");

        txt_descpergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descperguntaActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Comentário");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Resposta Certa");

        bnt_novapergunta.setText("Novo");
        bnt_novapergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_novaperguntaActionPerformed(evt);
            }
        });

        btn_cancelarpergunta.setText("Cancelar");
        btn_cancelarpergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarperguntaActionPerformed(evt);
            }
        });

        btn_salvarpergunta.setText("Salvar");
        btn_salvarpergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarperguntaActionPerformed(evt);
            }
        });

        btn_editarpergunta.setText("Editar");

        btn_excluirpergunta.setText("Excluir");

        tabela_perguntas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Resposta", "Descrição", "Comentario", "Resposta Certa"
            }
        ));
        tabela_perguntas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_perguntasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabela_perguntas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_idpergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_coment, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_respostacerta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_descpergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bnt_novapergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_salvarpergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cancelarpergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_editarpergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_excluirpergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(125, 125, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txt_idpergunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_descpergunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txt_coment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_respostacerta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnt_novapergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salvarpergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelarpergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editarpergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluirpergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jTabbedPane1.addTab("Perguntas", jPanel1);

        tabela_resposta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_resposta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_respostaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_resposta);
        if (tabela_resposta.getColumnModel().getColumnCount() > 0) {
            tabela_resposta.getColumnModel().getColumn(0).setResizable(false);
            tabela_resposta.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("ID Pergunta");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Descrição da Pergunta");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("ID Resposta");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Descrição da Resposta");

        txt_descricaoresposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descricaorespostaActionPerformed(evt);
            }
        });

        btn_novaresposta.setText("Novo");
        btn_novaresposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novarespostaActionPerformed(evt);
            }
        });

        btn_salvarresposta.setText("Salvar");
        btn_salvarresposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarrespostaActionPerformed(evt);
            }
        });

        btn_cancelarresposta.setText("Cancelar");
        btn_cancelarresposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarrespostaActionPerformed(evt);
            }
        });

        btn_editarresposta.setText("Editar");

        btn_excluirresposta.setText("Excluir");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Respostas Cadastradas");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Dados da Pergunta");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Dados da Resposta");

        jButton1.setText("Definir Resposta Certa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_novaresposta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_salvarresposta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cancelarresposta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_editarresposta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_excluirresposta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(43, 43, 43)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl_idpergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(txt_idresposta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_descricaoresposta, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 401, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lbl_descpergunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(lbl_idpergunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_descpergunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txt_idresposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_descricaoresposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novaresposta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salvarresposta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelarresposta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editarresposta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_excluirresposta, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jLabel9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
        );

        jTabbedPane1.addTab("Respostas", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_descperguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descperguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descperguntaActionPerformed

    private void txt_descricaorespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descricaorespostaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descricaorespostaActionPerformed

    private void btn_salvarperguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarperguntaActionPerformed
        pergunta.setDescricao(txt_descpergunta.getText());
        pergunta.setComentario(txt_coment.getText());
        
        try {
            txt_idpergunta.setText(String.valueOf(perguntadao.salvar(pergunta)));
            btn_salvarpergunta.setEnabled(false);
            atualizarTabelaPerguntas();
            salvar_pergunta();
            atualiza_labels();
            
        } catch (SQLException ex) {
            Logger.getLogger(PerguntaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_salvarperguntaActionPerformed

    private void btn_salvarrespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarrespostaActionPerformed
        
        if(tabela_resposta.getModel().getRowCount()>3)
        {
            JOptionPane.showMessageDialog(null,"Máximo de 4 respostas por pergunta!");
        }
        else
        {
        resposta.setDescricao(txt_descricaoresposta.getText());
        resposta.setId_pergunta(Integer.parseInt(txt_idpergunta.getText()));
        try {
           
            txt_idresposta.setText(String.valueOf(respostadao.salvar(resposta)));
            atualizarTabelaRespostas();
            
        } catch (SQLException ex) {
            Logger.getLogger(PerguntaView.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_btn_salvarrespostaActionPerformed

    private void bnt_novaperguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_novaperguntaActionPerformed
        nova_pergunta();
    }//GEN-LAST:event_bnt_novaperguntaActionPerformed

    private void btn_novarespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novarespostaActionPerformed
        nova_resposta();
    }//GEN-LAST:event_btn_novarespostaActionPerformed

    private void btn_cancelarrespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarrespostaActionPerformed
        cancelar_resposta();
    }//GEN-LAST:event_btn_cancelarrespostaActionPerformed

    private void btn_cancelarperguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarperguntaActionPerformed
        cancelar_pergunta();
    }//GEN-LAST:event_btn_cancelarperguntaActionPerformed

    private void tabela_perguntasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_perguntasMouseClicked
        txt_idpergunta.setText(tabela_perguntas.getValueAt(tabela_perguntas.getSelectedRow(),0).toString());
        txt_descpergunta.setText(tabela_perguntas.getValueAt(tabela_perguntas.getSelectedRow(),1).toString());
        txt_coment.setText(tabela_perguntas.getValueAt(tabela_perguntas.getSelectedRow(),2).toString());
        txt_respostacerta.setText(tabela_perguntas.getValueAt(tabela_perguntas.getSelectedRow(),3).toString());
        nova_perguntasemzerar();
        atualiza_labels();
        try {
            atualizarTabelaRespostas();
        } catch (SQLException ex) {
            Logger.getLogger(PerguntaView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_tabela_perguntasMouseClicked

    private void tabela_respostaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_respostaMouseClicked
        
        
            txt_idresposta.setText(tabela_resposta.getValueAt(tabela_resposta.getSelectedRow(),0).toString());
        txt_descricaoresposta.setText(tabela_resposta.getValueAt(tabela_resposta.getSelectedRow(),1).toString());
        nova_respostasemzerar();
       
        
    }//GEN-LAST:event_tabela_respostaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void atualizarTabelaRespostas() throws SQLException{
        resposta = new Resposta();
        
        if(txt_idpergunta.getText().isEmpty())
        {
            listaresposta = respostadao.ListaResposta(0);
        }
        else
        {
            listaresposta = respostadao.ListaResposta(Integer.parseInt(txt_idpergunta.getText()));
        }
        
        String dados [][] = new String[listaresposta.size()] [2];
        int i = 0;
        for (Resposta resposta : listaresposta){
            dados [i][0] = String.valueOf(resposta.getId());
            dados[i][1] = resposta.getDescricao();
            
            i++;
        }
        String titulocoluna[] = {"ID Resposta", "Resposta"};
        DefaultTableModel tabelaresposta = new DefaultTableModel();
        tabelaresposta.setDataVector(dados, titulocoluna);
        
        tabela_resposta.setModel(new DefaultTableModel(dados, titulocoluna)
                {
                boolean[] canEdit = new boolean[]{
                    false,false
                };
                
                public boolean  isCellEditable(int rowIndex, int columnIndex )
                {
                    return canEdit[columnIndex];
                }
                });
        tabela_resposta.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabela_resposta.getColumnModel().getColumn(1).setPreferredWidth(400);
        
        DefaultTableCellRenderer alinhamentocentro = new DefaultTableCellRenderer();
        alinhamentocentro.setHorizontalAlignment(SwingConstants.CENTER);
        
        tabela_resposta.getColumnModel().getColumn(0).setCellRenderer(alinhamentocentro);
        tabela_resposta.setRowHeight(25);
        tabela_resposta.updateUI();
    }
    public void nova_pergunta(){
        txt_coment.setEnabled(true);
        txt_descpergunta.setEnabled(true);
        btn_cancelarpergunta.setEnabled(true);
        btn_editarpergunta.setEnabled(true);
        btn_excluirpergunta.setEnabled(true);
        btn_salvarpergunta.setEnabled(true);
        txt_respostacerta.setEnabled(true);
        txt_idpergunta.setText("");
        txt_descpergunta.setText("");
        txt_coment.setText("");
        txt_respostacerta.setText("");
        
        
    
}
    public void nova_perguntasemzerar()
    {
        txt_coment.setEnabled(true);
        txt_descpergunta.setEnabled(true);
        btn_cancelarpergunta.setEnabled(true);
        btn_editarpergunta.setEnabled(true);
        btn_excluirpergunta.setEnabled(true);
        btn_salvarpergunta.setEnabled(true);
        txt_respostacerta.setEnabled(true);
    }
    public void nova_resposta(){
        txt_descricaoresposta.setEnabled(true);
        btn_cancelarresposta.setEnabled(true);
        btn_editarresposta.setEnabled(true);
        btn_excluirresposta.setEnabled(true);
        btn_salvarresposta.setEnabled(true);
        txt_idresposta.setText("");
        txt_descricaoresposta.setText("");
    }
    public void nova_respostasemzerar(){
        txt_descricaoresposta.setEnabled(true);
        btn_cancelarresposta.setEnabled(true);
        btn_editarresposta.setEnabled(true);
        btn_excluirresposta.setEnabled(true);
        btn_salvarresposta.setEnabled(true);
        
       
    }
    public void cancelar_pergunta()
    {
        txt_idpergunta.setEnabled(false);
        txt_coment.setEnabled(false);
        txt_descpergunta.setEnabled(false);
        txt_respostacerta.setEnabled(false);
        btn_cancelarpergunta.setEnabled(false);
        btn_editarpergunta.setEnabled(false);
        btn_excluirpergunta.setEnabled(false);
        btn_salvarpergunta.setEnabled(false);
        txt_idpergunta.setText("");
        txt_descpergunta.setText("");
        txt_coment.setText("");
        txt_respostacerta.setText("");
    }
    public void cancelar_resposta(){
        txt_idresposta.setEnabled(false);
        txt_descricaoresposta.setEnabled(false);
        btn_cancelarresposta.setEnabled(false);
        btn_editarresposta.setEnabled(false);
        btn_excluirresposta.setEnabled(false);
        btn_salvarresposta.setEnabled(false);
        txt_idresposta.setText("");
        txt_descricaoresposta.setText("");
    }
    public void salvar_pergunta()
    {
        btn_cancelarpergunta.setEnabled(false);
        btn_editarpergunta.setEnabled(false);
        btn_excluirpergunta.setEnabled(false);
        btn_salvarpergunta.setEnabled(false);
    }
    public void salvar_resposta()
    {
        btn_cancelarresposta.setEnabled(false);
        btn_editarresposta.setEnabled(false);
        btn_excluirresposta.setEnabled(false);
        btn_salvarresposta.setEnabled(false);
    }
    public void atualizarTabelaPerguntas() throws SQLException{
        pergunta = new Pergunta();
        
        listapergunta = perguntadao.ListaPergunta();
        
        String dados [][] = new String[listapergunta.size()] [4];
        int i = 0;
        for (Pergunta pergunta : listapergunta){
            dados[i][0] = String.valueOf(pergunta.getId());
            dados[i][1] = pergunta.getDescricao();
            dados[i][2] = pergunta.getComentario();
            dados[i][3] = String.valueOf(pergunta.getResposta_certa());
            
            i++;
        }
        String titulocoluna[] = {"ID Pergunta", "Descrição","Comentario","Resposta Certa"};
        DefaultTableModel tabelaresposta = new DefaultTableModel();
        tabelaresposta.setDataVector(dados, titulocoluna);
        
        tabela_perguntas.setModel(new DefaultTableModel(dados, titulocoluna)
                {
                boolean[] canEdit = new boolean[]{
                    false,false,false,false
                };
                
                public boolean  isCellEditable(int rowIndex, int columnIndex )
                {
                    return canEdit[columnIndex];
                }
                });
        tabela_resposta.getColumnModel().getColumn(0).setPreferredWidth(40);

        
        DefaultTableCellRenderer alinhamentocentro = new DefaultTableCellRenderer();
        alinhamentocentro.setHorizontalAlignment(SwingConstants.CENTER);
        
        tabela_perguntas.getColumnModel().getColumn(0).setCellRenderer(alinhamentocentro);

        tabela_perguntas.setRowHeight(25);
        tabela_perguntas.updateUI();
    }
    public void atualiza_labels(){
        lbl_idpergunta.setText(txt_idpergunta.getText());
        lbl_descpergunta.setText(txt_descpergunta.getText());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_novapergunta;
    private javax.swing.JButton btn_cancelarpergunta;
    private javax.swing.JButton btn_cancelarresposta;
    private javax.swing.JButton btn_editarpergunta;
    private javax.swing.JButton btn_editarresposta;
    private javax.swing.JButton btn_excluirpergunta;
    private javax.swing.JButton btn_excluirresposta;
    private javax.swing.JButton btn_novaresposta;
    private javax.swing.JButton btn_salvarpergunta;
    private javax.swing.JButton btn_salvarresposta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_descpergunta;
    private javax.swing.JLabel lbl_idpergunta;
    private javax.swing.JTable tabela_perguntas;
    private javax.swing.JTable tabela_resposta;
    private javax.swing.JTextField txt_coment;
    private javax.swing.JTextField txt_descpergunta;
    private javax.swing.JTextField txt_descricaoresposta;
    private javax.swing.JTextField txt_idpergunta;
    private javax.swing.JTextField txt_idresposta;
    private javax.swing.JTextField txt_respostacerta;
    // End of variables declaration//GEN-END:variables
}

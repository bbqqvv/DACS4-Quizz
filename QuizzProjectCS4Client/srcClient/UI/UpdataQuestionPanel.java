/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;

import BLL.QuestionBLL;
import BLL.ValidatorBLL;
import DTO.QuestionDTO;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.Color;

/**
 *
 * @author nguye
 */
public class UpdataQuestionPanel extends javax.swing.JDialog {

    private QuestionDTO question;
    private QuestionBLL qsBLL=new QuestionBLL();
    public UpdataQuestionPanel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
      //  setLocationRelativeTo(null);
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
     /**
      * @wbp.parser.constructor
      */
     public UpdataQuestionPanel(java.awt.Frame parent, boolean modal,QuestionDTO question) {
        super(parent, modal);
       // setLocationRelativeTo(null);
        this.question=question;
        initComponents();
        setInfo();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
     private void setInfo(){
        // txtSerialQuestion.setText(String.valueOf(question.getId()));
         txtQuestion.setText(question.getQuestion());
         txtAnswerA.setText(question.getA());
         txtAnswerB.setText(question.getB());
         txtAnswerC.setText(question.getC());
         txtAnswerD.setText(question.getD());
         String answer = question.getAnswer();
         if (answer.equalsIgnoreCase("A"))
             txtOptionAnswerA.setSelected(true);
         else if (answer.equalsIgnoreCase("B"))
             txtOptionAnswerB.setSelected(true);
         else if (answer.equalsIgnoreCase("C"))
             txtOptionAnswerC.setSelected(true);
         else
             txtOptionAnswerD.setSelected(true);
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pInput = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAnswerB = new javax.swing.JTextField();
        txtAnswerC = new javax.swing.JTextField();
        txtAnswerD = new javax.swing.JTextField();
        txtAnswerA = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtOptionAnswerB = new javax.swing.JRadioButton();
        txtOptionAnswerD = new javax.swing.JRadioButton();
        txtOptionAnswerC = new javax.swing.JRadioButton();
        txtOptionAnswerA = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextPane();
        pInput4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnSave.setIcon(new ImageIcon(UpdataQuestionPanel.class.getResource("/img/save.png")));
        btnExit = new javax.swing.JButton();
        btnExit.setIcon(new ImageIcon(UpdataQuestionPanel.class.getResource("/img/logout.png")));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 0));

        pInput.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Đáp Án:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Câu Hỏi:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Đáp Án Đúng:");

        txtAnswerB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAnswerB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtAnswerC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAnswerC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtAnswerC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswerCActionPerformed(evt);
            }
        });

        txtAnswerD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAnswerD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtAnswerA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAnswerA.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("A");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("B");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("C");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("D");

        txtOptionAnswerB.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(txtOptionAnswerB);
        txtOptionAnswerB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtOptionAnswerB.setText("B");
        txtOptionAnswerB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOptionAnswerBActionPerformed(evt);
            }
        });

        txtOptionAnswerD.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(txtOptionAnswerD);
        txtOptionAnswerD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtOptionAnswerD.setText("D");
        txtOptionAnswerD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOptionAnswerDActionPerformed(evt);
            }
        });

        txtOptionAnswerC.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(txtOptionAnswerC);
        txtOptionAnswerC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtOptionAnswerC.setText("C");
        txtOptionAnswerC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOptionAnswerCActionPerformed(evt);
            }
        });

        txtOptionAnswerA.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(txtOptionAnswerA);
        txtOptionAnswerA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtOptionAnswerA.setText("A");
        txtOptionAnswerA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOptionAnswerAActionPerformed(evt);
            }
        });

        txtQuestion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtQuestion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(txtQuestion);

        pInput4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pInput4Layout = new javax.swing.GroupLayout(pInput4);
        pInput4.setLayout(pInput4Layout);
        pInput4Layout.setHorizontalGroup(
            pInput4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
        );
        pInput4Layout.setVerticalGroup(
            pInput4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pInputLayout = new javax.swing.GroupLayout(pInput);
        pInput.setLayout(pInputLayout);
        pInputLayout.setHorizontalGroup(
            pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInputLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(pInputLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pInputLayout.createSequentialGroup()
                                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAnswerA, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                                    .addComponent(txtAnswerB)
                                    .addComponent(txtAnswerC)
                                    .addComponent(txtAnswerD))
                                .addGap(38, 38, 38)
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32)
                                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOptionAnswerA)
                                    .addComponent(txtOptionAnswerB)
                                    .addGroup(pInputLayout.createSequentialGroup()
                                        .addComponent(txtOptionAnswerD)
                                        .addGap(18, 18, 18)
                                        .addComponent(pInput4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtOptionAnswerC)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        pInputLayout.setVerticalGroup(
            pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInputLayout.createSequentialGroup()
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInputLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInputLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pInputLayout.createSequentialGroup()
                        .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnswerA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(20, 20, 20)
                        .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnswerB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(20, 20, 20)
                        .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAnswerC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtOptionAnswerC)))
                        .addGap(20, 20, 20)
                        .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnswerD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtOptionAnswerD))
                        .addGap(50, 50, 50))
                    .addGroup(pInputLayout.createSequentialGroup()
                        .addGroup(pInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pInputLayout.createSequentialGroup()
                                .addComponent(txtOptionAnswerA)
                                .addGap(23, 23, 23)
                                .addComponent(txtOptionAnswerB))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pInput4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(102, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 255, 255));
        jLabel8.setText("CẬP NHẬT CÂU HỎI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(349, 349, 349))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        btnSave.setBackground(new java.awt.Color(51, 153, 255));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnSave.setForeground(new Color(0, 255, 128));
        btnSave.setText("LƯU");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 51, 153));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnExit.setForeground(new Color(255, 0, 0));
        btnExit.setText("THOÁT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(63)
        			.addComponent(btnExit)
        			.addPreferredGap(ComponentPlacement.RELATED, 571, Short.MAX_VALUE)
        			.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
        			.addGap(74))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(14)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pInput, javax.swing.GroupLayout.PREFERRED_SIZE, 921, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(pInput, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnswerCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswerCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnswerCActionPerformed

    private void txtOptionAnswerBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOptionAnswerBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOptionAnswerBActionPerformed

    private void txtOptionAnswerDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOptionAnswerDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOptionAnswerDActionPerformed

    private void txtOptionAnswerCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOptionAnswerCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOptionAnswerCActionPerformed

    private void txtOptionAnswerAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOptionAnswerAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOptionAnswerAActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       StringBuilder sb = new StringBuilder();
            ValidatorBLL.checkEmpty(txtQuestion, sb, "Câu hỏi còn trống!");
            ValidatorBLL.checkEmpty(txtAnswerA, sb, "Đáp án A còn trống!");
            ValidatorBLL.checkEmpty(txtAnswerB, sb, "Đáp án B còn trống!");
            ValidatorBLL.checkEmpty(txtAnswerC, sb, "Đáp án C còn trống!");
            ValidatorBLL.checkEmpty(txtAnswerD, sb, "Đáp án D còn trống!");
            ValidatorBLL.checkEmpty(txtOptionAnswerA,txtOptionAnswerB,txtOptionAnswerC,txtOptionAnswerD, sb, "Đáp án đúng còn trống!");
            if (sb.length() > 0) {
                JOptionPane.showMessageDialog(this, sb.toString(), "Thông Báo Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
        
        QuestionDTO question =new QuestionDTO();
       //question.setId(Integer.parseInt(txtSerialQuestion.getText()));
       question.setQuestion(txtQuestion.getText());
       question.setA(txtAnswerA.getText());
       question.setB(txtAnswerB.getText());
       question.setC(txtAnswerC.getText());
       question.setD(txtAnswerD.getText());
       question.setExamID(question.getExamID());
       String answer=(txtOptionAnswerA.isSelected())?"A":(
               (txtOptionAnswerB.isSelected())?"B":((txtOptionAnswerC.isSelected())?"C":"D"));
       question.setAnswer(answer);
       question.setId(this.question.getId());
       
        try {
            qsBLL.updateQuestionDTO(question);
            dispose();
        } catch (Exception ex) {
              JOptionPane.showMessageDialog(this, "Không thể cập nhật câu hỏi ",
                    "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(UpdataQuestionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdataQuestionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdataQuestionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdataQuestionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdataQuestionPanel dialog = new UpdataQuestionPanel(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pInput;
    private javax.swing.JPanel pInput4;
    private javax.swing.JTextField txtAnswerA;
    private javax.swing.JTextField txtAnswerB;
    private javax.swing.JTextField txtAnswerC;
    private javax.swing.JTextField txtAnswerD;
    private javax.swing.JRadioButton txtOptionAnswerA;
    private javax.swing.JRadioButton txtOptionAnswerB;
    private javax.swing.JRadioButton txtOptionAnswerC;
    private javax.swing.JRadioButton txtOptionAnswerD;
    private javax.swing.JTextPane txtQuestion;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.awt.Image;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import BLL.UserBLL;
import BLL.ValidatorBLL;
import DTO.UserDTO;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 *
 * @author nguye
 */
public class MyProfileUI extends javax.swing.JPanel {

    private int DEFALUT_WIDTH;
    private UserDTO user;
    private int userID;
    private UserBLL userBLL = new UserBLL();

    public MyProfileUI() {
        this.setSize(1090, 575);
        initComponents();
    }

    public MyProfileUI(int width) {
        DEFALUT_WIDTH = width;
        initComponents();

        this.user = ManageExam.getUser();// lấy thông tin user đang nhập hiện tai từ GUI Tổng .

        this.setSize(this.DEFALUT_WIDTH - 200, 750);
        init();
    }

    public MyProfileUI(int width, int userID) {
        DEFALUT_WIDTH = width;
        this.userID = userID;
        initComponents();

        this.user = ManageExam.getUser();// lấy thông tin user đang nhập hiện tai từ GUI Tổng .

        this.setSize(this.DEFALUT_WIDTH - 200, 750);
        init();
    }

    private void init() {
         loadUserLogin();
    }

    private void loadUserLogin() {
        try {
            user = userBLL.loadUserLogin(this.userID);
            txtName.setText(user.getName());
            txtBirthDay.setDate(user.getBirthday()); 
            txEmail.setText(user.getEmail());
            if (user.getGender()) {
                rbMale.setSelected(true);
                lbIMG.setIcon(new ImageIcon("./src/main/java/CLIENT/UI/img/profile_avatar_male.png"));
            } else {
                rbFemale.setSelected(true);
                lbIMG.setIcon(new ImageIcon("./src/main/java/CLIENT/UI/img/profile_avatar_female.png"));
            }
            txtID.setText(String.valueOf(this.userID));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lấy Thông Tin Thí Sinh Thất Bại");
        }
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbIMG = new javax.swing.JLabel();
        ImageIcon imageIcon = new ImageIcon(MyProfileUI.class.getResource("/img/user-manager.png"));
        Image image = imageIcon.getImage().getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(image);
        // Gán lại ImageIcon vào JLabel
        lbIMG.setIcon(scaledIcon);
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        rbFemale = new javax.swing.JRadioButton();
        rbMale = new javax.swing.JRadioButton();
        txEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtBirthDay = new com.toedter.calendar.JDateChooser();
        btnEdit = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(41, 188, 214));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(51, 213, 238));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THÔNG TIN CÁ NHÂN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(445, 445, 445))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Mã Định Danh :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Giới Tính :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Tên Người Dùng :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Ngày Sinh :");

        txtID.setEditable(false);
        txtID.setBackground(new java.awt.Color(204, 204, 204));
        txtID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.setToolTipText("");

        rbFemale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbFemale.setText("Nữ");
        rbFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemaleActionPerformed(evt);
            }
        });

        rbMale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbMale);
        rbMale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbMale.setText("Nam");

        txEmail.setEditable(false);
        txEmail.setBackground(new java.awt.Color(204, 204, 204));
        txEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txEmail.setToolTipText("");
        txEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txEmailActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Email :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGap(22)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel2)
        						.addComponent(jLabel4))
        					.addGap(23)
        					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtID, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
        						.addGroup(jPanel3Layout.createSequentialGroup()
        							.addGap(116)
        							.addComponent(rbFemale))))
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addGap(6)
        					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel3Layout.createSequentialGroup()
        							.addComponent(jLabel6)
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(txEmail, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel3Layout.createSequentialGroup()
        							.addComponent(jLabel3)
        							.addGap(0, 305, Short.MAX_VALUE))
        						.addGroup(jPanel3Layout.createSequentialGroup()
        							.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(jLabel5)
        								.addComponent(jLabel7))
        							.addGap(60)
        							.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(jPanel3Layout.createSequentialGroup()
        									.addComponent(rbMale)
        									.addPreferredGap(ComponentPlacement.RELATED, 180, Short.MAX_VALUE))
        								.addComponent(txtBirthDay, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        			.addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGap(21)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(txtID, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(30)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(30)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txEmail, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(29)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(rbFemale)
        				.addComponent(rbMale)
        				.addComponent(jLabel3))
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addGap(30)
        					.addComponent(jLabel5)
        					.addGap(0)
        					.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(txtBirthDay, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())))
        );
        jPanel3.setLayout(jPanel3Layout);

        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.setIcon(new ImageIcon("./src/main/java/CLIENT/UI/img/icons8_maintenance_30px.png"));
        btnEdit.setText("Cập Nhật Thông Tin Cá Nhân");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(30)
        			.addComponent(lbIMG, GroupLayout.PREFERRED_SIZE, 499, GroupLayout.PREFERRED_SIZE)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(40)
        					.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(63)
        					.addComponent(btnEdit, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(34)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lbIMG, GroupLayout.PREFERRED_SIZE, 419, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE)
        					.addGap(29)
        					.addComponent(btnEdit, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFemaleActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            String name = txtName.getText();
            Date birthday = txtBirthDay.getDate();
            String email = txEmail.getText();
            boolean gender = (rbMale.isSelected()) ? true : false;
            // check empty
            StringBuilder sb = new StringBuilder();
            ValidatorBLL.checkEmpty(txEmail, sb, "Email còn trống!");
            ValidatorBLL.checkEmpty(txtName, sb, "Name còn trống!");
            ValidatorBLL.checkEmpty(txtBirthDay, sb, "Ngày sinh còn trống!");
            if (sb.length() > 0) {
                JOptionPane.showMessageDialog(this, sb.toString(), "Thông Báo Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //update user instant
            user.setId(user.getId());
            user.setEmail(email);
            user.setName(name);
            user.setGender(gender);
            user.setBirthday(birthday);
            user.setStatus(1);
            user.setRole("0");
            
            String mess =userBLL.updateUser(user);
            ManageExam.userGlobal=user;// cập nhật lại user hiện tại
            JOptionPane.showMessageDialog(this,mess,"Thông Báo",JOptionPane.INFORMATION_MESSAGE);
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Cập nhật thất bại !", "Thông Báo Lỗi", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnEditActionPerformed

    private void txEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbIMG;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextField txEmail;
    private com.toedter.calendar.JDateChooser txtBirthDay;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}

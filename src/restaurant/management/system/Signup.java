/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.management.system;

import javax.swing.JOptionPane;
import model.User;
import dao.UserDao;
import java.awt.event.KeyEvent;

/**
 *
 * @author surya
 */
public class Signup extends javax.swing.JFrame {

    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mobileNumberPattern = "^[0-9]*$";

    /**
     * Creates new form Signup
     */
    public Signup() {
        initComponents();  
        openeye.setVisible(false);
        btnSave.setEnabled(false);
    }

    public void clear() {
        txtName.setText("");
        txtEmail.setText("");
        txtMobileNumber.setText("");
        txtAddress.setText("");
        txtSecurityQuestion.setSelectedItem("");
        txtAnswer.setText("");
        txtPassword.setText("");
        btnSave.setEnabled(false);
    }

    public void validateFields() {
        String name = txtName.getText();
        String email = txtEmail.getText();
        String mobileNumber = txtMobileNumber.getText();
        String address = txtAddress.getText();
        String password = txtPassword.getText();
        String securityQuestion = (String)txtSecurityQuestion.getSelectedItem();
        String answer = txtAnswer.getText();
        if (!name.equals("") && email.matches(emailPattern) && mobileNumber.matches(mobileNumberPattern) && mobileNumber.length() == 10 && !address.equals("") && !password.equals("") && !securityQuestion.equals("") && !answer.equals("")) {
            btnSave.setEnabled(true);
        } else {
            btnSave.setEnabled(false);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtinst = new javax.swing.JLabel();
        txtinstructer = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEmail = new app.bolivia.swing.JCTextField();
        jLabel13 = new javax.swing.JLabel();
        txtName = new app.bolivia.swing.JCTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtMobileNumber = new app.bolivia.swing.JCTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtAddress = new app.bolivia.swing.JCTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtAnswer = new app.bolivia.swing.JCTextField();
        jLabel25 = new javax.swing.JLabel();
        jButton5 = new rojerusan.RSMaterialButtonCircle();
        btnSave = new rojerusan.RSMaterialButtonCircle();
        jLabel14 = new javax.swing.JLabel();
        btnClear = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        openeye = new javax.swing.JLabel();
        closeeye = new javax.swing.JLabel();
        txtPassword = new rojerusan.RSPasswordTextPlaceHolder();
        txtSecurityQuestion = new rojerusan.RSComboMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/699.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 1080));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtinst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtinst.setForeground(new java.awt.Color(240, 0, 0));
        jPanel2.add(txtinst, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 760, 190, 20));

        txtinstructer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtinstructer.setForeground(new java.awt.Color(204, 0, 0));
        jPanel2.add(txtinstructer, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 220, 40));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Signup Page");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 200, 50));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Create New Account Here");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email Id");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Account_50px.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        txtEmail.setBackground(new java.awt.Color(102, 102, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txtEmail.setPlaceholder("Enter Id........");
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 360, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Password");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 100, -1));

        txtName.setBackground(new java.awt.Color(102, 102, 255));
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtName.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txtName.setPlaceholder("Enter Name.......");
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 360, -1));

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/icons8_Google_Mobile_50px.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Mobile Number");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 150, -1));

        txtMobileNumber.setBackground(new java.awt.Color(102, 102, 255));
        txtMobileNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtMobileNumber.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txtMobileNumber.setPlaceholder("Enter Mobile Number.......");
        txtMobileNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMobileNumberKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMobileNumberKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMobileNumberKeyTyped(evt);
            }
        });
        jPanel2.add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 360, -1));

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-home-40.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 40, 40));

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Address");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 100, -1));

        txtAddress.setBackground(new java.awt.Color(102, 102, 255));
        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txtAddress.setPlaceholder("Enter Address......");
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddressKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });
        jPanel2.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 360, -1));

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/icons8_Secure_50px.png"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, -1, -1));

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Security Question");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 640, 170, -1));

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-ask-question-40.png"))); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 650, -1, -1));

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Name");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 100, -1));

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-chat-40.png"))); // NOI18N
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 740, -1, -1));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Answer");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 730, 100, -1));

        txtAnswer.setBackground(new java.awt.Color(102, 102, 255));
        txtAnswer.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtAnswer.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txtAnswer.setPlaceholder("Enter Answer.......");
        txtAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAnswerKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnswerKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnswerKeyTyped(evt);
            }
        });
        jPanel2.add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 760, 360, -1));

        jLabel25.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Secured_Letter_50px.png"))); // NOI18N
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        jButton5.setBackground(new java.awt.Color(51, 51, 255));
        jButton5.setText("Login");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 910, 440, 60));

        btnSave.setBackground(new java.awt.Color(255, 51, 51));
        btnSave.setText("SIGNUP");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 840, 440, 60));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicon/icons8_Forgot_Password_50px_4.png"))); // NOI18N
        jLabel14.setText("Forget Password ?");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 990, 230, -1));

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-synchronize-32.png"))); // NOI18N
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        jPanel2.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 800, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        openeye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-eye-30.png"))); // NOI18N
        openeye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                openeyeMousePressed(evt);
            }
        });
        jPanel2.add(openeye, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 570, 40, 30));

        closeeye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-closed-eye-30.png"))); // NOI18N
        closeeye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeeyeMousePressed(evt);
            }
        });
        jPanel2.add(closeeye, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 570, 40, -1));

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassword.setPlaceholder("Enter Password.....");
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 370, 30));

        txtSecurityQuestion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What is the name of your first pet?", "What was your first car?", "What elementary school did you attend?", "What is the name of the town where you were born?" }));
        txtSecurityQuestion.setActionCommand("What is the name of your first pet?\nWhat was your first car?\nWhat elementary school did you attend?\nWhat is the name of the town where you were born?");
        txtSecurityQuestion.setColorBorde(new java.awt.Color(0, 51, 153));
        txtSecurityQuestion.setColorFondo(new java.awt.Color(102, 102, 255));
        txtSecurityQuestion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        txtSecurityQuestion.setName("What is the name of your first pet?\nWhat was your first car?\nWhat elementary school did you attend?\nWhat is the name of the town where you were born?"); // NOI18N
        txtSecurityQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecurityQuestionActionPerformed(evt);
            }
        });
        txtSecurityQuestion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSecurityQuestionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSecurityQuestionKeyReleased(evt);
            }
        });
        jPanel2.add(txtSecurityQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 670, 360, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 0, 630, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtMobileNumber.requestFocus();
        }
        switch(evt.getKeyCode())
        {
            case 40:txtMobileNumber.requestFocus();
            break;
            case 38:txtName.requestFocus();
            break;
            case 39:txtMobileNumber.requestFocus();
            break;
            case 37:txtName.requestFocus();
            break;
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtEmail.requestFocus();
        }
        switch(evt.getKeyCode())
        {
            case 40:txtEmail.requestFocus();
            break;
            case 38:txtAnswer.requestFocus();
            break;
            case 39:txtEmail.requestFocus();
            break;
            case 37:txtAnswer.requestFocus();
            break;
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtMobileNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileNumberKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddress.requestFocus();
        }
        switch(evt.getKeyCode())
        {
            case 40:txtAddress.requestFocus();
            break;
            case 38:txtEmail.requestFocus();
            break;
            case 39:txtAddress.requestFocus();
            break;
            case 37:txtEmail.requestFocus();
            break;
        }
    }//GEN-LAST:event_txtMobileNumberKeyPressed

    private void txtMobileNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileNumberKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtMobileNumberKeyReleased

    private void txtAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPassword.requestFocus();
        }
        switch(evt.getKeyCode())
        {
            case 40:txtPassword.requestFocus();
            break;
            case 38:txtMobileNumber.requestFocus();
            break;
            case 39:txtPassword.requestFocus();
            break;
            case 37:txtMobileNumber.requestFocus();
            break;
        }
    }//GEN-LAST:event_txtAddressKeyPressed

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtAnswerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnswerKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtName.requestFocus();
        }
        switch(evt.getKeyCode())
        {
            case 40:txtName.requestFocus();
            break;
            case 38:txtSecurityQuestion.requestFocus();
            break;
            case 39:txtName.requestFocus();
            break;
            case 37:txtSecurityQuestion.requestFocus();
            break;
        }
    }//GEN-LAST:event_txtAnswerKeyPressed

    private void txtAnswerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnswerKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtAnswerKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        User user = new User();
        user.setName(txtName.getText());
        user.setEmail(txtEmail.getText());
        user.setMobileNumber(txtMobileNumber.getText());
        user.setAddress(txtAddress.getText());
        user.setPassword(txtPassword.getText());
        user.securityQuestion = (String) txtSecurityQuestion.getSelectedItem();
        user.setAnswer(txtAnswer.getText());
        UserDao.save(user);
        clear();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new ForgetPassword().setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void txtMobileNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileNumberKeyTyped
        // TODO add your handling code here:
        char C=evt.getKeyChar();
        if(Character.isLetter(C) || Character.isSpaceChar(C) || Character.isAlphabetic(C))
        {
            txtMobileNumber.setEditable(false);
            txtinstructer.setText("Please Enter Number Only");
        }else
        {
            txtMobileNumber.setEditable(true);
            txtinstructer.setText(null);
        }
    }//GEN-LAST:event_txtMobileNumberKeyTyped

    private void txtAnswerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnswerKeyTyped
        // TODO add your handling code here:
        char C = evt.getKeyChar();
        if (Character.isLowerCase(C) || Character.isDigit(C) || Character.isSpaceChar(C)){
            txtAnswer.setEditable(false);
            txtinst.setText("Use Only Caps");
        } else {
            txtAnswer.setEditable(true);
            txtinst.setText(null);
        }
    }//GEN-LAST:event_txtAnswerKeyTyped

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        // TODO add your handling code here
        clear();
    }//GEN-LAST:event_btnClearMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Close Application", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtSecurityQuestion.requestFocus();
        }
        switch(evt.getKeyCode())
        {
            case 40:txtSecurityQuestion.requestFocus();
            break;
            case 38:txtAddress.requestFocus();
            break;
            case 39:txtSecurityQuestion.requestFocus();
            break;
            case 37:txtAddress.requestFocus();
            break;
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtSecurityQuestionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecurityQuestionKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAnswer.requestFocus();
        }
        switch(evt.getKeyCode())
        {
            case 40:txtAnswer.requestFocus();
            break;
            case 38:txtPassword.requestFocus();
            break;
            case 39:txtAnswer.requestFocus();
            break;
            case 37:txtPassword.requestFocus();
            break;
        }
    }//GEN-LAST:event_txtSecurityQuestionKeyPressed

    private void txtSecurityQuestionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecurityQuestionKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtSecurityQuestionKeyReleased

    private void txtSecurityQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecurityQuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecurityQuestionActionPerformed

    private void openeyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openeyeMousePressed
        // TODO add your handling code here:
        closeeye.setVisible(true);
        openeye.setVisible(false);
        txtPassword.setEchoChar('*');
    }//GEN-LAST:event_openeyeMousePressed

    private void closeeyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeeyeMousePressed
        // TODO add your handling code here:
        openeye.setVisible(true);
        closeeye.setVisible(false);
        txtPassword.setEchoChar((char)0);
    }//GEN-LAST:event_closeeyeMousePressed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClear;
    private rojerusan.RSMaterialButtonCircle btnSave;
    private javax.swing.JLabel closeeye;
    private rojerusan.RSMaterialButtonCircle jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel openeye;
    private app.bolivia.swing.JCTextField txtAddress;
    private app.bolivia.swing.JCTextField txtAnswer;
    private app.bolivia.swing.JCTextField txtEmail;
    private app.bolivia.swing.JCTextField txtMobileNumber;
    private app.bolivia.swing.JCTextField txtName;
    private rojerusan.RSPasswordTextPlaceHolder txtPassword;
    private rojerusan.RSComboMetro txtSecurityQuestion;
    private javax.swing.JLabel txtinst;
    private javax.swing.JLabel txtinstructer;
    // End of variables declaration//GEN-END:variables
}

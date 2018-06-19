package ui;

import Model.DataModel;
import Model.Member;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

   private DataModel dataModel;

   public Login(DataModel dataModel) {

      this.dataModel = dataModel;

      initComponents();
      setLocationRelativeTo(null);
      setVisible(true);

   }

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      panSign = new javax.swing.JPanel();
      panLogin = new javax.swing.JPanel();
      txtUsername = new javax.swing.JTextField();
      lblProfileIcon = new javax.swing.JLabel();
      lblPasswordIcon = new javax.swing.JLabel();
      txtPassword = new javax.swing.JPasswordField();
      btnLogin = new javax.swing.JButton();
      lblLogo = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      setTitle("Login");
      setBackground(new java.awt.Color(50, 77, 92));
      setIconImages(null);
      setMinimumSize(new java.awt.Dimension(420, 400));

      panSign.setBackground(new java.awt.Color(220, 220, 220));
      panSign.setToolTipText("");
      panSign.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyPressed(java.awt.event.KeyEvent evt) {
            panSignKeyPressed(evt);
         }
      });

      panLogin.setBackground(new java.awt.Color(255, 255, 255));
      panLogin.setAlignmentX(0.0F);
      panLogin.setAlignmentY(0.0F);

      txtUsername.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
      txtUsername.setText("Username");
      txtUsername.setToolTipText("");
      txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            txtUsernameFocusGained(evt);
         }
         public void focusLost(java.awt.event.FocusEvent evt) {
            txtUsernameFocusLost(evt);
         }
      });
      txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyPressed(java.awt.event.KeyEvent evt) {
            txtUsernameKeyPressed(evt);
         }
      });

      lblProfileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N

      lblPasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password.png"))); // NOI18N

      txtPassword.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
      txtPassword.setText("Password");
      txtPassword.setToolTipText("");
      txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            txtPasswordFocusGained(evt);
         }
         public void focusLost(java.awt.event.FocusEvent evt) {
            txtPasswordFocusLost(evt);
         }
      });
      txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyPressed(java.awt.event.KeyEvent evt) {
            txtPasswordKeyPressed(evt);
         }
      });

      javax.swing.GroupLayout panLoginLayout = new javax.swing.GroupLayout(panLogin);
      panLogin.setLayout(panLoginLayout);
      panLoginLayout.setHorizontalGroup(
         panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panLoginLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(lblProfileIcon)
               .addComponent(lblPasswordIcon, javax.swing.GroupLayout.Alignment.TRAILING))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
            .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
               .addComponent(txtPassword))
            .addContainerGap())
      );
      panLoginLayout.setVerticalGroup(
         panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panLoginLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(lblProfileIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
               .addComponent(txtUsername))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
            .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
               .addComponent(txtPassword)
               .addComponent(lblPasswordIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
            .addContainerGap())
      );

      btnLogin.setBackground(new java.awt.Color(111, 156, 150));
      btnLogin.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
      btnLogin.setForeground(new java.awt.Color(255, 255, 255));
      btnLogin.setText("Login");
      btnLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(164, 153, 141), new java.awt.Color(164, 153, 141), new java.awt.Color(143, 134, 124), new java.awt.Color(143, 134, 124)));
      btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      btnLogin.setFocusTraversalPolicyProvider(true);
      btnLogin.setMaximumSize(new java.awt.Dimension(80, 30));
      btnLogin.setMinimumSize(new java.awt.Dimension(80, 30));
      btnLogin.setPreferredSize(new java.awt.Dimension(80, 30));
      btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            btnLoginMouseClicked(evt);
         }
      });
      btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyPressed(java.awt.event.KeyEvent evt) {
            btnLoginKeyPressed(evt);
         }
      });

      lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginIcon.png"))); // NOI18N

      javax.swing.GroupLayout panSignLayout = new javax.swing.GroupLayout(panSign);
      panSign.setLayout(panSignLayout);
      panSignLayout.setHorizontalGroup(
         panSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panSignLayout.createSequentialGroup()
            .addGroup(panSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(panSignLayout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addGroup(panSignLayout.createSequentialGroup()
                  .addGap(160, 160, 160)
                  .addGroup(panSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(panLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(0, 155, Short.MAX_VALUE)))
            .addContainerGap())
      );
      panSignLayout.setVerticalGroup(
         panSignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panSignLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(36, 36, 36)
            .addComponent(panLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(28, 28, 28)
            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(76, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(panSign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(panSign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
      login();
   }//GEN-LAST:event_btnLoginMouseClicked

   private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
      if (txtPassword.getText().equals("")) {
         txtPassword.setText("Password");
      }
   }//GEN-LAST:event_txtPasswordFocusLost

   private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
      txtPassword.setText("");
   }//GEN-LAST:event_txtPasswordFocusGained

   private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
      if (txtUsername.getText().equals("")) {
         txtUsername.setText("Username");
      }
   }//GEN-LAST:event_txtUsernameFocusLost

   private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
      txtUsername.setText("");
   }//GEN-LAST:event_txtUsernameFocusGained

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
          login();
       }
    }//GEN-LAST:event_btnLoginKeyPressed

    private void panSignKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panSignKeyPressed
    }//GEN-LAST:event_panSignKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
          login();
       }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
          login();
       }
    }//GEN-LAST:event_txtUsernameKeyPressed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnLogin;
   private javax.swing.JLabel lblLogo;
   private javax.swing.JLabel lblPasswordIcon;
   private javax.swing.JLabel lblProfileIcon;
   private javax.swing.JPanel panLogin;
   private javax.swing.JPanel panSign;
   private javax.swing.JPasswordField txtPassword;
   private javax.swing.JTextField txtUsername;
   // End of variables declaration//GEN-END:variables

   private void login() {

      String username = txtUsername.getText();
      String password = new String(txtPassword.getPassword());

      Member currentMember = dataModel.getMemberManager().getMemberByUsername(username);
      if (currentMember != null && currentMember.validPassword(password)) {

         Projects projectsForm = new Projects(dataModel, currentMember);
         setVisible(false);
      } else {

         JOptionPane.showMessageDialog(null, "Invalid username or password");

      }
   }
}

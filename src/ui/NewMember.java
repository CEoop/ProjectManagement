package ui;

import Model.DataModel;
import Model.Member;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import main.MemberListRenderer;

public class NewMember extends javax.swing.JFrame {

   private DataModel dataModel;
   private Projects parent;
   private Member selectedMember = null;
   private Member currentUser;

   public NewMember(DataModel dataModel, Projects projects, Member user) {

      this.dataModel = dataModel;
      parent = projects;
      currentUser = user;

      initComponents();
      setLocationRelativeTo(null);
      setVisible(true);

      lstMembers.setCellRenderer(new MemberListRenderer());

      lstMembers.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
         @Override
         public void valueChanged(ListSelectionEvent e) {

            Object[] selectedItems = lstMembers.getSelectedValues();

            if (selectedItems.length > 0) {
               selectedMember = (Member) selectedItems[0];
               loadMemberData(selectedMember);
            }
         }
      });
      if (!currentUser.isManager()) {
         loadMyInfo();
         btnAddMember.setVisible(false);
         btnDelete.setVisible(false);
         chbManager.setVisible(false);
      } else {
         loadMemberList();
      }

   }

   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      panMain = new javax.swing.JPanel();
      lblLogo = new javax.swing.JLabel();
      panLogin = new javax.swing.JPanel();
      txtAlias = new javax.swing.JTextField();
      lblAlias = new javax.swing.JLabel();
      txtPassword = new javax.swing.JPasswordField();
      lblPassword = new javax.swing.JLabel();
      txtUsername = new javax.swing.JTextField();
      lblUsername = new javax.swing.JLabel();
      chbManager = new javax.swing.JCheckBox();
      btnDelete = new javax.swing.JButton();
      btnSave1 = new javax.swing.JButton();
      btnAddMember = new javax.swing.JButton();
      lblMembers = new javax.swing.JLabel();
      spMembersList = new javax.swing.JScrollPane();
      lstMembers = new javax.swing.JList<>();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      setTitle("New Member");
      setMinimumSize(null);
      setResizable(false);

      panMain.setBackground(new java.awt.Color(220, 220, 220));

      lblLogo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
      lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/signup.png"))); // NOI18N

      panLogin.setBackground(new java.awt.Color(255, 255, 255));
      panLogin.setAlignmentX(0.0F);
      panLogin.setAlignmentY(0.0F);

      txtAlias.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

      lblAlias.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
      lblAlias.setForeground(new java.awt.Color(124, 116, 108));
      lblAlias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      lblAlias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N
      lblAlias.setText("                Alias:");

      txtPassword.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
      txtPassword.setToolTipText("");

      lblPassword.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
      lblPassword.setForeground(new java.awt.Color(124, 116, 108));
      lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      lblPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password.png"))); // NOI18N
      lblPassword.setText("      Password:");

      txtUsername.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

      lblUsername.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
      lblUsername.setForeground(new java.awt.Color(124, 116, 108));
      lblUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N
      lblUsername.setText("     Username:");

      chbManager.setBackground(new java.awt.Color(255, 255, 255));
      chbManager.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
      chbManager.setForeground(new java.awt.Color(124, 116, 108));
      chbManager.setText("Manager");

      javax.swing.GroupLayout panLoginLayout = new javax.swing.GroupLayout(panLogin);
      panLogin.setLayout(panLoginLayout);
      panLoginLayout.setHorizontalGroup(
         panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panLoginLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(lblPassword)
               .addComponent(lblAlias)
               .addComponent(lblUsername))
            .addGap(18, 18, 18)
            .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(panLoginLayout.createSequentialGroup()
                  .addComponent(chbManager)
                  .addGap(0, 122, Short.MAX_VALUE))
               .addComponent(txtAlias, javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING))
            .addContainerGap())
      );
      panLoginLayout.setVerticalGroup(
         panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panLoginLayout.createSequentialGroup()
            .addContainerGap(28, Short.MAX_VALUE)
            .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(txtAlias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(lblAlias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(panLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(panLoginLayout.createSequentialGroup()
                  .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(panLoginLayout.createSequentialGroup()
                  .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(chbManager)
            .addGap(16, 16, 16))
      );

      btnDelete.setBackground(new java.awt.Color(111, 156, 150));
      btnDelete.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
      btnDelete.setForeground(new java.awt.Color(255, 255, 255));
      btnDelete.setText("Delete");
      btnDelete.setToolTipText("");
      btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(164, 153, 141), new java.awt.Color(164, 153, 141), new java.awt.Color(143, 134, 124), new java.awt.Color(143, 134, 124)));
      btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      btnDelete.setFocusTraversalPolicyProvider(true);
      btnDelete.setMaximumSize(new java.awt.Dimension(80, 30));
      btnDelete.setMinimumSize(new java.awt.Dimension(80, 30));
      btnDelete.setPreferredSize(new java.awt.Dimension(80, 30));
      btnDelete.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnDeleteActionPerformed(evt);
         }
      });

      btnSave1.setBackground(new java.awt.Color(111, 156, 150));
      btnSave1.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
      btnSave1.setForeground(new java.awt.Color(255, 255, 255));
      btnSave1.setText("Save");
      btnSave1.setToolTipText("");
      btnSave1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(164, 153, 141), new java.awt.Color(164, 153, 141), new java.awt.Color(143, 134, 124), new java.awt.Color(143, 134, 124)));
      btnSave1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      btnSave1.setFocusTraversalPolicyProvider(true);
      btnSave1.setMaximumSize(new java.awt.Dimension(80, 30));
      btnSave1.setMinimumSize(new java.awt.Dimension(80, 30));
      btnSave1.setPreferredSize(new java.awt.Dimension(80, 30));
      btnSave1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnSave1ActionPerformed(evt);
         }
      });

      btnAddMember.setBackground(new java.awt.Color(111, 156, 150));
      btnAddMember.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
      btnAddMember.setForeground(new java.awt.Color(255, 255, 255));
      btnAddMember.setText("Add member");
      btnAddMember.setToolTipText("");
      btnAddMember.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(164, 153, 141), new java.awt.Color(164, 153, 141), new java.awt.Color(143, 134, 124), new java.awt.Color(143, 134, 124)));
      btnAddMember.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      btnAddMember.setFocusTraversalPolicyProvider(true);
      btnAddMember.setMaximumSize(new java.awt.Dimension(80, 30));
      btnAddMember.setMinimumSize(new java.awt.Dimension(80, 30));
      btnAddMember.setPreferredSize(new java.awt.Dimension(80, 30));
      btnAddMember.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAddMemberActionPerformed(evt);
         }
      });

      lblMembers.setBackground(new java.awt.Color(111, 156, 150));
      lblMembers.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
      lblMembers.setForeground(new java.awt.Color(255, 255, 255));
      lblMembers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      lblMembers.setText("Members");
      lblMembers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(164, 153, 141)));
      lblMembers.setOpaque(true);

      spMembersList.setViewportView(lstMembers);

      javax.swing.GroupLayout panMainLayout = new javax.swing.GroupLayout(panMain);
      panMain.setLayout(panMainLayout);
      panMainLayout.setHorizontalGroup(
         panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panMainLayout.createSequentialGroup()
            .addContainerGap(35, Short.MAX_VALUE)
            .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
               .addComponent(lblMembers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(spMembersList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
               .addComponent(btnAddMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(panMainLayout.createSequentialGroup()
                  .addGap(44, 44, 44)
                  .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(btnSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(panMainLayout.createSequentialGroup()
                  .addGap(35, 35, 35)
                  .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(panLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGap(35, 35, 35))
      );
      panMainLayout.setVerticalGroup(
         panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMainLayout.createSequentialGroup()
            .addGap(29, 29, 29)
            .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(panMainLayout.createSequentialGroup()
                  .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                  .addGap(18, 18, 18)
                  .addComponent(panLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(panMainLayout.createSequentialGroup()
                  .addComponent(lblMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(spMembersList, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnSave1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnAddMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(40, 40, 40))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(panMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addComponent(panMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(0, 0, 0))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      deleteMember();
      clearFields();
   }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
       if (!currentUser.isManager()) {
          saveEdits(selectedMember);
          loadMyInfo();          
       } else if (selectedMember == null) {
          addMember();
          loadMemberList();
       } else {
          saveEdits(selectedMember);
          loadMemberList();
       }
       clearFields();
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void btnAddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMemberActionPerformed
       clearFields();
       selectedMember = null;
    }//GEN-LAST:event_btnAddMemberActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnAddMember;
   private javax.swing.JButton btnDelete;
   private javax.swing.JButton btnSave1;
   private javax.swing.JCheckBox chbManager;
   private javax.swing.JLabel lblAlias;
   private javax.swing.JLabel lblLogo;
   private javax.swing.JLabel lblMembers;
   private javax.swing.JLabel lblPassword;
   private javax.swing.JLabel lblUsername;
   private javax.swing.JList<String> lstMembers;
   private javax.swing.JPanel panLogin;
   private javax.swing.JPanel panMain;
   private javax.swing.JScrollPane spMembersList;
   private javax.swing.JTextField txtAlias;
   private javax.swing.JPasswordField txtPassword;
   private javax.swing.JTextField txtUsername;
   // End of variables declaration//GEN-END:variables

   public void addMember() {

      try {
         String alias = txtAlias.getText();
         String username = txtUsername.getText();
         String password = new String(txtPassword.getPassword());
         boolean isManager = chbManager.isSelected();

         dataModel.getMemberManager().addMember(new Member(alias, username, password, isManager));
         dataModel.save();

      } catch (Exception ex) {
         JOptionPane.showMessageDialog(null, "Invalid input");
      }

   }

   private void saveEdits(Member member) {
      if (currentUser != member) {
         member.isManager(chbManager.isSelected());
         dataModel.save();
         loadMemberData(member);
      } else {
         try {
            member.setAlias(txtAlias.getText());
            member.setUsername(txtUsername.getText());
            member.changePassword(txtPassword.getText());
            dataModel.save();
         } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, "Invalid input");
         }
      }
   }

   public void deleteMember() {

      if (selectedMember != null) {
         if (selectedMember.isManager()) {
            JOptionPane.showMessageDialog(null, "Sorry, you cannot delete another manager");
         } else {
            int n = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this member?");
            if (n == 0) {
               if (dataModel.getProjectManager().hasProjects(selectedMember)) {
                  JOptionPane.showMessageDialog(null, "Sorry, the selected member has tasks assigned to and cannot be deleted");
               } else {
                  dataModel.getMemberManager().deleteMember(selectedMember);
                  dataModel.save();
                  selectedMember = null;
                  loadMemberList();
               }
            }
         }
      } else {
         JOptionPane.showMessageDialog(null, "Please select a member");
      }
   }

   public void loadMemberList() {

      DefaultListModel dlmMembers = new DefaultListModel();

      for (Member m : dataModel.getMemberManager().getAllMembers()) {
         dlmMembers.addElement(m);
      }
      lstMembers.setModel(dlmMembers);
   }

   private void loadMemberData(Member member) {

      txtAlias.setText(member.getAlias());
      txtUsername.setText(member.getUsername());
      chbManager.setSelected(member.isManager());

      if (currentUser == member) {
         txtAlias.setEnabled(true);
         txtUsername.setEnabled(true);
         txtPassword.setEnabled(true);
      } else {
         txtAlias.setEnabled(false);
         txtUsername.setEnabled(false);
         txtPassword.setEnabled(false);
      }
   }

   private void clearFields() {

      txtAlias.setEnabled(true);
      txtUsername.setEnabled(true);
      txtPassword.setEnabled(true);
      chbManager.setEnabled(true);

      txtAlias.setText("");
      txtUsername.setText("");
      txtPassword.setText("");
      chbManager.setSelected(false);
      lstMembers.clearSelection();
   }

   public void loadMyInfo() {
      DefaultListModel dlmMembers = new DefaultListModel();

      dlmMembers.addElement(currentUser);
      lstMembers.setModel(dlmMembers);
   }

}

package main;

public class MemberItem extends javax.swing.JPanel {

   public MemberItem() {
      initComponents();
      setVisible(true);
   }

    public void setMember(String str) {
      lblMemberAlias.setText(str);
   }

   public void setMemberMngr(String str) {
      lblMemberIsMngr.setText(str);
   }
   
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      lblMemberAlias = new javax.swing.JLabel();
      jSeparator1 = new javax.swing.JSeparator();
      lblMemberIsMngr = new javax.swing.JLabel();

      setMinimumSize(new java.awt.Dimension(220, 45));
      setPreferredSize(new java.awt.Dimension(220, 45));

      lblMemberAlias.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
      lblMemberAlias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      lblMemberAlias.setText("Alias");
      lblMemberAlias.setToolTipText("");
      lblMemberAlias.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

      lblMemberIsMngr.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
      lblMemberIsMngr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      lblMemberIsMngr.setText("isManager");
      lblMemberIsMngr.setVerticalAlignment(javax.swing.SwingConstants.TOP);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jSeparator1)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(lblMemberIsMngr, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
               .addComponent(lblMemberAlias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addComponent(lblMemberAlias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(2, 2, 2)
            .addComponent(lblMemberIsMngr)
            .addGap(2, 2, 2)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
      );
   }// </editor-fold>//GEN-END:initComponents


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JSeparator jSeparator1;
   private javax.swing.JLabel lblMemberAlias;
   private javax.swing.JLabel lblMemberIsMngr;
   // End of variables declaration//GEN-END:variables
}

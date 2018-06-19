package main;

public class TaskItem extends javax.swing.JPanel {

   public TaskItem() {
      initComponents();
      setVisible(true);
   }

   public void setTitle(String str) {
      lblTitle.setText(str);
   }

   public void setMember(String str) {
      lblMember.setText(str);
   }

   public void setDueDate(String str) {
      lblDueDate.setText(str);
   }

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      lblTitle = new javax.swing.JLabel();
      lblMember = new javax.swing.JLabel();
      lblDueDate = new javax.swing.JLabel();
      jSeparator2 = new javax.swing.JSeparator();

      setToolTipText("Double Click To View");
      setMaximumSize(new java.awt.Dimension(310, 60));
      setMinimumSize(new java.awt.Dimension(310, 60));
      setPreferredSize(new java.awt.Dimension(310, 60));

      lblTitle.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
      lblTitle.setText("Title");

      lblMember.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
      lblMember.setText("Member");

      lblDueDate.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
      lblDueDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
      lblDueDate.setText("Due Date");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addContainerGap(184, Short.MAX_VALUE))
               .addGroup(layout.createSequentialGroup()
                  .addComponent(lblMember, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(lblDueDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGap(25, 25, 25))))
         .addComponent(jSeparator2)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTitle)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(lblMember)
               .addComponent(lblDueDate))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
      );
   }// </editor-fold>//GEN-END:initComponents


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JSeparator jSeparator2;
   private javax.swing.JLabel lblDueDate;
   private javax.swing.JLabel lblMember;
   private javax.swing.JLabel lblTitle;
   // End of variables declaration//GEN-END:variables
}

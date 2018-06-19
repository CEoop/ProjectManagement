package main;

import Model.Project;
import Model.Task;

public class ProjectItem extends javax.swing.JPanel {

   public ProjectItem() {
      initComponents();
      setVisible(true);
   }

   public void setText(String str) {

      lblProjectTitle.setText(str);
   }

   public void setDueDate(Project selectedProject) {
      String maxDate = selectedProject.getDueDateString();
      lblDueDate.setText("Due Date: " + maxDate);
   }

   public void setProgressUpdate(Project selectedProject) {

      int min = 0;     

      for (Task t : selectedProject.getTasks()) {
         if (t.getState() == State.FINISHED) {
            ++min;
         }
      }
      ProgressBar.setMaximum(selectedProject.getTasks().size());
      ProgressBar.setValue(min);
      ProgressBar.setString(String.format("%15s  %d/%d", selectedProject.getState().toString(),min ,ProgressBar.getMaximum()));
      ProgressBar.setStringPainted(true);
   }

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      lblProjectTitle = new javax.swing.JLabel();
      lblDueDate = new javax.swing.JLabel();
      ProgressBar = new javax.swing.JProgressBar();
      jSeparator2 = new javax.swing.JSeparator();

      setToolTipText("Double Click To View");
      setMinimumSize(new java.awt.Dimension(780, 45));
      setPreferredSize(new java.awt.Dimension(780, 45));

      lblProjectTitle.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
      lblProjectTitle.setText("Project Title");
      lblProjectTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

      lblDueDate.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
      lblDueDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
      lblDueDate.setText("Due Date");
      lblDueDate.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

      ProgressBar.setForeground(new java.awt.Color(145, 170, 157));
      ProgressBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(124, 116, 108)));
      ProgressBar.setMaximumSize(new java.awt.Dimension(32767, 25));
      ProgressBar.setMinimumSize(new java.awt.Dimension(150, 25));
      ProgressBar.setPreferredSize(new java.awt.Dimension(150, 25));

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(35, 35, 35)
            .addComponent(lblProjectTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(lblDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(35, 35, 35))
         .addComponent(jSeparator2)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(5, 5, 5)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(lblDueDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(lblProjectTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addContainerGap(14, Short.MAX_VALUE)
                  .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
      );
   }// </editor-fold>//GEN-END:initComponents


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JProgressBar ProgressBar;
   private javax.swing.JSeparator jSeparator2;
   private javax.swing.JLabel lblDueDate;
   private javax.swing.JLabel lblProjectTitle;
   // End of variables declaration//GEN-END:variables
}

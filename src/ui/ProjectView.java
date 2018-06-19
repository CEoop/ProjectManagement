package ui;

import Model.DataModel;
import Model.Member;
import Model.Project;
import Model.Task;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import main.TaskListRenderer;
import main.State;

public class ProjectView extends javax.swing.JFrame {

   private DataModel dataModel;
   private Projects  parent;
   private Project   selectedProject;
   private Task      selectedTask;
   private Member    user;

   public ProjectView(DataModel datamodel, Projects projectForm, Project project, Member currentMember) {

      this.dataModel = datamodel;
      parent = projectForm;
      selectedProject = project;
      user = currentMember;

      initComponents();
      setLocationRelativeTo(null);
      setVisible(true);

      if (project.getTasks() != null) {
         loadTaskList();
      }

      lblProjectTitle.setText(project.getProjectName());
      txtProject.setText(project.getProjectDescription());

      lstPending.setCellRenderer(new TaskListRenderer());
      lstInProgress.setCellRenderer(new TaskListRenderer());
      lstFinished.setCellRenderer(new TaskListRenderer());

      lstPending.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
         @Override
         public void valueChanged(ListSelectionEvent e) {

            Object[] selectedItems = lstPending.getSelectedValues();

            if (selectedItems.length > 0) {

               selectedTask = (Task) selectedItems[0];

               lstInProgress.clearSelection();
               lstFinished.clearSelection();

            }
         }

      });
      lstInProgress.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
         @Override
         public void valueChanged(ListSelectionEvent e) {

            Object[] selectedItems = lstInProgress.getSelectedValues();

            if (selectedItems.length > 0) {

               selectedTask = (Task) selectedItems[0];

               lstFinished.clearSelection();
               lstPending.clearSelection();
            }
         }

      });
      lstFinished.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
         @Override
         public void valueChanged(ListSelectionEvent e) {

            Object[] selectedItems = lstFinished.getSelectedValues();

            if (selectedItems.length > 0) {

               selectedTask = (Task) selectedItems[0];

               lstInProgress.clearSelection();
               lstPending.clearSelection();
            }
         }

      });
      
      if (!user.isManager()) {
         enableRestrictions();
      }
   }

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      panMain = new javax.swing.JPanel();
      lblProjectTitle = new javax.swing.JLabel();
      jScrollPane2 = new javax.swing.JScrollPane();
      lstPending = new javax.swing.JList<>();
      jScrollPane1 = new javax.swing.JScrollPane();
      lstInProgress = new javax.swing.JList<>();
      jScrollPane3 = new javax.swing.JScrollPane();
      lstFinished = new javax.swing.JList<>();
      lblPending = new javax.swing.JLabel();
      lblInProgress = new javax.swing.JLabel();
      lblFinished = new javax.swing.JLabel();
      btnAddTask = new javax.swing.JButton();
      ProgressBar = new javax.swing.JProgressBar();
      lblProjectDescription = new javax.swing.JLabel();
      lblProgress = new javax.swing.JLabel();
      btnSave = new javax.swing.JButton();
      jScrollPane4 = new javax.swing.JScrollPane();
      txtProject = new javax.swing.JTextArea();
      btnDeleteProject = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      setTitle("Project View");
      setMinimumSize(new java.awt.Dimension(1060, 560));
      setResizable(false);

      panMain.setBackground(new java.awt.Color(220, 220, 220));

      lblProjectTitle.setBackground(new java.awt.Color(153, 153, 255));
      lblProjectTitle.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
      lblProjectTitle.setForeground(new java.awt.Color(124, 116, 108));
      lblProjectTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      lblProjectTitle.setText("Project Title ");

      jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
      jScrollPane2.setPreferredSize(new java.awt.Dimension(300, 260));

      lstPending.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
      lstPending.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
      lstPending.setMaximumSize(null);
      lstPending.setMinimumSize(null);
      lstPending.setPreferredSize(null);
      lstPending.setVisibleRowCount(50);
      lstPending.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            lstPendingMouseClicked(evt);
         }
      });
      jScrollPane2.setViewportView(lstPending);

      jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
      jScrollPane1.setPreferredSize(new java.awt.Dimension(300, 260));

      lstInProgress.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
      lstInProgress.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
      lstInProgress.setMaximumSize(null);
      lstInProgress.setMinimumSize(null);
      lstInProgress.setPreferredSize(null);
      lstInProgress.setVisibleRowCount(50);
      lstInProgress.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            lstInProgressMouseClicked(evt);
         }
      });
      jScrollPane1.setViewportView(lstInProgress);

      jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
      jScrollPane3.setPreferredSize(new java.awt.Dimension(300, 260));

      lstFinished.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
      lstFinished.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
      lstFinished.setMaximumSize(null);
      lstFinished.setMinimumSize(null);
      lstFinished.setPreferredSize(null);
      lstFinished.setVisibleRowCount(50);
      lstFinished.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            lstFinishedMouseClicked(evt);
         }
      });
      jScrollPane3.setViewportView(lstFinished);

      lblPending.setBackground(new java.awt.Color(111, 156, 150));
      lblPending.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
      lblPending.setForeground(new java.awt.Color(255, 255, 255));
      lblPending.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      lblPending.setText("Pending Tasks");
      lblPending.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(164, 153, 141)));
      lblPending.setOpaque(true);

      lblInProgress.setBackground(new java.awt.Color(111, 156, 150));
      lblInProgress.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
      lblInProgress.setForeground(new java.awt.Color(255, 255, 255));
      lblInProgress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      lblInProgress.setText("In Progress Tasks");
      lblInProgress.setToolTipText("");
      lblInProgress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(164, 153, 141)));
      lblInProgress.setOpaque(true);

      lblFinished.setBackground(new java.awt.Color(111, 156, 150));
      lblFinished.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
      lblFinished.setForeground(new java.awt.Color(255, 255, 255));
      lblFinished.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      lblFinished.setText("Finished Tasks");
      lblFinished.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(164, 153, 141)));
      lblFinished.setOpaque(true);

      btnAddTask.setBackground(new java.awt.Color(111, 156, 150));
      btnAddTask.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
      btnAddTask.setForeground(new java.awt.Color(255, 255, 255));
      btnAddTask.setText("Add Task");
      btnAddTask.setToolTipText("Add New");
      btnAddTask.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(164, 153, 141), new java.awt.Color(164, 153, 141), new java.awt.Color(143, 134, 124), new java.awt.Color(143, 134, 124)));
      btnAddTask.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      btnAddTask.setFocusTraversalPolicyProvider(true);
      btnAddTask.setMaximumSize(new java.awt.Dimension(80, 30));
      btnAddTask.setMinimumSize(new java.awt.Dimension(80, 30));
      btnAddTask.setPreferredSize(new java.awt.Dimension(80, 30));
      btnAddTask.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            btnAddTaskMouseClicked(evt);
         }
      });
      btnAddTask.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAddTaskActionPerformed(evt);
         }
      });

      ProgressBar.setForeground(new java.awt.Color(145, 170, 157));
      ProgressBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(124, 116, 108)));
      ProgressBar.setMaximumSize(new java.awt.Dimension(32767, 25));
      ProgressBar.setMinimumSize(new java.awt.Dimension(10, 25));
      ProgressBar.setPreferredSize(new java.awt.Dimension(148, 25));

      lblProjectDescription.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
      lblProjectDescription.setForeground(new java.awt.Color(124, 116, 108));
      lblProjectDescription.setText("Project Description");

      lblProgress.setForeground(new java.awt.Color(124, 116, 108));
      lblProgress.setText("Overall project progress");
      lblProgress.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

      btnSave.setBackground(new java.awt.Color(111, 156, 150));
      btnSave.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
      btnSave.setForeground(new java.awt.Color(255, 255, 255));
      btnSave.setText("Save");
      btnSave.setToolTipText("");
      btnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(164, 153, 141), new java.awt.Color(164, 153, 141), new java.awt.Color(143, 134, 124), new java.awt.Color(143, 134, 124)));
      btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      btnSave.setFocusTraversalPolicyProvider(true);
      btnSave.setMaximumSize(new java.awt.Dimension(80, 30));
      btnSave.setMinimumSize(new java.awt.Dimension(80, 30));
      btnSave.setPreferredSize(new java.awt.Dimension(80, 30));
      btnSave.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnSaveActionPerformed(evt);
         }
      });

      txtProject.setColumns(20);
      txtProject.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
      txtProject.setRows(5);
      jScrollPane4.setViewportView(txtProject);

      btnDeleteProject.setBackground(new java.awt.Color(111, 156, 150));
      btnDeleteProject.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
      btnDeleteProject.setForeground(new java.awt.Color(255, 255, 255));
      btnDeleteProject.setText("Delete Project");
      btnDeleteProject.setToolTipText("Add New");
      btnDeleteProject.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(164, 153, 141), new java.awt.Color(164, 153, 141), new java.awt.Color(143, 134, 124), new java.awt.Color(143, 134, 124)));
      btnDeleteProject.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      btnDeleteProject.setFocusTraversalPolicyProvider(true);
      btnDeleteProject.setMaximumSize(new java.awt.Dimension(80, 30));
      btnDeleteProject.setMinimumSize(new java.awt.Dimension(80, 30));
      btnDeleteProject.setPreferredSize(new java.awt.Dimension(80, 30));
      btnDeleteProject.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnDeleteProjectActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout panMainLayout = new javax.swing.GroupLayout(panMain);
      panMain.setLayout(panMainLayout);
      panMainLayout.setHorizontalGroup(
         panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panMainLayout.createSequentialGroup()
            .addGap(35, 35, 35)
            .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(panMainLayout.createSequentialGroup()
                  .addComponent(lblProjectDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMainLayout.createSequentialGroup()
                  .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(ProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addGroup(panMainLayout.createSequentialGroup()
                        .addGap(0, 184, Short.MAX_VALUE)
                        .addComponent(lblProjectTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))
                     .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panMainLayout.createSequentialGroup()
                        .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                           .addComponent(lblPending, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(btnDeleteProject, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                           .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                           .addComponent(lblInProgress, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                           .addComponent(btnAddTask, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                           .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(lblFinished, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                  .addGap(35, 35, 35))))
         .addGroup(panMainLayout.createSequentialGroup()
            .addGap(439, 439, 439)
            .addComponent(lblProgress)
            .addGap(0, 0, Short.MAX_VALUE))
      );
      panMainLayout.setVerticalGroup(
         panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(panMainLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lblProjectTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
            .addComponent(lblProjectDescription)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(lblPending, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(lblInProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(lblFinished, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGap(18, 18, 18)
            .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnDeleteProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnAddTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(20, 20, 20))
      );

      ProgressBar.getAccessibleContext().setAccessibleName("");
      ProgressBar.getAccessibleContext().setAccessibleDescription("");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(panMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(panMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void btnAddTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddTaskMouseClicked

   }//GEN-LAST:event_btnAddTaskMouseClicked

   private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
      if (!txtProject.getText().equals(selectedProject.getProjectDescription())) {
         selectedProject.setProjectDescription(txtProject.getText());
         dataModel.save();
      }
      if (user.isManager()) {
         parent.refreshProjectList(dataModel.getProjectManager().getAllProjects());
      } else {
         parent.refreshProjectList(dataModel.getProjectManager().getMemberProjects(user));

      }
      setVisible(false);
   }//GEN-LAST:event_btnSaveActionPerformed

    private void lstPendingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstPendingMouseClicked
       if (evt.getClickCount() == 2) {
          if (selectedTask != null) {
             TaskForm taskform = new TaskForm(dataModel, selectedProject, this, selectedTask, user, parent);
          } else {
             JOptionPane.showMessageDialog(null, "Please select a task");
          }
       }
    }//GEN-LAST:event_lstPendingMouseClicked

    private void lstInProgressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstInProgressMouseClicked
       if (evt.getClickCount() == 2) {
          if (selectedTask != null) {
             TaskForm taskform = new TaskForm(dataModel, selectedProject, this, selectedTask, user, parent);
          } else {
             JOptionPane.showMessageDialog(null, "Please select a task");
          }
       }
    }//GEN-LAST:event_lstInProgressMouseClicked

    private void lstFinishedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstFinishedMouseClicked
       if (evt.getClickCount() == 2) {
          if (selectedTask != null) {
             TaskForm taskform = new TaskForm(dataModel, selectedProject, this, selectedTask, user, parent);
          } else {
             JOptionPane.showMessageDialog(null, "Please select a task");
          }
       }
    }//GEN-LAST:event_lstFinishedMouseClicked

    private void btnDeleteProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProjectActionPerformed
       if (selectedProject != null) {
          int n = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this project?");
          if (n == 0) {
             dataModel.getProjectManager().removeProject(selectedProject);
             dataModel.save();
             selectedProject = null;
             parent.refreshProjectList(dataModel.getProjectManager().getAllProjects());
             setVisible(false);
          }
       }
    }//GEN-LAST:event_btnDeleteProjectActionPerformed

    private void btnAddTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTaskActionPerformed
       TaskForm tv = new TaskForm(dataModel, this, selectedProject, user, parent);
    }//GEN-LAST:event_btnAddTaskActionPerformed

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JProgressBar ProgressBar;
   private javax.swing.JButton btnAddTask;
   private javax.swing.JButton btnDeleteProject;
   private javax.swing.JButton btnSave;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JScrollPane jScrollPane3;
   private javax.swing.JScrollPane jScrollPane4;
   private javax.swing.JLabel lblFinished;
   private javax.swing.JLabel lblInProgress;
   private javax.swing.JLabel lblPending;
   private javax.swing.JLabel lblProgress;
   private javax.swing.JLabel lblProjectDescription;
   private javax.swing.JLabel lblProjectTitle;
   private javax.swing.JList<String> lstFinished;
   private javax.swing.JList<String> lstInProgress;
   private javax.swing.JList<String> lstPending;
   private javax.swing.JPanel panMain;
   private javax.swing.JTextArea txtProject;
   // End of variables declaration//GEN-END:variables

   public void loadTaskList() {

      DefaultListModel dlmPending = new DefaultListModel();
      DefaultListModel dlmInProgress = new DefaultListModel();
      DefaultListModel dlmFinished = new DefaultListModel();

      for (Task t : selectedProject.getTasks()) {
         switch (t.getState()) {
            case PENDING:
               dlmPending.addElement(t);
               break;
            case INPROGRESS:
               dlmInProgress.addElement(t);
               break;
            default:
               dlmFinished.addElement(t);
               break;
         }
      }

      lstPending.setModel(dlmPending);
      lstInProgress.setModel(dlmInProgress);
      lstFinished.setModel(dlmFinished);

      progressUpdate();
   }

   public void progressUpdate() {
      
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

   public void enableRestrictions() {

      btnAddTask.setVisible(false);
      btnDeleteProject.setVisible(false);
      btnSave.setVisible(false);
      
   }

}

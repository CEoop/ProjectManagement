package ui;

import Model.DataModel;
import Model.Member;
import Model.Project;
import Model.Task;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import main.State;

public class TaskForm extends javax.swing.JFrame {

   private DataModel        dataModel;
   private Task             selectedTask;
   private Project          selectedProject;
   private ProjectView      parentProjectView;
   private Member           user;
   private Projects         projects;

   public TaskForm(DataModel datamodel, ProjectView projectView, Project project, Member currentMember, Projects main) {

      this.dataModel = datamodel;
      parentProjectView = projectView;
      selectedProject = project;
      user = currentMember;
      this.projects = main;

      initComponents();
      loadMembers();
      setLocationRelativeTo(null);
      setVisible(true);

      btnDeleteTask.setVisible(false);

      if (!user.isManager()) {
         enableRestrictions();
      }

   }

   public TaskForm(DataModel datamodel, Project project, ProjectView projectView, Task task, Member currentMember, Projects main) {

      this.dataModel = datamodel;
      parentProjectView = projectView;
      selectedTask = task;
      selectedProject = project;
      user = currentMember;
      this.projects = main;

      initComponents();
      loadMembers();
      setLocationRelativeTo(null);
      setVisible(true);
      loadData(task);

      if (!currentMember.isManager()) {
         enableRestrictions();
      }
   }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMain = new javax.swing.JPanel();
        cmbMember = new javax.swing.JComboBox<>();
        cmbState = new javax.swing.JComboBox<>();
        txtTitle = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblDueDate = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblAssignedTo = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        ScrollPaneTextArea = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        txtDueDate = new javax.swing.JTextField();
        btnDeleteTask = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(420, 400));
        setResizable(false);

        panMain.setBackground(new java.awt.Color(220, 220, 220));

        cmbMember.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cmbMember.setForeground(new java.awt.Color(124, 116, 108));
        cmbMember.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Member" }));
        cmbMember.setName(""); // NOI18N

        cmbState.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cmbState.setForeground(new java.awt.Color(124, 116, 108));
        cmbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "In Progress", "Finished" }));
        cmbState.setName(""); // NOI18N

        txtTitle.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        lblTitle.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(124, 116, 108));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Task Title:");
        lblTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblDescription.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(124, 116, 108));
        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescription.setText("Task Description:");
        lblDescription.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblDueDate.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblDueDate.setForeground(new java.awt.Color(124, 116, 108));
        lblDueDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDueDate.setText("Due Date");
        lblDueDate.setToolTipText("");
        lblDueDate.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblStatus.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(124, 116, 108));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("Status:");
        lblStatus.setToolTipText("");
        lblStatus.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblAssignedTo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblAssignedTo.setForeground(new java.awt.Color(124, 116, 108));
        lblAssignedTo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAssignedTo.setText("Assigned to:");
        lblAssignedTo.setToolTipText("");
        lblAssignedTo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

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

        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtDescription.setRows(5);
        ScrollPaneTextArea.setViewportView(txtDescription);

        txtDueDate.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtDueDate.setForeground(new java.awt.Color(124, 116, 108));
        txtDueDate.setToolTipText("Month/Day/Year");

        btnDeleteTask.setBackground(new java.awt.Color(111, 156, 150));
        btnDeleteTask.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnDeleteTask.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteTask.setText("Delete Task");
        btnDeleteTask.setToolTipText("");
        btnDeleteTask.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(164, 153, 141), new java.awt.Color(164, 153, 141), new java.awt.Color(143, 134, 124), new java.awt.Color(143, 134, 124)));
        btnDeleteTask.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDeleteTask.setFocusTraversalPolicyProvider(true);
        btnDeleteTask.setMaximumSize(new java.awt.Dimension(80, 30));
        btnDeleteTask.setMinimumSize(new java.awt.Dimension(80, 30));
        btnDeleteTask.setPreferredSize(new java.awt.Dimension(80, 30));
        btnDeleteTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTaskActionPerformed(evt);
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
                        .addComponent(lblDescription)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMainLayout.createSequentialGroup()
                        .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panMainLayout.createSequentialGroup()
                                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDueDate)
                                    .addComponent(txtDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDeleteTask, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblStatus)
                                    .addComponent(cmbState, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ScrollPaneTextArea)
                            .addGroup(panMainLayout.createSequentialGroup()
                                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTitle)
                                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAssignedTo)
                                    .addComponent(cmbMember, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(35, 35, 35))))
        );
        panMainLayout.setVerticalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAssignedTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMember, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPaneTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbState, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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

    private void btnDeleteTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTaskActionPerformed
       if (selectedTask != null) {
          int n = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this task?");
          if (n == 0) {
             dataModel.getProjectManager().removeTaskFromProject(selectedProject, selectedTask);
             dataModel.save();
             selectedTask = null;
             parentProjectView.loadTaskList();
             setVisible(false);
          }
       }
    }//GEN-LAST:event_btnDeleteTaskActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       if (selectedTask == null) {
          saveTask();
          
       } else {
          saveEdits(selectedTask);
       }
       parentProjectView.loadTaskList();
       setVisible(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPaneTextArea;
    private javax.swing.JButton btnDeleteTask;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbMember;
    private javax.swing.JComboBox<String> cmbState;
    private javax.swing.JLabel lblAssignedTo;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblDueDate;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panMain;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtDueDate;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables

   private void saveTask() {

      try {

         String title = txtTitle.getText();
         String description = txtDescription.getText();

         GregorianCalendar dueDate = new GregorianCalendar();
         dueDate.setTime(new Date(txtDueDate.getText()));

         Member member = (Member) cmbMember.getSelectedItem();
         State state = State.values()[cmbState.getSelectedIndex()];

         Task newTask = new Task(title, description, dueDate, state, member, selectedProject);

         dataModel.getProjectManager().addTaskToProject(selectedProject, newTask);
         dataModel.save();
         projects.loadMemberList();
         

      } catch (IllegalArgumentException ex) {

         JOptionPane.showMessageDialog(null, "Invalid date format");

      }
   }

   private void saveEdits(Task task) {

      try {

         task.setTitle(txtTitle.getText());
         task.setDescription(txtDescription.getText());
         task.setState(State.values()[cmbState.getSelectedIndex()]);
         task.setAssignedTo((Member) cmbMember.getSelectedItem());

         GregorianCalendar dueDate = task.getDueDate();
         dueDate.setTime(new Date(txtDueDate.getText()));
         task.setDueDate(dueDate);

         dataModel.save();
         projects.loadMemberList();

      } catch (IllegalArgumentException ex) {

         JOptionPane.showMessageDialog(null, "Invalid date format");
      }
   }

   private void loadData(Task task) {

      try {

         txtTitle.setText(task.getTitle());
         txtDescription.setText(task.getDescription());

         SimpleDateFormat fmt = new SimpleDateFormat("MM/dd/yyyy");
         txtDueDate.setText(fmt.format(task.getDueDate().getTime()));

         cmbMember.setSelectedItem(task.getAssignedTo());
         cmbState.setSelectedIndex(task.getState().ordinal()); //ordinal e kthen index te enum value

      } catch (IllegalArgumentException ex) {

         JOptionPane.showMessageDialog(null, "Invalid date format");
      }
   }

   public void loadMembers() {

      DefaultComboBoxModel memberDcm = new DefaultComboBoxModel();

      for (Member member : dataModel.getMemberManager().getAllMembers()) {
         memberDcm.addElement(member);
      }
      cmbMember.setModel(memberDcm);

   }

   public void enableRestrictions() {
      cmbMember.setEnabled(false);
      txtDueDate.setEditable(false);
      btnDeleteTask.setVisible(false);
      if (selectedTask.getAssignedTo() != user){
          btnSave.setVisible(false);
      }
      
   }
}

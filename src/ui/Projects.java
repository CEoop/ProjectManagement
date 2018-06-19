package ui;

import Model.DataModel;
import Model.Member;
import Model.Project;
import Model.Task;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import main.MemberListRenderer;
import main.ProjectListRenderer;

public class Projects extends javax.swing.JFrame {

   private DataModel    dataModel;
   private Project      selectedProject = null;
   private Member       selectedMember = null;
   private Member       user;

   public Projects(DataModel dataModel, Member currentMember) {

      this.dataModel = dataModel;
      user = currentMember;

      initComponents();
      setLocationRelativeTo(null);
      setVisible(true);

      lstProjects.setCellRenderer(new ProjectListRenderer());

      lstProjects.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
         @Override
         public void valueChanged(ListSelectionEvent e) {

            Object[] selectedItems = lstProjects.getSelectedValues();

            if (selectedItems.length > 0) {

               selectedProject = (Project) selectedItems[0];
               lstMembers.clearSelection();
               loadMemberList();
            }
         }
      });

      lstMembers.setCellRenderer(new MemberListRenderer());

      lstMembers.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
         @Override
         public void valueChanged(ListSelectionEvent e) {

            Object[] selectedItems = lstMembers.getSelectedValues();

            if (selectedItems.length > 0) {

               selectedMember = (Member) selectedItems[0];
               lstProjects.clearSelection();
            }
         }
      });

      refreshProjectList(dataModel.getProjectManager().getAllProjects());
      loadMemberList();

      if (!user.isManager()) {
         enableRestrictions();
         refreshProjectList(dataModel.getProjectManager().getMemberProjects(user));

      }
   }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMain = new javax.swing.JPanel();
        lblProjects = new javax.swing.JLabel();
        lblMembers = new javax.swing.JLabel();
        btnEditMembers = new javax.swing.JButton();
        btnCreateProject = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstMembers = new javax.swing.JList<>();
        spProjects = new javax.swing.JScrollPane();
        lstProjects = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projects");
        setMinimumSize(new java.awt.Dimension(880, 480));
        setResizable(false);

        panMain.setBackground(new java.awt.Color(220, 220, 220));
        panMain.setMinimumSize(new java.awt.Dimension(880, 480));

        lblProjects.setBackground(new java.awt.Color(111, 156, 150));
        lblProjects.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        lblProjects.setForeground(new java.awt.Color(255, 255, 255));
        lblProjects.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProjects.setText("Projects");
        lblProjects.setOpaque(true);

        lblMembers.setBackground(new java.awt.Color(111, 156, 150));
        lblMembers.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblMembers.setForeground(new java.awt.Color(255, 255, 255));
        lblMembers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMembers.setText("Members");
        lblMembers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblMembers.setOpaque(true);

        btnEditMembers.setBackground(new java.awt.Color(111, 156, 150));
        btnEditMembers.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnEditMembers.setForeground(new java.awt.Color(255, 255, 255));
        btnEditMembers.setText("Edit Members");
        btnEditMembers.setToolTipText("");
        btnEditMembers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(164, 153, 141), new java.awt.Color(164, 153, 141), new java.awt.Color(143, 134, 124), new java.awt.Color(143, 134, 124)));
        btnEditMembers.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditMembers.setFocusTraversalPolicyProvider(true);
        btnEditMembers.setMaximumSize(new java.awt.Dimension(80, 30));
        btnEditMembers.setMinimumSize(new java.awt.Dimension(80, 30));
        btnEditMembers.setPreferredSize(new java.awt.Dimension(80, 30));
        btnEditMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditMembersActionPerformed(evt);
            }
        });

        btnCreateProject.setBackground(new java.awt.Color(111, 156, 150));
        btnCreateProject.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btnCreateProject.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateProject.setText("Create New Project");
        btnCreateProject.setToolTipText("");
        btnCreateProject.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(164, 153, 141), new java.awt.Color(164, 153, 141), new java.awt.Color(143, 134, 124), new java.awt.Color(143, 134, 124)));
        btnCreateProject.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCreateProject.setFocusTraversalPolicyProvider(true);
        btnCreateProject.setMaximumSize(new java.awt.Dimension(80, 30));
        btnCreateProject.setMinimumSize(new java.awt.Dimension(80, 30));
        btnCreateProject.setPreferredSize(new java.awt.Dimension(80, 30));
        btnCreateProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateProjectActionPerformed(evt);
            }
        });

        lstMembers.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lstMembers.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstMembers);

        spProjects.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        lstProjects.setToolTipText("");
        lstProjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstProjectsMouseClicked(evt);
            }
        });
        spProjects.setViewportView(lstProjects);

        javax.swing.GroupLayout panMainLayout = new javax.swing.GroupLayout(panMain);
        panMain.setLayout(panMainLayout);
        panMainLayout.setHorizontalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMainLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblProjects, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                    .addComponent(spProjects)
                    .addComponent(btnCreateProject, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panMainLayout.setVerticalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProjects, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spProjects, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreateProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditMembers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void btnCreateProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateProjectActionPerformed
      NewProject newProject = new NewProject(dataModel, this);
   }//GEN-LAST:event_btnCreateProjectActionPerformed

   private void btnEditMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditMembersActionPerformed
      NewMember newMember = new NewMember(dataModel, this, user);
   }//GEN-LAST:event_btnEditMembersActionPerformed

   private void lstProjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstProjectsMouseClicked
      if (evt.getClickCount() == 2) {
         if (selectedProject == null) {
            JOptionPane.showMessageDialog(null, "Please select a project");
         } else {
            ProjectView pv = new ProjectView(dataModel, this, selectedProject, user);
         }
      }
   }//GEN-LAST:event_lstProjectsMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateProject;
    private javax.swing.JButton btnEditMembers;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMembers;
    private javax.swing.JLabel lblProjects;
    private javax.swing.JList<String> lstMembers;
    private javax.swing.JList<String> lstProjects;
    private javax.swing.JPanel panMain;
    private javax.swing.JScrollPane spProjects;
    // End of variables declaration//GEN-END:variables

   public void refreshProjectList(ArrayList<Project> projectList) {

      DefaultListModel dlmProjects = new DefaultListModel();

      for (Project p : projectList) {
         dlmProjects.addElement(p);
      }

      lstProjects.setModel(dlmProjects);
   }

   public void loadMemberList(ArrayList<Member> memberslist) {

      DefaultListModel dlmMembers = new DefaultListModel();

      for (Member m : memberslist) {
         dlmMembers.addElement(m);
      }

      lstMembers.setModel(dlmMembers);
   }

   public void loadMemberList() {

      DefaultListModel dlmMembers = new DefaultListModel();

      if (selectedProject != null) {
         for (Task t : selectedProject.getTasks()) {
            if (!dlmMembers.contains(t.getAssignedTo())) {
               dlmMembers.addElement(t.getAssignedTo());
            }
         }
         lstMembers.setModel(dlmMembers);
      } 
   }

   public void enableRestrictions() {
      btnCreateProject.setVisible(false);
       btnEditMembers.setText("My information");

   }

}

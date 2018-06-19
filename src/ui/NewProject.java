package ui;

import Model.DataModel;
import Model.Project;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class NewProject extends javax.swing.JFrame {

   private DataModel   dataModel;
   private Projects    parent;

   public NewProject(DataModel dataModel, Projects newProjects) {
      
      this.dataModel = dataModel;
      parent = newProjects;
      
      initComponents();
      setLocationRelativeTo(null);
      setVisible(true);
      
   }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMain = new javax.swing.JPanel();
        txtProjectTitle = new javax.swing.JTextField();
        ScrollPaneDescription = new javax.swing.JScrollPane();
        txtProjectDescription = new javax.swing.JTextArea();
        lblProjectTitle = new javax.swing.JLabel();
        lblProjectDescription = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblDueDate = new javax.swing.JLabel();
        txtDueDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Project");
        setMinimumSize(new java.awt.Dimension(550, 280));
        setResizable(false);

        panMain.setBackground(new java.awt.Color(220, 220, 220));
        panMain.setForeground(new java.awt.Color(124, 116, 108));
        panMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panMain.setMaximumSize(new java.awt.Dimension(550, 280));
        panMain.setMinimumSize(new java.awt.Dimension(550, 280));
        panMain.setName(""); // NOI18N
        panMain.setPreferredSize(new java.awt.Dimension(550, 280));

        txtProjectTitle.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtProjectDescription.setColumns(20);
        txtProjectDescription.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtProjectDescription.setRows(5);
        ScrollPaneDescription.setViewportView(txtProjectDescription);

        lblProjectTitle.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblProjectTitle.setForeground(new java.awt.Color(124, 116, 108));
        lblProjectTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProjectTitle.setText("Project Title:");
        lblProjectTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblProjectDescription.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblProjectDescription.setForeground(new java.awt.Color(124, 116, 108));
        lblProjectDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProjectDescription.setText("Project Description:");
        lblProjectDescription.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

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

        lblDueDate.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblDueDate.setForeground(new java.awt.Color(124, 116, 108));
        lblDueDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDueDate.setText("Due Date");
        lblDueDate.setToolTipText("");
        lblDueDate.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txtDueDate.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtDueDate.setForeground(new java.awt.Color(124, 116, 108));
        txtDueDate.setToolTipText("Month/Day/Year");

        javax.swing.GroupLayout panMainLayout = new javax.swing.GroupLayout(panMain);
        panMain.setLayout(panMainLayout);
        panMainLayout.setHorizontalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMainLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panMainLayout.createSequentialGroup()
                        .addComponent(lblProjectDescription)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMainLayout.createSequentialGroup()
                        .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panMainLayout.createSequentialGroup()
                                .addComponent(txtDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ScrollPaneDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                            .addComponent(txtProjectTitle)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panMainLayout.createSequentialGroup()
                                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDueDate, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProjectTitle, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(35, 35, 35))))
        );
        panMainLayout.setVerticalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProjectTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProjectTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProjectDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPaneDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMain, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       createProject();
       setVisible(false);
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPaneDescription;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblDueDate;
    private javax.swing.JLabel lblProjectDescription;
    private javax.swing.JLabel lblProjectTitle;
    private javax.swing.JPanel panMain;
    private javax.swing.JTextField txtDueDate;
    private javax.swing.JTextArea txtProjectDescription;
    private javax.swing.JTextField txtProjectTitle;
    // End of variables declaration//GEN-END:variables

   public void createProject() {
       
    try {
         String projectName = txtProjectTitle.getText();
         String projectDescription = txtProjectDescription.getText();

         GregorianCalendar dueDate = new GregorianCalendar();
         dueDate.setTime(new Date(txtDueDate.getText()));

         Project project = new Project(projectName, projectDescription, dueDate);

         dataModel.getProjectManager().addProject(project);
         dataModel.save();
         parent.refreshProjectList(dataModel.getProjectManager().getAllProjects());

      } catch (IllegalArgumentException ex) {

         JOptionPane.showMessageDialog(null, "Invalid date format");

      }
   }
}

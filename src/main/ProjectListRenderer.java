package main;

import Model.Project;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ProjectListRenderer implements ListCellRenderer {

   @Override
   public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

      ProjectItem pi = new ProjectItem();
      pi.setText(((Project) value).getProjectName());
      pi.setDueDate((Project) value);
      pi.setProgressUpdate((Project) value);
      
      if (isSelected) {
         pi.setBackground(new Color(255, 255, 255));
      }

      return pi;
   }

}

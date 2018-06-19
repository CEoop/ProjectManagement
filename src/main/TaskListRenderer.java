package main;

import Model.Task;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class TaskListRenderer implements ListCellRenderer {

   @Override
   public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

      TaskItem ti = new TaskItem();

      ti.setTitle(((Task) value).getTitle());
      ti.setMember("To: " + ((Task) value).getAssignedTo().getAlias());
      ti.setDueDate("Due Date: " + ((Task) value).getDueDateString()) ;
      
      if (isSelected) {
         ti.setBackground(new Color(255, 255, 255));
      }
      
      return ti;
   }

}

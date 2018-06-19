package main;

import Model.Member;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class MemberListRenderer implements ListCellRenderer {

   @Override
   public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
     
      MemberItem mi = new MemberItem();

      mi.setMember(((Member) value).getAlias());
      if (((Member) value).isManager()) {
         mi.setMemberMngr("Manager");
      } else {
         mi.setMemberMngr("Member");
      }

      if (isSelected) {
         mi.setBackground(new Color(255, 255, 255));
      }
      return mi;
   }

}

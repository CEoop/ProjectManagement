package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MemberManager implements Serializable {

   public ArrayList<Member> memberList = new ArrayList<>();

   public void addMember(Member m) {
      if (m == null || usernameExists(m.getUsername()) ) 
         throw new IllegalArgumentException("Invalid Member");
      
      memberList.add(m);
   }

   public void deleteMember(Member m) {
      if (!exists(m)) {
         throw new NoSuchElementException("Member doesn't exist");
      }
      memberList.remove(m);
   }

   public boolean exists(Member m) {
      return memberList.contains(m);
   }

   public Member getMemberByUsername(String username) {

      for (Member member : memberList) {
         if (member.getUsername().equals(username)) {
            return member;
         }
      }

      return null;
   }
   
    private boolean usernameExists(String username) {

      for (Member member : memberList) {
         if (member.getUsername().equals(username)) {
            return true;
         }
      }

      return false;
   }

   public ArrayList<Member> getAllMembers() {

      return memberList;
   }

}

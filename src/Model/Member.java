package Model;

import java.io.Serializable;
import main.Helpers;

public class Member implements Serializable {

   private String alias;
   private String username;
   private String password;
   private boolean isManager;

   private String hashedPassword;
   private final int salt;

   public Member(String alias, String username, String password, boolean isManager) {

      this.alias = alias;
      this.isManager = isManager;

      setUsername(username);

      salt = Helpers.generateSalt();
      hashedPassword = Helpers.hashPassword(password, salt);
   }

   public String getAlias() {
      return alias;
   }

   public void isManager(Boolean Manager) {
      this.isManager = Manager;
   }

   public void setAlias(String alias) {
      this.alias = alias;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {

      String usernameRegex = "[a-zA-Z0-9\\._\\-]{4,}";

      if (!username.matches(usernameRegex)) {
         throw new IllegalArgumentException("Invalid username");
      }

      this.username = username;
   }

   public boolean isManager() {
      return isManager;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public boolean validPassword(String password) {

      String enteredPasswordHash = Helpers.hashPassword(password, salt);

      return hashedPassword.equals(enteredPasswordHash);
   }

   public void changePassword(String newPassword) {
      if (newPassword.length() < 6) {
         throw new IllegalArgumentException("Invalid password");
      }
      hashedPassword = Helpers.hashPassword(newPassword, salt);
   }

   @Override
   public String toString() {
      return getAlias();
   }

}

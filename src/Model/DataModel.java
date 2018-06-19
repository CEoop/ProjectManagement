package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DataModel implements Serializable {

   private ProjectManager projectManager;
   private MemberManager  memberManager;
   private String         objectPath;

   public DataModel() {

      projectManager = new ProjectManager();
      memberManager = new MemberManager();
      objectPath = null;

   }

   public ProjectManager getProjectManager() {
      return projectManager;
   }

   public void setProjectManager(ProjectManager projectManager) {
      this.projectManager = projectManager;
   }

   public MemberManager getMemberManager() {
      return memberManager;
   }

   public void setMemberManager(MemberManager memberManager) {
      this.memberManager = memberManager;
   }

   public String getObjectPath() {
      return objectPath;
   }

   public void setObjectPath(String objectPath) {
      this.objectPath = objectPath;
   }

   public boolean save() {

      if (objectPath != null) {
         return saveToFile(objectPath);
      } else {
         return false;
      }
   }

   public boolean saveToFile(String filePath) {

      try (FileOutputStream fos = new FileOutputStream(filePath)) {

         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(this);

         return true;
      } catch (IOException ex) {
         return false;
      }
   }

   public static DataModel loadFromFile(String filePath) {

      try (FileInputStream fis = new FileInputStream(filePath)) {

         ObjectInputStream ois = new ObjectInputStream(fis);

         DataModel dataModel = (DataModel) ois.readObject();

         dataModel.setObjectPath(filePath);

         return dataModel;

      } catch (IOException | ClassNotFoundException ex) {

         return createNewDataModel(filePath);
      }
   }

   public static DataModel createNewDataModel(String modelPath) {

      DataModel dataModel = new DataModel();

      dataModel.getMemberManager().addMember(new Member("Default User", "username", "password", true));

      dataModel.saveToFile(modelPath);

      dataModel.setObjectPath(modelPath);

      System.out.println("Created new DataModel");

      return dataModel;
   }
}

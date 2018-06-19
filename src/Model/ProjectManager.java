package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ProjectManager implements Serializable {

   private ArrayList<Project> projectList = new ArrayList<>();

   public void addProject(Project p) {
      if (p == null) {
         throw new IllegalArgumentException("Invalid Project");
      }
      projectList.add(p);
   }

   public void removeProject(Project p) {
      if (!exists(p)) {
         throw new NoSuchElementException("Project doesn't exist");
      } else {
         projectList.remove(p);
      }
   }

   public boolean exists(Project p) {
      return projectList.contains(p);
   }

   public ArrayList<Project> getAllProjects() {
      return projectList;
   }

   public void addTaskToProject(Project selectedProject, Task newTask) {
      selectedProject.addTask(newTask);
   }

   public void removeTaskFromProject(Project selectedProject, Task selectedTask) {
      selectedProject.deleteTask(selectedTask);
   }

   public ArrayList<Project> getMemberProjects(Member member) {

      ArrayList<Project> projects = new ArrayList<>();

      for (Project p : projectList) {
         for (Task t : p.getTasks()) {
            if (t.getAssignedTo() == member) {
               projects.add(p);
               break;
            }
         }
      }
      return projects;
   }
   
   public boolean hasProjects(Member member){
       boolean projects = false;
       for(Project p : projectList){
           for (Task t :p.getTasks()){
               if(t.getAssignedTo() == member)
                   projects = true;
           }
       }
       return projects;
   }
   
}

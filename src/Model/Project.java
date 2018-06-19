package Model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.NoSuchElementException;
import main.State;

public class Project implements Serializable {

   private String            projectName;
   private String            projectDescription;
   private GregorianCalendar dueDate;
   private State             state;
   private ArrayList<Task>   tasks;

   public Project(String projectName, String projectDescription, GregorianCalendar dueDate) {

      this.projectName = projectName;
      this.projectDescription = projectDescription;
      setDueDate(dueDate);

      tasks = new ArrayList<>();
      state = State.PENDING;
   }

   public void setDueDate(GregorianCalendar dueDate) {

      if (dueDate.before(new GregorianCalendar())) {
         throw new IllegalArgumentException("Invalid date");
      }

      this.dueDate = dueDate;
   }

   public String getDueDateString() {
      SimpleDateFormat fmt = new SimpleDateFormat("MM/dd/yyyy");
      return fmt.format(dueDate.getTime());
   }

   public GregorianCalendar getDueDate() {
      return dueDate;
   }

   public void setState(State ps) {
      this.state = ps;
   }

   public State getState() {
      int pending = 0;
      int inProgress = 0;
      int finished = 0;

      for (Task t : tasks) {

         switch (t.getState()) {
            case PENDING:
               pending++;
               break;
            case INPROGRESS:
               inProgress++;
               break;
            default:
               finished++;
               break;
         }
      }

      if (!tasks.isEmpty() && finished == tasks.size()) {
         return State.FINISHED;
      } else if (inProgress > 0 || finished > 0) {
         return State.INPROGRESS;
      } else {
         return State.PENDING;
      }
   }

   public String getProjectName() {
      return projectName;
   }

   public void setProjectName(String projectName) {
      this.projectName = projectName;
   }

   public String getProjectDescription() {
      return projectDescription;
   }

   public void setProjectDescription(String projectDescription) {
      this.projectDescription = projectDescription;
   }

   public ArrayList<Task> getTasks() {
      return tasks;
   }

   @Override
   public String toString() {
      return projectName;
   }

   public void addTask(Task t) {
      if (t == null) {
         throw new IllegalArgumentException("Invalid Task");
      }
      tasks.add(t);
   }

   public void deleteTask(Task t) {
      if (!tasks.contains(t)) {
         throw new NoSuchElementException("Task doesn't exist");
      }
      tasks.remove(t);
   }

}

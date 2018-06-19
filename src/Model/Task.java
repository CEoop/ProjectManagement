package Model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import main.State;

public class Task implements Serializable {

   private String               title;
   private String               description;
   private GregorianCalendar    dueDate;
   private State                state;
   private Member               assignedTo;
   private Project              project;

   public Task(String title, String description, GregorianCalendar dueDate, State state, Member assignedTo, Project selectedProject) {

      this.project = selectedProject;
      this.title = title;
      this.description = description;
      this.state = state;
      this.assignedTo = assignedTo;


      setDueDate(dueDate);
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public GregorianCalendar getDueDate() {
      return dueDate;
   }

   public void setDueDate(GregorianCalendar dueDate) {

      if (dueDate.before(new GregorianCalendar()) || dueDate.after(project.getDueDate()) ) {
         throw new IllegalArgumentException("Invalid date");
      }

      this.dueDate = dueDate;
   }

   public String getDueDateString() {
      SimpleDateFormat fmt = new SimpleDateFormat("MM/dd/yyyy");
      return fmt.format(dueDate.getTime());
   }

   public State getState() {
      return state;
   }

   public void setState(State state) {
      this.state = state;
   }

   public Member getAssignedTo() {
      return assignedTo;
   }

   public void setAssignedTo(Member assignedTo) {
      this.assignedTo = assignedTo;
   }

}

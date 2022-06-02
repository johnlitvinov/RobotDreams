import java.util.HashMap;
import java.util.Map;

public class Student {

   private int id;
   private String firstName;
   private String lastName;
   private Map<String, Boolean> tasks = new HashMap<>();

   public Student (int id,String firstName,String lastName){
       this.id = id;
       this.firstName = firstName;
       this.lastName = lastName;
   }

    public void setStudentTask(String task, boolean state) {
           tasks.put(task, state);
    }

    @Override
    public String toString() {
        return "----------STUDENT INFO---------\n"+
                "Student id: "+this.id+"\n"+
                "Student firstName: "+this.firstName+"\n"+
                "Student lastName: "+this.lastName+"\n" +
                "Done task: " +  tasks.toString() + "\n"+"____________________________\n";
    }
}//end class

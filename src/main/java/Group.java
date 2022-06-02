import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Group {

    private String name;
    private Student cheifOfGroup;
    private Map<Integer, Student> students = new HashMap<>();
    private Set<String> tasks = new HashSet<>();

    public Group(String name,Student headOfGroup) {
        this.name = name;
        this.cheifOfGroup = headOfGroup;
    }

    public Student changeChief(Student cheifOfGroup){
        System.out.println("---------Changed chief of the group-------------");
        return this.cheifOfGroup = cheifOfGroup;
    }

    public void addStudent(int idInGroup,Student student){
        students.put(idInGroup,student);
        System.out.println("-------Added student to the group:----------- \n" +
                "studentIdInGroup: "+idInGroup+"\n"+
                "Student: \n"+student+"\n"+
                "Group: \n"+students+"\n"+
                "---------------------------------------------------------");
    }

    public boolean removeStudent(int groupId){
        if (isStudentInGroup(groupId)) {
            students.remove(groupId);
            System.out.println("Removed student from the group");
            return true;
        }
        System.out.println("Can't Remove student from the group");
        return false;
    }

    public boolean renameStudent(int groupId,Student student){
        if (isStudentInGroup(groupId)) {
            students.replace(groupId, student);
            System.out.println("Rename student from the group");
            return true;
        }
        System.out.println("Can't rename student from the group");
        return false;
    }

    public void addTask(String task){
        tasks.add(task);
        System.out.println("Добавлено задание: " + task);
    }

    public void markTaskAsDoneByStudent(String task, int IdInGroup){
        Student student = students.get(IdInGroup);
        student.setStudentTask(task, true);
    }

    private boolean isStudentInGroup(int id) {
        return students.containsKey(id);
    }

    @Override
    public String toString() {
        return  "----------GROUP INFO---------\n"+
                "Group Name: "+ this.name+"\n" +
                "Cheif Of Group: \n"+ this.cheifOfGroup+"\n" +
                "Group MEMBERS: \n"+ students.toString()+"\n"+
                "All Tasks: " + tasks;
    }
}//end class

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Group {

    private String name;
    private Student cheifOfGroup;
    private Map<Integer, Student> students = new HashMap<>();
    private Set<String> tasks = new HashSet<>();

    public Group(String name,Student cheifOfGroup) {
        this.name = name;
        this.cheifOfGroup = cheifOfGroup;
    }

    public Student getStudentOfGroup(int id) {
        return students.get(id);
    }

    public Student getCheifOfGroup() {
        return cheifOfGroup;
    }

    void setHeadOfGroup(Student cheifOfGroup) {
            this.cheifOfGroup = cheifOfGroup;
    }

    public void changeChief(Student student) {
        if (!isStudentNull(cheifOfGroup)) {
            setHeadOfGroup(getStudentOfGroup(student.getId()));
        }
    }

    public void addStudent(Student student){
        students.put(student.getId(),student);
        System.out.println("-------Added student to the group:----------- \n" +
                "Student: \n"+student+"\n"+
                "Group: \n"+students+"\n"+
                "---------------------------------------------------------");
    }

    public boolean removeStudent(Student student){
        if (isStudentExist(student)) {
            students.remove(student.getId());
            return true;
        }
        return false;
    }

    public boolean renameStudent(Student student){
        if (!isStudentNull(student)) {
            students.replace(student.getId(), student);
            return true;
        }
        return false;
    }

    public void addTask(String task){
        tasks.add(task);
        System.out.println("Добавлено задание: " + task);
    }

    public void markTaskAsDoneByStudent(String task, Student student){
        if (!isStudentNull(student)) {
            if (isStudentExist(student)) {
                int studID = student.getId();
                student = students.get(studID);
                student.setStudentTask(task, true);
            }
        }
    }

    private boolean isStudentExist(Student student) {
        return students.containsKey(student.getId()) & students.containsValue(student);
    }

    private boolean isStudentInGroup(int id) {
        return students.containsKey(id);
    }

    private boolean isStudentNull(Student student) {
        if (student == null) {
            System.out.println("Student is NULL!");
            return true;
        } else {
            return false;
        }
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

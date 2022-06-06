public class Main {
    private static String englishGroupName = "English Group";

    public static void main(String[] args){

        //Create students,headOfGroup and group
        Student headOfGroup = new Student(0, "TOM", "Hardman");
       // Student headOfGroup = null; //check null
        Student student1 = new Student(1, "Vanya", "Tomson");
        Student student2 = null;  //check null
        Student student3 = new Student(3, "Miron", "Lit");
        Student student4 = new Student(4, "Vasya", "Pytrov");
        Student student5 = new Student(5, "Kate", "Nike");

        Group group = new Group(englishGroupName,headOfGroup);
        System.out.println(student1.toString());
        System.out.println(group.toString());

        //Add student to the group
        group.addStudent(student4);
        group.addStudent(student5);
        System.out.println(group.toString());

        //Rename student
        student4 = new Student(20,"Alex","Tik");
        group.renameStudent(student4);
        System.out.println(student4.toString());
        System.out.println(group);

        //Remove student
        group.removeStudent(student4);
        System.out.println(group);

        //Change chiefOfGroup
        group.changeChief(student5);
        System.out.println(group);


        //add tasks:
        String firstTask = "Изучить 'PastSimple'";
        String secondTask = "Изучить глагол 'To be'";
        group.addTask(firstTask);
        group.addTask(secondTask);

        //add new student to the group
        group.addStudent(student3);

        //Done task by students:
        group.markTaskAsDoneByStudent(firstTask,student3);

        group.markTaskAsDoneByStudent(secondTask,student5);
        System.out.println(group);

        group.setHeadOfGroup(student2); //check null
        System.out.println(group);
    }
}//end class

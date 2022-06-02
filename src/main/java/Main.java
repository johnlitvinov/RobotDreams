public class Main {
    private static String englishGroupName = "English Group";

    public static void main(String[] args){

        //Create students,headOfGroup and group
        Student headOfGroup = new Student(1, "TOM", "Hardman");
        Student student1 = new Student(2, "Vanya", "Tomson");
        Student student2 = new Student(3, "Taras", "Petrenko");
        Student student3 = new Student(4, "Miron", "Lit");
        Student student4 = new Student(5, "Vasya", "Pytrov");
        Student student5 = new Student(6, "Kate", "Nike");

        Group group = new Group(englishGroupName,headOfGroup);
        System.out.println(student1.toString());
        System.out.println(group.toString());

        //Add student to the group
        group.addStudent(1,student4);
        group.addStudent(2,student5);
        System.out.println(group.toString());

        //Rename student
        student4 = new Student(20,"Alex","Tik");
        group.renameStudent(1, student4);
        System.out.println(student4.toString());
        System.out.println(group);

        //Remove student
        group.removeStudent(1);
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
        group.addStudent(3,student3);

        //Done task by students:
        group.markTaskAsDoneByStudent(firstTask,3);

        group.markTaskAsDoneByStudent(secondTask,2);
        System.out.println(group);
    }
}//end class

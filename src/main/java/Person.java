public abstract class Person {
    protected String firstName;
    protected String lastNAme;
    protected int age;
    protected boolean parther;

    Person(String firstName, String lastNAme, int age, boolean parther) {
        this.firstName = firstName;
        this.lastNAme = lastNAme;
        this.age = age;
        this.parther = parther;
    }

    // Getter int age;
    public int getAge(){
        return age;
    }

    // Setter int age;
    public void setAge(int age) {
        this.age = age;
    }

    public abstract boolean isRetired();
    public abstract String registerPartnership(Person personLastName);
    public abstract String deregisterPartnership(boolean isReturned);
    public abstract void info();
}//end class

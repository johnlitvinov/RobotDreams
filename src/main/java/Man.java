public class Man extends Person{

    private int manAgeToRetired = 65;

    Man(String firstName, String lastNAme, int age, boolean parther) {
        super(firstName, lastNAme, age, parther);
    }

    @Override
    public boolean isRetired(){
        if(manAgeToRetired <= getAge()){
            System.out.println("На пeнсии");
            return true;
        }else{
            int timeToRetered = manAgeToRetired - getAge();
            System.out.println("До пенсии еще: " + timeToRetered);
            return false;
        }
    }

    @Override
    public String registerPartnership(Person personLastName) {
        return null;
    }
    @Override
    public String deregisterPartnership(boolean isReturned) {
        return null;
    }

    @Override
    public void info(){
        int timeToRetered = manAgeToRetired - age;
        System.out.println("--------------Person-----------------------\n"+
                "FirstName: "+ firstName +"\n"+
                "LastName: "+ lastNAme + "\n"+
                "Age: " + age + "\n"+
                "TimeToRetired: " + timeToRetered+ "\n"+
                           "--------------------------------------------"
        );
    }
}//end class

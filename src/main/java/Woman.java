public class Woman extends Person {

    protected String maidenName;
    private int womanAgeToRetired = 60;

    Woman(String firstName, String lastNAme, int age, boolean parther, String maidenName) {
        super(firstName, lastNAme, age, parther);
        this.maidenName = maidenName;
    }

    public String getMaidemName() {
        return this.maidenName;
    }

    @Override
    public boolean isRetired() {
        if (womanAgeToRetired <= getAge()) {
            System.out.println("На пeнсии");
            return true;
        } else {
            int timeToRetered = womanAgeToRetired - getAge();
            System.out.println("До пенсии еще: " + timeToRetered);
            return false;
        }
    }

    @Override
    public void info() {
        int timeToRetered = womanAgeToRetired - getAge();
        System.out.println("--------------Person----------------\n" +
                "FirstName: " + firstName + "\n" +
                "LastName: " + lastNAme + "\n" +
                "Age: " + getAge() + "\n" +
                "MaidenName: " + maidenName + "\n" +
                "TimeToRetired: " + timeToRetered + "\n" +
                "-----------------------------------------------"
        );
    }

    @Override
    public String registerPartnership(Person personLastName) {
        return this.lastNAme = personLastName.lastNAme;
    }

    @Override
    public String deregisterPartnership(boolean isReturnLastName) {
        if (isReturnLastName == true) {
            return this.lastNAme = getMaidemName();
        } else {
            System.out.println("Фaмилия не изменилась тк returnLastName == false");
            return this.lastNAme;
        }
    }
}//end class

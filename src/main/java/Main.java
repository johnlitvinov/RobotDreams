public class Main {
    public static void main(String[] args) {

        Man newMan = new Man("Ivan", "Lit", 32, true);
        newMan.isRetired();
        newMan.info();

        Woman newWoman = new Woman("Ilona", "Ivanova", 59, true, "Ivanova");
        newWoman.isRetired();
        newWoman.info();

        newWoman.registerPartnership(newMan);
        newWoman.info();

        newWoman.deregisterPartnership(true);
        newWoman.info();

        newWoman.deregisterPartnership(false); // Фaмилия не изменилась тк returnLastName == false
        newWoman.info();
    }
} //end class

public class SecondClass {
    int number = 22;

    public String printer() {
        String pattern = "---<%s>---";
        System.out.println(String.format(pattern, number));
        return String.format(pattern, number);
    }
}
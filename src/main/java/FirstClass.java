public class FirstClass {
    public static void main(String[] args) {
        SecondClass secondClass = new SecondClass();
        System.out.println(printer(secondClass.printer()));
    }

    public static String printer(String string){
        String pattern = "~~~<%s>~~~";
        return String.format(pattern, string);
    }
}
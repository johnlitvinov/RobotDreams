import java.util.ArrayList;
import java.util.*;

public class Hometask_6 {

    public static void main(String[] args)
        {
            ArrayList<String> mainLArray = new ArrayList<>();
            mainLArray.add("мрия");
            mainLArray.add("пап");
            mainLArray.add("барабан");
            mainLArray.add("чемодан");
            mainLArray.add("Мадагаскар");

            ArrayList<Character> finalResult = new ArrayList<>();

            for (int i = 0; i < mainLArray.size(); i++)
            {
                char[] arrayResult = mainLArray.get(i).toCharArray();

                ArrayList<Character> additionalArray = new ArrayList<>();

                for (int x = 0; x < arrayResult.length; x++)
                {
                    additionalArray.add(arrayResult[x]);
                }

                Set<Character> set = new HashSet<>();
                set.addAll(additionalArray);

                for (Character character : set)
                {
                    finalResult.add(character);
                }
                System.out.println(finalResult);
            }
        }
    }//end class

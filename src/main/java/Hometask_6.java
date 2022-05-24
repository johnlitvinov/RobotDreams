import java.util.ArrayList;
import java.util.*;

public class Hometask_6 {

    public static void main(String[] args) {
        System.out.println(checkArray());
    }

    private static Set<Character> checkArray() {

        String[] arrayString = new String[]{"tur", "kip", "mama", "papa"};

        List<String> finalArray = new ArrayList<>();
        HashMap<Character, Integer> keyValue = new HashMap<>();


        int numberString = 0;

        for (String element : arrayString) {
            boolean isThereEvenNumLetter = true;

            if (element.length() % 2 == 0 && numberString < 2) {
                char[] charWord = element.toCharArray();
                char[] sortedCharWord = Arrays.copyOf(charWord, charWord.length);
                Arrays.sort(sortedCharWord);

                for (int i = 0; i < sortedCharWord.length; i = i + 2) {
                    if (sortedCharWord[i] != sortedCharWord[i + 1]) {
                        isThereEvenNumLetter = false;
                        break;
                    }
                }

                if (isThereEvenNumLetter) {
                    finalArray.add(element);
                    numberString++;
                }
            }
        }

        for (String element : finalArray) {
            char[] chars = element.toCharArray();
            for (char ch : chars) {
                keyValue.put(ch, (keyValue.getOrDefault(ch, 0)) + 1);
            }
        }
        return keyValue.keySet();
    } //end function
}//end class

import java.util.HashMap;
import java.util.Map;

public class Duplicatecharacterinstring {
    public static void main(String[] args) {
        String str = "programming";

        findDuplicateCharacters(str);
    }

    public static void findDuplicateCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        System.out.println("Duplicate characters in the string \"" + str + "\" are:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}
import java.util.*;
public class  PrintsaveeVowels {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        String vowels = "";

        for (char c : word.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels += c + " ";
            } 
        }

        System.out.println("Vowels: " + vowels);
    }
}
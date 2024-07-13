import java.util.*;
public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.next();
        String vowels = "";
        String consonants = "";

        for (char c : word.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels += c + " ";
            } else {
                consonants += c + " ";
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class ReverseAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = scanner.nextLine();
        char[] letters = word.toCharArray();
        Arrays.sort(letters);
        System.out.println(letters);
    }
}

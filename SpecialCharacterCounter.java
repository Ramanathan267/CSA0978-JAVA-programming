import java.util.Scanner;

public class SpecialCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a statement:");
        String statement = scanner.nextLine();
        scanner.close();

        int count = 0;
        for (int i = 0; i < statement.length(); i++) {
            char ch = statement.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                count++;
            }
        }

        System.out.println("Number of special characters: " + count);
    }
}

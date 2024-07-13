import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countUpper = 0, countLower = 0, countNumbers = 0;
        
        System.out.println("Enter * to exit…");
        while (true) {
            System.out.print("Enter any character: ");
            char ch = scanner.next().charAt(0);
            if (ch == '*') break;
            if (Character.isUpperCase(ch)) countUpper++;
            else if (Character.isLowerCase(ch)) countLower++;
            else if (Character.isDigit(ch)) countNumbers++;
        }
        
        System.out.println("Total count of lower case: " + countLower);
        System.out.println("Total count of upper case: " + countUpper);
        System.out.println("Total count of numbers: " + countNumbers);
        
        scanner.close();
    }
}

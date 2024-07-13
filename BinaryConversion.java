import java.util.Scanner;

public class BinaryConversion {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a binary number:");
    String binary = scanner.next();

    int decimal = Integer.parseInt(binary, 2);
    String octal = Integer.toOctalString(decimal);

    System.out.println("Decimal Number: " + decimal);
    System.out.println("Octal: " + octal);
  }
}

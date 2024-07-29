import java.util.Scanner;

public class BinaryConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the binary number: ");
        String binaryStr = scanner.nextLine();

        int decimal = Integer.parseInt(binaryStr,2);

        String octal = Integer.toOctalString(decimal);

        System.out.println("Decimal Number: " + decimal);
        System.out.println("Octal Number: " + octal);

        scanner.close();
    }
}

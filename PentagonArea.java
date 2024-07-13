import java.util.Scanner;

public class PentagonArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the pentagon: ");
        double sideLength = scanner.nextDouble();

        double area = (5 * sideLength * sideLength) / (4 * Math.tan(Math.PI / 5));

        System.out.println("The area of the pentagon is: " + area);

        scanner.close();
    }
}

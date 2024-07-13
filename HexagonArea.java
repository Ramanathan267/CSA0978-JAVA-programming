import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the hexagon: ");
        double sideLength = scanner.nextDouble();
        double area = (3 * Math.sqrt(3) * Math.pow(sideLength, 2)) / 2;
        System.out.println("The area of the hexagon is: " + area);
        scanner.close();
    }
}

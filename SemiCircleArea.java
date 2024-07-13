import java.util.Scanner;

public class SemiCircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the semicircle: ");
        double radius = scanner.nextDouble();

        double area = (Math.PI * radius * radius) / 2;

        System.out.println("The area of the semicircle is: " + area);
    }
}

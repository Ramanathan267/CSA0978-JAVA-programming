import java.util.Scanner;

public class CubeArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of one side of the cube: ");
        double sideLength = scanner.nextDouble();
        double surfaceArea = 6 * sideLength * sideLength;
        System.out.println("The surface area of the cube is: " + surfaceArea);
        scanner.close();
    }
}

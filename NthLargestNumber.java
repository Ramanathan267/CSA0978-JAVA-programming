import java.util.Arrays;
import java.util.Scanner;

public class NthLargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        Arrays.sort(array);

        int nthLargest = array[size - N];
        
        System.out.println("The " + N + "th largest number is: " + nthLargest);

        scanner.close();
    }
}

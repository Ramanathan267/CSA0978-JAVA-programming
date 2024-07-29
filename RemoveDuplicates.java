import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element" + (i + 1) + ": ");
            set.add(scanner.nextInt());
        }
        scanner.close();
        
        System.out.println("Non-duplicate items: " + set);
    }
}

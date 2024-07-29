import java.util.Scanner;
public class PerfectSquaresInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter lower range: ");
        int lowerRange = scanner.nextInt();
        System.out.print("Enter upper range: ");
        int upperRange = scanner.nextInt();

        System.out.print("[");
        
        for (int i = lowerRange; i <= upperRange; i++) {
            int sqrt = (int) Math.sqrt(i);
            if (sqrt * sqrt == i) { // Check if it's a perfect square
                int sum = 0, num = i;
                while (num > 0) { // Calculate sum of digits
                    sum += num % 10;
                    num /= 10;
                }
                if (sum < 10) { 
                        System.out.print(i+" ");
                }
            }
        }
        System.out.println("]");

        scanner.close();
    }
}

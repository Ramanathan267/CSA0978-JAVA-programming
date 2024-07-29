import java.util.Scanner;
public class PrimeCompositeCounter {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeCount = 0, compositeCount = 0;

        System.out.println("Enter numbers (negative number to stop):");
        while (true) {
            int number = scanner.nextInt();
            if (number < 0) break;
            if (isPrime(number)) {
                primeCount++;
            } else if (number > 1) {
                compositeCount++;
            }
        }

        System.out.println("Primes: " + primeCount);
        System.out.println("Composites: " + compositeCount);
    }
}
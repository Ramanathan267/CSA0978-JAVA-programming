import java.util.Scanner;
public class SimplePrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        int nthPrime = 0;
        int count = 0;
        int number = 1;
        while (count < N) {
            number++;
            if (isPrime(number)) {
                count++;
            }
        }
        nthPrime = number;
        System.out.println(N + "rd Prime number is " + nthPrime); 
        System.out.print(N + " prime numbers after " + nthPrime + " are: ");
        count = 0;
        number = nthPrime;
        while (count < N) {
            number++;
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }}
                scanner.close();
    }    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        } return true;
    }
}

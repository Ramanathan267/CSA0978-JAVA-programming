import java.util.Scanner;
public class Mains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            PrimeCheckRunnable primeCheckRunnable = new PrimeCheckRunnable(number);
            Thread thread = new Thread(primeCheckRunnable);
            thread.start();
        }
    }
class PrimeCheckRunnable implements Runnable {
    private int number;

    public PrimeCheckRunnable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (number <= 1) {
            System.out.println(number + " is not prime.");
            return;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(number + " is not prime.");
                return;
            } }
        System.out.println(number + " is prime.");
    }
}

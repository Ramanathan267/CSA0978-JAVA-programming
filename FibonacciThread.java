import java.util.Scanner;

public class FibonacciThread implements Runnable {
    private int n;

    public FibonacciThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int a = 0, b = 1;
        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n= scanner.nextInt();
        
        FibonacciThread FibonacciThread = new FibonacciThread(n);

        Thread thread = new Thread(FibonacciThread);
        thread.start();
    }
}

import java.util.Scanner;

public class Main extends Thread {
    private int number;

    public void MultiplicationTable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Thread for number " + number + " is running.");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
        System.out.println("Thread for number " + number + " has completed.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Close the scanner
        scanner.close();

        // Create threads for both numbers
        MultiplicationTable thread1 = new MultiplicationTable(num1);
        MultiplicationTable thread2 = new MultiplicationTable(num2);

        // Start the threads
        thread1.start();
        thread2.start();
    }
}

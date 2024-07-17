public class PrimeChecker implements Runnable {
    private int numberToCheck;

    public PrimeChecker(int numberToCheck) {
        this.numberToCheck = numberToCheck;
    }

    @Override
    public void run() {
        boolean isPrime = true;
        if (numberToCheck <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numberToCheck); i++) {
                if (numberToCheck % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime) {
            System.out.println(numberToCheck + " is a prime number.");
        } else {
            System.out.println(numberToCheck + " is not a prime number.");
        }
    }

    public static void main(String[] args) {
        int[] numbersToCheck = {17, 20, 23, 30, 37};

        for (int number : numbersToCheck) {
            PrimeChecker primeChecker = new PrimeChecker(number);
            Thread thread = new Thread(primeChecker);
            thread.start();
            try {
                thread.join(); // Wait for the thread to finish before proceeding
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

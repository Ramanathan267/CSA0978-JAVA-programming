import java.util.Scanner;

public class Factorsofnnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given Number: ");
        int givenNumber = scanner.nextInt();
        
        System.out.print("N = ");
        int n = scanner.nextInt();
        int factorCount = 0;
        int nthFactor =0;
        
        for (int i = 1; i <= givenNumber; i++) {
            if (givenNumber % i == 0) {
                factorCount++;
                if (factorCount == n) {
                    nthFactor = i;
                }
            }
        }
        System.out.println("Number of factors = " + factorCount);
        
        if (nthFactor != -1) {
            System.out.println(n + "th factor of " + givenNumber + " = " + nthFactor);
        } else {
            System.out.println("The " + n + "th factor does not exist.");
        } 
        scanner.close();
    }
}
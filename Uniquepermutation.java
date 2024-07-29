import java.util.Scanner;

public class Uniquepermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String numStr = scanner.next();
        int[] num = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            num[i] = Integer.parseInt(String.valueOf(numStr.charAt(i)));
        }
        System.out.println("Permutations are: ");
        int n = num.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
                for (int k = 0; k < n; k++) {
                    System.out.print(num[k]);
                }
                System.out.println();
                temp = num[i];
                num[i] = num[j];
                num[j] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                int temp = num[j];
                num[j] = num[j + 1];
                num[j + 1] = temp;
                for (int k = 0; k < n; k++) {
                    System.out.print(num[k]);
                }
                System.out.println();
                temp = num[j];
                num[j] = num[j + 1];
                num[j + 1] = temp;
            }
        }
    }
}


public class Armstrong {

    public static void main(String[] args) {

        int number = 371, originalNumber, r, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            r = originalNumber % 10;
            result += r*r*r;
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
import java.util.Scanner;

public class DisplayPrime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2,i,j;
        System.out.println("Please enter the first number :");
        num1=sc.nextInt();
        System.out.println("Please enter the second number :");
        num2=sc.nextInt();
        System.out.println("Prime number");
            
        for( i=num1;i<=num2;i++)
        {
            for( j=2;j<i;j++)
            {
                int n=i%j;
                if(n==0)
                break;
            }
            if(i==j)
            {
                System.out.println("  "+i);
            }
        }

    }
}
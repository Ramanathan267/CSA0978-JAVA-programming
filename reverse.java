import java.util.*;
public class reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    String input=sc.nextLine();
    String reverse=new StringBuilder(input).reverse().toString();
    System.out.println("reversed number"+reverse);
    sc.close();
    }
}
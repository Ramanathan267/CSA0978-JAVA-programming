import java.util.*;
class Oddoreven{
    public static void main (String[]args){
        int num;
        Scanner s=new Scanner(System.in);
        System.out.print("enter an number");
        num= s.nextInt();
        if(num%2==0){
            System.out.print("even number");
        }else{
                System.out.print("odd number");
            }
        }
    }

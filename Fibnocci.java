import java.util.*;
class Fibnocci{
    public static void main(String[]args)
{
    Scanner S=new Scanner(System.in);
    int n=S.nextInt();
    int a1=0,a2=1;
    for(int i=1;i<=n;i++){
        System.out.println(a1);
    int temp=a1+a2;
    a1=a2;
    a2=temp;
   

}}}
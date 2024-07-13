import java.util.*;
class Bonus{
    public static void main (String args[]){
        Scanner S=new Scanner(System.in);
        System.out.print("enter the grade:");
        char grade=S.next().charAt(0);
        System.out.print("enter the salary");
        double salary=S.nextDouble();
        double bonus=0;
        if (grade=='A'||grade=='a'){
            bonus=salary*0.05;
        }
        else if(grade=='B'||grade=='b') {
            bonus=salary*0.10;
        }
        else{
            System.out.print("enter invalid grade");
            System.exit(0);
        }
        if(salary<10000){
            bonus+=salary*0.02;
        }
        double totalSalary=bonus+salary;
        System.out.print(salary+"");
        System.out.print(bonus+"");
        System.out.print(totalSalary+"");
    }
}
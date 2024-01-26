import java.util.*;
public class L3_1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Marks:");
        int A= sc.nextInt();
        int B= sc.nextInt();
        int C= sc.nextInt();
        int D= sc.nextInt();
        int E= sc.nextInt();
        int sum=A+B+C+D+E;
        int avg=(sum)/5;
        if(avg>=60)
        {
            System.out.println("First Division.");
        }
        else if(avg>=50 || avg<60)
        {
            System.out.println("Second Division.");
        }
        else if(avg>=40 || avg<50)
        {
            System.out.println("Third Division.");
        }
        else
        {
            System.out.println("Fail.");
        }
    }
}
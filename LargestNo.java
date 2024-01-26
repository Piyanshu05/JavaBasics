import java.util.*;
public class LargestNo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Numbers.");
        int A= sc.nextInt();
        int B= sc.nextInt();
        int C= sc.nextInt();
        if (A >= B && A >= C)
         System.out.println( A + " is the maximum number.");
      else if (B >= A && B >= C)
         System.out.println( B + " is the maximum number.");
      else
         System.out.println( C + " is the maximum number.");
   }
}

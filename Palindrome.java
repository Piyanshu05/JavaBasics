import java.util.*;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int rem;
        int n;
        int temp=a;
        int sum=0;
        while(a!=0){    
            rem=a%10;   
            sum=(sum*10)+rem;    
            a=a/10;    
           }    
           if(temp==sum)    
            System.out.println("palindrome number ");    
           else    
            System.out.println("not palindrome");    
         }  
           
    }

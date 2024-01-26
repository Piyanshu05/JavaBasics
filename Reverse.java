import java.util.*;
public class Reverse
{
    public static void main(String[] args) 
    {
        int n,temp,i,j=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements ");
        for(i=0; i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for( i=0;i<n;i++,n--)
        {
	        temp=arr[i];
        	arr[i]=arr[n-1];
        	arr[n-1]=temp;    
        }
            System.out.println("Reverse =");
            for( i=0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
      
    }
}
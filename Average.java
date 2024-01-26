import java.util.Scanner;
 
public class Average {
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int[] array = new int[4];
        System.out.println("Enter array value:  ");
        for (int i = 0; i < 4; i++) {
            int value = sc.nextInt();
            array[i] = value;
        }
        
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += array[i];
        }
        double average = sum /(double)4;
        System.out.println(sum);
        System.out.println("Average: " + average);
    }
 
}
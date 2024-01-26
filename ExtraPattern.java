import java.util.Scanner;

public class ExtraPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of r: ");
        int r = sc.nextInt();
        int n= 1;
        for (int i = 1; i <= r; i++) {
            if (i % 2 == 0) 
            {
                for (int j = 1; j <= i; j++) {
                    System.out.print(n + " ");
                    n++;
                }
            } 
            else
            {
                int ln = n + i - 1;
                for (int j = i; j >= 1; j--) {
                    System.out.print(ln + " ");
                    ln--;
                }
                n+= i;
            }
            System.out.println();
        }
    }
}

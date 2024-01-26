import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int length = str.length();
        int half = length / 2;

        System.out.printf("Length: %d\n", length);
        System.out.printf("half of the string: %s\n", str.substring(half));

        
    }
}
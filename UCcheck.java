import java.util.*;
public class UCcheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (Character.isUpperCase(str.charAt(0))) {
            System.out.println("The string starts with uppercase letter.");
        } 
        else {
            System.out.println("Error");
        }
       
    }
}

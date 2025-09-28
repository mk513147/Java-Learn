
// Q: Reverse a string 
import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a String: ");
            String str = in.nextLine();
            System.out.println("Reversed String: " + reverse(str));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static String reverse(String str) {
        String rstr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rstr += str.charAt(i);
        }
        return rstr;
    }
}
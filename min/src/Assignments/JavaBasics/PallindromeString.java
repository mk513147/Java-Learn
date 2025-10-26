
// Q: To find out whether the given String is Palindrome or not.
import java.util.*;

public class PallindromeString {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = in.nextLine();
            if (isPal(str)) {
                System.out.println("It is a pallindrome string.");
            } else {
                System.out.println("It is NOT a pallindrome string.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static boolean isPal(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
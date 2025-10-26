
// Q: Check for even odd
import java.util.*;

public class EvenOdd {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = in.nextInt();
            if (check(num)) {
                System.out.println("EVEN");
            } else {
                System.out.println("ODD");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static boolean check(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}

// Q: To find Armstrong Number between two given number.
import java.util.*;

public class Armstrong {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter two numbers: ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            boolean found = false;
            for (int i = num1; i <= num2; i++) {
                if (Arms(i)) {
                    System.out.print(i + " ");
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No Armstrong number found.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static boolean Arms(int num) {
        int original = num;
        int sum = 0;
        int len = numLen(num);
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, len);
            num = num / 10;
        }
        if (sum == original) {
            return true;
        }
        return false;

    }

    static int numLen(int num) {
        int length = 0;
        while (num > 0) {
            length++;
            num = num / 10;
        }
        return length;
    }
}
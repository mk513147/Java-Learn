
// Q; Pallindorme number?
import java.util.*;

public class Pallindrome {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = in.nextInt();
            int originalNum = num;
            int numReverse = 0;
            while (num > 0) {
                int digit = num % 10;
                numReverse = numReverse * 10 + digit;
                num = num / 10;
            }
            if (originalNum == numReverse) {
                System.out.println("It is a pallindrome number.");
            } else {
                System.out.println("It is a NOT pallindrome number.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
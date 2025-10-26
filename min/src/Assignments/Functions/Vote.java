// Q: A person is eligible to vote if his/her age is greater than or equal to
// 18. Define a method to find out if he/she is eligible to vote.

import java.util.*;

public class Vote {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter age: ");
            int age = in.nextInt();

            if (age <= 0 || age >= 120) {
                System.out.println("Please enter a valid age.");
                return;
            }

            if (check(age)) {
                System.out.println("Eligible to vote.");
            } else {
                System.out.println("Not eligible to vote.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static boolean check(int num) {
        if (num >= 18) {
            return true;
        }
        return false;
    }
}
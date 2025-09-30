// Q: Kunal is allowed to go out with his friends only on the even days of a
// given month. Write a program to count the number of days he can go out in the
// month of August.

import java.util.*;

public class EvenDaysInAMonth {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int count = 0;
            for (int i = 0; i < 30; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            System.out.print("No of days kunal can go out in august is: " + count);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
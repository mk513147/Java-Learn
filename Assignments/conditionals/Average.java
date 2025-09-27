
// Q: Calculate Average Of N Numbers
import java.util.*;

public class Average {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter numbers to calculate the average (press 0 to stop): ");

            double avg = average(in);

            if (Double.isNaN(avg)) {
                System.out.println("No numbers were entered!");
            } else {
                System.out.println("Average: " + avg);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static double average(Scanner in) {
        int num, sum = 0, length = 0;

        while ((num = in.nextInt()) != 0) {
            sum += num;
            length++;
        }

        if (length == 0) {
            return Double.NaN;
        }

        return (double) sum / length;
    }
}

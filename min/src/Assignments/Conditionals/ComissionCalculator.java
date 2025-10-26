
// Q: Calculate Comission
import java.util.*;

public class ComissionCalculator {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {

            System.out.print("Enter the total sale amount: ");
            if (!in.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                return;
            }
            int saleAmount = in.nextInt();
            if (saleAmount <= 0) {
                System.out.println("Sale amount must be greater than 0.");
                return;
            }

            System.out.print("Enter the total commission amount: ");
            if (!in.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                return;
            }
            int commission = in.nextInt();
            if (commission < 0 || commission > saleAmount) {
                System.out.println("Commission must be between 0 and sale amount.");
                return;
            }

            double commissionPercent = ((double) commission / saleAmount) * 100;
            System.out.println("Commission Percent: " + commissionPercent + "%");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

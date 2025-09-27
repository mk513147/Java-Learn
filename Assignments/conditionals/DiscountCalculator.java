// Q: Discount Calculator

import java.util.*;

public class DiscountCalculator {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the original price: ");
            double originalPrice = in.nextDouble();
            if (originalPrice <= 0) {
                System.out.println("Price must be greater than 0.");
                return;
            }
            System.out.print("Enter the discount percent: ");
            double discountpercent = in.nextDouble();
            if (discountpercent < 0 || discountpercent > 100) {
                System.out.println("Discount must be between 0 and 100.");
                return;
            }

            double discountPrice = (originalPrice * discountpercent) / 100;
            double finalPrice = originalPrice - discountPrice;
            System.out.printf("Discount Amount: %.2f%n", discountPrice);
            System.out.printf("Final Price After Discount: %.2f%n", finalPrice);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
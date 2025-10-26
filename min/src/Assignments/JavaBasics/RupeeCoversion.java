
// Q: Input currency in rupees and output in USD.
import java.text.DecimalFormat;
import java.util.*;

public class RupeeCoversion {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.print("Enter rupees: ");
            double rupee = in.nextDouble();
            System.out.println("Dollar: " + df.format(rupee * 0.0113));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
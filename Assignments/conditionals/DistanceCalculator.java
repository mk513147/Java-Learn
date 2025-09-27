
// Q: Calculate the distance between 2 points
import java.util.*;

public class DistanceCalculator {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n=== Distance Calculator ===");
                System.out.println("1. Calculate distance in 2D plane");
                System.out.println("2. Calculate distance in 3D plane");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");

                if (!in.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a number (0, 1, or 2).");
                    in.nextLine();
                    continue;
                }

                int choice = in.nextInt();

                switch (choice) {
                    case 1:
                        System.out.printf("Distance: %.2f%n", singlePlane(in));
                        break;
                    case 2:
                        System.out.printf("Distance: %.2f%n", multiPlane(in));
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                        break;
                }
            }
        }
    }

    static double singlePlane(Scanner in) {
        System.out.print("Enter the first point (x1 y1): ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();

        System.out.print("Enter the second point (x2 y2): ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    static double multiPlane(Scanner in) {
        System.out.print("Enter the first point (x1 y1 z1): ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double z1 = in.nextDouble();

        System.out.print("Enter the second point (x2 y2 z2): ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double z2 = in.nextDouble();

        return Math.sqrt(
                Math.pow((x2 - x1), 2) +
                        Math.pow((y2 - y1), 2) +
                        Math.pow((z2 - z1), 2));
    }
}

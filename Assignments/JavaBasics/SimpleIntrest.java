
// Q: Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter Princinple, Interest and Time: ");
            double P = in.nextDouble();
            double R = in.nextDouble();
            int T = in.nextInt();
            double SI = (P * R * T) / 100;
            System.out.println("Simple Interest: " + SI);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
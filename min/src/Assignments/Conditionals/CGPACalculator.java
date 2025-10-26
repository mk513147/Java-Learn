
// Q: Calculate CGPA Java Program
import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int num1 = in.nextInt();

        if (num1 > 15) {
            System.out.println("Maximum 15 subjects are allowed");
            in.close();
            return;
        }
        double sum = 0;

        for (int i = 1; i <= num1; i++) {
            System.out.print("Enter grade point of subject " + i + " : ");
            double marks = in.nextDouble();
            sum += marks;
        }

        double cgpa = sum / num1;

        System.out.printf("CGPA: %.2f%n ", cgpa);

        in.close();
    }
}
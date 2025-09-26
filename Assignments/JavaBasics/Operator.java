
// Q: Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter two numbers and the operations you want to perform: ");
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            char c = in.next().charAt(0);
            int res = result(n1, n2, c);
            if (res == Integer.MIN_VALUE) {
                System.out.println("Wrong character input.");
            } else {
                System.out.println("Result: " + res);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    static int result(int num1, int num2, char c) {
        if (c == '+') {
            return num1 + num2;
        }
        if (c == '-') {
            return num1 - num2;
        }
        if (c == '*') {
            return num1 * num2;
        }
        if (c == '/') {
            if (num2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
                return Integer.MIN_VALUE;
            }
            return num1 / num2;
        }
        return Integer.MIN_VALUE;

    }
}

// Q; Sum  and product

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        System.out.println("Sum: " + sum(num1, num2));
        System.out.println("Product: " + product(num1, num2));

        in.close();
    }

    static int sum(int n1, int n2) {
        return n1 + n2;
    }

    static int product(int n1, int n2) {
        return n1 * n2;
    }
}
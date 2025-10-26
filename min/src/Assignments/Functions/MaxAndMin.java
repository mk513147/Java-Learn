
// Q: Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        System.out.print("Enter second number: ");
        int num3 = in.nextInt();

        System.out.println("Maximum Number: " + maxi(num1, num2, num3));
        System.out.println("Minimum Number: " + mini(num1, num2, num3));
        in.close();
    }

    static int maxi(int n1, int n2, int n3) {
        int maximum = Integer.MIN_VALUE;
        if (n1 > n2 && n1 > n3) {
            maximum = n1;
        } else if (n2 > n1 && n2 > n3) {
            maximum = n2;
        } else {
            maximum = n3;
        }
        return maximum;
    }

    static int mini(int n1, int n2, int n3) {
        int minimum = Integer.MIN_VALUE;
        if (n1 < n2 && n1 < n3) {
            minimum = n1;
        } else if (n2 < n1 && n2 < n3) {
            minimum = n2;
        } else {
            minimum = n3;
        }
        return minimum;
    }
}
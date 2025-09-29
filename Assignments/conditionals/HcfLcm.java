// Q: Find HCF(GCD) and LCM

import java.util.Scanner;

public class HcfLcm {

    static int HCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = b % a;
            a = temp;
        }
        return a;
    }

    static int LCM(int a, int b) {
        return (a * b) / HCF(a, b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        System.out.println("HCF: " + HCF(num1, num2));
        System.out.println("LCM: " + LCM(num1, num2));

        in.close();
    }
}
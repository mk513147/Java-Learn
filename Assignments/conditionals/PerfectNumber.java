// Q: CHeck wether a number is ferfect number or not

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += num;
            }
        }
        if (sum == num) {
            System.out.println("It is a perfect number.");
        } else {
            System.out.println("It is a not perfect number.");
        }

        in.close();
    }
}
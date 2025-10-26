
// Q: Calculate Electricity Bill
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter previous meter reading: ");
        int num1 = in.nextInt();

        System.out.print("Enter current meter reading: ");
        int num2 = in.nextInt();

        int rate = 7, fixedCharge = 100, tax = 5;

        int bill = ((num2 - num1) * rate) + fixedCharge + (tax / 100);

        System.out.println("Your Electricity bill is: " + bill);

        in.close();
    }
}
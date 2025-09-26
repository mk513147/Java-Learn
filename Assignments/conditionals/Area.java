import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        System.out.println("You entered: " + num1 + " and " + num2);

        in.close();
    }
}
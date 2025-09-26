
// Q: Take name as input and print a greeting message for that particular name.
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a name: ");
            String greet = in.nextLine();
            System.out.println("Hello " + greet);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
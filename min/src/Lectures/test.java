import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a word: ");
            char n = in.next().trim().charAt(0);
            in.nextLine();
            char upper = Character.toUpperCase(n);
            System.out.print("Enter a string: ");
            String str = in.nextLine().toUpperCase();          
            System.out.println();
            System.out.println("Character: " + upper );
            System.out.println("String: " + str );
            System.out.println("String: " +str.getClass().getName() );
        } catch (Exception e) {
            // e.getStackTrace();
            System.out.println("Error: " + e.getClass().getName());
            System.out.println("Message: " + e.getMessage());
        }
    }
}
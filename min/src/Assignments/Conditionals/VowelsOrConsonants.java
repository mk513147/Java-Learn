
// Q: Check wether a given letter is vowel or consonant;
import java.util.*;

public class VowelsOrConsonants {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a letter: ");
            String input = in.next();

            if (input.length() != 1) {
                System.out.println("Please enter exactly one character.");
                return;
            }

            char letter = input.charAt(0);

            if (!Character.isLetter(letter)) {
                System.out.println("Please enter a valid alphabet character.");
                return;
            }

            letter = Character.toLowerCase(letter);

            char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
            boolean consonant = true;

            for (int i = 0; i < 5; i++) {
                if (letter == vowels[i]) {
                    consonant = false;
                    break;
                }
            }
            if (consonant) {
                System.out.println("It is a consonant.");
            } else {
                System.out.println("It is a vowel.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
// Q: A pangram is a sentence where every letter of the English alphabet appears at least once.
// Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

public class Pangram {

    public static void main(String[] args) {
        String str = "leeetcode";
        if (checkIfPangram(str)) {
            System.out.println("It is a Panagram.");
        } else {
            System.out.println("It is NOT a Panagram.");
        }
    }

    // Better way
    static boolean checkIfPangramBetter(String sentence) {
        if (sentence.length() < 26)
            return false;
        for (char c = 'a'; c <= 'z'; c++) {
            if (sentence.indexOf(c) == -1)
                return false;
        }
        return true;
    }

    // Good way
    static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            freq[ch - 'a']++;
        }

        for (int n : freq) {
            if (n == 0) {
                return false;
            }
        }

        return true;
    }

}
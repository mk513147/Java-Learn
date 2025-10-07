//Q: You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

// The ith item is said to match the rule if one of the following is true:

// ruleKey == "type" and ruleValue == typei.
// ruleKey == "color" and ruleValue == colori.
// ruleKey == "name" and ruleValue == namei.
// Return the number of items that match the given rule.

import java.util.Arrays;
import java.util.List;

public class CountItemMatchWithRule {

    public static void main(String[] args) {
        List<List<String>> items = new java.util.ArrayList<>();
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("phone", "gold", "iphone"));

        String ruleKey = "color";
        String ruleValue = "silver";

        System.out.println("Matched Items: " + countMatches(items, ruleKey, ruleValue));

    }

    static public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = 0;
        if (ruleKey.equals("color"))
            index = 1;
        else if (ruleKey.equals("name"))
            index = 2;

        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}
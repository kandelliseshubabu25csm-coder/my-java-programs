package helloworldpackage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

// Main class
public class LetterCombinations {

    // HashMap to store digit and letters
    static HashMap<Character, String> phoneMap =
            new HashMap<>();

    // Method to generate combinations
    public static List<String> generateCombinations(
            String digits) {

        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return result;
        }

        // Validate input digits
        for (char digit : digits.toCharArray()) {

            if (digit < '2' || digit > '9') {
                throw new IllegalArgumentException(
                    "Enter digits only between 2 and 9."
                );
            }
        }

        // Generate combinations
        backtrack(digits, 0, new StringBuilder(), result);

        return result;
    }

    // Recursive method
    public static void backtrack(
            String digits,
            int index,
            StringBuilder current,
            List<String> result) {

        // Base condition
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        // Get letters for current digit
        String letters = phoneMap.get(
                digits.charAt(index));

        for (char ch : letters.toCharArray()) {

            current.append(ch);

            backtrack(
                digits,
                index + 1,
                current,
                result
            );

            current.deleteCharAt(
                current.length() - 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initialize phone keypad mapping
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");

        System.out.println(
            "===== LETTER COMBINATIONS OF PHONE NUMBER ====="
        );

        System.out.print("Enter Phone Number Digits: ");

        String digits = sc.nextLine();

        try {

            List<String> combinations =
                    generateCombinations(digits);

            System.out.println("Letter Combinations:");

            System.out.println(combinations);

            System.out.println(
                "Total Combinations: " + combinations.size()
            );

        }
        catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }
        finally {

            System.out.println(
                "Letter Combination Process Completed."
            );

            sc.close();
        }
    }
}


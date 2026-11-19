package helloworldpackage;
import java.util.Stack;
import java.util.Scanner;

// Main class
public class ValidParentheses {

    // Method to check valid parentheses
    public static boolean isValid(String str) {

        Stack<Character> stack = new Stack<>();

        // Traverse each character
        for (char ch : str.toCharArray()) {

            // Check opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {

                stack.push(ch);

            }

            // Check closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check matching brackets
                if (ch == ')' && top != '(' ||
                    ch == '}' && top != '{' ||
                    ch == ']' && top != '[') {

                    return false;
                }

            }

            // Reject other characters
            else {
                return false;
            }
        }

        // Stack must be empty
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
            "===== VALID PARENTHESES CHECKER ====="
        );

        System.out.print("Enter Parentheses: ");

        String str = sc.nextLine();

        if (isValid(str)) {

            System.out.println("Valid Parentheses.");

        } else {

            System.out.println("Invalid Parentheses.");

        }

        System.out.println(
            "Parentheses Checking Completed."
        );

        sc.close();
    }
}


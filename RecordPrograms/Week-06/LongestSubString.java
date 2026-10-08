
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstring {

    public static String longestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            // Remove repeated characters from the left
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add the current character
            set.add(s.charAt(right));

            // Update the longest substring
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
        }

        String result = s.substring(start, start + maxLength);

        System.out.println("Longest Substring: " + result);
        System.out.println("Length: " + maxLength);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        longestSubstring(s);

        sc.close();
    }
}
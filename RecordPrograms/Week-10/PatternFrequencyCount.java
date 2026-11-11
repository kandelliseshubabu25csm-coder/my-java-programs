package helloworldpackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PatternFrequencyCount {

    // Method to count pattern frequency
    public static int countPattern(String text, String pattern) {

        int count = 0;
        int index = 0;

        if (pattern.isEmpty()) {
            return 0;
        }

        while ((index = text.indexOf(pattern, index)) != -1) {

            count++;

            // Move one position forward
            index++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== PATTERN FREQUENCY COUNT =====");

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        System.out.print("Enter pattern to search: ");
        String pattern = sc.nextLine();

        StringBuilder text = new StringBuilder();

        try {

            File file = new File(fileName);

            Scanner fileReader = new Scanner(file);

            // Reading file contents
            while (fileReader.hasNextLine()) {

                text.append(fileReader.nextLine());
                text.append("\n");
            }

            fileReader.close();

            // Counting pattern occurrences
            int frequency = countPattern(
                    text.toString(), pattern);

            System.out.println("\nPattern: " + pattern);

            System.out.println(
                    "Frequency Count: " + frequency);

        } catch (FileNotFoundException e) {

            System.out.println("Error: File not found!");

        }

        sc.close();
    }
}



package helloworldpackage;

import java.util.Scanner;

class RomanConverter {

    // Method to get Roman symbol value
    private int getValue(char ch) {

        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    // Method to convert Roman to Integer
    public int romanToInteger(String roman) {

        int result = 0;

        roman = roman.toUpperCase();

        for (int i = 0; i < roman.length(); i++) {

            int current = getValue(roman.charAt(i));

            if (i + 1 < roman.length()) {

                int next = getValue(roman.charAt(i + 1));

                if (current < next) {
                    result -= current;
                } else {
                    result += current;
                }

            } else {
                result += current;
            }
        }

        return result;
    }
}

// Main class
public class RomanToInteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RomanConverter converter = new RomanConverter();

        System.out.println("===== ROMAN TO INTEGER CONVERSION =====");

        System.out.print("Enter a Roman Numeral: ");
        String roman = sc.nextLine();

        int result = converter.romanToInteger(roman);

        System.out.println("Roman Numeral: " + roman.toUpperCase());
        System.out.println("Integer Value: " + result);

        sc.close();
    }
}




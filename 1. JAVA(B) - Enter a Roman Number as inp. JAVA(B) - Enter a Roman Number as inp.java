import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToIntegerConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();

        int integerEquivalent = romanToInteger(romanNumeral);
        System.out.println("Integer equivalent: " + integerEquivalent);
    }

    public static int romanToInteger(String s) {
        // Create a map to store the values of Roman numerals
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(s.charAt(i));

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }
}

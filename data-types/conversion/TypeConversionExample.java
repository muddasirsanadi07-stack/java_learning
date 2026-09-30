/**
 * Lesson: convert between text, primitive values, characters, and arrays.
 * Key points: parsing can fail for invalid input; arrays need Arrays.toString
 * to display their contents; String.join combines string arrays.
 */
import java.util.Arrays;

public class TypeConversionExample {
    public static void main(String[] args) {
        int number = Integer.parseInt("123");
        String numberText = String.valueOf(456);

        String name = "Java";
        char firstLetter = name.charAt(0);
        char[] letters = name.toCharArray();
        String rebuiltName = new String(letters);

        char digit = '4';
        int digitValue = digit - '0';
        char characterCode = (char) 67;

        int[] numbers = Arrays.stream("10,20,30".split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        String[] words = {"learn", "Java"};

        System.out.println(number);
        System.out.println(numberText);
        System.out.println(firstLetter);
        System.out.println(rebuiltName);
        System.out.println(digitValue);
        System.out.println(characterCode);
        System.out.println(Arrays.toString(numbers));
        System.out.println(String.join(" ", words));
    }
}

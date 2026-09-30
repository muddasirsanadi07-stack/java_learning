/**
 * Lesson: String is immutable; its methods return new values. Use equals for
 * content comparison, substring's end index is exclusive, and charAt needs a
 * valid index.
 */
import java.util.Arrays;

public class StringOperationsExample {
    public static void main(String[] args) {
        String name = "muddasir";

        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Character at index 2: " + name.charAt(2));
        System.out.println("First d index: " + name.indexOf('d'));
        System.out.println("Contains sir: " + name.contains("sir"));
        System.out.println("Substring [3, 6): " + name.substring(3, 6));

        String anotherName = new String("muddasir");
        System.out.println("Same contents: " + name.equals(anotherName));
        System.out.println("Same object: " + (name == anotherName));

        String[] words = " Java strings are useful ".trim().split("\\s+");
        System.out.println(Arrays.toString(words));
        System.out.println(String.join(" | ", words));
        System.out.println(name.replace('a', 'o'));
    }
}

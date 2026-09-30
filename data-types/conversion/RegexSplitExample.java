/**
 * Lesson: String.split accepts a regular expression, not always a literal
 * delimiter. Escape regex metacharacters such as dot and pipe.
 */
import java.util.Arrays;

public class RegexSplitExample {
    public static void main(String[] args) {
        String dottedName = "j.a.v.a";
        String[] letters = dottedName.split("\\.");
        System.out.println(Arrays.toString(letters));

        String alternatives = "A|B|C";
        System.out.println(Arrays.toString(alternatives.split("\\|")));

        String sentence = " Java    is   fun ";
        String[] words = sentence.trim().split("\\s+");
        System.out.println(Arrays.toString(words));
        System.out.println(String.join(",", words));
    }
}

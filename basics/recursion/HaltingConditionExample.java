/**
 * Lesson: recursion is a method calling itself. A base case stops the calls;
 * each recursive step must move toward that case.
 */
public class HaltingConditionExample {
    public static void main(String[] args) {
        countDown(5);
    }

    private static void countDown(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must not be negative.");
        }
        if (number == 0) {
            System.out.println("Done.");
            return;
        }

        System.out.println(number);
        countDown(number - 1);
    }
}

/**
 * Lesson: widening conversions are often implicit; narrowing conversions
 * require a cast and may lose range or fractional information.
 */
public class CastingExample {
    public static void main(String[] args) {
        int wholeNumber = 1;
        double widened = wholeNumber;

        double measurement = 2.534;
        int narrowed = (int) measurement;

        System.out.println("Widened value: " + widened);
        System.out.println("Narrowed value: " + narrowed);
    }
}

/**
 * Lesson: java.lang.Math provides common numeric operations and constants.
 * Math.random() returns a value in [0, 1); this formula yields an integer from
 * min through max, inclusive.
 */
public class MathExample {
    public static void main(String[] args) {
        System.out.println("Minimum: " + Math.min(2, 7));
        System.out.println("Absolute value: " + Math.abs(-8.3));
        System.out.println("Power: " + Math.pow(2, 3));
        System.out.println("Square root: " + Math.sqrt(25));
        System.out.println("Rounded: " + Math.round(5.55));
        System.out.println("Pi: " + Math.PI);

        int min = 50;
        int max = 100;
        int randomInteger = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("Random integer: " + randomInteger);
    }
}

/**
 * Lesson: Scanner reads typed values from standard input. nextInt reads an
 * integer; nextLine reads the remainder of a line.
 */
import java.util.Scanner;

public class ScannerInputExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("Expected an integer.");
            }
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        }
    }
}

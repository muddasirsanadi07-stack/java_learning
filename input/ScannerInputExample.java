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


/*
nextBoolean()	Reads a boolean value from the user
nextByte()	Reads a byte value from the user
nextDouble()	Reads a double value from the user
nextFloat()	Reads a float value from the user
nextInt()	Reads a int value from the user
nextLine()	Reads a String value from the user
nextLong()	Reads a long value from the user
nextShort()	Reads a short value from the user 
next()        Reads a character/one word
 fromt the user
*/

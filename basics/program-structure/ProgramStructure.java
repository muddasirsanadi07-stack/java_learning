/**
 * Lesson: a Java application starts at main. The String... parameter is
 * equivalent to String[] and receives command-line arguments.
 * Key points: print adds no newline; println does; printf uses format codes.
 */
public class ProgramStructure {
    public static void main(String... args) {
        System.out.println("Java program structure");
        System.out.print("print keeps the cursor on this line; ");
        System.out.printf("printf formats an integer: %d%n", 21);

        if (args.length == 0) {
            System.out.println("Pass arguments, for example: java ProgramStructure hello");
            return;
        }

        System.out.println("Command-line arguments:");
        for (String argument : args) {
            System.out.println(argument);
        }
    }
}

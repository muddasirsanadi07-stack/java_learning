/**
 * Lesson: a Java application starts at main. The String... parameter is
 * equivalent to String[] and receives command-line arguments.
 * Key points: print adds no newline; println does; printf uses format codes.
 */
public class ProgramStructure {
    public static void main(String... args) {                                    //Not a String array.  bc it can takes 123(int) aswell "string" so it is Object ...you will learn later
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
//              Object[] arr = {10, "Hello", 3.14, true};

/*public class Main {
    public static void main(String[] args) {
        String name = args[0];
        int age = Integer.parseInt(args[1]);

        System.out.println(name + " is " + age + " years old.");
    }
}


Rahul is 20 years old.
 */
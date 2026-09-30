/**
 * Lesson: a static method belongs to its class and can be called from another
 * static method in that class without constructing an object.
 */
public class StaticMethodSameClass {
    static void greet() {
        System.out.println("Hello from a static method.");
    }

    public static void main(String[] args) {
        greet();
    }
}

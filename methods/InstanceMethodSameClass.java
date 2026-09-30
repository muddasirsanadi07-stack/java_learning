/**
 * Lesson: an instance method belongs to an object, so main creates an object
 * before calling greet().
 */
public class InstanceMethodSameClass {
    void greet() {
        System.out.println("Hello from an instance method.");
    }

    public static void main(String[] args) {
        InstanceMethodSameClass example = new InstanceMethodSameClass();
        example.greet();
    }
}

/**
 * Lesson: call a static method declared by another class using its class name.
 */
public class StaticMethodDifferentClass {
    public static void main(String[] args) {
        StaticMethodHelper.greet();
    }
}

class StaticMethodHelper {
    static void greet() {
        System.out.println("Hello from another class's static method.");
    }
}

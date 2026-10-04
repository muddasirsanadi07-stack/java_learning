/**
 * Lesson: create an instance of another class before calling its instance
 * method
 */
public class InstanceMethodDifferentClass {
    public static void main(String[] args) {
        InstanceMethodHelper helper = new InstanceMethodHelper();
        helper.greet();
    }
}

class InstanceMethodHelper {
    void greet() {
        System.out.println("Hello from another class's instance method.");
    }
}

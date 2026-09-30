/**
 * Lesson: a constructor runs when an object is created and initializes its
 * state. this.name distinguishes the field from the parameter.
 */
public class ConstructorExample {
    private final String name;

    ConstructorExample(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ConstructorExample student = new ConstructorExample("Muddasir");
        System.out.println(student.name);
    }
}

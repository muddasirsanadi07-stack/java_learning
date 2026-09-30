/**
 * Lesson: encapsulation keeps state and behavior together and protects
 * internal state behind a small public API.
 */
public class EncapsulationExample {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Muddasir");
        System.out.println(student.getName());
    }
}

class Student {
    private String name;

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be blank.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

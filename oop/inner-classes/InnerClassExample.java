/**
 * Lesson: a non-static inner class is associated with one outer object and
 * must be created through that object.
 */
public class InnerClassExample {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        System.out.printf("Outer value: %d; inner value: %d%n", outer.value, inner.value);
    }
}

class Outer {
    int value = 23;

    class Inner {
        int value = 53;
    }
}

/**
 * Lesson: an abstract class cannot be instantiated. A concrete subclass must
 * implement every inherited abstract method.
 */
public class AbstractClassExample {
    public static void main(String[] args) {
        Labrador dog = new Labrador();
        dog.sound();
        dog.eat();
        dog.sleep();
    }
}

abstract class AbstractAnimal {
    abstract void sound();

    abstract void eat();

    abstract void sleep();
}

abstract class AbstractDog extends AbstractAnimal {
    @Override
    void sound() {
        System.out.println("A dog barks.");
    }
}

class Labrador extends AbstractDog {
    @Override
    void eat() {
        System.out.println("The Labrador eats.");
    }

    @Override
    void sleep() {
        System.out.println("The Labrador sleeps.");
    }
}

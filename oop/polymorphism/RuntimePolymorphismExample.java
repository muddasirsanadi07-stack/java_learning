/**
 * Lesson: an overridden instance method is selected at runtime from the
 * object's actual class, even when the variable uses a parent type.
 */
public class RuntimePolymorphismExample {
    public static void main(String[] args) {
        PolymorphicAnimal animal = new PolymorphicDog();
        animal.makeSound();

        animal = new PolymorphicCat();
        animal.makeSound();
    }
}

class PolymorphicAnimal {
    void makeSound() {
        System.out.println("Animal sound.");
    }
}

class PolymorphicDog extends PolymorphicAnimal {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

class PolymorphicCat extends PolymorphicAnimal {
    @Override
    void makeSound() {
        System.out.println("Cat meows.");
    }
}

/**
 * Lesson: inheritance lets subclasses reuse and specialize accessible
 * behavior. This example shows two subclasses inheriting from one base class.
 */
public class AnimalInheritanceExample {
    public static void main(String[] args) {
        InheritanceDog dog = new InheritanceDog();
        InheritanceCat cat = new InheritanceCat();

        dog.eat();
        dog.makeSound();
        cat.eat();
        cat.makeSound();
    }
}

class InheritanceAnimal {
    void eat() {
        System.out.println("The animal eats.");
    }

    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class InheritanceDog extends InheritanceAnimal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class InheritanceCat extends InheritanceAnimal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

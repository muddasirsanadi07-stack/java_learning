/**
 * Lesson: the variable's declared type controls which members are available
 * at compile time; the object's runtime type determines an overridden method.
 */
public class ReferenceTypeExample {
    public static void main(String[] args) {
        ReferenceB child = new ReferenceB();
        ReferenceA parentReference = child;

        parentReference.showA();
        child.showB();
        // parentReference.showB(); // Compile-time error: ReferenceA has no showB().
    }
}

class ReferenceA {
    void showA() {
        System.out.println("Method from ReferenceA.");
    }
}

class ReferenceB extends ReferenceA {
    void showB() {
        System.out.println("Method from ReferenceB.");
    }
}

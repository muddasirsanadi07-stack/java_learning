/**
 * Lesson: a static field belongs to the class and is shared. Prefer accessing
 * it by its class name rather than through an object.
 */
public class FieldAccessExample {
    public static void main(String[] args) {
        System.out.println(SharedField.age);
    }
}


/*
| Access specifier           | Same class   | Same package  | Subclass in different package  | Different package, non-subclass   |
| -------------------------- | :--------:   | :----------:  | :---------------------------:  | :-----------------------------:   |
| `private`                  |      ✅     |       ❌      |               ❌               |                ❌                |
| **default** *(no keyword)* |      ✅     |       ✅      |               ❌               |                ❌                |
| `protected`                |      ✅     |       ✅      |               ✅*              |                ❌*               |
| `public`                   |      ✅     |       ✅      |               ✅               |                ✅                |

 */
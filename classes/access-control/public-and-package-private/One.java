/**
 * Lesson: one public top-level class may share a file with package-private
 * helper classes. The public class name must match the source filename.
 */
public class One {
    public static void main(String[] args) {
        PackageHelper.describe();
    }
}

class PackageHelper {
    static void describe() {
        System.out.println("Package-private classes are accessible in their package.");
    }
}

/**
 * Lesson: ArrayList is a resizable list. Use get/set/remove with valid indexes;
 * remove(index) and remove(value) have different meanings for numeric lists.
 */
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        //List<Integer> numbers =new ArrayList<>();     -----> this is also valid, infact it is better than ArrayList(IMPORT java.util.List;)
        // because you don't care about the specific implementation of ArrayList. 
        // and you can easily change it to Linked List:
        // List<String> numbers=new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(2, 123);
        System.out.println("After insertion: " + numbers);

        System.out.println("Value at index 1: " + numbers.get(1));
        numbers.set(2, 987);
        numbers.remove(2);                  // Removes the element at index 2.
        numbers.remove(Integer.valueOf(20)); // Removes the value 20.
        System.out.println("After changes: " + numbers);
    }
}

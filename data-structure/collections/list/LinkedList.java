/*A Linked List is a linear data structure where elements are stored in separate objects called nodes, and each node contains:

Data — the actual value
Reference — a reference to the next node
 */

        // operations 
import java.util.LinkedList;
import java.util.List;
class Main {
    public static void main(String[] args) {
       List<String> names=new LinkedList<>();  // Using the List interface
        names.add("muddasir");
        names.add("mugutsab");
        names.add("sanadi");
        System.out.println(names);
        for(String i : names){
            System.out.print(i+" ");
        }   
}
}

When To Use
Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.

//<-----------additional operations-------------------->
names.addFirst("hello");
names.addLast("hi");

names.getFirst();
names.getLast();

names.removeFirst();
names.removeLast();
-------------------------------------------------------------------------------------------------------------
When To Use
Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
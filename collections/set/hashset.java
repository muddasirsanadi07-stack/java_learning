//set
/*Set          → interface
HashSet      → implementation/class
names        → reference
new HashSet  → creates the object */
import java.util.Set;
import java.util.HashSet;
class Main {
    public static void main(String[] args) {
        System.out.println("Try clicking the Run button.");
        Set<String> names=new HashSet<>();          //using set interface
        names.add("muddasir");
        names.add("rehan");
        names.add("muddasir");                //Muddasir =! muddasir
        //already exists.  An interesting thing: add() returns a boolean.

        System.out.println(numbers.add("malik")); // true        as new element 
        System.out.println(numbers.add("malik")); // false       set dose not allow duplicates
        for(String i : names){
            System.out.println(i);
        }
    }
}
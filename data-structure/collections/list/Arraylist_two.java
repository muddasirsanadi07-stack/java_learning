        // operations 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
       List<String> s1=new ArrayList<>();    
       List<String> s2=new ArrayList<>();    
       //ArrayList<String> cars = new ArrayList<String>();             same thing, just to be more specific
       //                                         |------> object type 
        s1.add("one");
        s1.add("two");
        s1.add("three");
        s2.add("10");
        s2.add("20");
        s2.add("30");
        s1.addAll(s2);
        System.out.println(s1);
        s1.removeAll(s2);
        System.out.println(s1);
        s1.containsAll(s2);
        System.out.println(s1);
        s1.retainAll(s2);
        System.out.println(s1);
}
}
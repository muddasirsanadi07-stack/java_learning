        // operations 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
       ArrayList<Integer> num=new ArrayList<>();
        /*List<Integer> numbers = new ArrayList<>();
        │               │           │
        │               │           └── Object creation
        │               │
        │               └── Reference variable
        │
        └── Reference type (interface)
 */
        num.add(10);
        num.add(30);
        num.add(40);
        num.add(2,20);
        for(int i:num){
                System.out.println(i);
        }
        //-------------size------------------
        System.out.println("size:"+num.size()); //4
        //-----------------isEmpty   contains----------
        System.out.println("isEmpty"+num.isEmpty());
        System.out.println("contains"+num.contains(Integer.valueOf(20)));
        //-------------------sorting-------------
        num.sort(null);
        System.out.println("sort"+num);
        Collections.reverse(num);         //reverse
        System.out.println("reverse"+num);
        Collections.shuffle(num);         //shuffle
        System.out.println("shuffle"+num);

        //-------------sublist--------------------
        System.out.println(num.subList(1,2));
        //-------------------remove() everything----------
        num.clear();
        System.out.println("clear:"+num);
        System.out.println("----The End------");
        
}
}
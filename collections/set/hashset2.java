import java.util.Set;
import java.util.HashSet;
class Main {
    public static void main(String[] args) {
        System.out.println("Try clicking the Run button.");
        HashSet<Integer> num =new HashSet<>();             //using implementation of set interface using hashset class
        num.add(23);
        num.add(44);
        num.add(34);
        num.remove(23);                             // value
       // num.remove(num.indexOf(34));             //indexing
        System.out.println(num);
        
    }
}

//set: does not have indexing , so it does not support the get() set() sort() 
//only add() remove()   as basic functions of collections framework.

//remove() also works: VALUE ONLY (no indexing )


//supports : clear() isempty() contains() size()
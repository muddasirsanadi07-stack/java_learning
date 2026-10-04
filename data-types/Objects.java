//aslo act as tuple

class Main {
    public static void main(String[] args) {
        Object arr[]={1_2_3,13.46,"muddasir", true};                            //Object is a class // array that can hold references to objects
        //autoboxing.
        for(var i: arr){
            System.out.println(i);
        }
    }
}


/*                    Java types
                   /          \
            Primitive types   Reference types
            /   |   \          |
          int double boolean   Object
                                |
                    ┌───────────┼───────────┐
                    ↓           ↓           ↓
                  String      Integer     MyClass
 */
//Primitive types such as int and double do NOT inherit from Object, but Java can automatically wrap them into objects when necessary.
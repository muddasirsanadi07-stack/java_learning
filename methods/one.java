//A function is a standalone block of code. A method is a function that belongs to a class/object.
//basically a function can be owned by any object.
//when we say method - then we are taking about the function of that class || and it is only invoked by object of that class.                 ---simple


// you cannot declare another method inside main method : example
/*
public class one{
    public static void main(String... var){
        void Hello(){
            System.out.println("this is hello method");
        }
        Hello();
    }
}
*/

public class one{
    static void Hello(){
        System.out.println("life could be dream ! life COUND BE DREM,");
    }
    public static void main(String... car){
        // method calling
        Hello();
    }
}


//Java usually combines declaration and definition into one method declaration when you write a normal method. (unlike C)

// Why static keyword with method declaration:
//static means the member belongs to the class itself, rather than to individual objects.
//static tell Hello() belongs to class one. and if you are calling method inside same (one ) class , no need for the object.

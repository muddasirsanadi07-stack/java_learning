// method without static keyword
public class two{
    void Hello(){
        System.out.println("this is Hello class");
    }
    public static void main(String... hi){
        // Hello();          ---can't work
        two obj = new two();
        obj.Hello();
    }
}


//note: why main method have static keyword:
//main() itself is static because the JVM needs to start your program without first creating an object of your class.
//The JVM needs to call main() without creating an object first.and it is the starting point of the program
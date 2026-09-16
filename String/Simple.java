// It is called Reference Datatype;
public class Simple{
    public static void main(String... var){
        double x=0.1;
        double y=0.2;
        System.out.println("value of x=0.1 +y=0.2="+(x+y));//you might expect 0.3 but result will be different 
        System.out.println("reason:0.1  0.2  0.3cannot be represented exactly as finite binary fractions.Java actually stores values that are extremely close to them:0.1 → approximately 0.10000000000000000555...  0.2 → approximately 0.20000000000000001110...");

    }
}
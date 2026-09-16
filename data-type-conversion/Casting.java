/*
Widening Casting (automatic) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manual) - converting a larger type to a smaller type size
double -> float -> long -> int -> char -> short -> byte

note:  small------>large hirarchy data type (automatic/implicit)
       large------>small hirarchy data type (manual/explicit)
*/
public class Casting{
    public static void main(String... var){
        int x=1;
        float y=x;     //1.00

        float a=2.534f;
        int b=(int)a;

        System.out.println(b);
    }
}
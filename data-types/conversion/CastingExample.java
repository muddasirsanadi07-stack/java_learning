/**
 * Lesson: widening conversions are often implicit; narrowing conversions
 * require a cast and may lose range or fractional information.
 */
public class CastingExample {
    public static void main(String[] args) {
        int wholeNumber = 1;
        double widened = wholeNumber;

        double measurement = 2.534;
        int narrowed = (int) measurement;

        System.out.println("Widened value: " + widened);
        System.out.println("Narrowed value: " + narrowed);
    }
}




//char<--->int
/*
     conversion is done using casting (int)(char)      ex: A---->65
     but in order convert '8'<----->8  same value.

     int n=c-'0';
     char c=(char)n+'0';
 */
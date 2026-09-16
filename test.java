import java.util.Arrays;
public class test{
    public static void main(String... varw){
        String name="m.u.d.d.u.s.i.r";
        System.out.print(name.split("\\."));//exception on dot(.)-due to REGEX
        //  (.) in regex . means "any character"    unlike .split(" ") -here space act as literal
        //regex is pattern language for describing text


        //same for |
        String hi="A|B|C";
        System.out.println(hi.split("\\|")); //in regex | means "OR"

        // REGEX symbols
        /*
        * : 0 or more
        + :1 or more
        ? : 0 or 1
        {n} : exactly n
        ^ : begning input/line
        $ :end of input
        \b \B \A \z \Z : just consider special for moment
        | : OR
        . :any character
        () [] {} :blah blah blah

        */


       String s=" java    is   not    fun";
       //String[] words = s.split(" "); only one space 
       String[] words = s.split("\\s+");  // s:whitespave  +: one or more

       // String ---->split---> array of string----> join ---->string.

       //reason for [Ljava.lang.String;@1dbd16a6 output:
       System.out.println(Arrays.toString(words));
       String result = String.join(",", words);
       System.out.println(result);



        //split() converts a String into a String[] (array of Strings) based on a delimiter/regex.



       //Arrays.toString
       System.out.println("Start small. Ship something.");
        String name="muddasir";
        String list[]=name.split("");
        System.out.println(Arrays.toString(list));
        System.out.println(String.join(":",list));
    }
}
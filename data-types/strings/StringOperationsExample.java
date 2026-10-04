/**
 * Lesson: String is immutable; its methods return new values. Use equals for
 * content comparison, substring's end index is exclusive, and charAt needs a
 * valid index.
 */
import java.util.Arrays;

public class StringsOperationsExample{
    public static void main(String... var){
        String name = "muddasir";
    /*   |      \           \_String Object      
         |       \_refernce variable
         |
        class/reference datatype    
     */
        String num="@123";
        String arr[]={"a","b","c"};

        System.out.println(name);

        //length and empty
        System.out.println("length"+name.length());            //length()
        System.out.println("is empty"+name.isEmpty());

        //concatination
        System.out.println("concat +"+name+num);                        //use when you have different datatypes
        System.out.println("concat :"+name.concat(num));                 //use this method concat() when both are String datatype.

        //upper and lower
        System.out.println("lower :"+name.toLowerCase());
        System.out.println("upper :"+name.toUpperCase()); 

        //char and index
        System.out.println("charAt(5) :"+name.charAt(5));
        System.out.println("indexOf('d') :"+name.indexOf('d'));
        System.out.println("last index of d :"+name.lastIndexOf('d'));
        
        //compares
        System.out.println(name==num);                        //compares the refernce values: bc two string variable can have same ref: datatype.txt
        System.out.println(name.equals(num));                  //compares the actual string/content.
        System.out.println(name.compareTo(num));             //ex: "cat".compareTo("car"); ---> left to right (c=c)--->(a=a)--->(t!=r) and t-r=positive. unicode based

        //string matching 
        System.out.println("string matching------------------\n"+name.contains("sir"));
        System.out.println(name.startsWith("mudd"));
        System.out.println(name.endsWith("ir"));

        //replace 
        System.out.println("replace a with o :"+name.replace('a','o'));

        String n="    java     ";
        System.out.println(n.trim());
        
        System.out.println(name.split(" "));
        System.out.println(String.join(":",arr));

        //substring 
        System.out.println(name.substring(3,6));


        //conversion
        String s = "Java";
        char a[] = s.toCharArray();
        System.out.println(a[2]);

        //string-->int                                                   //similar to the casting 
        int v=Integer.parseInt("123");
        System.out.println(v);
        //int-->string
        String.valueOf(123);

        //repeat
        "hi".repeat(2);

       }

    
/*
String a = new String("Hello");
String b = new String("Hello");

System.out.println(a == b);       // false
System.out.println(a.equals(b));  // true


== compares references for objects. 

--------------------------------------------------------------------------------------------

System.out.println("Hello" + 10 + 20);
output: Hello1020
reason: evaluation happens from left-->right
 */

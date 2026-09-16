public class Strings {
    public static void main(String... var){
        String name = "muddasir";
        String num="@123";
        String arr[]={"a","b","c"};

        System.out.println(name);

        //length and empty
        System.out.println("length"+name.length());
        System.out.println("is empty"+name.isEmpty());

        //concatination
        System.out.println("concat +"+name+num);
        System.out.println("concat :"+name.concat(num));

        //upper and lower
        System.out.println("lower :"+name.toLowerCase());
        System.out.println("upper :"+name.toUpperCase()); 

        //char and index
        System.out.println("charAt(5) :"+name.charAt(5));
        System.out.println("indexOf('d') :"+name.indexOf('d'));
        System.out.println("last index of d :"+name.lastIndexOf('d'));
        
        //compares
        System.out.println(name==num);
        System.out.println(name.equals(num));
        System.out.println(name.compareTo(num));  //ex: "cat".compareTo("car"); ---> left to right (c=c)--->(a=a)--->(t!=r) and t-r=positive. unicode based

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

    
}

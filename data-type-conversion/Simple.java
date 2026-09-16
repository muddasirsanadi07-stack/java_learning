public class Simple{
    public static void main(String... var){
        /*  String ↔ int
            String ↔ char
            String ↔ char[]
            String ↔ int[]
            String ↔ array           //use split and join
        */
       //string --->int
       String num="123";
       int n=Integer.parseInt(num);
       //int---->string
       int a=456;
       String b=String.valueOf(a);

       //string--->char
       String name="muddasir";
       char no=name.charAt(0);
       //char-->string
       char c='i';
       String s=String.valueOf(c);

       //string--->char[]
       String name_="muddasir";
       char arr[]=name.toCharArray();
       //char[]--->String
       char[] ar = {'H', 'e', 'l', 'l', 'o'};
       String st = new String(ar);

        //char--->int
        char x='4';
        int y=x-'0';
        //int --->char 
        int number=67;
        char cha=(char)number;

       //int[]-->string
       int[] arrr= {10, 20, 30};
        String se = Arrays.toString(arrr);
        //string-->int[]


        //------------------------------------print anythign-----------------------------
        System.out.println(cha);
    }
}



/*
String
 │
 ├──→ int
 │     Integer.parseInt()
 │
 ├──→ char
 │     charAt()
 │
 ├──→ char[]
 │     toCharArray()
 │
 └──→ String[]
       split()


int
 │
 └──→ String
       String.valueOf()


char
 │
 └──→ String
       String.valueOf()


char[]
 │
 └──→ String
       new String(arr)


String[]
 │
 └──→ String
       String.join()


String
 │
 └──→ String[]
       split()
*/
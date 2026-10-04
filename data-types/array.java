/*
An array is an object that stores a fixed number of values of the same type, where each value is accessed using an index.

Example:
 */
public class array{
    public static void main(String... arg){
        int arr[]={1,2,3,4,5,6};
        int ar[]=new int[10];
        int ar[0]=10;

        char c[]={'a','b','r','t','a'};                        //length 
        String s[]={"muddasir","mugutsab","sanadi"};           //length()


        //float..double ..long ....short....
        System.out.println(s);            //this gives [I@7a81197d 
        System.out.println(c[c.length-1]);      //access last index ele
        System.out.println(Arrays.toString(s)); //c,ar or arr            output-[Muddasir,Mugutsab,Sanadi]
        for(String i:s){
            System.out.print(i+" ");
        }
    }
}
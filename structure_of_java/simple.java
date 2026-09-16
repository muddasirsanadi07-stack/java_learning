public class simple{              //class name supposed to be upper ,but who cares
    public static void main (String... var){ //var is array of string used to store command-line arguments |||useful in passing any files from terminal 
        //Display statements
        System.out.println("---------simplest program--------");
        System.out.print("statement withour ln \n");
        System.out.printf("number:%d\n",21);
        System.out.format("number:%d\n",22);

        //primitive data types:??????????
        //bytes-1byte
        //short-2byte
        //int-4byte
        //long-8byte            ex=037450283049820L;
        //float-4byte           ex: float num=2.3f;
        //double-8byte
        //char-2byte             ex 65=A 97=a 49=1
        //bool-depend upon the architecture of system.

        /* command-line arguments example ;*/
        if(var.length>0){
            System.out.println("the arguments passed in main class are");
            for(int i=0;i<var.length;i++){
            System.out.println(var[i]+"\t");
            }
        }else{
            System.out.println("try typing some command line argments ex: java simple a b c");
        }


    }
}



// use String[] var is arguments are specific or fixed size.
// for varible value arguments use String... var
//either way both are fine to use
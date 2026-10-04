//Simple linked list program

class Node{
    int data;
    Node next;  //self-referential reference
}

public class Link{
    public static void main(String... arg){
        Node n1=new Node();                                           //pass argument and create constructor in Node
        Node n2=new Node();
        Node n3=new Node();

        n1.data=10;
        n2.data=20;
        n3.data=30;

        n1.next=n2;
        n2.next=n3;
        n3.next=null;

        while(n1!=null){
            System.out.println("data:"+n1.data);
            n1=n1.next;
        }

    }
}
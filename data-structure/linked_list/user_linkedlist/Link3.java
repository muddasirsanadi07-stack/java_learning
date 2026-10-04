class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("enter the number of nodes");

        OP o = new OP();

        int n = 10;
        int x = 10;

        for (int i = 1; i <= n; i++) {
            o.in_first(x);
            x += 10;
        }

        int y=1;
        for (int i = 1; i <= n; i++) {
            o.in_last(y);
            y += 1;
        }
        o.del_first();
        o.del_last();

        o.in(7,999);         //insert at position
        o.del(7);            //delete at position
        o.display();
    }
}

class OP {
    Node head;

    void in_last(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
    }
    //-----------------------------------------------------
    void in_first(int data){
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
    }
    //-----------------------------------------------------
    void del_last() {

        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    //-----------------------------------------------------
    void del_first(){
        head=head.next;
    }
    //-----------------------------------------------------
    void in(int p, int data) {
        Node new_node = new Node(data);
        if (p == 1) {
            new_node.next = head;
            head = new_node;
            return;
        }
        if (head == null) {
            return;
        }
        Node temp = head;
        for (int i = 1; i < p - 1; i++) {
            temp = temp.next;
        }
        new_node.next = temp.next;
        temp.next = new_node;
    }
    //-------------------------------------------------------------
    void del(int p){
        if(head==null){
            //sout 
            return;
        }
        Node temp=head;
        for(int i=1;i<p-1;i++){
            temp=temp.next;
        }
        System.out.println("this:"+temp.data);//debugging
        temp.next=temp.next.next; 
    }
    //-----------------------------------------------------
    void search(int s) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        int count = 1;
        while (temp != null) {
            if (temp.data == s) {
                System.out.println("Position: " + count);
                return;
            }
            temp = temp.next;
            count++;
        }
        System.out.println("Element not found");
    }
    //-----------------------------------------------------
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print("-->" + temp.data);
            temp = temp.next;
        }
    }
}

/*
Operation	What it does
10. Update	Change the data of a particular Node
11. Reverse	Reverse 10 → 20 → 30 into 30 → 20 → 10
12. Find middle	Find the middle Node
13. Find nth Node	Find a Node at a particular position
14. Find maximum/minimum	Find the largest/smallest value
15. Sort
Insert at beginning
Insert at end — you've already done this
Insert at a specific position
Delete from beginning
Delete from end
Delete from a specific position
Search for an element
Display / traverse
Reverse the linked list
 */
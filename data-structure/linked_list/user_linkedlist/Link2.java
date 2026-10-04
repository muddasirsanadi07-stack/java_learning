class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list.head = new Node(10);

        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
    }
}
/*list
 ↓
MyLinkedList object
 ┌─────────────┐
 │ head ───────┼────→ Node object
 └─────────────┘      ┌──────────────┐
                      │ data = 10    │
                      │ next = null  │
                      └──────────────┘
                       */
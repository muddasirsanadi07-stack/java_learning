Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;      
        }
        head=prev;

void middle() { 
    if (head == null) {
        return;
    }
    Node temp1 = head;
    Node temp2 = head;
    while (temp2 != null && temp2.next != null) {
        temp1 = temp1.next;
        temp2 = temp2.next.next;
    }
    System.out.println("middle: " + temp1.data);
}

void nth(int n) {
    if (head == null) {
        return;
    }
    Node temp = head;
    int count = 1;
    while (temp != null) {
        if (count == n) {
            System.out.println("Nth node: " + temp.data);
            return;
        }
        temp = temp.next;
        count++;
    }
}
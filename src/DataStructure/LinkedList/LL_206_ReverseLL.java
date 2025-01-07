package DataStructure.LinkedList;

public class LL_206_ReverseLL {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        MyLinkedList ll = new MyLinkedList();
        ll.printLinkedList(n1);
        Node n0 = ll.addToHead(n1, 0);
        n0 = ll.removeLast(n0);
        n4 = ll.removeAt(n4, 0);
        n0 = ll.removeAt(n0, 3);
        ll.printLinkedList(n0);
        ll.printLinkedList(reserveList(n0));
    }
    public static Node reserveList(Node head){
        if(head == null)
            return head;
        Node reverse = new Node(head.value);
        while(head.next != null){
            head = head.next;
            Node temp = new Node(head.value);
            temp.next = reverse;
            reverse = temp;
        }
        return reverse;
    }
}

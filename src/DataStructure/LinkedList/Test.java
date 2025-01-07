package DataStructure.LinkedList;

public class Test {
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
        n0 = ll.add(n0,  5);
        n0 = ll.add(n0, 7);
        Node n6 = ll.addTo(n0, 6, 6);
        n0 = ll.removeLast(n0);
        n0 = ll.removeAt(n0, 1);
        ll.printLinkedList(n0);
    }
}

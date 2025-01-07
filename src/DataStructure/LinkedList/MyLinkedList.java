package DataStructure.LinkedList;

public class MyLinkedList {

    public Node addToHead(Node HeadNode, int val){
        Node newNode = new Node(val);
        if (HeadNode != null){
            newNode.next = HeadNode;
        }
        return newNode;

    }
    public Node add(Node headNode, int val){
        Node newNode = new Node(val);
        if (headNode == null){
            return newNode;
        }else {
            Node lastNode = headNode;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
            return headNode;
        }

    }
    public Node addTo(Node headNode, int index, int val){
        if (index == 0){
            return addToHead(headNode, val);
        }else {
            Node newNode = new Node(val);
            Node curNode = headNode;
            int count = 0;
            while (curNode != null){
                count++;
                if (count == index){
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next;
            }
            return newNode;
        }
    }
    public Node removeHead(Node headNode){
        if (headNode != null){
            return headNode.next;
        }else
            return null;
    }
    public Node removeLast(Node headNode){
        Node lastNode = headNode;
        Node prevNode = null;
        while (lastNode.next != null){
            prevNode = lastNode;
            lastNode = lastNode.next;
        }
        if (prevNode == null){
            return null;
        }else {
            prevNode.next = null;
        }
        return headNode;
    }
    public Node removeAt(Node headNode, int index){
        if(headNode == null || index < 0){
            return null;
        }

        if (index == 0)
            return removeHead(headNode);

        int count = 0;
        Node prevNode = null;
        Node curNode = headNode;
        while (curNode.next != null){
            if (count == index){
                prevNode.next = curNode.next;
                break;
            }
            prevNode = curNode;
            curNode = curNode.next;
            count++;
            }
            return headNode;

    }
    public void printLinkedList(Node head){
        if (head == null){
            System.out.println("List is empty!");
        }else {
            Node temp = head;
            while (temp != null){
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

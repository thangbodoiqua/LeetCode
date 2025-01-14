package DataStructure.Tree.Recurisve;

public class Main {
    public static void main(String[] args) {
        BinaryTree t3 = new BinaryTree();
        t3.buildTreeByVal("2", null, null);
        BinaryTree t4 = new BinaryTree();
        t4.buildTreeByVal("6", "5","11");
        BinaryTree t5 = new BinaryTree();
        t5.buildTreeByVal("9", "4",null);
        BinaryTree t1 = new BinaryTree();
        t1.buildTree("7", t3,t4);
        BinaryTree t2 = new BinaryTree();
        t2.buildTree("5", null, t5);
        BinaryTree t = new BinaryTree();
        t.buildTree("2", t1, t2);

        t.preOrder(t);
        System.out.println();
        t.inOrder(t);
        System.out.println();
        t.postOrder(t);
        System.out.println();
        System.out.println(t.getDepth(t));
        System.out.println(t.countLeaves(t));
        System.out.println(t.iPathLength(t, 0));
    }
}

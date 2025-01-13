package DataStructure.Tree.Recurisve;

public class BinaryTree {
    Node root;
    BinaryTree left;
    BinaryTree right;
    public void buildTree(String label, BinaryTree left, BinaryTree right){
        this.root = new Node(label);
        this.left = left;
        this.right = right;
    }

}

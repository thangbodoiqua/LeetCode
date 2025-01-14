package DataStructure.Tree.Recurisve;

public class BinaryTree {
    Node root;
    BinaryTree left;
    BinaryTree right;
    public BinaryTree(){
        this.root = null;
        this.left = this.right = null;
    }
    public void buildTree(String rootValue, BinaryTree left, BinaryTree right){
        this.root = new Node(rootValue);
        this.left = left;
        this.right = right;
    }
    public void buildTreeByVal(String rootValue, String leftVal, String rightVal){
        this.root = new Node(rootValue);
        if (leftVal != null){
            this.left = new BinaryTree();
            this.left.buildTree(leftVal, null, null);
        }
        if (rightVal != null){
            this.right = new BinaryTree();
            this.right.buildTree(rightVal, null, null);
        }
    }
    public String getTreeVal(){
        return root.getValue();
    }
    public void setTreeVal(String label){
        this.root.setValue(label);
    }


    public void preOrder(BinaryTree tree){
        if (tree != null){
            System.out.print(tree.getTreeVal() + " ");
            preOrder(tree.left);
            preOrder(tree.right);
        }
    }

    public void inOrder(BinaryTree tree){
            if (tree != null){
                inOrder(tree.left);
                System.out.print(tree.getTreeVal() + " ");
                inOrder(tree.right);
            }
    }
    public void postOrder(BinaryTree tree){
        if (tree != null){
            postOrder(tree.left);
            postOrder(tree.right);
            System.out.print(tree.getTreeVal() + " ");
        }
    }

    public int getDepth(BinaryTree t){
        if (t != null) {
            return 1 + Math.max(getDepth(t.left), getDepth(t.right));
        }else
            return -1;
        // Vì vs mỗi node nó sẽ + 1, nma ở node null return 0 sẽ bị thừa
        // vì node trc đó vẫn tính node null này là 1 node con, cho nên return -1 để nó k tính nữa
    }
    public boolean isLeaf(){
        return this.left == null && this.right == null;
    }
    public int countLeaves(BinaryTree t){
        if (t == null)
            return 0;
        if (t.isLeaf())
                return 1;

        return countLeaves(t.left) + countLeaves(t.right);
    }
    public int iPathLength(BinaryTree t, int height){// total distance of all node to the root
        if (t == null)
            return 0;
        else
            return height + iPathLength(t.left, height + 1) + iPathLength(t.right, height + 1);
    }
}

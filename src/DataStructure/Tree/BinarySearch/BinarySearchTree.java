package DataStructure.Tree.BinarySearch;

public class BinarySearchTree {
    private Node root;
    private BinarySearchTree left;
    private BinarySearchTree right;
    public BinarySearchTree(){
        this.root = null;
        this.left = this.right = null;
    }
    public void addRoot(int value){
        if (this.root != null){
            throw new IllegalArgumentException("Root already exists");
        }
        this.root = new Node(value);
    }
    public boolean isEmpty(){
        return root == null;
    }
    public Node getRoot(){
        return root;
    }

    public BinarySearchTree getLeft() {
        return left;
    }

    public BinarySearchTree getRight() {
        return right;
    }

    public void setLeft(BinarySearchTree left) {
        this.left = left;
    }

    public void setRight(BinarySearchTree right) {
        this.right = right;
    }

    public boolean insert(int value, BinarySearchTree t){
        if (t.isEmpty()){
            t.addRoot(value);
            return true;
        }else {
            if (t.getRoot().getValue() > value){
                if (t.getLeft() == null){
                    t.setLeft(new BinarySearchTree());
                }
                return insert(value, t.getLeft());
            } else if(t.getRoot().getValue() < value){
                if (t.getRight() == null){
                    t.setRight(new BinarySearchTree());
                }
                return insert(value, t.getRight());
            }else
                return false;
        }
    }

    public int getMax(){
        if (this.isEmpty()){
            throw new IllegalArgumentException("Tree is empty!");
        }
        BinarySearchTree max = this;
        while (max.getRight() != null){
            max = max.getRight();
        }
        return max.getRoot().getValue();
    }
    public int getMin(){
        if (this.isEmpty()){
            throw new IllegalArgumentException("Tree is empty!");
        }
        BinarySearchTree min = this;
        while (min.getLeft() != null){
            min = min.getLeft();
        }
        return min.getRoot().getValue();
    }
    public boolean search(int key){
        if (this.isEmpty()){
            throw new IllegalArgumentException("Tree is empty!");
        }
        BinarySearchTree search = this;
        while (search != null){
            if (search.getRoot().getValue() == key ){
                return true;
            }else if (search.getRoot().getValue() > key){
                if (search.getLeft() != null) {
                    search = search.getLeft();
                }
                else{
                    return false;
                }
            }else {
                if (search.getRight() != null) {
                    search = search.getRight();
                }
                else {
                    return false;
                }
            }
        }
        return false;
    }
    public void preTraversal(BinarySearchTree t){
        if (t!= null){
            System.out.print(t.getRoot().getValue() + " ");
            preTraversal(t.getLeft());
            preTraversal(t.getRight());
        }
    }


}

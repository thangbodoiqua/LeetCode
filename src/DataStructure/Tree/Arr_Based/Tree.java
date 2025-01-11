package DataStructure.Tree.Arr_Based;

import java.util.Arrays;

public class Tree {
    int maxSize;
    int n;
    String[] l;
    int[] p;
    public Tree(int length){
        this.maxSize = length;
        this.n = -1;
        l = new String[maxSize];
        p = new int[maxSize];
    }
    public boolean isFull(){
        return n == maxSize - 1;
    }
    void addNode(String label, int parent){
        if (isFull()){
            throw new IllegalStateException("Tree is full");
        }
        int pos = ++n;
        if (parent == -1){
            this.p[pos] = parent;
            this.l[pos] = label;
        } else {
            for (int i = pos; i > parent; i--) {
                if (p[i - 1] > parent) {
                    l[i] = l[i - 1];
                    p[i] = p[i - 1];
                    pos = i - 1;
                }else {
                    break;
                }
            }
            this.p[pos] = parent;
            this.l[pos] = label;
        }
    }
    public int getParent(int node){
        if (node >= n){
            throw new IndexOutOfBoundsException("Node is not in the tree");
        }
        return p[node];
    }
    public int leftMostChild(int node){
        if (node >= n){
            throw new IndexOutOfBoundsException("Node is not in the tree");
        }
        for (int i = node; i <= n; i++) {
            if (p[i] == node){
                return i;
            }
        }
        return -1;
    }
    public int rightSibling(int node){
        if (node >= n){
            throw new IndexOutOfBoundsException("Node is not in the tree");
        }else if (node == n - 1) {
            return -1;
        }else{
            if (p[node + 1] == p[node]) {
                return node + 1;
            }
        }
        return -1;
    }
    public String getNodeLabel(int node){
        if (node > n){
            throw new IllegalStateException("No element");
        }
        return l[node];
    }
    public void setNodeLabel(int node, String label){
        if (node > n){
            throw new IllegalStateException("No element");
        }
        l[node] = label;
    }
    public static void main(String[] args) {
        Tree t = new Tree(10);
        t.addNode("A", -1);
        t.addNode("H", 4);
        t.addNode("K", 5);
        t.addNode("B", 0);
        t.addNode("G", 3);
        t.addNode("E", 2);
        t.addNode("F", 2);
        t.addNode("I", 4);
        t.addNode("C", 0);
        t.addNode("D", 0);
        System.out.println(t.leftMostChild(1));
        System.out.println(t.rightSibling(8));
        System.out.println(Arrays.toString(t.l));
        System.out.println(Arrays.toString(t.p));
    }
}

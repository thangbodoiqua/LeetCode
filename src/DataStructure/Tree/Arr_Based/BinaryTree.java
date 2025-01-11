package DataStructure.Tree.Arr_Based;

import java.util.Arrays;

public class BinaryTree {
    int maxSize;
    int n;
    String[] l;
    int[] p;
    public BinaryTree(int length){
        this.maxSize = length;
        this.n = 0;
        l = new String[maxSize];
        p = new int[maxSize];
        Arrays.fill(p, -1);
    }
    void addNode(String label, int parent){
        if (n == maxSize - 1){
            System.out.println("maxed!");
            return;
        }
        if (parent == -1){
            this.l[0] = label;
        } else {
            n++;
            int sameParent = 0;
            for (int i = 1; i <= n; i++) {
                if (p[i] == parent){
                    sameParent++;
                }
                if (sameParent == 2){
                    System.out.println("Node " + parent + " had 2 child");
                    return;
                }
                if (p[i] > parent || i == n){
                    for (int j = n; j > i; j--){
                        l[j] = l[j-1];
                        p[j] = p[j-1];
                    }
                    p[i] = parent;
                    l[i] = label;
                    break;
                }
            }
        }
    }
    public int getParent(int node){
        if (node > n){
            throw new IllegalStateException("No element");
        }
        return p[node];
    }
    public int leftMostChild(int node){
        if (node > n){
            throw new IllegalStateException("No element");
        }
        for (int i = node; i <= n; i++) {
            if (p[i] == node){
                return i;
            }
        }
        return -1;
    }
    public int rightSibling(int node){
        if (node > n - 1){
            throw new IllegalStateException("No element");
        }
        if (p[node + 1] == p[node]){
            return node + 1;
        }else
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
        BinaryTree t = new BinaryTree(10);
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
        System.out.println(Arrays.toString(t.l));
        System.out.println(Arrays.toString(t.p));
    }
}

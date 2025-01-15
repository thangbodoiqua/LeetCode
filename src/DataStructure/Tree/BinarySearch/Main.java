package DataStructure.Tree.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 7, 5, 5, 3, 3, 10, 12, 21, 33, 139, 91291};
        BinarySearchTree t = new BinarySearchTree();
        t.addRoot(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            boolean isInsert = t.insert(arr[i], t);
            System.out.println("inserted into tree value: " + arr[i] + " - " + isInsert);
        }
        t.preTraversal(t);
        System.out.println();
        System.out.println(t.getMax());
        System.out.println(t.getMin());
        System.out.println(t.search(21));
    }
}

package Sort;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 10, 3, 4, 14, 9, 16, 8, 10, 22, 13, -5, -8, -888,-999, 1900, 2123, 1332};
        heapSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void heapSort(int[] A, int n){
        buildHeap(A, n-1);
        for (int i = n - 1; i > 0; i--) {
            int tmp = A[0];
            A[0] = A[i];
            A[i] = tmp;
            trickleDown(A, i - 1, 0);
        }
    }
    public static void buildHeap(int[] A, int n){
        for (int i = n/2; i >= 0; i--){
            trickleDown(A,n,i);
        }
    }

    public static void trickleDown(int[] A, int n, int i){
        int l = i*2 + 1;
        int r = i*2 + 2;
        int max = i;
        if (l <= n && A[l] > A[max]) {
            max = l;
        }
        if (r <= n && A[r] > A[max]) {
            max = r;
        }
        if (max != i) {
            int tmp = A[max];
            A[max] = A[i];
            A[i] = tmp;
            trickleDown(A, n, max);
        }
    }


}

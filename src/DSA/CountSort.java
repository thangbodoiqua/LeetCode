package DSA;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {2,5,3,0,2,3,0,3,129129};
        countSort(arr);
    }
    public static void countSort(int[] a){
        int max = findMax(a);
        System.out.println("max: " + max);
        int[] b = new int[max + 1];
        for (int i = 0; i < a.length; i++){
            b[a[i]]++;
        }
        truePosition(b);
        int[] c = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--){
            c[b[a[i]] - 1] = a[i];
            b[a[i]]--;
        }
        System.out.println(Arrays.toString(c));
    }
    public static int findMax(int[] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++){
            max = Math.max(max, a[i]);
        }
        return max;
    }
    public static void truePosition(int[] b) {
        for (int i = 1; i < b.length; i++){
            b[i] = b[i] + b[i-1];
        }
    }
}

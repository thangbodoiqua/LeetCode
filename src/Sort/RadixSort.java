package Sort;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(arr);
    }
    public static void radixSort(int[] arr){
        int max = findMax(arr);
        for (int i = 1; max/i > 0; i *= 10){
            sort(arr, i);
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void sort(int[] arr, int d){
        int[] b = new int[10];
        int[] c = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            b[(arr[i]/d) % 10]++;
        }
        for (int i = 1; i < b.length; i++){
            b[i] += b[i-1];
        }
        for (int i = arr.length - 1; i >= 0; i--){
            c[ b[(arr[i]/d) % 10] - 1] = arr[i];
            b[(arr[i]/d) % 10]--;
        }
        for (int i = 0; i < arr.length; i++){
            arr[i] = c[i];
        }
    }
    public static int findMax(int[] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++){
            max = Math.max(max, a[i]);
        }
        return max;
    }
}

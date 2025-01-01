package DSA;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] a = {10, 4, 16, 20};
        int[] b = new int[a.length];
        prefixSum(a,b);
        System.out.println(Arrays.toString(b));
    }
    public static void prefixSum(int[] a, int[] b){
        b[0] = a[0];
        for (int i = 1; i < b.length; i++){
            b[i] = b[i -1] + a[i];
        }
    }
}

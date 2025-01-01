package DSA;

import java.util.Arrays;

public class PrefixSumInRange {    public static void main(String[] args) {
    int[] a = {3, 6, 2, 8, 9, 2};
    System.out.println(sum(a,0, 3));
}
    public static int sum(int[] a, int l, int r){
        int[] sum = new int[a.length + 1];
        sum[0] = 0;
        for (int i = 0; i < a.length; i++){
            sum[i + 1] = sum[i] + a[i];
        }
        System.out.println(Arrays.toString(sum));
        return sum[r] - sum[l];
    }
}

package Array;

import java.util.Arrays;

public class Arr_27_removeE {
    public static void main(String[] args) {
        int arr[] = {0,1,2,2,3,0,4,2};

        System.out.println(removeElement(arr, 2));
        System.out.println(Arrays.toString(arr));
    }
    public static int removeElement(int nums[], int val){
        int k = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == val){
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[i+1];
                }
                k++;
            }
        }
        return  nums.length - k;
    }
}

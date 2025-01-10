package Array;

import java.util.Arrays;

public class Arr_26_RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {};
        int[] arr = {1,1,2};
        // 1 2 2


        int k = removeDuplicates(nums);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }
    public static int removeDuplicates(int[] nums){
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}

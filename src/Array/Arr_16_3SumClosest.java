package Array;

import java.util.Arrays;

public class Arr_16_3SumClosest {
    public static void main(String[] args) {
        int[] nums = {4,0,5,-5,3,3,0,-4,-5};
        //-4 -1 1 2 if target = 0 --> -1 1 2
        System.out.println(ThreeSumClosest(nums, -2));
    }
    public static int ThreeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int nearest = Integer.MAX_VALUE;
        //[-5, -5, -4, 0, 0, 3, 3, 4, 5]
        for (int i = 0; i < nums.length - 2; i++){
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int j = i+1;
            int k = nums.length - 1;
            while (j < k){
                int compareSum = nums[i] + nums[j] + nums[k];
                if (Math.abs(target - compareSum) < Math.abs(target - nearest)){
                    nearest = compareSum;
                }

                if (compareSum < target) {
                    ++j;
                } else if (compareSum > target) {
                    --k;
                } else {
                    return compareSum;
                }
            }

        }
        return nearest;
    }
}

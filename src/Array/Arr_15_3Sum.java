package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arr_15_3Sum {
    public static void main(String[] args) {
        int[] nums = {34,55,79,28,46,33,2,48,31,-3,84,71,52,-3,93,15,21,-43,57,-6,86,56,94,74,83,-14,28,-66,46,-49,62,-11,43,65,77,12,47,61,26,1,13,29,55,-82,76,26,15,-29,36,-29,10,-70,69,17,49};
        //[-82, -70, -66, -49, -43, -29, -29, -14, -11, -6, -3, -3, 1, 2, 10, 12, 13, 15, 15, 17, 21, 26, 26, 28, 28, 29, 31, 33, 34, 36, 43, 46, 46, 47, 48, 49, 52, 55, 55, 56, 57, 61, 62, 65, 69, 71, 74, 76, 77, 79, 83, 84, 86, 93, 94]

        System.out.println(ThreeSum(nums));

    }
    public static List<List<Integer>> ThreeSum(int[] nums){
        List<List<Integer>> ThreeSum = new ArrayList<>();

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length - 2; i++){
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int j = i+1;
            int k = nums.length - 1;
            int target = -nums[i];
            while (j < k){
                if (nums[j] + nums[k] == target){
                    ThreeSum.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                } else if (nums[j] + nums[k] > target) {
                    k--;
                } else
                    j++;

                 while (nums[j] == nums[j-1] && j < k) {
                    j++;
                }
            }

        }
        return ThreeSum;
    }
}

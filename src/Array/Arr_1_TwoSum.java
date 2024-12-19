package Array;

import java.util.HashMap;

public class Arr_1_TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        for (int i : twoSum2(arr, 9)){
            System.out.print(i + " ");
        };
    }
    public static int[] twoSum(int[] nums, int target){
        int[] sum = new int[2];
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    sum[0] = i;
                    sum[1] = j;
                    break;
                }
            }
        }
        return sum;
    }
    public static int[] twoSum2(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }
}

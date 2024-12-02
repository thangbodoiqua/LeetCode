package Top100Liked;

import java.util.Arrays;

public class Sixth_35_SearchInsertPos {
    public static void main(String[] args) {
        int[] nums = {2,5,6,7};
        System.out.println(searchInsert(nums, 3));
    }
    public static int searchInsert(int[] nums, int target){
        return binarySearch(nums, target, 0, nums.length);
    }
    public static int binarySearch(int[] nums, int target, int from, int to){
        int mid = (to+from)/2;
        if (mid == to || nums[mid] == target){
            return mid;
        }else {
            if (nums[mid] > target) {
                return binarySearch(nums, target, from, mid - 1);
            }else {
                return binarySearch(nums, target, mid+1, to);
            }

        }
    }
}

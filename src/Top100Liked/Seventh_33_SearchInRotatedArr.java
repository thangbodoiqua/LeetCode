package Top100Liked;

public class Seventh_33_SearchInRotatedArr {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1 ,2};
        System.out.println(searchInsert(nums, 0));
    }
    public static int searchInsert(int[] nums, int target){
        int k = 0;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] > nums[i+1]) {
                k = i;
                break;
            }
        }
        int leftRot = binarySearch(nums, target, 0, k);
        int rightRot = binarySearch(nums, target, k + 1, nums.length - 1);
        if (leftRot != -1)
            return leftRot;
        else if (rightRot != -1)
            return rightRot;
        else
            return -1;
    }
    public static int binarySearch(int[] nums, int target, int from, int to) {
        int mid = (to + from) / 2;
        if (from > to)
            return -1;
        if (nums[mid] == target) {
            return mid;
        } else {
            if (nums[mid] > target) {
                return binarySearch(nums, target, from, mid - 1);
            } else {
                return binarySearch(nums, target, mid + 1, to);
            }

        }

    }

}

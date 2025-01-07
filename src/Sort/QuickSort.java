package Sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = new int[]{-10, 0, 1, 25, 10, 57, 48, 37, 12, 92, 86, 33};
        quickSort(nums, 0, nums.length-1);
        System.out.println("Last result");
        for (int i:nums) {
            System.out.print(i + " ");
        }
    }
    public static int[] quickSort(int[] nums, int left, int right){
        if(left < right){
            System.out.println("round with bound: " + left + ", " + right);

            int position = partition(nums, left, right);
/*            for (int i:nums) {
                System.out.print(i + " ");
            }*/

            quickSort(nums, left, position-1);
            quickSort(nums, position+1, right);
        }
        return nums;
    }
    public static int partition(int nums[], int left, int right){
        // copilot: disable
        int pivot = nums[left];
        int down = left;
        int up = right;
        while (down < up){
            while (down < right && nums[down] <= pivot){
                down++;
            }
            while (nums[up] > pivot){
                up--;
            }
            if (down < up) {
                System.out.println("up: " + down + ", down: " + up);
                int temp = nums[up];
                nums[up] = nums[down];
                nums[down] = temp;
            }
        }
        nums[left] = nums[up];
        nums[up] = pivot;
        return up;
    }
}

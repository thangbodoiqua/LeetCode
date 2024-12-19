package Array;

public class Arr_4_MedianOfTwoSortedArr {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println(median);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int l = 0, r = 0, idx = 0;
        while (l < nums1.length && r < nums2.length){
            if (nums1[l] < nums2[r]){
                arr[idx++] = nums1[l++];
            }else {
                arr[idx++] = nums2[r++];
            }
        }
        while (l < nums1.length){
            arr[idx++] = nums1[l++];
        }
        while (r < nums2.length){
            arr[idx++] = nums2[r++];
        }

        if (arr.length%2 == 1){
            return arr[arr.length/2];
        }else {
            return (double) (arr[arr.length/2]+arr[arr.length/2-1])/2;
        }
    }
}
